/**
 * ProcessAttachmentDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.totvs.technology.ecm.workflow.ws;

public class ProcessAttachmentDto  implements java.io.Serializable {
    private int attachmentSequence;

    private com.totvs.technology.ecm.workflow.ws.Attachment[] attachments;

    private java.lang.String colleagueId;

    private java.lang.String colleagueName;

    private long companyId;

    private java.lang.Long crc;

    private java.util.Calendar createDate;

    private java.lang.Long createDateTimestamp;

    private java.lang.Boolean deleted;

    private java.lang.String description;

    private java.lang.Integer documentId;

    private java.lang.String documentType;

    private java.lang.String fileName;

    private java.lang.Boolean newAttach;

    private java.lang.Integer originalMovementSequence;

    private java.lang.String permission;

    private int processInstanceId;

    private float size;

    private java.lang.Integer version;

    public ProcessAttachmentDto() {
    }

    public ProcessAttachmentDto(
           int attachmentSequence,
           com.totvs.technology.ecm.workflow.ws.Attachment[] attachments,
           java.lang.String colleagueId,
           java.lang.String colleagueName,
           long companyId,
           java.lang.Long crc,
           java.util.Calendar createDate,
           java.lang.Long createDateTimestamp,
           java.lang.Boolean deleted,
           java.lang.String description,
           java.lang.Integer documentId,
           java.lang.String documentType,
           java.lang.String fileName,
           java.lang.Boolean newAttach,
           java.lang.Integer originalMovementSequence,
           java.lang.String permission,
           int processInstanceId,
           float size,
           java.lang.Integer version) {
           this.attachmentSequence = attachmentSequence;
           this.attachments = attachments;
           this.colleagueId = colleagueId;
           this.colleagueName = colleagueName;
           this.companyId = companyId;
           this.crc = crc;
           this.createDate = createDate;
           this.createDateTimestamp = createDateTimestamp;
           this.deleted = deleted;
           this.description = description;
           this.documentId = documentId;
           this.documentType = documentType;
           this.fileName = fileName;
           this.newAttach = newAttach;
           this.originalMovementSequence = originalMovementSequence;
           this.permission = permission;
           this.processInstanceId = processInstanceId;
           this.size = size;
           this.version = version;
    }


    /**
     * Gets the attachmentSequence value for this ProcessAttachmentDto.
     * 
     * @return attachmentSequence
     */
    public int getAttachmentSequence() {
        return attachmentSequence;
    }


    /**
     * Sets the attachmentSequence value for this ProcessAttachmentDto.
     * 
     * @param attachmentSequence
     */
    public void setAttachmentSequence(int attachmentSequence) {
        this.attachmentSequence = attachmentSequence;
    }


    /**
     * Gets the attachments value for this ProcessAttachmentDto.
     * 
     * @return attachments
     */
    public com.totvs.technology.ecm.workflow.ws.Attachment[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this ProcessAttachmentDto.
     * 
     * @param attachments
     */
    public void setAttachments(com.totvs.technology.ecm.workflow.ws.Attachment[] attachments) {
        this.attachments = attachments;
    }

    public com.totvs.technology.ecm.workflow.ws.Attachment getAttachments(int i) {
        return this.attachments[i];
    }

    public void setAttachments(int i, com.totvs.technology.ecm.workflow.ws.Attachment _value) {
        this.attachments[i] = _value;
    }


    /**
     * Gets the colleagueId value for this ProcessAttachmentDto.
     * 
     * @return colleagueId
     */
    public java.lang.String getColleagueId() {
        return colleagueId;
    }


    /**
     * Sets the colleagueId value for this ProcessAttachmentDto.
     * 
     * @param colleagueId
     */
    public void setColleagueId(java.lang.String colleagueId) {
        this.colleagueId = colleagueId;
    }


    /**
     * Gets the colleagueName value for this ProcessAttachmentDto.
     * 
     * @return colleagueName
     */
    public java.lang.String getColleagueName() {
        return colleagueName;
    }


    /**
     * Sets the colleagueName value for this ProcessAttachmentDto.
     * 
     * @param colleagueName
     */
    public void setColleagueName(java.lang.String colleagueName) {
        this.colleagueName = colleagueName;
    }


    /**
     * Gets the companyId value for this ProcessAttachmentDto.
     * 
     * @return companyId
     */
    public long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this ProcessAttachmentDto.
     * 
     * @param companyId
     */
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the crc value for this ProcessAttachmentDto.
     * 
     * @return crc
     */
    public java.lang.Long getCrc() {
        return crc;
    }


    /**
     * Sets the crc value for this ProcessAttachmentDto.
     * 
     * @param crc
     */
    public void setCrc(java.lang.Long crc) {
        this.crc = crc;
    }


    /**
     * Gets the createDate value for this ProcessAttachmentDto.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this ProcessAttachmentDto.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the createDateTimestamp value for this ProcessAttachmentDto.
     * 
     * @return createDateTimestamp
     */
    public java.lang.Long getCreateDateTimestamp() {
        return createDateTimestamp;
    }


    /**
     * Sets the createDateTimestamp value for this ProcessAttachmentDto.
     * 
     * @param createDateTimestamp
     */
    public void setCreateDateTimestamp(java.lang.Long createDateTimestamp) {
        this.createDateTimestamp = createDateTimestamp;
    }


    /**
     * Gets the deleted value for this ProcessAttachmentDto.
     * 
     * @return deleted
     */
    public java.lang.Boolean getDeleted() {
        return deleted;
    }


    /**
     * Sets the deleted value for this ProcessAttachmentDto.
     * 
     * @param deleted
     */
    public void setDeleted(java.lang.Boolean deleted) {
        this.deleted = deleted;
    }


    /**
     * Gets the description value for this ProcessAttachmentDto.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ProcessAttachmentDto.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the documentId value for this ProcessAttachmentDto.
     * 
     * @return documentId
     */
    public java.lang.Integer getDocumentId() {
        return documentId;
    }


    /**
     * Sets the documentId value for this ProcessAttachmentDto.
     * 
     * @param documentId
     */
    public void setDocumentId(java.lang.Integer documentId) {
        this.documentId = documentId;
    }


    /**
     * Gets the documentType value for this ProcessAttachmentDto.
     * 
     * @return documentType
     */
    public java.lang.String getDocumentType() {
        return documentType;
    }


    /**
     * Sets the documentType value for this ProcessAttachmentDto.
     * 
     * @param documentType
     */
    public void setDocumentType(java.lang.String documentType) {
        this.documentType = documentType;
    }


    /**
     * Gets the fileName value for this ProcessAttachmentDto.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this ProcessAttachmentDto.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the newAttach value for this ProcessAttachmentDto.
     * 
     * @return newAttach
     */
    public java.lang.Boolean getNewAttach() {
        return newAttach;
    }


    /**
     * Sets the newAttach value for this ProcessAttachmentDto.
     * 
     * @param newAttach
     */
    public void setNewAttach(java.lang.Boolean newAttach) {
        this.newAttach = newAttach;
    }


    /**
     * Gets the originalMovementSequence value for this ProcessAttachmentDto.
     * 
     * @return originalMovementSequence
     */
    public java.lang.Integer getOriginalMovementSequence() {
        return originalMovementSequence;
    }


    /**
     * Sets the originalMovementSequence value for this ProcessAttachmentDto.
     * 
     * @param originalMovementSequence
     */
    public void setOriginalMovementSequence(java.lang.Integer originalMovementSequence) {
        this.originalMovementSequence = originalMovementSequence;
    }


    /**
     * Gets the permission value for this ProcessAttachmentDto.
     * 
     * @return permission
     */
    public java.lang.String getPermission() {
        return permission;
    }


    /**
     * Sets the permission value for this ProcessAttachmentDto.
     * 
     * @param permission
     */
    public void setPermission(java.lang.String permission) {
        this.permission = permission;
    }


    /**
     * Gets the processInstanceId value for this ProcessAttachmentDto.
     * 
     * @return processInstanceId
     */
    public int getProcessInstanceId() {
        return processInstanceId;
    }


    /**
     * Sets the processInstanceId value for this ProcessAttachmentDto.
     * 
     * @param processInstanceId
     */
    public void setProcessInstanceId(int processInstanceId) {
        this.processInstanceId = processInstanceId;
    }


    /**
     * Gets the size value for this ProcessAttachmentDto.
     * 
     * @return size
     */
    public float getSize() {
        return size;
    }


    /**
     * Sets the size value for this ProcessAttachmentDto.
     * 
     * @param size
     */
    public void setSize(float size) {
        this.size = size;
    }


    /**
     * Gets the version value for this ProcessAttachmentDto.
     * 
     * @return version
     */
    public java.lang.Integer getVersion() {
        return version;
    }


    /**
     * Sets the version value for this ProcessAttachmentDto.
     * 
     * @param version
     */
    public void setVersion(java.lang.Integer version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessAttachmentDto)) return false;
        ProcessAttachmentDto other = (ProcessAttachmentDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.attachmentSequence == other.getAttachmentSequence() &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              java.util.Arrays.equals(this.attachments, other.getAttachments()))) &&
            ((this.colleagueId==null && other.getColleagueId()==null) || 
             (this.colleagueId!=null &&
              this.colleagueId.equals(other.getColleagueId()))) &&
            ((this.colleagueName==null && other.getColleagueName()==null) || 
             (this.colleagueName!=null &&
              this.colleagueName.equals(other.getColleagueName()))) &&
            this.companyId == other.getCompanyId() &&
            ((this.crc==null && other.getCrc()==null) || 
             (this.crc!=null &&
              this.crc.equals(other.getCrc()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.createDateTimestamp==null && other.getCreateDateTimestamp()==null) || 
             (this.createDateTimestamp!=null &&
              this.createDateTimestamp.equals(other.getCreateDateTimestamp()))) &&
            ((this.deleted==null && other.getDeleted()==null) || 
             (this.deleted!=null &&
              this.deleted.equals(other.getDeleted()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.documentId==null && other.getDocumentId()==null) || 
             (this.documentId!=null &&
              this.documentId.equals(other.getDocumentId()))) &&
            ((this.documentType==null && other.getDocumentType()==null) || 
             (this.documentType!=null &&
              this.documentType.equals(other.getDocumentType()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.newAttach==null && other.getNewAttach()==null) || 
             (this.newAttach!=null &&
              this.newAttach.equals(other.getNewAttach()))) &&
            ((this.originalMovementSequence==null && other.getOriginalMovementSequence()==null) || 
             (this.originalMovementSequence!=null &&
              this.originalMovementSequence.equals(other.getOriginalMovementSequence()))) &&
            ((this.permission==null && other.getPermission()==null) || 
             (this.permission!=null &&
              this.permission.equals(other.getPermission()))) &&
            this.processInstanceId == other.getProcessInstanceId() &&
            this.size == other.getSize() &&
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
        _hashCode += getAttachmentSequence();
        if (getAttachments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getColleagueId() != null) {
            _hashCode += getColleagueId().hashCode();
        }
        if (getColleagueName() != null) {
            _hashCode += getColleagueName().hashCode();
        }
        _hashCode += new Long(getCompanyId()).hashCode();
        if (getCrc() != null) {
            _hashCode += getCrc().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getCreateDateTimestamp() != null) {
            _hashCode += getCreateDateTimestamp().hashCode();
        }
        if (getDeleted() != null) {
            _hashCode += getDeleted().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDocumentId() != null) {
            _hashCode += getDocumentId().hashCode();
        }
        if (getDocumentType() != null) {
            _hashCode += getDocumentType().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getNewAttach() != null) {
            _hashCode += getNewAttach().hashCode();
        }
        if (getOriginalMovementSequence() != null) {
            _hashCode += getOriginalMovementSequence().hashCode();
        }
        if (getPermission() != null) {
            _hashCode += getPermission().hashCode();
        }
        _hashCode += getProcessInstanceId();
        _hashCode += new Float(getSize()).hashCode();
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessAttachmentDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.workflow.ecm.technology.totvs.com/", "processAttachmentDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachmentSequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.workflow.ecm.technology.totvs.com/", "attachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
        elemField.setFieldName("crc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDateTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createDateTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("documentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newAttach");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newAttach"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalMovementSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originalMovementSequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permission");
        elemField.setXmlName(new javax.xml.namespace.QName("", "permission"));
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
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
