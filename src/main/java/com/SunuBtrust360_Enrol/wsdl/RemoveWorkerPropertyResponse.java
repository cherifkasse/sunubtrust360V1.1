
package com.SunuBtrust360_Enrol.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour removeWorkerPropertyResponse complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="removeWorkerPropertyResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeWorkerPropertyResponse", propOrder = {
    "_return"
})
public class RemoveWorkerPropertyResponse {

    @XmlElement(name = "return")
    protected boolean _return;

    /**
     * Obtient la valeur de la propri�t� return.
     * 
     */
    public boolean isReturn() {
        return _return;
    }

    /**
     * D�finit la valeur de la propri�t� return.
     * 
     */
    public void setReturn(boolean value) {
        this._return = value;
    }

}
