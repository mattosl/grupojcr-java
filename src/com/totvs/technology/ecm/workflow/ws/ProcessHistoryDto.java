/**
 * ProcessHistoryDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.totvs.technology.ecm.workflow.ws;

public class ProcessHistoryDto  implements java.io.Serializable {
    private java.lang.Boolean active;

    private long companyId;

    private java.lang.Integer conversionSequence;

    private java.lang.Boolean isReturn;

    private java.lang.String labelActivity;

    private java.lang.String labelLink;

    private java.util.Calendar movementDate;

    private java.lang.String movementHour;

    private int movementSequence;

    private java.lang.Integer previousMovementSequence;

    private int processInstanceId;

    private java.lang.Integer stateSequence;

    private java.lang.Integer subProcessId;

    private com.totvs.technology.ecm.workflow.ws.ProcessTaskDto[] tasks;

    private java.lang.Integer threadSequence;

    public ProcessHistoryDto() {
    }

    public ProcessHistoryDto(
           java.lang.Boolean active,
           long companyId,
           java.lang.Integer conversionSequence,
           java.lang.Boolean isReturn,
           java.lang.String labelActivity,
           java.lang.String labelLink,
           java.util.Calendar movementDate,
           java.lang.String movementHour,
           int movementSequence,
           java.lang.Integer previousMovementSequence,
           int processInstanceId,
           java.lang.Integer stateSequence,
           java.lang.Integer subProcessId,
           com.totvs.technology.ecm.workflow.ws.ProcessTaskDto[] tasks,
           java.lang.Integer threadSequence) {
           this.active = active;
           this.companyId = companyId;
           this.conversionSequence = conversionSequence;
           this.isReturn = isReturn;
           this.labelActivity = labelActivity;
           this.labelLink = labelLink;
           this.movementDate = movementDate;
           this.movementHour = movementHour;
           this.movementSequence = movementSequence;
           this.previousMovementSequence = previousMovementSequence;
           this.processInstanceId = processInstanceId;
           this.stateSequence = stateSequence;
           this.subProcessId = subProcessId;
           this.tasks = tasks;
           this.threadSequence = threadSequence;
    }


    /**
     * Gets the active value for this ProcessHistoryDto.
     * 
     * @return active
     */
    public java.lang.Boolean getActive() {
        return active;
    }


    /**
     * Sets the active value for this ProcessHistoryDto.
     * 
     * @param active
     */
    public void setActive(java.lang.Boolean active) {
        this.active = active;
    }


    /**
     * Gets the companyId value for this ProcessHistoryDto.
     * 
     * @return companyId
     */
    public long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this ProcessHistoryDto.
     * 
     * @param companyId
     */
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the conversionSequence value for this ProcessHistoryDto.
     * 
     * @return conversionSequence
     */
    public java.lang.Integer getConversionSequence() {
        return conversionSequence;
    }


    /**
     * Sets the conversionSequence value for this ProcessHistoryDto.
     * 
     * @param conversionSequence
     */
    public void setConversionSequence(java.lang.Integer conversionSequence) {
        this.conversionSequence = conversionSequence;
    }


    /**
     * Gets the isReturn value for this ProcessHistoryDto.
     * 
     * @return isReturn
     */
    public java.lang.Boolean getIsReturn() {
        return isReturn;
    }


    /**
     * Sets the isReturn value for this ProcessHistoryDto.
     * 
     * @param isReturn
     */
    public void setIsReturn(java.lang.Boolean isReturn) {
        this.isReturn = isReturn;
    }


    /**
     * Gets the labelActivity value for this ProcessHistoryDto.
     * 
     * @return labelActivity
     */
    public java.lang.String getLabelActivity() {
        return labelActivity;
    }


    /**
     * Sets the labelActivity value for this ProcessHistoryDto.
     * 
     * @param labelActivity
     */
    public void setLabelActivity(java.lang.String labelActivity) {
        this.labelActivity = labelActivity;
    }


    /**
     * Gets the labelLink value for this ProcessHistoryDto.
     * 
     * @return labelLink
     */
    public java.lang.String getLabelLink() {
        return labelLink;
    }


    /**
     * Sets the labelLink value for this ProcessHistoryDto.
     * 
     * @param labelLink
     */
    public void setLabelLink(java.lang.String labelLink) {
        this.labelLink = labelLink;
    }


    /**
     * Gets the movementDate value for this ProcessHistoryDto.
     * 
     * @return movementDate
     */
    public java.util.Calendar getMovementDate() {
        return movementDate;
    }


    /**
     * Sets the movementDate value for this ProcessHistoryDto.
     * 
     * @param movementDate
     */
    public void setMovementDate(java.util.Calendar movementDate) {
        this.movementDate = movementDate;
    }


    /**
     * Gets the movementHour value for this ProcessHistoryDto.
     * 
     * @return movementHour
     */
    public java.lang.String getMovementHour() {
        return movementHour;
    }


    /**
     * Sets the movementHour value for this ProcessHistoryDto.
     * 
     * @param movementHour
     */
    public void setMovementHour(java.lang.String movementHour) {
        this.movementHour = movementHour;
    }


    /**
     * Gets the movementSequence value for this ProcessHistoryDto.
     * 
     * @return movementSequence
     */
    public int getMovementSequence() {
        return movementSequence;
    }


    /**
     * Sets the movementSequence value for this ProcessHistoryDto.
     * 
     * @param movementSequence
     */
    public void setMovementSequence(int movementSequence) {
        this.movementSequence = movementSequence;
    }


    /**
     * Gets the previousMovementSequence value for this ProcessHistoryDto.
     * 
     * @return previousMovementSequence
     */
    public java.lang.Integer getPreviousMovementSequence() {
        return previousMovementSequence;
    }


    /**
     * Sets the previousMovementSequence value for this ProcessHistoryDto.
     * 
     * @param previousMovementSequence
     */
    public void setPreviousMovementSequence(java.lang.Integer previousMovementSequence) {
        this.previousMovementSequence = previousMovementSequence;
    }


    /**
     * Gets the processInstanceId value for this ProcessHistoryDto.
     * 
     * @return processInstanceId
     */
    public int getProcessInstanceId() {
        return processInstanceId;
    }


    /**
     * Sets the processInstanceId value for this ProcessHistoryDto.
     * 
     * @param processInstanceId
     */
    public void setProcessInstanceId(int processInstanceId) {
        this.processInstanceId = processInstanceId;
    }


    /**
     * Gets the stateSequence value for this ProcessHistoryDto.
     * 
     * @return stateSequence
     */
    public java.lang.Integer getStateSequence() {
        return stateSequence;
    }


    /**
     * Sets the stateSequence value for this ProcessHistoryDto.
     * 
     * @param stateSequence
     */
    public void setStateSequence(java.lang.Integer stateSequence) {
        this.stateSequence = stateSequence;
    }


    /**
     * Gets the subProcessId value for this ProcessHistoryDto.
     * 
     * @return subProcessId
     */
    public java.lang.Integer getSubProcessId() {
        return subProcessId;
    }


    /**
     * Sets the subProcessId value for this ProcessHistoryDto.
     * 
     * @param subProcessId
     */
    public void setSubProcessId(java.lang.Integer subProcessId) {
        this.subProcessId = subProcessId;
    }


    /**
     * Gets the tasks value for this ProcessHistoryDto.
     * 
     * @return tasks
     */
    public com.totvs.technology.ecm.workflow.ws.ProcessTaskDto[] getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this ProcessHistoryDto.
     * 
     * @param tasks
     */
    public void setTasks(com.totvs.technology.ecm.workflow.ws.ProcessTaskDto[] tasks) {
        this.tasks = tasks;
    }

    public com.totvs.technology.ecm.workflow.ws.ProcessTaskDto getTasks(int i) {
        return this.tasks[i];
    }

    public void setTasks(int i, com.totvs.technology.ecm.workflow.ws.ProcessTaskDto _value) {
        this.tasks[i] = _value;
    }


    /**
     * Gets the threadSequence value for this ProcessHistoryDto.
     * 
     * @return threadSequence
     */
    public java.lang.Integer getThreadSequence() {
        return threadSequence;
    }


    /**
     * Sets the threadSequence value for this ProcessHistoryDto.
     * 
     * @param threadSequence
     */
    public void setThreadSequence(java.lang.Integer threadSequence) {
        this.threadSequence = threadSequence;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessHistoryDto)) return false;
        ProcessHistoryDto other = (ProcessHistoryDto) obj;
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
            ((this.conversionSequence==null && other.getConversionSequence()==null) || 
             (this.conversionSequence!=null &&
              this.conversionSequence.equals(other.getConversionSequence()))) &&
            ((this.isReturn==null && other.getIsReturn()==null) || 
             (this.isReturn!=null &&
              this.isReturn.equals(other.getIsReturn()))) &&
            ((this.labelActivity==null && other.getLabelActivity()==null) || 
             (this.labelActivity!=null &&
              this.labelActivity.equals(other.getLabelActivity()))) &&
            ((this.labelLink==null && other.getLabelLink()==null) || 
             (this.labelLink!=null &&
              this.labelLink.equals(other.getLabelLink()))) &&
            ((this.movementDate==null && other.getMovementDate()==null) || 
             (this.movementDate!=null &&
              this.movementDate.equals(other.getMovementDate()))) &&
            ((this.movementHour==null && other.getMovementHour()==null) || 
             (this.movementHour!=null &&
              this.movementHour.equals(other.getMovementHour()))) &&
            this.movementSequence == other.getMovementSequence() &&
            ((this.previousMovementSequence==null && other.getPreviousMovementSequence()==null) || 
             (this.previousMovementSequence!=null &&
              this.previousMovementSequence.equals(other.getPreviousMovementSequence()))) &&
            this.processInstanceId == other.getProcessInstanceId() &&
            ((this.stateSequence==null && other.getStateSequence()==null) || 
             (this.stateSequence!=null &&
              this.stateSequence.equals(other.getStateSequence()))) &&
            ((this.subProcessId==null && other.getSubProcessId()==null) || 
             (this.subProcessId!=null &&
              this.subProcessId.equals(other.getSubProcessId()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              java.util.Arrays.equals(this.tasks, other.getTasks()))) &&
            ((this.threadSequence==null && other.getThreadSequence()==null) || 
             (this.threadSequence!=null &&
              this.threadSequence.equals(other.getThreadSequence())));
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
        if (getConversionSequence() != null) {
            _hashCode += getConversionSequence().hashCode();
        }
        if (getIsReturn() != null) {
            _hashCode += getIsReturn().hashCode();
        }
        if (getLabelActivity() != null) {
            _hashCode += getLabelActivity().hashCode();
        }
        if (getLabelLink() != null) {
            _hashCode += getLabelLink().hashCode();
        }
        if (getMovementDate() != null) {
            _hashCode += getMovementDate().hashCode();
        }
        if (getMovementHour() != null) {
            _hashCode += getMovementHour().hashCode();
        }
        _hashCode += getMovementSequence();
        if (getPreviousMovementSequence() != null) {
            _hashCode += getPreviousMovementSequence().hashCode();
        }
        _hashCode += getProcessInstanceId();
        if (getStateSequence() != null) {
            _hashCode += getStateSequence().hashCode();
        }
        if (getSubProcessId() != null) {
            _hashCode += getSubProcessId().hashCode();
        }
        if (getTasks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTasks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTasks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getThreadSequence() != null) {
            _hashCode += getThreadSequence().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessHistoryDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.workflow.ecm.technology.totvs.com/", "processHistoryDto"));
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
        elemField.setFieldName("conversionSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conversionSequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelActivity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "labelActivity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelLink");
        elemField.setXmlName(new javax.xml.namespace.QName("", "labelLink"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("movementDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "movementDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("movementHour");
        elemField.setXmlName(new javax.xml.namespace.QName("", "movementHour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("previousMovementSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "previousMovementSequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("stateSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stateSequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subProcessId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subProcessId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tasks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.workflow.ecm.technology.totvs.com/", "processTaskDto"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("threadSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "threadSequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
