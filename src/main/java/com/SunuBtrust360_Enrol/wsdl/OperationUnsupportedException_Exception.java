
package com.SunuBtrust360_Enrol.wsdl;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.3
 * 2023-12-01T16:54:21.228Z
 * Generated source version: 4.0.3
 */

@WebFault(name = "OperationUnsupportedException", targetNamespace = "http://adminws.signserver.org/")
public class OperationUnsupportedException_Exception extends Exception {

    private OperationUnsupportedException faultInfo;

    public OperationUnsupportedException_Exception() {
        super();
    }

    public OperationUnsupportedException_Exception(String message) {
        super(message);
    }

    public OperationUnsupportedException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public OperationUnsupportedException_Exception(String message, OperationUnsupportedException operationUnsupportedException) {
        super(message);
        this.faultInfo = operationUnsupportedException;
    }

    public OperationUnsupportedException_Exception(String message, OperationUnsupportedException operationUnsupportedException, Throwable cause) {
        super(message, cause);
        this.faultInfo = operationUnsupportedException;
    }

    public OperationUnsupportedException getFaultInfo() {
        return this.faultInfo;
    }
}
