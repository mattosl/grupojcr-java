/**
 * ProcessTaskDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.totvs.technology.ecm.workflow.ws;

public class ProcessTaskDto  implements java.io.Serializable {
    private boolean active;

    private boolean canCurrentUserTakeTask;

    private java.lang.String choosedColleagueId;

    private int choosedSequence;

    private java.lang.String colleagueId;

    private java.lang.String colleagueName;

    private long companyId;

    private boolean complement;

    private java.lang.String completeColleagueId;

    private int completeType;

    private java.lang.String deadlineText;

    private java.lang.String historCompleteColleague;

    private java.lang.String historTaskObservation;

    private int movementSequence;

    private int processInstanceId;

    private int status;

    private int statusConsult;

    private java.util.Calendar taskCompletionDate;

    private int taskCompletionHour;

    private java.lang.String taskObservation;

    private boolean taskSigned;

    private int transferredSequence;

    public ProcessTaskDto() {
    }

    public ProcessTaskDto(
           boolean active,
           boolean canCurrentUserTakeTask,
           java.lang.String choosedColleagueId,
           int choosedSequence,
           java.lang.String colleagueId,
           java.lang.String colleagueName,
           long companyId,
           boolean complement,
           java.lang.String completeColleagueId,
           int completeType,
           java.lang.String deadlineText,
           java.lang.String historCompleteColleague,
           java.lang.String historTaskObservation,
           int movementSequence,
           int processInstanceId,
           int status,
           int statusConsult,
           java.util.Calendar taskCompletionDate,
           int taskCompletionHour,
           java.lang.String taskObservation,
           boolean taskSigned,
           int transferredSequence) {
           this.active = active;
           this.canCurrentUserTakeTask = canCurrentUserTakeTask;
           this.choosedColleagueId = choosedColleagueId;
           this.choosedSequence = choosedSequence;
           this.colleagueId = colleagueId;
           this.colleagueName = colleagueName;
           this.companyId = companyId;
           this.complement = complement;
           this.completeColleagueId = completeColleagueId;
           this.completeType = completeType;
           this.deadlineText = deadlineText;
           this.historCompleteColleague = historCompleteColleague;
           this.historTaskObservation = historTaskObservation;
           this.movementSequence = movementSequence;
           this.processInstanceId = processInstanceId;
           this.status = status;
           this.statusConsult = statusConsult;
           this.taskCompletionDate = taskCompletionDate;
           this.taskCompletionHour = taskCompletionHour;
           this.taskObservation = taskObservation;
           this.taskSigned = taskSigned;
           this.transferredSequence = transferredSequence;
    }


    /**
     * Gets the active value for this ProcessTaskDto.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this ProcessTaskDto.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the canCurrentUserTakeTask value for this ProcessTaskDto.
     * 
     * @return canCurrentUserTakeTask
     */
    public boolean isCanCurrentUserTakeTask() {
        return canCurrentUserTakeTask;
    }


    /**
     * Sets the canCurrentUserTakeTask value for this ProcessTaskDto.
     * 
     * @param canCurrentUserTakeTask
     */
    public void setCanCurrentUserTakeTask(boolean canCurrentUserTakeTask) {
        this.canCurrentUserTakeTask = canCurrentUserTakeTask;
    }


    /**
     * Gets the choosedColleagueId value for this ProcessTaskDto.
     * 
     * @return choosedColleagueId
     */
    public java.lang.String getChoosedColleagueId() {
        return choosedColleagueId;
    }


    /**
     * Sets the choosedColleagueId value for this ProcessTaskDto.
     * 
     * @param choosedColleagueId
     */
    public void setChoosedColleagueId(java.lang.String choosedColleagueId) {
        this.choosedColleagueId = choosedColleagueId;
    }


    /**
     * Gets the choosedSequence value for this ProcessTaskDto.
     * 
     * @return choosedSequence
     */
    public int getChoosedSequence() {
        return choosedSequence;
    }


    /**
     * Sets the choosedSequence value for this ProcessTaskDto.
     * 
     * @param choosedSequence
     */
    public void setChoosedSequence(int choosedSequence) {
        this.choosedSequence = choosedSequence;
    }


    /**
     * Gets the colleagueId value for this ProcessTaskDto.
     * 
     * @return colleagueId
     */
    public java.lang.String getColleagueId() {
        return colleagueId;
    }


    /**
     * Sets the colleagueId value for this ProcessTaskDto.
     * 
     * @param colleagueId
     */
    public void setColleagueId(java.lang.String colleagueId) {
        this.colleagueId = colleagueId;
    }


    /**
     * Gets the colleagueName value for this ProcessTaskDto.
     * 
     * @return colleagueName
     */
    public java.lang.String getColleagueName() {
        return colleagueName;
    }


    /**
     * Sets the colleagueName value for this ProcessTaskDto.
     * 
     * @param colleagueName
     */
    public void setColleagueName(java.lang.String colleagueName) {
        this.colleagueName = colleagueName;
    }


    /**
     * Gets the companyId value for this ProcessTaskDto.
     * 
     * @return companyId
     */
    public long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this ProcessTaskDto.
     * 
     * @param companyId
     */
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the complement value for this ProcessTaskDto.
     * 
     * @return complement
     */
    public boolean isComplement() {
        return complement;
    }


    /**
     * Sets the complement value for this ProcessTaskDto.
     * 
     * @param complement
     */
    public void setComplement(boolean complement) {
        this.complement = complement;
    }


    /**
     * Gets the completeColleagueId value for this ProcessTaskDto.
     * 
     * @return completeColleagueId
     */
    public java.lang.String getCompleteColleagueId() {
        return completeColleagueId;
    }


    /**
     * Sets the completeColleagueId value for this ProcessTaskDto.
     * 
     * @param completeColleagueId
     */
    public void setCompleteColleagueId(java.lang.String completeColleagueId) {
        this.completeColleagueId = completeColleagueId;
    }


    /**
     * Gets the completeType value for this ProcessTaskDto.
     * 
     * @return completeType
     */
    public int getCompleteType() {
        return completeType;
    }


    /**
     * Sets the completeType value for this ProcessTaskDto.
     * 
     * @param completeType
     */
    public void setCompleteType(int completeType) {
        this.completeType = completeType;
    }


    /**
     * Gets the deadlineText value for this ProcessTaskDto.
     * 
     * @return deadlineText
     */
    public java.lang.String getDeadlineText() {
        return deadlineText;
    }


    /**
     * Sets the deadlineText value for this ProcessTaskDto.
     * 
     * @param deadlineText
     */
    public void setDeadlineText(java.lang.String deadlineText) {
        this.deadlineText = deadlineText;
    }


    /**
     * Gets the historCompleteColleague value for this ProcessTaskDto.
     * 
     * @return historCompleteColleague
     */
    public java.lang.String getHistorCompleteColleague() {
        return historCompleteColleague;
    }


    /**
     * Sets the historCompleteColleague value for this ProcessTaskDto.
     * 
     * @param historCompleteColleague
     */
    public void setHistorCompleteColleague(java.lang.String historCompleteColleague) {
        this.historCompleteColleague = historCompleteColleague;
    }


    /**
     * Gets the historTaskObservation value for this ProcessTaskDto.
     * 
     * @return historTaskObservation
     */
    public java.lang.String getHistorTaskObservation() {
        return historTaskObservation;
    }


    /**
     * Sets the historTaskObservation value for this ProcessTaskDto.
     * 
     * @param historTaskObservation
     */
    public void setHistorTaskObservation(java.lang.String historTaskObservation) {
        this.historTaskObservation = historTaskObservation;
    }


    /**
     * Gets the movementSequence value for this ProcessTaskDto.
     * 
     * @return movementSequence
     */
    public int getMovementSequence() {
        return movementSequence;
    }


    /**
     * Sets the movementSequence value for this ProcessTaskDto.
     * 
     * @param movementSequence
     */
    public void setMovementSequence(int movementSequence) {
        this.movementSequence = movementSequence;
    }


    /**
     * Gets the processInstanceId value for this ProcessTaskDto.
     * 
     * @return processInstanceId
     */
    public int getProcessInstanceId() {
        return processInstanceId;
    }


    /**
     * Sets the processInstanceId value for this ProcessTaskDto.
     * 
     * @param processInstanceId
     */
    public void setProcessInstanceId(int processInstanceId) {
        this.processInstanceId = processInstanceId;
    }


    /**
     * Gets the status value for this ProcessTaskDto.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ProcessTaskDto.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the statusConsult value for this ProcessTaskDto.
     * 
     * @return statusConsult
     */
    public int getStatusConsult() {
        return statusConsult;
    }


    /**
     * Sets the statusConsult value for this ProcessTaskDto.
     * 
     * @param statusConsult
     */
    public void setStatusConsult(int statusConsult) {
        this.statusConsult = statusConsult;
    }


    /**
     * Gets the taskCompletionDate value for this ProcessTaskDto.
     * 
     * @return taskCompletionDate
     */
    public java.util.Calendar getTaskCompletionDate() {
        return taskCompletionDate;
    }


    /**
     * Sets the taskCompletionDate value for this ProcessTaskDto.
     * 
     * @param taskCompletionDate
     */
    public void setTaskCompletionDate(java.util.Calendar taskCompletionDate) {
        this.taskCompletionDate = taskCompletionDate;
    }


    /**
     * Gets the taskCompletionHour value for this ProcessTaskDto.
     * 
     * @return taskCompletionHour
     */
    public int getTaskCompletionHour() {
        return taskCompletionHour;
    }


    /**
     * Sets the taskCompletionHour value for this ProcessTaskDto.
     * 
     * @param taskCompletionHour
     */
    public void setTaskCompletionHour(int taskCompletionHour) {
        this.taskCompletionHour = taskCompletionHour;
    }


    /**
     * Gets the taskObservation value for this ProcessTaskDto.
     * 
     * @return taskObservation
     */
    public java.lang.String getTaskObservation() {
        return taskObservation;
    }


    /**
     * Sets the taskObservation value for this ProcessTaskDto.
     * 
     * @param taskObservation
     */
    public void setTaskObservation(java.lang.String taskObservation) {
        this.taskObservation = taskObservation;
    }


    /**
     * Gets the taskSigned value for this ProcessTaskDto.
     * 
     * @return taskSigned
     */
    public boolean isTaskSigned() {
        return taskSigned;
    }


    /**
     * Sets the taskSigned value for this ProcessTaskDto.
     * 
     * @param taskSigned
     */
    public void setTaskSigned(boolean taskSigned) {
        this.taskSigned = taskSigned;
    }


    /**
     * Gets the transferredSequence value for this ProcessTaskDto.
     * 
     * @return transferredSequence
     */
    public int getTransferredSequence() {
        return transferredSequence;
    }


    /**
     * Sets the transferredSequence value for this ProcessTaskDto.
     * 
     * @param transferredSequence
     */
    public void setTransferredSequence(int transferredSequence) {
        this.transferredSequence = transferredSequence;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessTaskDto)) return false;
        ProcessTaskDto other = (ProcessTaskDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.active == other.isActive() &&
            this.canCurrentUserTakeTask == other.isCanCurrentUserTakeTask() &&
            ((this.choosedColleagueId==null && other.getChoosedColleagueId()==null) || 
             (this.choosedColleagueId!=null &&
              this.choosedColleagueId.equals(other.getChoosedColleagueId()))) &&
            this.choosedSequence == other.getChoosedSequence() &&
            ((this.colleagueId==null && other.getColleagueId()==null) || 
             (this.colleagueId!=null &&
              this.colleagueId.equals(other.getColleagueId()))) &&
            ((this.colleagueName==null && other.getColleagueName()==null) || 
             (this.colleagueName!=null &&
              this.colleagueName.equals(other.getColleagueName()))) &&
            this.companyId == other.getCompanyId() &&
            this.complement == other.isComplement() &&
            ((this.completeColleagueId==null && other.getCompleteColleagueId()==null) || 
             (this.completeColleagueId!=null &&
              this.completeColleagueId.equals(other.getCompleteColleagueId()))) &&
            this.completeType == other.getCompleteType() &&
            ((this.deadlineText==null && other.getDeadlineText()==null) || 
             (this.deadlineText!=null &&
              this.deadlineText.equals(other.getDeadlineText()))) &&
            ((this.historCompleteColleague==null && other.getHistorCompleteColleague()==null) || 
             (this.historCompleteColleague!=null &&
              this.historCompleteColleague.equals(other.getHistorCompleteColleague()))) &&
            ((this.historTaskObservation==null && other.getHistorTaskObservation()==null) || 
             (this.historTaskObservation!=null &&
              this.historTaskObservation.equals(other.getHistorTaskObservation()))) &&
            this.movementSequence == other.getMovementSequence() &&
            this.processInstanceId == other.getProcessInstanceId() &&
            this.status == other.getStatus() &&
            this.statusConsult == other.getStatusConsult() &&
            ((this.taskCompletionDate==null && other.getTaskCompletionDate()==null) || 
             (this.taskCompletionDate!=null &&
              this.taskCompletionDate.equals(other.getTaskCompletionDate()))) &&
            this.taskCompletionHour == other.getTaskCompletionHour() &&
            ((this.taskObservation==null && other.getTaskObservation()==null) || 
             (this.taskObservation!=null &&
              this.taskObservation.equals(other.getTaskObservation()))) &&
            this.taskSigned == other.isTaskSigned() &&
            this.transferredSequence == other.getTransferredSequence();
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
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanCurrentUserTakeTask() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getChoosedColleagueId() != null) {
            _hashCode += getChoosedColleagueId().hashCode();
        }
        _hashCode += getChoosedSequence();
        if (getColleagueId() != null) {
            _hashCode += getColleagueId().hashCode();
        }
        if (getColleagueName() != null) {
            _hashCode += getColleagueName().hashCode();
        }
        _hashCode += new Long(getCompanyId()).hashCode();
        _hashCode += (isComplement() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCompleteColleagueId() != null) {
            _hashCode += getCompleteColleagueId().hashCode();
        }
        _hashCode += getCompleteType();
        if (getDeadlineText() != null) {
            _hashCode += getDeadlineText().hashCode();
        }
        if (getHistorCompleteColleague() != null) {
            _hashCode += getHistorCompleteColleague().hashCode();
        }
        if (getHistorTaskObservation() != null) {
            _hashCode += getHistorTaskObservation().hashCode();
        }
        _hashCode += getMovementSequence();
        _hashCode += getProcessInstanceId();
        _hashCode += getStatus();
        _hashCode += getStatusConsult();
        if (getTaskCompletionDate() != null) {
            _hashCode += getTaskCompletionDate().hashCode();
        }
        _hashCode += getTaskCompletionHour();
        if (getTaskObservation() != null) {
            _hashCode += getTaskObservation().hashCode();
        }
        _hashCode += (isTaskSigned() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getTransferredSequence();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessTaskDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.workflow.ecm.technology.totvs.com/", "processTaskDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canCurrentUserTakeTask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "canCurrentUserTakeTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("choosedColleagueId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "choosedColleagueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("choosedSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "choosedSequence"));
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
        elemField.setFieldName("complement");
        elemField.setXmlName(new javax.xml.namespace.QName("", "complement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completeColleagueId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "completeColleagueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "completeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deadlineText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deadlineText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historCompleteColleague");
        elemField.setXmlName(new javax.xml.namespace.QName("", "historCompleteColleague"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historTaskObservation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "historTaskObservation"));
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
        elemField.setFieldName("processInstanceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processInstanceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusConsult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusConsult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskCompletionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taskCompletionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskCompletionHour");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taskCompletionHour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskObservation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taskObservation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskSigned");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taskSigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferredSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferredSequence"));
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
