
package com.SunuBtrust360_Enrol.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour queryTokenEntries complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="queryTokenEntries"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="workerId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="startIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="max" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="condition" type="{http://adminws.signserver.org/}queryCondition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ordering" type="{http://adminws.signserver.org/}queryOrdering" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="includeData" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryTokenEntries", propOrder = {
    "workerId",
    "startIndex",
    "max",
    "condition",
    "ordering",
    "includeData"
})
public class QueryTokenEntries {

    protected int workerId;
    protected int startIndex;
    protected int max;
    protected List<QueryCondition> condition;
    protected List<QueryOrdering> ordering;
    protected boolean includeData;

    /**
     * Obtient la valeur de la propri�t� workerId.
     * 
     */
    public int getWorkerId() {
        return workerId;
    }

    /**
     * D�finit la valeur de la propri�t� workerId.
     * 
     */
    public void setWorkerId(int value) {
        this.workerId = value;
    }

    /**
     * Obtient la valeur de la propri�t� startIndex.
     * 
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * D�finit la valeur de la propri�t� startIndex.
     * 
     */
    public void setStartIndex(int value) {
        this.startIndex = value;
    }

    /**
     * Obtient la valeur de la propri�t� max.
     * 
     */
    public int getMax() {
        return max;
    }

    /**
     * D�finit la valeur de la propri�t� max.
     * 
     */
    public void setMax(int value) {
        this.max = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the condition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryCondition }
     * 
     * 
     */
    public List<QueryCondition> getCondition() {
        if (condition == null) {
            condition = new ArrayList<QueryCondition>();
        }
        return this.condition;
    }

    /**
     * Gets the value of the ordering property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ordering property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdering().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryOrdering }
     * 
     * 
     */
    public List<QueryOrdering> getOrdering() {
        if (ordering == null) {
            ordering = new ArrayList<QueryOrdering>();
        }
        return this.ordering;
    }

    /**
     * Obtient la valeur de la propri�t� includeData.
     * 
     */
    public boolean isIncludeData() {
        return includeData;
    }

    /**
     * D�finit la valeur de la propri�t� includeData.
     * 
     */
    public void setIncludeData(boolean value) {
        this.includeData = value;
    }

}
