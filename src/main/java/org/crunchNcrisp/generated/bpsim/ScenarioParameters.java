//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.02.11 at 02:41:34 PM CET 
//


package org.crunchNcrisp.generated.bpsim;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for ScenarioParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScenarioParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="Start" type="{http://www.bpsim.org/schemas/2.0}Parameter" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.bpsim.org/schemas/2.0}Parameter" minOccurs="0"/>
 *         &lt;element name="Warmup" type="{http://www.bpsim.org/schemas/2.0}Parameter" minOccurs="0"/>
 *         &lt;element name="PropertyParameters" type="{http://www.bpsim.org/schemas/2.0}PropertyParameters" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="replication" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="seed" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="baseTimeUnit" type="{http://www.bpsim.org/schemas/2.0}TimeUnit" default="min" />
 *       &lt;attribute name="baseCurrencyUnit" type="{http://www.w3.org/2001/XMLSchema}string" default="USD" />
 *       &lt;attribute name="baseResultFrequency" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *       &lt;attribute name="baseResultFrequencyCumul" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="traceOutput" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="traceFormat" type="{http://www.w3.org/2001/XMLSchema}string" default="XES" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScenarioParameters", propOrder = {
    "start",
    "duration",
    "warmup",
    "propertyParameters"
})
@XmlSeeAlso({
    org.crunchNcrisp.generated.bpsim.Scenario.ScenarioParameters.class
})
public class ScenarioParameters {

    @XmlElement(name = "Start")
    protected Parameter start;
    @XmlElement(name = "Duration")
    protected Parameter duration;
    @XmlElement(name = "Warmup")
    protected Parameter warmup;
    @XmlElement(name = "PropertyParameters")
    protected PropertyParameters propertyParameters;
    @XmlAttribute(name = "replication")
    protected Integer replication;
    @XmlAttribute(name = "seed")
    protected Long seed;
    @XmlAttribute(name = "baseTimeUnit")
    protected TimeUnit baseTimeUnit;
    @XmlAttribute(name = "baseCurrencyUnit")
    protected String baseCurrencyUnit;
    @XmlAttribute(name = "baseResultFrequency")
    protected Duration baseResultFrequency;
    @XmlAttribute(name = "baseResultFrequencyCumul")
    protected Boolean baseResultFrequencyCumul;
    @XmlAttribute(name = "traceOutput")
    protected Boolean traceOutput;
    @XmlAttribute(name = "traceFormat")
    protected String traceFormat;

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link Parameter }
     *     
     */
    public Parameter getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parameter }
     *     
     */
    public void setStart(Parameter value) {
        this.start = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Parameter }
     *     
     */
    public Parameter getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parameter }
     *     
     */
    public void setDuration(Parameter value) {
        this.duration = value;
    }

    /**
     * Gets the value of the warmup property.
     * 
     * @return
     *     possible object is
     *     {@link Parameter }
     *     
     */
    public Parameter getWarmup() {
        return warmup;
    }

    /**
     * Sets the value of the warmup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parameter }
     *     
     */
    public void setWarmup(Parameter value) {
        this.warmup = value;
    }

    /**
     * Gets the value of the propertyParameters property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyParameters }
     *     
     */
    public PropertyParameters getPropertyParameters() {
        return propertyParameters;
    }

    /**
     * Sets the value of the propertyParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyParameters }
     *     
     */
    public void setPropertyParameters(PropertyParameters value) {
        this.propertyParameters = value;
    }

    /**
     * Gets the value of the replication property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReplication() {
        return replication;
    }

    /**
     * Sets the value of the replication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReplication(Integer value) {
        this.replication = value;
    }

    /**
     * Gets the value of the seed property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeed() {
        return seed;
    }

    /**
     * Sets the value of the seed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeed(Long value) {
        this.seed = value;
    }

    /**
     * Gets the value of the baseTimeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link TimeUnit }
     *     
     */
    public TimeUnit getBaseTimeUnit() {
        if (baseTimeUnit == null) {
            return TimeUnit.MIN;
        } else {
            return baseTimeUnit;
        }
    }

    /**
     * Sets the value of the baseTimeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeUnit }
     *     
     */
    public void setBaseTimeUnit(TimeUnit value) {
        this.baseTimeUnit = value;
    }

    /**
     * Gets the value of the baseCurrencyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCurrencyUnit() {
        if (baseCurrencyUnit == null) {
            return "USD";
        } else {
            return baseCurrencyUnit;
        }
    }

    /**
     * Sets the value of the baseCurrencyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCurrencyUnit(String value) {
        this.baseCurrencyUnit = value;
    }

    /**
     * Gets the value of the baseResultFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getBaseResultFrequency() {
        return baseResultFrequency;
    }

    /**
     * Sets the value of the baseResultFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setBaseResultFrequency(Duration value) {
        this.baseResultFrequency = value;
    }

    /**
     * Gets the value of the baseResultFrequencyCumul property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBaseResultFrequencyCumul() {
        if (baseResultFrequencyCumul == null) {
            return false;
        } else {
            return baseResultFrequencyCumul;
        }
    }

    /**
     * Sets the value of the baseResultFrequencyCumul property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBaseResultFrequencyCumul(Boolean value) {
        this.baseResultFrequencyCumul = value;
    }

    /**
     * Gets the value of the traceOutput property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTraceOutput() {
        if (traceOutput == null) {
            return false;
        } else {
            return traceOutput;
        }
    }

    /**
     * Sets the value of the traceOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTraceOutput(Boolean value) {
        this.traceOutput = value;
    }

    /**
     * Gets the value of the traceFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceFormat() {
        if (traceFormat == null) {
            return "XES";
        } else {
            return traceFormat;
        }
    }

    /**
     * Sets the value of the traceFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceFormat(String value) {
        this.traceFormat = value;
    }

}
