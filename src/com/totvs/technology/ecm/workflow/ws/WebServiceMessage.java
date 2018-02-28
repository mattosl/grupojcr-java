/**
 * WebServiceMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.totvs.technology.ecm.workflow.ws;

public class WebServiceMessage  implements java.io.Serializable {
    private long companyId;

    private java.lang.String documentDescription;

    private int documentId;

    private java.lang.String[] foo;

    private int version;

    private java.lang.String webServiceMessage;

    public WebServiceMessage() {
    }

    public WebServiceMessage(
           long companyId,
           java.lang.String documentDescription,
           int documentId,
           java.lang.String[] foo,
           int version,
           java.lang.String webServiceMessage) {
           this.companyId = companyId;
           this.documentDescription = documentDescription;
           this.documentId = documentId;
           this.foo = foo;
           this.version = version;
           this.webServiceMessage = webServiceMessage;
    }


    /**
     * Gets the companyId value for this WebServiceMessage.
     * 
     * @return companyId
     */
    public long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this WebServiceMessage.
     * 
     * @param companyId
     */
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the documentDescription value for this WebServiceMessage.
     * 
     * @return documentDescription
     */
    public java.lang.String getDocumentDescription() {
        return documentDescription;
    }


    /**
     * Sets the documentDescription value for this WebServiceMessage.
     * 
     * @param documentDescription
     */
    public void setDocumentDescription(java.lang.String documentDescription) {
        this.documentDescription = documentDescription;
    }


    /**
     * Gets the documentId value for this WebServiceMessage.
     * 
     * @return documentId
     */
    public int getDocumentId() {
        return documentId;
    }


    /**
     * Sets the documentId value for this WebServiceMessage.
     * 
     * @param documentId
     */
    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }


    /**
     * Gets the foo value for this WebServiceMessage.
     * 
     * @return foo
     */
    public java.lang.String[] getFoo() {
        return foo;
    }


    /**
     * Sets the foo value for this WebServiceMessage.
     * 
     * @param foo
     */
    public void setFoo(java.lang.String[] foo) {
        this.foo = foo;
    }

    public java.lang.String getFoo(int i) {
        return this.foo[i];
    }

    public void setFoo(int i, java.lang.String _value) {
        this.foo[i] = _value;
    }


    /**
     * Gets the version value for this WebServiceMessage.
     * 
     * @return version
     */
    public int getVersion() {
        return version;
    }


    /**
     * Sets the version value for this WebServiceMessage.
     * 
     * @param version
     */
    public void setVersion(int version) {
        this.version = version;
    }


    /**
     * Gets the webServiceMessage value for this WebServiceMessage.
     * 
     * @return webServiceMessage
     */
    public java.lang.String getWebServiceMessage() {
        return webServiceMessage;
    }


    /**
     * Sets the webServiceMessage value for this WebServiceMessage.
     * 
     * @param webServiceMessage
     */
    public void setWebServiceMessage(java.lang.String webServiceMessage) {
        this.webServiceMessage = webServiceMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WebServiceMessage)) return false;
        WebServiceMessage other = (WebServiceMessage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.companyId == other.getCompanyId() &&
            ((this.documentDescription==null && other.getDocumentDescription()==null) || 
             (this.documentDescription!=null &&
              this.documentDescription.equals(other.getDocumentDescription()))) &&
            this.documentId == other.getDocumentId() &&
            ((this.foo==null && other.getFoo()==null) || 
             (this.foo!=null &&
              java.util.Arrays.equals(this.foo, other.getFoo()))) &&
            this.version == other.getVersion() &&
            ((this.webServiceMessage==null && other.getWebServiceMessage()==null) || 
             (this.webServiceMessage!=null &&
              this.webServiceMessage.equals(other.getWebServiceMessage())));
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
        _hashCode += new Long(getCompanyId()).hashCode();
        if (getDocumentDescription() != null) {
            _hashCode += getDocumentDescription().hashCode();
        }
        _hashCode += getDocumentId();
        if (getFoo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFoo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFoo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getVersion();
        if (getWebServiceMessage() != null) {
            _hashCode += getWebServiceMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WebServiceMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.workflow.ecm.technology.totvs.com/", "webServiceMessage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "foo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webServiceMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "webServiceMessage"));
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
