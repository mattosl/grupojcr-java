/**
 * ProcessDefinitionDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.totvs.technology.ecm.workflow.ws;

public class ProcessDefinitionDto  implements java.io.Serializable {
    private java.lang.Boolean active;

    private long companyId;

    private java.lang.String processDescription;

    private java.lang.String processId;

    public ProcessDefinitionDto() {
    }

    public ProcessDefinitionDto(
           java.lang.Boolean active,
           long companyId,
           java.lang.String processDescription,
           java.lang.String processId) {
           this.active = active;
           this.companyId = companyId;
           this.processDescription = processDescription;
           this.processId = processId;
    }


    /**
     * Gets the active value for this ProcessDefinitionDto.
     * 
     * @return active
     */
    public java.lang.Boolean getActive() {
        return active;
    }


    /**
     * Sets the active value for this ProcessDefinitionDto.
     * 
     * @param active
     */
    public void setActive(java.lang.Boolean active) {
        this.active = active;
    }


    /**
     * Gets the companyId value for this ProcessDefinitionDto.
     * 
     * @return companyId
     */
    public long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this ProcessDefinitionDto.
     * 
     * @param companyId
     */
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the processDescription value for this ProcessDefinitionDto.
     * 
     * @return processDescription
     */
    public java.lang.String getProcessDescription() {
        return processDescription;
    }


    /**
     * Sets the processDescription value for this ProcessDefinitionDto.
     * 
     * @param processDescription
     */
    public void setProcessDescription(java.lang.String processDescription) {
        this.processDescription = processDescription;
    }


    /**
     * Gets the processId value for this ProcessDefinitionDto.
     * 
     * @return processId
     */
    public java.lang.String getProcessId() {
        return processId;
    }


    /**
     * Sets the processId value for this ProcessDefinitionDto.
     * 
     * @param processId
     */
    public void setProcessId(java.lang.String processId) {
        this.processId = processId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessDefinitionDto)) return false;
        ProcessDefinitionDto other = (ProcessDefinitionDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            this.companyId == other.getCompanyId() &&
            ((this.processDescription==null && other.getProcessDescription()==null) || 
             (this.processDescription!=null &&
              this.processDescription.equals(other.getProcessDescription()))) &&
            ((this.processId==null && other.getProcessId()==null) || 
             (this.processId!=null &&
              this.processId.equals(other.getProcessId())));
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
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        _hashCode += new Long(getCompanyId()).hashCode();
        if (getProcessDescription() != null) {
            _hashCode += getProcessDescription().hashCode();
        }
        if (getProcessId() != null) {
            _hashCode += getProcessId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessDefinitionDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.workflow.ecm.technology.totvs.com/", "processDefinitionDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processId"));
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
