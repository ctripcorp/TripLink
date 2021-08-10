<?php
namespace triplink\vcc\card\utils;
require_once(__DIR__. '/../exception/CusException.php');


use triplink\vcc\card\exception\CustomeException;

class CURLUtils {
    
    static function curl_post($url, $postdata) {
        
        $header = array(
            'Content-Type: application/json',
        );
        
        $curl = curl_init();

        curl_setopt($curl, CURLOPT_URL, $url);
        curl_setopt($curl, CURLOPT_HEADER, 0);
        curl_setopt($curl, CURLOPT_RETURNTRANSFER, 1);
        curl_setopt($curl, CURLOPT_TIMEOUT, 10);

        curl_setopt($curl, CURLOPT_HTTPHEADER, $header);
        
        curl_setopt($curl, CURLOPT_SSL_VERIFYPEER, FALSE );
        curl_setopt($curl, CURLOPT_SSL_VERIFYHOST, FALSE );
        
        curl_setopt($curl, CURLOPT_POST, 1);
        curl_setopt($curl, CURLOPT_POSTFIELDS, $postdata);
        $data = curl_exec($curl);
        
        if (curl_error($curl)) {
            throw new CusException($curl, $data);
        } else {
            
            var_dump($data);
            curl_close($curl);
            return $data;
        }
    }
}
?>