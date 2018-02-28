/**
 * ProcessStateDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.totvs.technology.ecm.workflow.ws;

public class ProcessStateDto  implements java.io.Serializable {
    private long companyId;

    private java.lang.Boolean counterSign;

    private int sequence;

    private java.lang.String stateDescription;

    private java.lang.String stateName;

    public ProcessStateDto() {
    }

    public ProcessStateDto(
           long companyId,
           java.lang.Boolean counterSign,
           int sequence,
           java.lang.String stateDescription,
           java.lang.String stateName) {
           this.companyId = companyId;
           this.counterSign = counterSign;
           this.sequence = sequence;
           this.stateDescription = stateDescription;
           this.stateName = stateName;
    }


    /**
     * Gets the companyId value for this ProcessStateDto.
     * 
     * @return companyId
     */
    public long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this ProcessStateDto.
     * 
     * @param companyId
     */
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the counterSign value for this ProcessStateDto.
     * 
     * @return counterSign
     */
    public java.lang.Boolean getCounterSign() {
        return counterSign;
    }


    /**
     * Sets the counterSign value for this ProcessStateDto.
     * 
     * @param counterSign
     */
    public void setCounterSign(java.lang.Boolean counterSign) {
        this.counterSign = counterSign;
    }


    /**
     * Gets the sequence value for this ProcessStateDto.
     * 
     * @return sequence
     */
    public int getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this ProcessStateDto.
     * 
     * @param sequence
     */
    public void setSequence(int sequence) {
        this.sequence = sequence;
    }


    /**
     * Gets the stateDescription value for this ProcessStateDto.
     * 
     * @return stateDescription
     */
    public java.lang.String getStateDescription() {
        return stateDescription;
    }


    /**
     * Sets the stateDescription value for this ProcessStateDto.
     * 
     * @param stateDescription
     */
    public void setStateDescription(java.lang.String stateDescription) {
        this.stateDescription = stateDescription;
    }


    /**
     * Gets the stateName value for this ProcessStateDto.
     * 
     * @return stateName
     */
    public java.lang.String getStateName() {
        return stateName;
    }


    /**
     * Sets the stateName value for this ProcessStateDto.
     * 
     * @param stateName
     */
    public void setStateName(java.lang.String stateName) {
        this.stateName = stateName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessStateDto)) return false;
        ProcessStateDto other = (ProcessStateDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.companyId == other.getCompanyId() &&
            ((this.counterSign==null && other.getCounterSign()==null) || 
             (this.counterSign!=null &&
              this.counterSign.equals(other.getCounterSign()))) &&
            this.sequence == other.getSequence() &&
            ((this.stateDescription==null && other.getStateDescription()==null) || 
             (this.stateDescription!=null &&
              this.stateDescription.equals(other.getStateDescription()))) &&
            ((this.stateName==null && other.getStateName()==null) || 
             (this.stateName!=null &&
              this.stateName.equals(other.getStateName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Long(getCompanyId()).hashCode();
        if (getCounterSign() != null) {
            _hashCode += getCounterSign().hashCode();
        }
        _hashCode += getSequence();
        if (getStateDescription() != null) {
            _hashCode += getStateDescription().hashCode();
        }
        if (getStateName() != null) {
            _hashCode += getStateName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessStateDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.workflow.ecm.technology.totvs.com/", "processStateDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("counterSign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "counterSign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stateDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stateName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
