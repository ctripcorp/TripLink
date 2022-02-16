<?php
namespace triplink\vcc\card\exception;
class CusException extends \Exception {
    
    var $url;
    
    var $requestData;
    
    public function __construct($url, $requestData){
        $this->url = $url;
        $this->requestData = $requestData;
    }
}
?>