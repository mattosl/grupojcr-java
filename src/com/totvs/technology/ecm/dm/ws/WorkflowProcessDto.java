/**
 * WorkflowProcessDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.totvs.technology.ecm.dm.ws;

public class WorkflowProcessDto  implements java.io.Serializable {
    private java.lang.Boolean active;

    private java.lang.Integer attachmentSeqId;

    private java.lang.Boolean canCancel;

    private java.lang.Boolean canTake;

    private java.lang.String code;

    private java.lang.String colleagueName;

    private long companyId;

    private java.lang.Boolean counterSign;

    private java.util.Calendar deadlineDate;

    private java.lang.String deadlineText;

    private java.lang.Integer mainAttachmentDocumentId;

    private int mainAttachmentDocumentVersion;

    private java.lang.Boolean mobileReady;

    private java.lang.String movementHour;

    private int movementSequence;

    private java.lang.String processDescription;

    private java.lang.String processId;

    private int processInstanceId;

    private java.lang.String[] relatedDatasets;

    private java.lang.String requesterId;

    private java.lang.String requesterName;

    private int rowId;

    private java.lang.Integer sourceProcess;

    private java.lang.Integer sourceThreadSequence;

    private java.lang.String startupHour;

    private java.lang.String stateDescription;

    private java.lang.Integer stateId;

    private java.lang.String url;

    private java.lang.Integer version;

    public WorkflowProcessDto() {
    }

    public WorkflowProcessDto(
           java.lang.Boolean active,
           java.lang.Integer attachmentSeqId,
           java.lang.Boolean canCancel,
           java.lang.Boolean canTake,
           java.lang.String code,
           java.lang.String colleagueName,
           long companyId,
           java.lang.Boolean counterSign,
           java.util.Calendar deadlineDate,
           java.lang.String deadlineText,
           java.lang.Integer mainAttachmentDocumentId,
           int mainAttachmentDocumentVersion,
           java.lang.Boolean mobileReady,
           java.lang.String movementHour,
           int movementSequence,
           java.lang.String processDescription,
           java.lang.String processId,
           int processInstanceId,
           java.lang.String[] relatedDatasets,
           java.lang.String requesterId,
           java.lang.String requesterName,
           int rowId,
           java.lang.Integer sourceProcess,
           java.lang.Integer sourceThreadSequence,
           java.lang.String startupHour,
           java.lang.String stateDescription,
           java.lang.Integer stateId,
           java.lang.String url,
           java.lang.Integer version) {
           this.active = active;
           this.attachmentSeqId = attachmentSeqId;
           this.canCancel = canCancel;
           this.canTake = canTake;
           this.code = code;
           this.colleagueName = colleagueName;
           this.companyId = companyId;
           this.counterSign = counterSign;
           this.deadlineDate = deadlineDate;
           this.deadlineText = deadlineText;
           this.mainAttachmentDocumentId = mainAttachmentDocumentId;
           this.mainAttachmentDocumentVersion = mainAttachmentDocumentVersion;
           this.mobileReady = mobileReady;
           this.movementHour = movementHour;
           this.movementSequence = movementSequence;
           this.processDescription = processDescription;
           this.processId = processId;
           this.processInstanceId = processInstanceId;
           this.relatedDatasets = relatedDatasets;
           this.requesterId = requesterId;
           this.requesterName = requesterName;
           this.rowId = rowId;
           this.sourceProcess = sourceProcess;
           this.sourceThreadSequence = sourceThreadSequence;
           this.startupHour = startupHour;
           this.stateDescription = stateDescription;
           this.stateId = stateId;
           this.url = url;
           this.version = version;
    }


    /**
     * Gets the active value for this WorkflowProcessDto.
     * 
     * @return active
     */
    public java.lang.Boolean getActive() {
        return active;
    }


    /**
     * Sets the active value for this WorkflowProcessDto.
     * 
     * @param active
     */
    public void setActive(java.lang.Boolean active) {
        this.active = active;
    }


    /**
     * Gets the attachmentSeqId value for this WorkflowProcessDto.
     * 
     * @return attachmentSeqId
     */
    public java.lang.Integer getAttachmentSeqId() {
        return attachmentSeqId;
    }


    /**
     * Sets the attachmentSeqId value for this WorkflowProcessDto.
     * 
     * @param attachmentSeqId
     */
    public void setAttachmentSeqId(java.lang.Integer attachmentSeqId) {
        this.attachmentSeqId = attachmentSeqId;
    }


    /**
     * Gets the canCancel value for this WorkflowProcessDto.
     * 
     * @return canCancel
     */
    public java.lang.Boolean getCanCancel() {
        return canCancel;
    }


    /**
     * Sets the canCancel value for this WorkflowProcessDto.
     * 
     * @param canCancel
     */
    public void setCanCancel(java.lang.Boolean canCancel) {
        this.canCancel = canCancel;
    }


    /**
     * Gets the canTake value for this WorkflowProcessDto.
     * 
     * @return canTake
     */
    public java.lang.Boolean getCanTake() {
        return canTake;
    }


    /**
     * Sets the canTake value for this WorkflowProcessDto.
     * 
     * @param canTake
     */
    public void setCanTake(java.lang.Boolean canTake) {
        this.canTake = canTake;
    }


    /**
     * Gets the code value for this WorkflowProcessDto.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this WorkflowProcessDto.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the colleagueName value for this WorkflowProcessDto.
     * 
     * @return colleagueName
     */
    public java.lang.String getColleagueName() {
        return colleagueName;
    }


    /**
     * Sets the colleagueName value for this WorkflowProcessDto.
     * 
     * @param colleagueName
     */
    public void setColleagueName(java.lang.String colleagueName) {
        this.colleagueName = colleagueName;
    }


    /**
     * Gets the companyId value for this WorkflowProcessDto.
     * 
     * @return companyId
     */
    public long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this WorkflowProcessDto.
     * 
     * @param companyId
     */
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the counterSign value for this WorkflowProcessDto.
     * 
     * @return counterSign
     */
    public java.lang.Boolean getCounterSign() {
        return counterSign;
    }


    /**
     * Sets the counterSign value for this WorkflowProcessDto.
     * 
     * @param counterSign
     */
    public void setCounterSign(java.lang.Boolean counterSign) {
        this.counterSign = counterSign;
    }


    /**
     * Gets the deadlineDate value for this WorkflowProcessDto.
     * 
     * @return deadlineDate
     */
    public java.util.Calendar getDeadlineDate() {
        return deadlineDate;
    }


    /**
     * Sets the deadlineDate value for this WorkflowProcessDto.
     * 
     * @param deadlineDate
     */
    public void setDeadlineDate(java.util.Calendar deadlineDate) {
        this.deadlineDate = deadlineDate;
    }


    /**
     * Gets the deadlineText value for this WorkflowProcessDto.
     * 
     * @return deadlineText
     */
    public java.lang.String getDeadlineText() {
        return deadlineText;
    }


    /**
     * Sets the deadlineText value for this WorkflowProcessDto.
     * 
     * @param deadlineText
     */
    public void setDeadlineText(java.lang.String deadlineText) {
        this.deadlineText = deadlineText;
    }


    /**
     * Gets the mainAttachmentDocumentId value for this WorkflowProcessDto.
     * 
     * @return mainAttachmentDocumentId
     */
    public java.lang.Integer getMainAttachmentDocumentId() {
        return mainAttachmentDocumentId;
    }


    /**
     * Sets the mainAttachmentDocumentId value for this WorkflowProcessDto.
     * 
     * @param mainAttachmentDocumentId
     */
    public void setMainAttachmentDocumentId(java.lang.Integer mainAttachmentDocumentId) {
        this.mainAttachmentDocumentId = mainAttachmentDocumentId;
    }


    /**
     * Gets the mainAttachmentDocumentVersion value for this WorkflowProcessDto.
     * 
     * @return mainAttachmentDocumentVersion
     */
    public int getMainAttachmentDocumentVersion() {
        return mainAttachmentDocumentVersion;
    }


    /**
     * Sets the mainAttachmentDocumentVersion value for this WorkflowProcessDto.
     * 
     * @param mainAttachmentDocumentVersion
     */
    public void setMainAttachmentDocumentVersion(int mainAttachmentDocumentVersion) {
        this.mainAttachmentDocumentVersion = mainAttachmentDocumentVersion;
    }


    /**
     * Gets the mobileReady value for this WorkflowProcessDto.
     * 
     * @return mobileReady
     */
    public java.lang.Boolean getMobileReady() {
        return mobileReady;
    }


    /**
     * Sets the mobileReady value for this WorkflowProcessDto.
     * 
     * @param mobileReady
     */
    public void setMobileReady(java.lang.Boolean mobileReady) {
        this.mobileReady = mobileReady;
    }


    /**
     * Gets the movementHour value for this WorkflowProcessDto.
     * 
     * @return movementHour
     */
    public java.lang.String getMovementHour() {
        return movementHour;
    }


    /**
     * Sets the movementHour value for this WorkflowProcessDto.
     * 
     * @param movementHour
     */
    public void setMovementHour(java.lang.String movementHour) {
        this.movementHour = movementHour;
    }


    /**
     * Gets the movementSequence value for this WorkflowProcessDto.
     * 
     * @return movementSequence
     */
    public int getMovementSequence() {
        return movementSequence;
    }


    /**
     * Sets the movementSequence value for this WorkflowProcessDto.
     * 
     * @param movementSequence
     */
    public void setMovementSequence(int movementSequence) {
        this.movementSequence = movementSequence;
    }


    /**
     * Gets the processDescription value for this WorkflowProcessDto.
     * 
     * @return processDescription
     */
    public java.lang.String getProcessDescription() {
        return processDescription;
    }


    /**
     * Sets the processDescription value for this WorkflowProcessDto.
     * 
     * @param processDescription
     */
    public void setProcessDescription(java.lang.String processDescription) {
        this.processDescription = processDescription;
    }


    /**
     * Gets the processId value for this WorkflowProcessDto.
     * 
     * @return processId
     */
    public java.lang.String getProcessId() {
        return processId;
    }


    /**
     * Sets the processId value for this WorkflowProcessDto.
     * 
     * @param processId
     */
    public void setProcessId(java.lang.String processId) {
        this.processId = processId;
    }


    /**
     * Gets the processInstanceId value for this WorkflowProcessDto.
     * 
     * @return processInstanceId
     */
    public int getProcessInstanceId() {
        return processInstanceId;
    }


    /**
     * Sets the processInstanceId value for this WorkflowProcessDto.
     * 
     * @param processInstanceId
     */
    public void setProcessInstanceId(int processInstanceId) {
        this.processInstanceId = processInstanceId;
    }


    /**
     * Gets the relatedDatasets value for this WorkflowProcessDto.
     * 
     * @return relatedDatasets
     */
    public java.lang.String[] getRelatedDatasets() {
        return relatedDatasets;
    }


    /**
     * Sets the relatedDatasets value for this WorkflowProcessDto.
     * 
     * @param relatedDatasets
     */
    public void setRelatedDatasets(java.lang.String[] relatedDatasets) {
        this.relatedDatasets = relatedDatasets;
    }

    public java.lang.String getRelatedDatasets(int i) {
        return this.relatedDatasets[i];
    }

    public void setRelatedDatasets(int i, java.lang.String _value) {
        this.relatedDatasets[i] = _value;
    }


    /**
     * Gets the requesterId value for this WorkflowProcessDto.
     * 
     * @return requesterId
     */
    public java.lang.String getRequesterId() {
        return requesterId;
    }


    /**
     * Sets the requesterId value for this WorkflowProcessDto.
     * 
     * @param requesterId
     */
    public void setRequesterId(java.lang.String requesterId) {
        this.requesterId = requesterId;
    }


    /**
     * Gets the requesterName value for this WorkflowProcessDto.
     * 
     * @return requesterName
     */
    public java.lang.String getRequesterName() {
        return requesterName;
    }


    /**
     * Sets the requesterName value for this WorkflowProcessDto.
     * 
     * @param requesterName
     */
    public void setRequesterName(java.lang.String requesterName) {
        this.requesterName = requesterName;
    }


    /**
     * Gets the rowId value for this WorkflowProcessDto.
     * 
     * @return rowId
     */
    public int getRowId() {
        return rowId;
    }


    /**
     * Sets the rowId value for this WorkflowProcessDto.
     * 
     * @param rowId
     */
    public void setRowId(int rowId) {
        this.rowId = rowId;
    }


    /**
     * Gets the sourceProcess value for this WorkflowProcessDto.
     * 
     * @return sourceProcess
     */
    public java.lang.Integer getSourceProcess() {
        return sourceProcess;
    }


    /**
     * Sets the sourceProcess value for this WorkflowProcessDto.
     * 
     * @param sourceProcess
     */
    public void setSourceProcess(java.lang.Integer sourceProcess) {
        this.sourceProcess = sourceProcess;
    }


    /**
     * Gets the sourceThreadSequence value for this WorkflowProcessDto.
     * 
     * @return sourceThreadSequence
     */
    public java.lang.Integer getSourceThreadSequence() {
        return sourceThreadSequence;
    }


    /**
     * Sets the sourceThreadSequence value for this WorkflowProcessDto.
     * 
     * @param sourceThreadSequence
     */
    public void setSourceThreadSequence(java.lang.Integer sourceThreadSequence) {
        this.sourceThreadSequence = sourceThreadSequence;
    }


    /**
     * Gets the startupHour value for this WorkflowProcessDto.
     * 
     * @return startupHour
     */
    public java.lang.String getStartupHour() {
        return startupHour;
    }


    /**
     * Sets the startupHour value for this WorkflowProcessDto.
     * 
     * @param startupHour
     */
    public void setStartupHour(java.lang.String startupHour) {
        this.startupHour = startupHour;
    }


    /**
     * Gets the stateDescription value for this WorkflowProcessDto.
     * 
     * @return stateDescription
     */
    public java.lang.String getStateDescription() {
        return stateDescription;
    }


    /**
     * Sets the stateDescription value for this WorkflowProcessDto.
     * 
     * @param stateDescription
     */
    public void setStateDescription(java.lang.String stateDescription) {
        this.stateDescription = stateDescription;
    }


    /**
     * Gets the stateId value for this WorkflowProcessDto.
     * 
     * @return stateId
     */
    public java.lang.Integer getStateId() {
        return stateId;
    }


    /**
     * Sets the stateId value for this WorkflowProcessDto.
     * 
     * @param stateId
     */
    public void setStateId(java.lang.Integer stateId) {
        this.stateId = stateId;
    }


    /**
     * Gets the url value for this WorkflowProcessDto.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this WorkflowProcessDto.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the version value for this WorkflowProcessDto.
     * 
     * @return version
     */
    public java.lang.Integer getVersion() {
        return version;
    }


    /**
     * Sets the version value for this WorkflowProcessDto.
     * 
     * @param version
     */
    public void setVersion(java.lang.Integer version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkflowProcessDto)) return false;
        WorkflowProcessDto other = (WorkflowProcessDto) obj;
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
            ((this.attachmentSeqId==null && other.getAttachmentSeqId()==null) || 
             (this.attachmentSeqId!=null &&
              this.attachmentSeqId.equals(other.getAttachmentSeqId()))) &&
            ((this.canCancel==null && other.getCanCancel()==null) || 
             (this.canCancel!=null &&
              this.canCancel.equals(other.getCanCancel()))) &&
            ((this.canTake==null && other.getCanTake()==null) || 
             (this.canTake!=null &&
              this.canTake.equals(other.getCanTake()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.colleagueName==null && other.getColleagueName()==null) || 
             (this.colleagueName!=null &&
              this.colleagueName.equals(other.getColleagueName()))) &&
            this.companyId == other.getCompanyId() &&
            ((this.counterSign==null && other.getCounterSign()==null) || 
             (this.counterSign!=null &&
              this.counterSign.equals(other.getCounterSign()))) &&
            ((this.deadlineDate==null && other.getDeadlineDate()==null) || 
             (this.deadlineDate!=null &&
              this.deadlineDate.equals(other.getDeadlineDate()))) &&
            ((this.deadlineText==null && other.getDeadlineText()==null) || 
             (this.deadlineText!=null &&
              this.deadlineText.equals(other.getDeadlineText()))) &&
            ((this.mainAttachmentDocumentId==null && other.getMainAttachmentDocumentId()==null) || 
             (this.mainAttachmentDocumentId!=null &&
              this.mainAttachmentDocumentId.equals(other.getMainAttachmentDocumentId()))) &&
            this.mainAttachmentDocumentVersion == other.getMainAttachmentDocumentVersion() &&
            ((this.mobileReady==null && other.getMobileReady()==null) || 
             (this.mobileReady!=null &&
              this.mobileReady.equals(other.getMobileReady()))) &&
            ((this.movementHour==null && other.getMovementHour()==null) || 
             (this.movementHour!=null &&
              this.movementHour.equals(other.getMovementHour()))) &&
            this.movementSequence == other.getMovementSequence() &&
            ((this.processDescription==null && other.getProcessDescription()==null) || 
             (this.processDescription!=null &&
              this.processDescription.equals(other.getProcessDescription()))) &&
            ((this.processId==null && other.getProcessId()==null) || 
             (this.processId!=null &&
              this.processId.equals(other.getProcessId()))) &&
            this.processInstanceId == other.getProcessInstanceId() &&
            ((this.relatedDatasets==null && other.getRelatedDatasets()==null) || 
             (this.relatedDatasets!=null &&
              java.util.Arrays.equals(this.relatedDatasets, other.getRelatedDatasets()))) &&
            ((this.requesterId==null && other.getRequesterId()==null) || 
             (this.requesterId!=null &&
              this.requesterId.equals(other.getRequesterId()))) &&
            ((this.requesterName==null && other.getRequesterName()==null) || 
             (this.requesterName!=null &&
              this.requesterName.equals(other.getRequesterName()))) &&
            this.rowId == other.getRowId() &&
            ((this.sourceProcess==null && other.getSourceProcess()==null) || 
             (this.sourceProcess!=null &&
              this.sourceProcess.equals(other.getSourceProcess()))) &&
            ((this.sourceThreadSequence==null && other.getSourceThreadSequence()==null) || 
             (this.sourceThreadSequence!=null &&
              this.sourceThreadSequence.equals(other.getSourceThreadSequence()))) &&
            ((this.startupHour==null && other.getStartupHour()==null) || 
             (this.startupHour!=null &&
              this.startupHour.equals(other.getStartupHour()))) &&
            ((this.stateDescription==null && other.getStateDescription()==null) || 
             (this.stateDescription!=null &&
              this.stateDescription.equals(other.getStateDescription()))) &&
            ((this.stateId==null && other.getStateId()==null) || 
             (this.stateId!=null &&
              this.stateId.equals(other.getStateId()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion())));
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
        if (getAttachmentSeqId() != null) {
            _hashCode += getAttachmentSeqId().hashCode();
        }
        if (getCanCancel() != null) {
            _hashCode += getCanCancel().hashCode();
        }
        if (getCanTake() != null) {
            _hashCode += getCanTake().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getColleagueName() != null) {
            _hashCode += getColleagueName().hashCode();
        }
        _hashCode += new Long(getCompanyId()).hashCode();
        if (getCounterSign() != null) {
            _hashCode += getCounterSign().hashCode();
        }
        if (getDeadlineDate() != null) {
            _hashCode += getDeadlineDate().hashCode();
        }
        if (getDeadlineText() != null) {
            _hashCode += getDeadlineText().hashCode();
        }
        if (getMainAttachmentDocumentId() != null) {
            _hashCode += getMainAttachmentDocumentId().hashCode();
        }
        _hashCode += getMainAttachmentDocumentVersion();
        if (getMobileReady() != null) {
            _hashCode += getMobileReady().hashCode();
        }
        if (getMovementHour() != null) {
            _hashCode += getMovementHour().hashCode();
        }
        _hashCode += getMovementSequence();
        if (getProcessDescription() != null) {
            _hashCode += getProcessDescription().hashCode();
        }
        if (getProcessId() != null) {
            _hashCode += getProcessId().hashCode();
        }
        _hashCode += getProcessInstanceId();
        if (getRelatedDatasets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRelatedDatasets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRelatedDatasets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRequesterId() != null) {
            _hashCode += getRequesterId().hashCode();
        }
        if (getRequesterName() != null) {
            _hashCode += getRequesterName().hashCode();
        }
        _hashCode += getRowId();
        if (getSourceProcess() != null) {
            _hashCode += getSourceProcess().hashCode();
        }
        if (getSourceThreadSequence() != null) {
            _hashCode += getSourceThreadSequence().hashCode();
        }
        if (getStartupHour() != null) {
            _hashCode += getStartupHour().hashCode();
        }
        if (getStateDescription() != null) {
            _hashCode += getStateDescription().hashCode();
        }
        if (getStateId() != null) {
            _hashCode += getStateId().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkflowProcessDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.dm.ecm.technology.totvs.com/", "workflowProcessDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentSeqId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachmentSeqId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canCancel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "canCancel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canTake");
        elemField.setXmlName(new javax.xml.namespace.QName("", "canTake"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "code"));
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
        elemField.setFieldName("counterSign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "counterSign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deadlineDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deadlineDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("mainAttachmentDocumentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mainAttachmentDocumentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainAttachmentDocumentVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mainAttachmentDocumentVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileReady");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobileReady"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processInstanceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processInstanceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedDatasets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relatedDatasets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requesterId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requesterId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requesterName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requesterName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rowId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceProcess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceProcess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceThreadSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceThreadSequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startupHour");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startupHour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("stateId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
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
