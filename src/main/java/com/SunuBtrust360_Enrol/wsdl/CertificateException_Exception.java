
package com.SunuBtrust360_Enrol.wsdl;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.3
 * 2023-12-01T16:54:21.231Z
 * Generated source version: 4.0.3
 */

@WebFault(name = "CertificateException", targetNamespace = "http://adminws.signserver.org/")
public class CertificateException_Exception extends Exception {

    private CertificateException faultInfo;

    public CertificateException_Exception() {
        super();
    }

    public CertificateException_Exception(String message) {
        super(message);
    }

    public CertificateException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public CertificateException_Exception(String message, CertificateException certificateException) {
        super(message);
        this.faultInfo = certificateException;
    }

    public CertificateException_Exception(String message, CertificateException certificateException, Throwable cause) {
        super(message, cause);
        this.faultInfo = certificateException;
    }

    public CertificateException getFaultInfo() {
        return this.faultInfo;
    }
}
