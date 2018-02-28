/**
 * ProcessTaskAppointmentDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.totvs.technology.ecm.workflow.ws;

public class ProcessTaskAppointmentDto  implements java.io.Serializable {
    private java.util.Calendar appointmentDate;

    private java.lang.Integer appointmentSeconds;

    private int appointmentSequence;

    private java.lang.String colleagueId;

    private java.lang.String colleagueName;

    private long companyId;

    private java.lang.Boolean isNewRecord;

    private int movementSequence;

    private int processInstanceId;

    private int transferenceSequence;

    public ProcessTaskAppointmentDto() {
    }

    public ProcessTaskAppointmentDto(
           java.util.Calendar appointmentDate,
           java.lang.Integer appointmentSeconds,
           int appointmentSequence,
           java.lang.String colleagueId,
           java.lang.String colleagueName,
           long companyId,
           java.lang.Boolean isNewRecord,
           int movementSequence,
           int processInstanceId,
           int transferenceSequence) {
           this.appointmentDate = appointmentDate;
           this.appointmentSeconds = appointmentSeconds;
           this.appointmentSequence = appointmentSequence;
           this.colleagueId = colleagueId;
           this.colleagueName = colleagueName;
           this.companyId = companyId;
           this.isNewRecord = isNewRecord;
           this.movementSequence = movementSequence;
           this.processInstanceId = processInstanceId;
           this.transferenceSequence = transferenceSequence;
    }


    /**
     * Gets the appointmentDate value for this ProcessTaskAppointmentDto.
     * 
     * @return appointmentDate
     */
    public java.util.Calendar getAppointmentDate() {
        return appointmentDate;
    }


    /**
     * Sets the appointmentDate value for this ProcessTaskAppointmentDto.
     * 
     * @param appointmentDate
     */
    public void setAppointmentDate(java.util.Calendar appointmentDate) {
        this.appointmentDate = appointmentDate;
    }


    /**
     * Gets the appointmentSeconds value for this ProcessTaskAppointmentDto.
     * 
     * @return appointmentSeconds
     */
    public java.lang.Integer getAppointmentSeconds() {
        return appointmentSeconds;
    }


    /**
     * Sets the appointmentSeconds value for this ProcessTaskAppointmentDto.
     * 
     * @param appointmentSeconds
     */
    public void setAppointmentSeconds(java.lang.Integer appointmentSeconds) {
        this.appointmentSeconds = appointmentSeconds;
    }


    /**
     * Gets the appointmentSequence value for this ProcessTaskAppointmentDto.
     * 
     * @return appointmentSequence
     */
    public int getAppointmentSequence() {
        return appointmentSequence;
    }


    /**
     * Sets the appointmentSequence value for this ProcessTaskAppointmentDto.
     * 
     * @param appointmentSequence
     */
    public void setAppointmentSequence(int appointmentSequence) {
        this.appointmentSequence = appointmentSequence;
    }


    /**
     * Gets the colleagueId value for this ProcessTaskAppointmentDto.
     * 
     * @return colleagueId
     */
    public java.lang.String getColleagueId() {
        return colleagueId;
    }


    /**
     * Sets the colleagueId value for this ProcessTaskAppointmentDto.
     * 
     * @param colleagueId
     */
    public void setColleagueId(java.lang.String colleagueId) {
        this.colleagueId = colleagueId;
    }


    /**
     * Gets the colleagueName value for this ProcessTaskAppointmentDto.
     * 
     * @return colleagueName
     */
    public java.lang.String getColleagueName() {
        return colleagueName;
    }


    /**
     * Sets the colleagueName value for this ProcessTaskAppointmentDto.
     * 
     * @param colleagueName
     */
    public void setColleagueName(java.lang.String colleagueName) {
        this.colleagueName = colleagueName;
    }


    /**
     * Gets the companyId value for this ProcessTaskAppointmentDto.
     * 
     * @return companyId
     */
    public long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this ProcessTaskAppointmentDto.
     * 
     * @param companyId
     */
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the isNewRecord value for this ProcessTaskAppointmentDto.
     * 
     * @return isNewRecord
     */
    public java.lang.Boolean getIsNewRecord() {
        return isNewRecord;
    }


    /**
     * Sets the isNewRecord value for this ProcessTaskAppointmentDto.
     * 
     * @param isNewRecord
     */
    public void setIsNewRecord(java.lang.Boolean isNewRecord) {
        this.isNewRecord = isNewRecord;
    }


    /**
     * Gets the movementSequence value for this ProcessTaskAppointmentDto.
     * 
     * @return movementSequence
     */
    public int getMovementSequence() {
        return movementSequence;
    }


    /**
     * Sets the movementSequence value for this ProcessTaskAppointmentDto.
     * 
     * @param movementSequence
     */
    public void setMovementSequence(int movementSequence) {
        this.movementSequence = movementSequence;
    }


    /**
     * Gets the processInstanceId value for this ProcessTaskAppointmentDto.
     * 
     * @return processInstanceId
     */
    public int getProcessInstanceId() {
        return processInstanceId;
    }


    /**
     * Sets the processInstanceId value for this ProcessTaskAppointmentDto.
     * 
     * @param processInstanceId
     */
    public void setProcessInstanceId(int processInstanceId) {
        this.processInstanceId = processInstanceId;
    }


    /**
     * Gets the transferenceSequence value for this ProcessTaskAppointmentDto.
     * 
     * @return transferenceSequence
     */
    public int getTransferenceSequence() {
        return transferenceSequence;
    }


    /**
     * Sets the transferenceSequence value for this ProcessTaskAppointmentDto.
     * 
     * @param transferenceSequence
     */
    public void setTransferenceSequence(int transferenceSequence) {
        this.transferenceSequence = transferenceSequence;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessTaskAppointmentDto)) return false;
        ProcessTaskAppointmentDto other = (ProcessTaskAppointmentDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.appointmentDate==null && other.getAppointmentDate()==null) || 
             (this.appointmentDate!=null &&
              this.appointmentDate.equals(other.getAppointmentDate()))) &&
            ((this.appointmentSeconds==null && other.getAppointmentSeconds()==null) || 
             (this.appointmentSeconds!=null &&
              this.appointmentSeconds.equals(other.getAppointmentSeconds()))) &&
            this.appointmentSequence == other.getAppointmentSequence() &&
            ((this.colleagueId==null && other.getColleagueId()==null) || 
             (this.colleagueId!=null &&
              this.colleagueId.equals(other.getColleagueId()))) &&
            ((this.colleagueName==null && other.getColleagueName()==null) || 
             (this.colleagueName!=null &&
              this.colleagueName.equals(other.getColleagueName()))) &&
            this.companyId == other.getCompanyId() &&
            ((this.isNewRecord==null && other.getIsNewRecord()==null) || 
             (this.isNewRecord!=null &&
              this.isNewRecord.equals(other.getIsNewRecord()))) &&
            this.movementSequence == other.getMovementSequence() &&
            this.processInstanceId == other.getProcessInstanceId() &&
            this.transferenceSequence == other.getTransferenceSequence();
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
        if (getAppointmentDate() != null) {
            _hashCode += getAppointmentDate().hashCode();
        }
        if (getAppointmentSeconds() != null) {
            _hashCode += getAppointmentSeconds().hashCode();
        }
        _hashCode += getAppointmentSequence();
        if (getColleagueId() != null) {
            _hashCode += getColleagueId().hashCode();
        }
        if (getColleagueName() != null) {
            _hashCode += getColleagueName().hashCode();
        }
        _hashCode += new Long(getCompanyId()).hashCode();
        if (getIsNewRecord() != null) {
            _hashCode += getIsNewRecord().hashCode();
        }
        _hashCode += getMovementSequence();
        _hashCode += getProcessInstanceId();
        _hashCode += getTransferenceSequence();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessTaskAppointmentDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.workflow.ecm.technology.totvs.com/", "processTaskAppointmentDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appointmentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appointmentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appointmentSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appointmentSeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appointmentSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appointmentSequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colleagueId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "colleagueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colleagueName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "colleagueName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("isNewRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isNewRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("movementSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "movementSequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processInstanceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processInstanceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferenceSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferenceSequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
