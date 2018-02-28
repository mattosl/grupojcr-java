/**
 * AvailableUsersDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.totvs.technology.ecm.workflow.ws;

public class AvailableUsersDto  implements java.io.Serializable {
    private java.lang.Boolean isCollectiveTask;

    private com.totvs.technology.ecm.workflow.ws.ColleagueDto[] users;

    private java.lang.Boolean willShowUsers;

    public AvailableUsersDto() {
    }

    public AvailableUsersDto(
           java.lang.Boolean isCollectiveTask,
           com.totvs.technology.ecm.workflow.ws.ColleagueDto[] users,
           java.lang.Boolean willShowUsers) {
           this.isCollectiveTask = isCollectiveTask;
           this.users = users;
           this.willShowUsers = willShowUsers;
    }


    /**
     * Gets the isCollectiveTask value for this AvailableUsersDto.
     * 
     * @return isCollectiveTask
     */
    public java.lang.Boolean getIsCollectiveTask() {
        return isCollectiveTask;
    }


    /**
     * Sets the isCollectiveTask value for this AvailableUsersDto.
     * 
     * @param isCollectiveTask
     */
    public void setIsCollectiveTask(java.lang.Boolean isCollectiveTask) {
        this.isCollectiveTask = isCollectiveTask;
    }


    /**
     * Gets the users value for this AvailableUsersDto.
     * 
     * @return users
     */
    public com.totvs.technology.ecm.workflow.ws.ColleagueDto[] getUsers() {
        return users;
    }


    /**
     * Sets the users value for this AvailableUsersDto.
     * 
     * @param users
     */
    public void setUsers(com.totvs.technology.ecm.workflow.ws.ColleagueDto[] users) {
        this.users = users;
    }

    public com.totvs.technology.ecm.workflow.ws.ColleagueDto getUsers(int i) {
        return this.users[i];
    }

    public void setUsers(int i, com.totvs.technology.ecm.workflow.ws.ColleagueDto _value) {
        this.users[i] = _value;
    }


    /**
     * Gets the willShowUsers value for this AvailableUsersDto.
     * 
     * @return willShowUsers
     */
    public java.lang.Boolean getWillShowUsers() {
        return willShowUsers;
    }


    /**
     * Sets the willShowUsers value for this AvailableUsersDto.
     * 
     * @param willShowUsers
     */
    public void setWillShowUsers(java.lang.Boolean willShowUsers) {
        this.willShowUsers = willShowUsers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AvailableUsersDto)) return false;
        AvailableUsersDto other = (AvailableUsersDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isCollectiveTask==null && other.getIsCollectiveTask()==null) || 
             (this.isCollectiveTask!=null &&
              this.isCollectiveTask.equals(other.getIsCollectiveTask()))) &&
            ((this.users==null && other.getUsers()==null) || 
             (this.users!=null &&
              java.util.Arrays.equals(this.users, other.getUsers()))) &&
            ((this.willShowUsers==null && other.getWillShowUsers()==null) || 
             (this.willShowUsers!=null &&
              this.willShowUsers.equals(other.getWillShowUsers())));
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
        if (getIsCollectiveTask() != null) {
            _hashCode += getIsCollectiveTask().hashCode();
        }
        if (getUsers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUsers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUsers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWillShowUsers() != null) {
            _hashCode += getWillShowUsers().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AvailableUsersDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.workflow.ecm.technology.totvs.com/", "availableUsersDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCollectiveTask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isCollectiveTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("users");
        elemField.setXmlName(new javax.xml.namespace.QName("", "users"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.workflow.ecm.technology.totvs.com/", "colleagueDto"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("willShowUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "willShowUsers"));
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
