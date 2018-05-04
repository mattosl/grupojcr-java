/**
 * WorkflowTaskDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.totvs.technology.ecm.dm.ws;

public class WorkflowTaskDto  implements java.io.Serializable {
    private java.util.Calendar actualConclusionDate;

    private int actualConclusionTime;

    private long companyId;

    private java.util.Calendar creationDate;

    private int creationTime;

    private int deadline;

    private java.lang.String description;

    private java.util.Calendar expectedConclusionDate;

    private int movementSequence;

    private java.lang.String owner;

    private int processInstanceId;

    private int rowId;

    private int taskId;

    private int taskStatus;

    public WorkflowTaskDto() {
    }

    public WorkflowTaskDto(
           java.util.Calendar actualConclusionDate,
           int actualConclusionTime,
           long companyId,
           java.util.Calendar creationDate,
           int creationTime,
           int deadline,
           java.lang.String description,
           java.util.Calendar expectedConclusionDate,
           int movementSequence,
           java.lang.String owner,
           int processInstanceId,
           int rowId,
           int taskId,
           int taskStatus) {
           this.actualConclusionDate = actualConclusionDate;
           this.actualConclusionTime = actualConclusionTime;
           this.companyId = companyId;
           this.creationDate = creationDate;
           this.creationTime = creationTime;
           this.deadline = deadline;
           this.description = description;
           this.expectedConclusionDate = expectedConclusionDate;
           this.movementSequence = movementSequence;
           this.owner = owner;
           this.processInstanceId = processInstanceId;
           this.rowId = rowId;
           this.taskId = taskId;
           this.taskStatus = taskStatus;
    }


    /**
     * Gets the actualConclusionDate value for this WorkflowTaskDto.
     * 
     * @return actualConclusionDate
     */
    public java.util.Calendar getActualConclusionDate() {
        return actualConclusionDate;
    }


    /**
     * Sets the actualConclusionDate value for this WorkflowTaskDto.
     * 
     * @param actualConclusionDate
     */
    public void setActualConclusionDate(java.util.Calendar actualConclusionDate) {
        this.actualConclusionDate = actualConclusionDate;
    }


    /**
     * Gets the actualConclusionTime value for this WorkflowTaskDto.
     * 
     * @return actualConclusionTime
     */
    public int getActualConclusionTime() {
        return actualConclusionTime;
    }


    /**
     * Sets the actualConclusionTime value for this WorkflowTaskDto.
     * 
     * @param actualConclusionTime
     */
    public void setActualConclusionTime(int actualConclusionTime) {
        this.actualConclusionTime = actualConclusionTime;
    }


    /**
     * Gets the companyId value for this WorkflowTaskDto.
     * 
     * @return companyId
     */
    public long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this WorkflowTaskDto.
     * 
     * @param companyId
     */
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the creationDate value for this WorkflowTaskDto.
     * 
     * @return creationDate
     */
    public java.util.Calendar getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this WorkflowTaskDto.
     * 
     * @param creationDate
     */
    public void setCreationDate(java.util.Calendar creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the creationTime value for this WorkflowTaskDto.
     * 
     * @return creationTime
     */
    public int getCreationTime() {
        return creationTime;
    }


    /**
     * Sets the creationTime value for this WorkflowTaskDto.
     * 
     * @param creationTime
     */
    public void setCreationTime(int creationTime) {
        this.creationTime = creationTime;
    }


    /**
     * Gets the deadline value for this WorkflowTaskDto.
     * 
     * @return deadline
     */
    public int getDeadline() {
        return deadline;
    }


    /**
     * Sets the deadline value for this WorkflowTaskDto.
     * 
     * @param deadline
     */
    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }


    /**
     * Gets the description value for this WorkflowTaskDto.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WorkflowTaskDto.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the expectedConclusionDate value for this WorkflowTaskDto.
     * 
     * @return expectedConclusionDate
     */
    public java.util.Calendar getExpectedConclusionDate() {
        return expectedConclusionDate;
    }


    /**
     * Sets the expectedConclusionDate value for this WorkflowTaskDto.
     * 
     * @param expectedConclusionDate
     */
    public void setExpectedConclusionDate(java.util.Calendar expectedConclusionDate) {
        this.expectedConclusionDate = expectedConclusionDate;
    }


    /**
     * Gets the movementSequence value for this WorkflowTaskDto.
     * 
     * @return movementSequence
     */
    public int getMovementSequence() {
        return movementSequence;
    }


    /**
     * Sets the movementSequence value for this WorkflowTaskDto.
     * 
     * @param movementSequence
     */
    public void setMovementSequence(int movementSequence) {
        this.movementSequence = movementSequence;
    }


    /**
     * Gets the owner value for this WorkflowTaskDto.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this WorkflowTaskDto.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }


    /**
     * Gets the processInstanceId value for this WorkflowTaskDto.
     * 
     * @return processInstanceId
     */
    public int getProcessInstanceId() {
        return processInstanceId;
    }


    /**
     * Sets the processInstanceId value for this WorkflowTaskDto.
     * 
     * @param processInstanceId
     */
    public void setProcessInstanceId(int processInstanceId) {
        this.processInstanceId = processInstanceId;
    }


    /**
     * Gets the rowId value for this WorkflowTaskDto.
     * 
     * @return rowId
     */
    public int getRowId() {
        return rowId;
    }


    /**
     * Sets the rowId value for this WorkflowTaskDto.
     * 
     * @param rowId
     */
    public void setRowId(int rowId) {
        this.rowId = rowId;
    }


    /**
     * Gets the taskId value for this WorkflowTaskDto.
     * 
     * @return taskId
     */
    public int getTaskId() {
        return taskId;
    }


    /**
     * Sets the taskId value for this WorkflowTaskDto.
     * 
     * @param taskId
     */
    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }


    /**
     * Gets the taskStatus value for this WorkflowTaskDto.
     * 
     * @return taskStatus
     */
    public int getTaskStatus() {
        return taskStatus;
    }


    /**
     * Sets the taskStatus value for this WorkflowTaskDto.
     * 
     * @param taskStatus
     */
    public void setTaskStatus(int taskStatus) {
        this.taskStatus = taskStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkflowTaskDto)) return false;
        WorkflowTaskDto other = (WorkflowTaskDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actualConclusionDate==null && other.getActualConclusionDate()==null) || 
             (this.actualConclusionDate!=null &&
              this.actualConclusionDate.equals(other.getActualConclusionDate()))) &&
            this.actualConclusionTime == other.getActualConclusionTime() &&
            this.companyId == other.getCompanyId() &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            this.creationTime == other.getCreationTime() &&
            this.deadline == other.getDeadline() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.expectedConclusionDate==null && other.getExpectedConclusionDate()==null) || 
             (this.expectedConclusionDate!=null &&
              this.expectedConclusionDate.equals(other.getExpectedConclusionDate()))) &&
            this.movementSequence == other.getMovementSequence() &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            this.processInstanceId == other.getProcessInstanceId() &&
            this.rowId == other.getRowId() &&
            this.taskId == other.getTaskId() &&
            this.taskStatus == other.getTaskStatus();
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
        if (getActualConclusionDate() != null) {
            _hashCode += getActualConclusionDate().hashCode();
        }
        _hashCode += getActualConclusionTime();
        _hashCode += new Long(getCompanyId()).hashCode();
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        _hashCode += getCreationTime();
        _hashCode += getDeadline();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getExpectedConclusionDate() != null) {
            _hashCode += getExpectedConclusionDate().hashCode();
        }
        _hashCode += getMovementSequence();
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        _hashCode += getProcessInstanceId();
        _hashCode += getRowId();
        _hashCode += getTaskId();
        _hashCode += getTaskStatus();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkflowTaskDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.dm.ecm.technology.totvs.com/", "workflowTaskDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualConclusionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actualConclusionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualConclusionTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actualConclusionTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deadline");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deadline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedConclusionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expectedConclusionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processInstanceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processInstanceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rowId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taskId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taskStatus"));
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
