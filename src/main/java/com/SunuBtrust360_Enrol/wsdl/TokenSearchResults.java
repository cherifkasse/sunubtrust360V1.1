
package com.SunuBtrust360_Enrol.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour tokenSearchResults complex type.
 * 
 * <p>Le fragment de schema suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="tokenSearchResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entries" type="{http://adminws.signserver.org/}tokenEntry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="moreEntriesAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="numMoreEntries" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tokenSearchResults", propOrder = {
    "entries",
    "moreEntriesAvailable",
    "numMoreEntries"
})
public class TokenSearchResults {

    @XmlElement(nillable = true)
    protected List<TokenEntry> entries;
    protected Boolean moreEntriesAvailable;
    protected Long numMoreEntries;

    /**
     * Gets the value of the entries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the entries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TokenEntry }
     * 
     * 
     */
    public List<TokenEntry> getEntries() {
        if (entries == null) {
            entries = new ArrayList<TokenEntry>();
        }
        return this.entries;
    }

    /**
     * Obtient la valeur de la propri�t� moreEntriesAvailable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoreEntriesAvailable() {
        return moreEntriesAvailable;
    }

    /**
     * D�finit la valeur de la propri�t� moreEntriesAvailable.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMoreEntriesAvailable(Boolean value) {
        this.moreEntriesAvailable = value;
    }

    /**
     * Obtient la valeur de la propri�t� numMoreEntries.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumMoreEntries() {
        return numMoreEntries;
    }

    /**
     * D�finit la valeur de la propri�t� numMoreEntries.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumMoreEntries(Long value) {
        this.numMoreEntries = value;
    }

}
