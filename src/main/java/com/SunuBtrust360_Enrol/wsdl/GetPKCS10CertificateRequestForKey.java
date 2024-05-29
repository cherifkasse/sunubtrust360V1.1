
package com.SunuBtrust360_Enrol.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getPKCS10CertificateRequestForKey complex type.
 * 
 * <p>Le fragment de schma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getPKCS10CertificateRequestForKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="signerId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="certReqInfo" type="{http://adminws.signserver.org/}pkcs10CertReqInfo" minOccurs="0"/&gt;
 *         &lt;element name="explicitEccParameters" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="defaultKey" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPKCS10CertificateRequestForKey", propOrder = {
    "signerId",
    "certReqInfo",
    "explicitEccParameters",
    "defaultKey"
})
public class GetPKCS10CertificateRequestForKey {

    protected int signerId;
    protected Pkcs10CertReqInfo certReqInfo;
    protected boolean explicitEccParameters;
    protected boolean defaultKey;

    /**
     * Obtient la valeur de la propri�t� signerId.
     * 
     */
    public int getSignerId() {
        return signerId;
    }

    /**
     * D�finit la valeur de la propri�t� signerId.
     * 
     */
    public void setSignerId(int value) {
        this.signerId = value;
    }

    /**
     * Obtient la valeur de la propri�t� certReqInfo.
     * 
     * @return
     *     possible object is
     *     {@link Pkcs10CertReqInfo }
     *     
     */
    public Pkcs10CertReqInfo getCertReqInfo() {
        return certReqInfo;
    }

    /**
     * D�finit la valeur de la propri�t� certReqInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link Pkcs10CertReqInfo }
     *     
     */
    public void setCertReqInfo(Pkcs10CertReqInfo value) {
        this.certReqInfo = value;
    }

    /**
     * Obtient la valeur de la propri�t� explicitEccParameters.
     * 
     */
    public boolean isExplicitEccParameters() {
        return explicitEccParameters;
    }

    /**
     * D�finit la valeur de la propri�t� explicitEccParameters.
     * 
     */
    public void setExplicitEccParameters(boolean value) {
        this.explicitEccParameters = value;
    }

    /**
     * Obtient la valeur de la propri�t� defaultKey.
     * 
     */
    public boolean isDefaultKey() {
        return defaultKey;
    }

    /**
     * D�finit la valeur de la propri�t� defaultKey.
     * 
     */
    public void setDefaultKey(boolean value) {
        this.defaultKey = value;
    }

}
