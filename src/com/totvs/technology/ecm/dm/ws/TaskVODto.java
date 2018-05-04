/**
 * TaskVODto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.totvs.technology.ecm.dm.ws;

public class TaskVODto  implements java.io.Serializable {
    private com.totvs.technology.ecm.dm.ws.TaskVODto[] children;

    private java.lang.String description;

    private java.lang.String iconPath;

    private java.lang.String iconset;

    private java.lang.String state;

    private java.lang.String taskId;

    private java.lang.String type;

    public TaskVODto() {
    }

    public TaskVODto(
           com.totvs.technology.ecm.dm.ws.TaskVODto[] children,
           java.lang.String description,
           java.lang.String iconPath,
           java.lang.String iconset,
           java.lang.String state,
           java.lang.String taskId,
           java.lang.String type) {
           this.children = children;
           this.description = description;
           this.iconPath = iconPath;
           this.iconset = iconset;
           this.state = state;
           this.taskId = taskId;
           this.type = type;
    }


    /**
     * Gets the children value for this TaskVODto.
     * 
     * @return children
     */
    public com.totvs.technology.ecm.dm.ws.TaskVODto[] getChildren() {
        return children;
    }


    /**
     * Sets the children value for this TaskVODto.
     * 
     * @param children
     */
    public void setChildren(com.totvs.technology.ecm.dm.ws.TaskVODto[] children) {
        this.children = children;
    }

    public com.totvs.technology.ecm.dm.ws.TaskVODto getChildren(int i) {
        return this.children[i];
    }

    public void setChildren(int i, com.totvs.technology.ecm.dm.ws.TaskVODto _value) {
        this.children[i] = _value;
    }


    /**
     * Gets the description value for this TaskVODto.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TaskVODto.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the iconPath value for this TaskVODto.
     * 
     * @return iconPath
     */
    public java.lang.String getIconPath() {
        return iconPath;
    }


    /**
     * Sets the iconPath value for this TaskVODto.
     * 
     * @param iconPath
     */
    public void setIconPath(java.lang.String iconPath) {
        this.iconPath = iconPath;
    }


    /**
     * Gets the iconset value for this TaskVODto.
     * 
     * @return iconset
     */
    public java.lang.String getIconset() {
        return iconset;
    }


    /**
     * Sets the iconset value for this TaskVODto.
     * 
     * @param iconset
     */
    public void setIconset(java.lang.String iconset) {
        this.iconset = iconset;
    }


    /**
     * Gets the state value for this TaskVODto.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this TaskVODto.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the taskId value for this TaskVODto.
     * 
     * @return taskId
     */
    public java.lang.String getTaskId() {
        return taskId;
    }


    /**
     * Sets the taskId value for this TaskVODto.
     * 
     * @param taskId
     */
    public void setTaskId(java.lang.String taskId) {
        this.taskId = taskId;
    }


    /**
     * Gets the type value for this TaskVODto.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this TaskVODto.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaskVODto)) return false;
        TaskVODto other = (TaskVODto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.children==null && other.getChildren()==null) || 
             (this.children!=null &&
              java.util.Arrays.equals(this.children, other.getChildren()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.iconPath==null && other.getIconPath()==null) || 
             (this.iconPath!=null &&
              this.iconPath.equals(other.getIconPath()))) &&
            ((this.iconset==null && other.getIconset()==null) || 
             (this.iconset!=null &&
              this.iconset.equals(other.getIconset()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.taskId==null && other.getTaskId()==null) || 
             (this.taskId!=null &&
              this.taskId.equals(other.getTaskId()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getChildren() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildren());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildren(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getIconPath() != null) {
            _hashCode += getIconPath().hashCode();
        }
        if (getIconset() != null) {
            _hashCode += getIconset().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getTaskId() != null) {
            _hashCode += getTaskId().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaskVODto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.dm.ecm.technology.totvs.com/", "taskVODto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("children");
        elemField.setXmlName(new javax.xml.namespace.QName("", "children"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.dm.ecm.technology.totvs.com/", "taskVODto"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
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
        elemField.setFieldName("iconset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iconset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taskId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
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
