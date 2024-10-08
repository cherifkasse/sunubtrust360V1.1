
package com.SunuBtrust360_Enrol.wsdl;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.3
 * 2023-12-01T16:54:21.243Z
 * Generated source version: 4.0.3
 */

@WebFault(name = "QueryException", targetNamespace = "http://adminws.signserver.org/")
public class QueryException_Exception extends Exception {

    private QueryException faultInfo;

    public QueryException_Exception() {
        super();
    }

    public QueryException_Exception(String message) {
        super(message);
    }

    public QueryException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public QueryException_Exception(String message, QueryException queryException) {
        super(message);
        this.faultInfo = queryException;
    }

    public QueryException_Exception(String message, QueryException queryException, Throwable cause) {
        super(message, cause);
        this.faultInfo = queryException;
    }

    public QueryException getFaultInfo() {
        return this.faultInfo;
    }
}
