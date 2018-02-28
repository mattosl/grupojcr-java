/**
 * Attachment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.totvs.technology.ecm.workflow.ws;

public class Attachment  implements java.io.Serializable {
    private java.lang.Boolean attach;

    private java.lang.Boolean descriptor;

    private java.lang.Boolean editing;

    private java.lang.String fileName;

    private com.totvs.technology.ecm.workflow.ws.Attachment fileSelected;

    private long fileSize;

    private byte[] filecontent;

    private java.lang.String fullPatch;

    private java.lang.String iconPath;

    private java.lang.Boolean mobile;

    private java.lang.String pathName;

    private java.lang.Boolean principal;

    public Attachment() {
    }

    public Attachment(
           java.lang.Boolean attach,
           java.lang.Boolean descriptor,
           java.lang.Boolean editing,
           java.lang.String fileName,
           com.totvs.technology.ecm.workflow.ws.Attachment fileSelected,
           long fileSize,
           byte[] filecontent,
           java.lang.String fullPatch,
           java.lang.String iconPath,
           java.lang.Boolean mobile,
           java.lang.String pathName,
           java.lang.Boolean principal) {
           this.attach = attach;
           this.descriptor = descriptor;
           this.editing = editing;
           this.fileName = fileName;
           this.fileSelected = fileSelected;
           this.fileSize = fileSize;
           this.filecontent = filecontent;
           this.fullPatch = fullPatch;
           this.iconPath = iconPath;
           this.mobile = mobile;
           this.pathName = pathName;
           this.principal = principal;
    }


    /**
     * Gets the attach value for this Attachment.
     * 
     * @return attach
     */
    public java.lang.Boolean getAttach() {
        return attach;
    }


    /**
     * Sets the attach value for this Attachment.
     * 
     * @param attach
     */
    public void setAttach(java.lang.Boolean attach) {
        this.attach = attach;
    }


    /**
     * Gets the descriptor value for this Attachment.
     * 
     * @return descriptor
     */
    public java.lang.Boolean getDescriptor() {
        return descriptor;
    }


    /**
     * Sets the descriptor value for this Attachment.
     * 
     * @param descriptor
     */
    public void setDescriptor(java.lang.Boolean descriptor) {
        this.descriptor = descriptor;
    }


    /**
     * Gets the editing value for this Attachment.
     * 
     * @return editing
     */
    public java.lang.Boolean getEditing() {
        return editing;
    }


    /**
     * Sets the editing value for this Attachment.
     * 
     * @param editing
     */
    public void setEditing(java.lang.Boolean editing) {
        this.editing = editing;
    }


    /**
     * Gets the fileName value for this Attachment.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this Attachment.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the fileSelected value for this Attachment.
     * 
     * @return fileSelected
     */
    public com.totvs.technology.ecm.workflow.ws.Attachment getFileSelected() {
        return fileSelected;
    }


    /**
     * Sets the fileSelected value for this Attachment.
     * 
     * @param fileSelected
     */
    public void setFileSelected(com.totvs.technology.ecm.workflow.ws.Attachment fileSelected) {
        this.fileSelected = fileSelected;
    }


    /**
     * Gets the fileSize value for this Attachment.
     * 
     * @return fileSize
     */
    public long getFileSize() {
        return fileSize;
    }


    /**
     * Sets the fileSize value for this Attachment.
     * 
     * @param fileSize
     */
    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }


    /**
     * Gets the filecontent value for this Attachment.
     * 
     * @return filecontent
     */
    public byte[] getFilecontent() {
        return filecontent;
    }


    /**
     * Sets the filecontent value for this Attachment.
     * 
     * @param filecontent
     */
    public void setFilecontent(byte[] filecontent) {
        this.filecontent = filecontent;
    }


    /**
     * Gets the fullPatch value for this Attachment.
     * 
     * @return fullPatch
     */
    public java.lang.String getFullPatch() {
        return fullPatch;
    }


    /**
     * Sets the fullPatch value for this Attachment.
     * 
     * @param fullPatch
     */
    public void setFullPatch(java.lang.String fullPatch) {
        this.fullPatch = fullPatch;
    }


    /**
     * Gets the iconPath value for this Attachment.
     * 
     * @return iconPath
     */
    public java.lang.String getIconPath() {
        return iconPath;
    }


    /**
     * Sets the iconPath value for this Attachment.
     * 
     * @param iconPath
     */
    public void setIconPath(java.lang.String iconPath) {
        this.iconPath = iconPath;
    }


    /**
     * Gets the mobile value for this Attachment.
     * 
     * @return mobile
     */
    public java.lang.Boolean getMobile() {
        return mobile;
    }


    /**
     * Sets the mobile value for this Attachment.
     * 
     * @param mobile
     */
    public void setMobile(java.lang.Boolean mobile) {
        this.mobile = mobile;
    }


    /**
     * Gets the pathName value for this Attachment.
     * 
     * @return pathName
     */
    public java.lang.String getPathName() {
        return pathName;
    }


    /**
     * Sets the pathName value for this Attachment.
     * 
     * @param pathName
     */
    public void setPathName(java.lang.String pathName) {
        this.pathName = pathName;
    }


    /**
     * Gets the principal value for this Attachment.
     * 
     * @return principal
     */
    public java.lang.Boolean getPrincipal() {
        return principal;
    }


    /**
     * Sets the principal value for this Attachment.
     * 
     * @param principal
     */
    public void setPrincipal(java.lang.Boolean principal) {
        this.principal = principal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Attachment)) return false;
        Attachment other = (Attachment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attach==null && other.getAttach()==null) || 
             (this.attach!=null &&
              this.attach.equals(other.getAttach()))) &&
            ((this.descriptor==null && other.getDescriptor()==null) || 
             (this.descriptor!=null &&
              this.descriptor.equals(other.getDescriptor()))) &&
            ((this.editing==null && other.getEditing()==null) || 
             (this.editing!=null &&
              this.editing.equals(other.getEditing()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.fileSelected==null && other.getFileSelected()==null) || 
             (this.fileSelected!=null &&
              this.fileSelected.equals(other.getFileSelected()))) &&
            this.fileSize == other.getFileSize() &&
            ((this.filecontent==null && other.getFilecontent()==null) || 
             (this.filecontent!=null &&
              java.util.Arrays.equals(this.filecontent, other.getFilecontent()))) &&
            ((this.fullPatch==null && other.getFullPatch()==null) || 
             (this.fullPatch!=null &&
              this.fullPatch.equals(other.getFullPatch()))) &&
            ((this.iconPath==null && other.getIconPath()==null) || 
             (this.iconPath!=null &&
              this.iconPath.equals(other.getIconPath()))) &&
            ((this.mobile==null && other.getMobile()==null) || 
             (this.mobile!=null &&
              this.mobile.equals(other.getMobile()))) &&
            ((this.pathName==null && other.getPathName()==null) || 
             (this.pathName!=null &&
              this.pathName.equals(other.getPathName()))) &&
            ((this.principal==null && other.getPrincipal()==null) || 
             (this.principal!=null &&
              this.principal.equals(other.getPrincipal())));
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
        if (getAttach() != null) {
            _hashCode += getAttach().hashCode();
        }
        if (getDescriptor() != null) {
            _hashCode += getDescriptor().hashCode();
        }
        if (getEditing() != null) {
            _hashCode += getEditing().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getFileSelected() != null) {
            _hashCode += getFileSelected().hashCode();
        }
        _hashCode += new Long(getFileSize()).hashCode();
        if (getFilecontent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFilecontent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFilecontent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFullPatch() != null) {
            _hashCode += getFullPatch().hashCode();
        }
        if (getIconPath() != null) {
            _hashCode += getIconPath().hashCode();
        }
        if (getMobile() != null) {
            _hashCode += getMobile().hashCode();
        }
        if (getPathName() != null) {
            _hashCode += getPathName().hashCode();
        }
        if (getPrincipal() != null) {
            _hashCode += getPrincipal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Attachment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.workflow.ecm.technology.totvs.com/", "attachment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attach");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attach"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descriptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "editing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("fileSelected");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileSelected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.workflow.ecm.technology.totvs.com/", "attachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filecontent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filecontent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullPatch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fullPatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iconPath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iconPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pathName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("principal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "principal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
