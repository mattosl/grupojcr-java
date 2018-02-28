/**
 * SociableDocumentDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.totvs.technology.ecm.workflow.ws;

public class SociableDocumentDto  implements java.io.Serializable {
    private boolean commented;

    private boolean denounced;

    private java.lang.Integer documentId;

    private boolean following;

    private boolean liked;

    private java.lang.Integer numberComments;

    private java.lang.Integer numberDenouncements;

    private java.lang.Integer numberFollows;

    private java.lang.Integer numberLikes;

    private java.lang.Integer numberShares;

    private boolean shared;

    private java.lang.Long sociableId;

    private java.lang.Integer version;

    public SociableDocumentDto() {
    }

    public SociableDocumentDto(
           boolean commented,
           boolean denounced,
           java.lang.Integer documentId,
           boolean following,
           boolean liked,
           java.lang.Integer numberComments,
           java.lang.Integer numberDenouncements,
           java.lang.Integer numberFollows,
           java.lang.Integer numberLikes,
           java.lang.Integer numberShares,
           boolean shared,
           java.lang.Long sociableId,
           java.lang.Integer version) {
           this.commented = commented;
           this.denounced = denounced;
           this.documentId = documentId;
           this.following = following;
           this.liked = liked;
           this.numberComments = numberComments;
           this.numberDenouncements = numberDenouncements;
           this.numberFollows = numberFollows;
           this.numberLikes = numberLikes;
           this.numberShares = numberShares;
           this.shared = shared;
           this.sociableId = sociableId;
           this.version = version;
    }


    /**
     * Gets the commented value for this SociableDocumentDto.
     * 
     * @return commented
     */
    public boolean isCommented() {
        return commented;
    }


    /**
     * Sets the commented value for this SociableDocumentDto.
     * 
     * @param commented
     */
    public void setCommented(boolean commented) {
        this.commented = commented;
    }


    /**
     * Gets the denounced value for this SociableDocumentDto.
     * 
     * @return denounced
     */
    public boolean isDenounced() {
        return denounced;
    }


    /**
     * Sets the denounced value for this SociableDocumentDto.
     * 
     * @param denounced
     */
    public void setDenounced(boolean denounced) {
        this.denounced = denounced;
    }


    /**
     * Gets the documentId value for this SociableDocumentDto.
     * 
     * @return documentId
     */
    public java.lang.Integer getDocumentId() {
        return documentId;
    }


    /**
     * Sets the documentId value for this SociableDocumentDto.
     * 
     * @param documentId
     */
    public void setDocumentId(java.lang.Integer documentId) {
        this.documentId = documentId;
    }


    /**
     * Gets the following value for this SociableDocumentDto.
     * 
     * @return following
     */
    public boolean isFollowing() {
        return following;
    }


    /**
     * Sets the following value for this SociableDocumentDto.
     * 
     * @param following
     */
    public void setFollowing(boolean following) {
        this.following = following;
    }


    /**
     * Gets the liked value for this SociableDocumentDto.
     * 
     * @return liked
     */
    public boolean isLiked() {
        return liked;
    }


    /**
     * Sets the liked value for this SociableDocumentDto.
     * 
     * @param liked
     */
    public void setLiked(boolean liked) {
        this.liked = liked;
    }


    /**
     * Gets the numberComments value for this SociableDocumentDto.
     * 
     * @return numberComments
     */
    public java.lang.Integer getNumberComments() {
        return numberComments;
    }


    /**
     * Sets the numberComments value for this SociableDocumentDto.
     * 
     * @param numberComments
     */
    public void setNumberComments(java.lang.Integer numberComments) {
        this.numberComments = numberComments;
    }


    /**
     * Gets the numberDenouncements value for this SociableDocumentDto.
     * 
     * @return numberDenouncements
     */
    public java.lang.Integer getNumberDenouncements() {
        return numberDenouncements;
    }


    /**
     * Sets the numberDenouncements value for this SociableDocumentDto.
     * 
     * @param numberDenouncements
     */
    public void setNumberDenouncements(java.lang.Integer numberDenouncements) {
        this.numberDenouncements = numberDenouncements;
    }


    /**
     * Gets the numberFollows value for this SociableDocumentDto.
     * 
     * @return numberFollows
     */
    public java.lang.Integer getNumberFollows() {
        return numberFollows;
    }


    /**
     * Sets the numberFollows value for this SociableDocumentDto.
     * 
     * @param numberFollows
     */
    public void setNumberFollows(java.lang.Integer numberFollows) {
        this.numberFollows = numberFollows;
    }


    /**
     * Gets the numberLikes value for this SociableDocumentDto.
     * 
     * @return numberLikes
     */
    public java.lang.Integer getNumberLikes() {
        return numberLikes;
    }


    /**
     * Sets the numberLikes value for this SociableDocumentDto.
     * 
     * @param numberLikes
     */
    public void setNumberLikes(java.lang.Integer numberLikes) {
        this.numberLikes = numberLikes;
    }


    /**
     * Gets the numberShares value for this SociableDocumentDto.
     * 
     * @return numberShares
     */
    public java.lang.Integer getNumberShares() {
        return numberShares;
    }


    /**
     * Sets the numberShares value for this SociableDocumentDto.
     * 
     * @param numberShares
     */
    public void setNumberShares(java.lang.Integer numberShares) {
        this.numberShares = numberShares;
    }


    /**
     * Gets the shared value for this SociableDocumentDto.
     * 
     * @return shared
     */
    public boolean isShared() {
        return shared;
    }


    /**
     * Sets the shared value for this SociableDocumentDto.
     * 
     * @param shared
     */
    public void setShared(boolean shared) {
        this.shared = shared;
    }


    /**
     * Gets the sociableId value for this SociableDocumentDto.
     * 
     * @return sociableId
     */
    public java.lang.Long getSociableId() {
        return sociableId;
    }


    /**
     * Sets the sociableId value for this SociableDocumentDto.
     * 
     * @param sociableId
     */
    public void setSociableId(java.lang.Long sociableId) {
        this.sociableId = sociableId;
    }


    /**
     * Gets the version value for this SociableDocumentDto.
     * 
     * @return version
     */
    public java.lang.Integer getVersion() {
        return version;
    }


    /**
     * Sets the version value for this SociableDocumentDto.
     * 
     * @param version
     */
    public void setVersion(java.lang.Integer version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SociableDocumentDto)) return false;
        SociableDocumentDto other = (SociableDocumentDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.commented == other.isCommented() &&
            this.denounced == other.isDenounced() &&
            ((this.documentId==null && other.getDocumentId()==null) || 
             (this.documentId!=null &&
              this.documentId.equals(other.getDocumentId()))) &&
            this.following == other.isFollowing() &&
            this.liked == other.isLiked() &&
            ((this.numberComments==null && other.getNumberComments()==null) || 
             (this.numberComments!=null &&
              this.numberComments.equals(other.getNumberComments()))) &&
            ((this.numberDenouncements==null && other.getNumberDenouncements()==null) || 
             (this.numberDenouncements!=null &&
              this.numberDenouncements.equals(other.getNumberDenouncements()))) &&
            ((this.numberFollows==null && other.getNumberFollows()==null) || 
             (this.numberFollows!=null &&
              this.numberFollows.equals(other.getNumberFollows()))) &&
            ((this.numberLikes==null && other.getNumberLikes()==null) || 
             (this.numberLikes!=null &&
              this.numberLikes.equals(other.getNumberLikes()))) &&
            ((this.numberShares==null && other.getNumberShares()==null) || 
             (this.numberShares!=null &&
              this.numberShares.equals(other.getNumberShares()))) &&
            this.shared == other.isShared() &&
            ((this.sociableId==null && other.getSociableId()==null) || 
             (this.sociableId!=null &&
              this.sociableId.equals(other.getSociableId()))) &&
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
        _hashCode += (isCommented() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDenounced() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDocumentId() != null) {
            _hashCode += getDocumentId().hashCode();
        }
        _hashCode += (isFollowing() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isLiked() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNumberComments() != null) {
            _hashCode += getNumberComments().hashCode();
        }
        if (getNumberDenouncements() != null) {
            _hashCode += getNumberDenouncements().hashCode();
        }
        if (getNumberFollows() != null) {
            _hashCode += getNumberFollows().hashCode();
        }
        if (getNumberLikes() != null) {
            _hashCode += getNumberLikes().hashCode();
        }
        if (getNumberShares() != null) {
            _hashCode += getNumberShares().hashCode();
        }
        _hashCode += (isShared() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSociableId() != null) {
            _hashCode += getSociableId().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SociableDocumentDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.workflow.ecm.technology.totvs.com/", "sociableDocumentDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commented");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commented"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denounced");
        elemField.setXmlName(new javax.xml.namespace.QName("", "denounced"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("following");
        elemField.setXmlName(new javax.xml.namespace.QName("", "following"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liked");
        elemField.setXmlName(new javax.xml.namespace.QName("", "liked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberComments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberComments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberDenouncements");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberDenouncements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberFollows");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberFollows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberLikes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberLikes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberShares");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberShares"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shared");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shared"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sociableId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sociableId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
