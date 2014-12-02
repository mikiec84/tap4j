//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.02 at 07:47:15 AM CET 
//


package org.tap4j.ext.jmeter.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HttpSample complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HttpSample">
 *   &lt;complexContent>
 *     &lt;extension base="{}AbstractSample">
 *       &lt;sequence>
 *         &lt;element name="httpSample" type="{}HttpSample" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="responseHeader" type="{}TextEl" minOccurs="0"/>
 *         &lt;element name="requestHeader" type="{}TextEl" minOccurs="0"/>
 *         &lt;element name="responseData" type="{}TextEl" minOccurs="0"/>
 *         &lt;element name="responseFile" type="{}TextEl" minOccurs="0"/>
 *         &lt;element name="cookies" type="{}TextEl" minOccurs="0"/>
 *         &lt;element name="method" type="{}TextEl" minOccurs="0"/>
 *         &lt;element name="queryString" type="{}TextEl" minOccurs="0"/>
 *         &lt;element name="redirectLocation" type="{}TextEl" minOccurs="0"/>
 *         &lt;element name="java.net.URL" type="{}TextEl" minOccurs="0"/>
 *         &lt;element name="url" type="{}TextEl" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HttpSample", propOrder = {
    "httpSample",
    "responseHeader",
    "requestHeader",
    "responseData",
    "responseFile",
    "cookies",
    "method",
    "queryString",
    "redirectLocation",
    "javaNetURL",
    "url"
})
public class HttpSample
    extends AbstractSample
{

    protected List<HttpSample> httpSample;
    protected TextEl responseHeader;
    protected TextEl requestHeader;
    protected TextEl responseData;
    protected TextEl responseFile;
    protected TextEl cookies;
    protected TextEl method;
    protected TextEl queryString;
    protected TextEl redirectLocation;
    @XmlElement(name = "java.net.URL")
    protected TextEl javaNetURL;
    protected TextEl url;

    /**
     * Gets the value of the httpSample property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the httpSample property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHttpSample().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HttpSample }
     * 
     * 
     */
    public List<HttpSample> getHttpSample() {
        if (httpSample == null) {
            httpSample = new ArrayList<HttpSample>();
        }
        return this.httpSample;
    }

    /**
     * Gets the value of the responseHeader property.
     * 
     * @return
     *     possible object is
     *     {@link TextEl }
     *     
     */
    public TextEl getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the value of the responseHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextEl }
     *     
     */
    public void setResponseHeader(TextEl value) {
        this.responseHeader = value;
    }

    /**
     * Gets the value of the requestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link TextEl }
     *     
     */
    public TextEl getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the value of the requestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextEl }
     *     
     */
    public void setRequestHeader(TextEl value) {
        this.requestHeader = value;
    }

    /**
     * Gets the value of the responseData property.
     * 
     * @return
     *     possible object is
     *     {@link TextEl }
     *     
     */
    public TextEl getResponseData() {
        return responseData;
    }

    /**
     * Sets the value of the responseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextEl }
     *     
     */
    public void setResponseData(TextEl value) {
        this.responseData = value;
    }

    /**
     * Gets the value of the responseFile property.
     * 
     * @return
     *     possible object is
     *     {@link TextEl }
     *     
     */
    public TextEl getResponseFile() {
        return responseFile;
    }

    /**
     * Sets the value of the responseFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextEl }
     *     
     */
    public void setResponseFile(TextEl value) {
        this.responseFile = value;
    }

    /**
     * Gets the value of the cookies property.
     * 
     * @return
     *     possible object is
     *     {@link TextEl }
     *     
     */
    public TextEl getCookies() {
        return cookies;
    }

    /**
     * Sets the value of the cookies property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextEl }
     *     
     */
    public void setCookies(TextEl value) {
        this.cookies = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link TextEl }
     *     
     */
    public TextEl getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextEl }
     *     
     */
    public void setMethod(TextEl value) {
        this.method = value;
    }

    /**
     * Gets the value of the queryString property.
     * 
     * @return
     *     possible object is
     *     {@link TextEl }
     *     
     */
    public TextEl getQueryString() {
        return queryString;
    }

    /**
     * Sets the value of the queryString property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextEl }
     *     
     */
    public void setQueryString(TextEl value) {
        this.queryString = value;
    }

    /**
     * Gets the value of the redirectLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TextEl }
     *     
     */
    public TextEl getRedirectLocation() {
        return redirectLocation;
    }

    /**
     * Sets the value of the redirectLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextEl }
     *     
     */
    public void setRedirectLocation(TextEl value) {
        this.redirectLocation = value;
    }

    /**
     * Gets the value of the javaNetURL property.
     * 
     * @return
     *     possible object is
     *     {@link TextEl }
     *     
     */
    public TextEl getJavaNetURL() {
        return javaNetURL;
    }

    /**
     * Sets the value of the javaNetURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextEl }
     *     
     */
    public void setJavaNetURL(TextEl value) {
        this.javaNetURL = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link TextEl }
     *     
     */
    public TextEl getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextEl }
     *     
     */
    public void setUrl(TextEl value) {
        this.url = value;
    }

}
