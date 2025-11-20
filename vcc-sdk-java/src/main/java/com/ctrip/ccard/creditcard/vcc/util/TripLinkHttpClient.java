package com.ctrip.ccard.creditcard.vcc.util;

import com.ctrip.ccard.creditcard.vcc.bean.CallHttpResponse;
import com.ctrip.ccard.creditcard.vcc.exception.HttpException;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Description: https请求vcc接口
 */
public class TripLinkHttpClient implements HttpClient<CallHttpResponse> {

    private static final String HTTP_METHOD_GET = "GET";

    private static final String HTTP_METHOD_POST = "POST";

    private static final String CHARSET_NAME = "utf-8";

    private static final String CONTENT_TYPE = "Content-Type";

    private static final String CONTENT_TYPE_JSON_CONTENT = "application/json";

    private static Integer CONNECT_TIMEOUT = null;
    private static Integer READ_TIMEOUT = null;

    /**
     * des:
     * @param connectTimeout 毫秒
     * @param readTimeout 毫秒
     * date 2025/1/3 13:54
    */
    public TripLinkHttpClient(Integer connectTimeout,Integer readTimeout) {
        if(connectTimeout != null){
            CONNECT_TIMEOUT = connectTimeout;
        }
        if(readTimeout != null){
            READ_TIMEOUT = readTimeout;
        }

    }
    public TripLinkHttpClient() {

    }

    public CallHttpResponse post(String requestJson, String url, Map<String,String> header) {
        try {
            if(null == header){
                header = new HashMap<String, String>();
            }
            header.put(CONTENT_TYPE,CONTENT_TYPE_JSON_CONTENT);
            return httpsRequest(url,HTTP_METHOD_POST,requestJson,header);
        } catch (Exception e) {
            throw new HttpException("request vcc exception",e);
        }
    }

    public CallHttpResponse get(String url, Map<String, String> header) {
        try {
            return httpsRequest(url,HTTP_METHOD_GET,null,header);
        } catch (Exception e) {
            throw new HttpException("request vcc exception",e);
        }
    }

    /**
     * 发送https请求
     * @param requestUrl 请求地址
     * @param httpMethod method
     * @param requestJsonInfo 请求体
     * @param header http header
     * @return
     * @throws Exception
     */
    private static CallHttpResponse httpsRequest(String requestUrl,String httpMethod,String requestJsonInfo,Map<String,String> header) throws Exception{
        CallHttpResponse response = new CallHttpResponse();
        //请求数据流
        OutputStream outputStream = null;
        //服务端返回的报文流
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;
        try{
            //创建SSLContext
            SSLContext sslContext  = SSLContext.getInstance("SSL");
            TrustManager[] tm ={ new SslTrustManager() };
            //SSLContext 初始化
            sslContext.init(null, tm, new java.security.SecureRandom());;
            //获取SSLSocketFactory对象
            SSLSocketFactory ssf = sslContext.getSocketFactory();
            //Connect 创建初始化
            URL url = new URL(requestUrl);
            HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            conn.setRequestMethod(httpMethod);
            conn.setSSLSocketFactory(ssf);
            if (null != CONNECT_TIMEOUT)
                conn.setConnectTimeout(CONNECT_TIMEOUT);
            if(null != READ_TIMEOUT)
                conn.setReadTimeout(READ_TIMEOUT);

            //设置 header
            if(null != header){
                for(Map.Entry<String,String> entry : header.entrySet()){
                    conn.setRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            //往服务器端写内容
            if(null != requestJsonInfo){
                outputStream = conn.getOutputStream();
                outputStream.write(requestJsonInfo.getBytes(CHARSET_NAME));
            }
            conn.connect();
            if(200 != conn.getResponseCode() && 500 != conn.getResponseCode()){
                throw new Exception("response not success");
            }
            //response header
            Map<String, List<String>> responseHeaderFileds = conn.getHeaderFields();
            Set<String> keys = responseHeaderFileds.keySet();
            Map<String,String> responseHeader = new HashMap<String, String>();
            for(String key:keys){
                responseHeader.put(key,conn.getHeaderField(key));
            }
            response.setHeader(responseHeader);
            //读取服务器端返回的内容
            inputStream = conn.getInputStream();
            inputStreamReader = new InputStreamReader(inputStream,CHARSET_NAME);
            bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder builder = new StringBuilder();
            String line = null;
            while((line = bufferedReader.readLine())!= null){
                builder.append(line);
            }
            response.setResult(builder.toString());
        }finally {
            //关闭流
            if(null != outputStream)  outputStream.close();
            if(null != inputStream)  inputStream.close();
            if(null != inputStreamReader) inputStreamReader.close();
            if(null != bufferedReader)  bufferedReader.close();
        }
        return response;
    }
}
