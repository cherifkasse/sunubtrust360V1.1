
package com.SunuBtrust360_Enrol.wsdl;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.3
 * 2023-12-01T16:54:21.179Z
 * Generated source version: 4.0.3
 */

@WebFault(name = "InvalidWorkerIdException", targetNamespace = "http://adminws.signserver.org/")
public class InvalidWorkerIdException_Exception extends Exception {

    private InvalidWorkerIdException faultInfo;

    public InvalidWorkerIdException_Exception() {
        super();
    }

    public InvalidWorkerIdException_Exception(String message) {
        super(message);
    }

    public InvalidWorkerIdException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidWorkerIdException_Exception(String message, InvalidWorkerIdException invalidWorkerIdException) {
        super(message);
        this.faultInfo = invalidWorkerIdException;
    }

    public InvalidWorkerIdException_Exception(String message, InvalidWorkerIdException invalidWorkerIdException, Throwable cause) {
        super(message, cause);
        this.faultInfo = invalidWorkerIdException;
    }

    public InvalidWorkerIdException getFaultInfo() {
        return this.faultInfo;
    }
}
