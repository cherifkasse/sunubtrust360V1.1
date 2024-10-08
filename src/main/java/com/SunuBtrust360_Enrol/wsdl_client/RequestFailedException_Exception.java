
package com.SunuBtrust360_Enrol.wsdl_client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.0
 * 2024-01-26T08:57:30.399Z
 * Generated source version: 3.5.0
 */

@WebFault(name = "RequestFailedException", targetNamespace = "http://clientws.signserver.org/")
public class RequestFailedException_Exception extends Exception {

    private com.SunuBtrust360_Enrol.wsdl_client.RequestFailedException faultInfo;

    public RequestFailedException_Exception() {
        super();
    }

    public RequestFailedException_Exception(String message) {
        super(message);
    }

    public RequestFailedException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public RequestFailedException_Exception(String message, com.SunuBtrust360_Enrol.wsdl_client.RequestFailedException requestFailedException) {
        super(message);
        this.faultInfo = requestFailedException;
    }

    public RequestFailedException_Exception(String message, com.SunuBtrust360_Enrol.wsdl_client.RequestFailedException requestFailedException, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = requestFailedException;
    }

    public com.SunuBtrust360_Enrol.wsdl_client.RequestFailedException getFaultInfo() {
        return this.faultInfo;
    }
}
