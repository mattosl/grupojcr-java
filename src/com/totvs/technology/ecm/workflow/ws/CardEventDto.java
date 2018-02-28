/**
 * CardEventDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.totvs.technology.ecm.workflow.ws;

public class CardEventDto  implements java.io.Serializable {
    private java.lang.String eventDescription;

    private java.lang.String eventId;

    private java.lang.Boolean eventVersAnt;

    public CardEventDto() {
    }

    public CardEventDto(
           java.lang.String eventDescription,
           java.lang.String eventId,
           java.lang.Boolean eventVersAnt) {
           this.eventDescription = eventDescription;
           this.eventId = eventId;
           this.eventVersAnt = eventVersAnt;
    }


    /**
     * Gets the eventDescription value for this CardEventDto.
     * 
     * @return eventDescription
     */
    public java.lang.String getEventDescription() {
        return eventDescription;
    }


    /**
     * Sets the eventDescription value for this CardEventDto.
     * 
     * @param eventDescription
     */
    public void setEventDescription(java.lang.String eventDescription) {
        this.eventDescription = eventDescription;
    }


    /**
     * Gets the eventId value for this CardEventDto.
     * 
     * @return eventId
     */
    public java.lang.String getEventId() {
        return eventId;
    }


    /**
     * Sets the eventId value for this CardEventDto.
     * 
     * @param eventId
     */
    public void setEventId(java.lang.String eventId) {
        this.eventId = eventId;
    }


    /**
     * Gets the eventVersAnt value for this CardEventDto.
     * 
     * @return eventVersAnt
     */
    public java.lang.Boolean getEventVersAnt() {
        return eventVersAnt;
    }


    /**
     * Sets the eventVersAnt value for this CardEventDto.
     * 
     * @param eventVersAnt
     */
    public void setEventVersAnt(java.lang.Boolean eventVersAnt) {
        this.eventVersAnt = eventVersAnt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardEventDto)) return false;
        CardEventDto other = (CardEventDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eventDescription==null && other.getEventDescription()==null) || 
             (this.eventDescription!=null &&
              this.eventDescription.equals(other.getEventDescription()))) &&
            ((this.eventId==null && other.getEventId()==null) || 
             (this.eventId!=null &&
              this.eventId.equals(other.getEventId()))) &&
            ((this.eventVersAnt==null && other.getEventVersAnt()==null) || 
             (this.eventVersAnt!=null &&
              this.eventVersAnt.equals(other.getEventVersAnt())));
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
        if (getEventDescription() != null) {
            _hashCode += getEventDescription().hashCode();
        }
        if (getEventId() != null) {
            _hashCode += getEventId().hashCode();
        }
        if (getEventVersAnt() != null) {
            _hashCode += getEventVersAnt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardEventDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.workflow.ecm.technology.totvs.com/", "cardEventDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventVersAnt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventVersAnt"));
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
