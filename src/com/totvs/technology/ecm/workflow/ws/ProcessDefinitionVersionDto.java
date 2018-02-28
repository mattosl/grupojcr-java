/**
 * ProcessDefinitionVersionDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.totvs.technology.ecm.workflow.ws;

public class ProcessDefinitionVersionDto  implements java.io.Serializable {
    private java.lang.String categoryStructure;

    private long companyId;

    private java.lang.Boolean counterSign;

    private boolean favorite;

    private java.lang.Integer formId;

    private java.lang.Integer formVersion;

    private java.lang.String fullCategoryStructure;

    private com.totvs.technology.ecm.workflow.ws.ProcessStateDto initialProcessState;

    private boolean mobileReady;

    private java.lang.String processDescription;

    private java.lang.String processId;

    private java.lang.String[] relatedDatasets;

    private int rowId;

    private int version;

    private java.lang.String versionDescription;

    public ProcessDefinitionVersionDto() {
    }

    public ProcessDefinitionVersionDto(
           java.lang.String categoryStructure,
           long companyId,
           java.lang.Boolean counterSign,
           boolean favorite,
           java.lang.Integer formId,
           java.lang.Integer formVersion,
           java.lang.String fullCategoryStructure,
           com.totvs.technology.ecm.workflow.ws.ProcessStateDto initialProcessState,
           boolean mobileReady,
           java.lang.String processDescription,
           java.lang.String processId,
           java.lang.String[] relatedDatasets,
           int rowId,
           int version,
           java.lang.String versionDescription) {
           this.categoryStructure = categoryStructure;
           this.companyId = companyId;
           this.counterSign = counterSign;
           this.favorite = favorite;
           this.formId = formId;
           this.formVersion = formVersion;
           this.fullCategoryStructure = fullCategoryStructure;
           this.initialProcessState = initialProcessState;
           this.mobileReady = mobileReady;
           this.processDescription = processDescription;
           this.processId = processId;
           this.relatedDatasets = relatedDatasets;
           this.rowId = rowId;
           this.version = version;
           this.versionDescription = versionDescription;
    }


    /**
     * Gets the categoryStructure value for this ProcessDefinitionVersionDto.
     * 
     * @return categoryStructure
     */
    public java.lang.String getCategoryStructure() {
        return categoryStructure;
    }


    /**
     * Sets the categoryStructure value for this ProcessDefinitionVersionDto.
     * 
     * @param categoryStructure
     */
    public void setCategoryStructure(java.lang.String categoryStructure) {
        this.categoryStructure = categoryStructure;
    }


    /**
     * Gets the companyId value for this ProcessDefinitionVersionDto.
     * 
     * @return companyId
     */
    public long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this ProcessDefinitionVersionDto.
     * 
     * @param companyId
     */
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the counterSign value for this ProcessDefinitionVersionDto.
     * 
     * @return counterSign
     */
    public java.lang.Boolean getCounterSign() {
        return counterSign;
    }


    /**
     * Sets the counterSign value for this ProcessDefinitionVersionDto.
     * 
     * @param counterSign
     */
    public void setCounterSign(java.lang.Boolean counterSign) {
        this.counterSign = counterSign;
    }


    /**
     * Gets the favorite value for this ProcessDefinitionVersionDto.
     * 
     * @return favorite
     */
    public boolean isFavorite() {
        return favorite;
    }


    /**
     * Sets the favorite value for this ProcessDefinitionVersionDto.
     * 
     * @param favorite
     */
    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }


    /**
     * Gets the formId value for this ProcessDefinitionVersionDto.
     * 
     * @return formId
     */
    public java.lang.Integer getFormId() {
        return formId;
    }


    /**
     * Sets the formId value for this ProcessDefinitionVersionDto.
     * 
     * @param formId
     */
    public void setFormId(java.lang.Integer formId) {
        this.formId = formId;
    }


    /**
     * Gets the formVersion value for this ProcessDefinitionVersionDto.
     * 
     * @return formVersion
     */
    public java.lang.Integer getFormVersion() {
        return formVersion;
    }


    /**
     * Sets the formVersion value for this ProcessDefinitionVersionDto.
     * 
     * @param formVersion
     */
    public void setFormVersion(java.lang.Integer formVersion) {
        this.formVersion = formVersion;
    }


    /**
     * Gets the fullCategoryStructure value for this ProcessDefinitionVersionDto.
     * 
     * @return fullCategoryStructure
     */
    public java.lang.String getFullCategoryStructure() {
        return fullCategoryStructure;
    }


    /**
     * Sets the fullCategoryStructure value for this ProcessDefinitionVersionDto.
     * 
     * @param fullCategoryStructure
     */
    public void setFullCategoryStructure(java.lang.String fullCategoryStructure) {
        this.fullCategoryStructure = fullCategoryStructure;
    }


    /**
     * Gets the initialProcessState value for this ProcessDefinitionVersionDto.
     * 
     * @return initialProcessState
     */
    public com.totvs.technology.ecm.workflow.ws.ProcessStateDto getInitialProcessState() {
        return initialProcessState;
    }


    /**
     * Sets the initialProcessState value for this ProcessDefinitionVersionDto.
     * 
     * @param initialProcessState
     */
    public void setInitialProcessState(com.totvs.technology.ecm.workflow.ws.ProcessStateDto initialProcessState) {
        this.initialProcessState = initialProcessState;
    }


    /**
     * Gets the mobileReady value for this ProcessDefinitionVersionDto.
     * 
     * @return mobileReady
     */
    public boolean isMobileReady() {
        return mobileReady;
    }


    /**
     * Sets the mobileReady value for this ProcessDefinitionVersionDto.
     * 
     * @param mobileReady
     */
    public void setMobileReady(boolean mobileReady) {
        this.mobileReady = mobileReady;
    }


    /**
     * Gets the processDescription value for this ProcessDefinitionVersionDto.
     * 
     * @return processDescription
     */
    public java.lang.String getProcessDescription() {
        return processDescription;
    }


    /**
     * Sets the processDescription value for this ProcessDefinitionVersionDto.
     * 
     * @param processDescription
     */
    public void setProcessDescription(java.lang.String processDescription) {
        this.processDescription = processDescription;
    }


    /**
     * Gets the processId value for this ProcessDefinitionVersionDto.
     * 
     * @return processId
     */
    public java.lang.String getProcessId() {
        return processId;
    }


    /**
     * Sets the processId value for this ProcessDefinitionVersionDto.
     * 
     * @param processId
     */
    public void setProcessId(java.lang.String processId) {
        this.processId = processId;
    }


    /**
     * Gets the relatedDatasets value for this ProcessDefinitionVersionDto.
     * 
     * @return relatedDatasets
     */
    public java.lang.String[] getRelatedDatasets() {
        return relatedDatasets;
    }


    /**
     * Sets the relatedDatasets value for this ProcessDefinitionVersionDto.
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
     * Gets the rowId value for this ProcessDefinitionVersionDto.
     * 
     * @return rowId
     */
    public int getRowId() {
        return rowId;
    }


    /**
     * Sets the rowId value for this ProcessDefinitionVersionDto.
     * 
     * @param rowId
     */
    public void setRowId(int rowId) {
        this.rowId = rowId;
    }


    /**
     * Gets the version value for this ProcessDefinitionVersionDto.
     * 
     * @return version
     */
    public int getVersion() {
        return version;
    }


    /**
     * Sets the version value for this ProcessDefinitionVersionDto.
     * 
     * @param version
     */
    public void setVersion(int version) {
        this.version = version;
    }


    /**
     * Gets the versionDescription value for this ProcessDefinitionVersionDto.
     * 
     * @return versionDescription
     */
    public java.lang.String getVersionDescription() {
        return versionDescription;
    }


    /**
     * Sets the versionDescription value for this ProcessDefinitionVersionDto.
     * 
     * @param versionDescription
     */
    public void setVersionDescription(java.lang.String versionDescription) {
        this.versionDescription = versionDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessDefinitionVersionDto)) return false;
        ProcessDefinitionVersionDto other = (ProcessDefinitionVersionDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.categoryStructure==null && other.getCategoryStructure()==null) || 
             (this.categoryStructure!=null &&
              this.categoryStructure.equals(other.getCategoryStructure()))) &&
            this.companyId == other.getCompanyId() &&
            ((this.counterSign==null && other.getCounterSign()==null) || 
             (this.counterSign!=null &&
              this.counterSign.equals(other.getCounterSign()))) &&
            this.favorite == other.isFavorite() &&
            ((this.formId==null && other.getFormId()==null) || 
             (this.formId!=null &&
              this.formId.equals(other.getFormId()))) &&
            ((this.formVersion==null && other.getFormVersion()==null) || 
             (this.formVersion!=null &&
              this.formVersion.equals(other.getFormVersion()))) &&
            ((this.fullCategoryStructure==null && other.getFullCategoryStructure()==null) || 
             (this.fullCategoryStructure!=null &&
              this.fullCategoryStructure.equals(other.getFullCategoryStructure()))) &&
            ((this.initialProcessState==null && other.getInitialProcessState()==null) || 
             (this.initialProcessState!=null &&
              this.initialProcessState.equals(other.getInitialProcessState()))) &&
            this.mobileReady == other.isMobileReady() &&
            ((this.processDescription==null && other.getProcessDescription()==null) || 
             (this.processDescription!=null &&
              this.processDescription.equals(other.getProcessDescription()))) &&
            ((this.processId==null && other.getProcessId()==null) || 
             (this.processId!=null &&
              this.processId.equals(other.getProcessId()))) &&
            ((this.relatedDatasets==null && other.getRelatedDatasets()==null) || 
             (this.relatedDatasets!=null &&
              java.util.Arrays.equals(this.relatedDatasets, other.getRelatedDatasets()))) &&
            this.rowId == other.getRowId() &&
            this.version == other.getVersion() &&
            ((this.versionDescription==null && other.getVersionDescription()==null) || 
             (this.versionDescription!=null &&
              this.versionDescription.equals(other.getVersionDescription())));
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
        if (getCategoryStructure() != null) {
            _hashCode += getCategoryStructure().hashCode();
        }
        _hashCode += new Long(getCompanyId()).hashCode();
        if (getCounterSign() != null) {
            _hashCode += getCounterSign().hashCode();
        }
        _hashCode += (isFavorite() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFormId() != null) {
            _hashCode += getFormId().hashCode();
        }
        if (getFormVersion() != null) {
            _hashCode += getFormVersion().hashCode();
        }
        if (getFullCategoryStructure() != null) {
            _hashCode += getFullCategoryStructure().hashCode();
        }
        if (getInitialProcessState() != null) {
            _hashCode += getInitialProcessState().hashCode();
        }
        _hashCode += (isMobileReady() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getProcessDescription() != null) {
            _hashCode += getProcessDescription().hashCode();
        }
        if (getProcessId() != null) {
            _hashCode += getProcessId().hashCode();
        }
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
        _hashCode += getRowId();
        _hashCode += getVersion();
        if (getVersionDescription() != null) {
            _hashCode += getVersionDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessDefinitionVersionDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.workflow.ecm.technology.totvs.com/", "processDefinitionVersionDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryStructure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoryStructure"));
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
        elemField.setFieldName("favorite");
        elemField.setXmlName(new javax.xml.namespace.QName("", "favorite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullCategoryStructure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fullCategoryStructure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialProcessState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "initialProcessState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.workflow.ecm.technology.totvs.com/", "processStateDto"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileReady");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobileReady"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("relatedDatasets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relatedDatasets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rowId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "versionDescription"));
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
