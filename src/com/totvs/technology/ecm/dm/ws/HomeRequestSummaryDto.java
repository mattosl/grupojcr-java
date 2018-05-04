/**
 * HomeRequestSummaryDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.totvs.technology.ecm.dm.ws;

public class HomeRequestSummaryDto  implements java.io.Serializable {
    private int numberOfDocumentApprovalPending;

    private int numberOfDocumentAwaitingApproval;

    private int numberOfLearningTasks;

    private int numberOfOpenRequests;

    private int numberOfPoolGroupRequests;

    private int numberOfPoolRoleRequests;

    private int numberOfWorkflowDelayedRequests;

    private int numberOfWorkflowPendingRequests;

    private int numberOfWorkflowUnderDeadlineRequests;

    private java.lang.String replacementId;

    public HomeRequestSummaryDto() {
    }

    public HomeRequestSummaryDto(
           int numberOfDocumentApprovalPending,
           int numberOfDocumentAwaitingApproval,
           int numberOfLearningTasks,
           int numberOfOpenRequests,
           int numberOfPoolGroupRequests,
           int numberOfPoolRoleRequests,
           int numberOfWorkflowDelayedRequests,
           int numberOfWorkflowPendingRequests,
           int numberOfWorkflowUnderDeadlineRequests,
           java.lang.String replacementId) {
           this.numberOfDocumentApprovalPending = numberOfDocumentApprovalPending;
           this.numberOfDocumentAwaitingApproval = numberOfDocumentAwaitingApproval;
           this.numberOfLearningTasks = numberOfLearningTasks;
           this.numberOfOpenRequests = numberOfOpenRequests;
           this.numberOfPoolGroupRequests = numberOfPoolGroupRequests;
           this.numberOfPoolRoleRequests = numberOfPoolRoleRequests;
           this.numberOfWorkflowDelayedRequests = numberOfWorkflowDelayedRequests;
           this.numberOfWorkflowPendingRequests = numberOfWorkflowPendingRequests;
           this.numberOfWorkflowUnderDeadlineRequests = numberOfWorkflowUnderDeadlineRequests;
           this.replacementId = replacementId;
    }


    /**
     * Gets the numberOfDocumentApprovalPending value for this HomeRequestSummaryDto.
     * 
     * @return numberOfDocumentApprovalPending
     */
    public int getNumberOfDocumentApprovalPending() {
        return numberOfDocumentApprovalPending;
    }


    /**
     * Sets the numberOfDocumentApprovalPending value for this HomeRequestSummaryDto.
     * 
     * @param numberOfDocumentApprovalPending
     */
    public void setNumberOfDocumentApprovalPending(int numberOfDocumentApprovalPending) {
        this.numberOfDocumentApprovalPending = numberOfDocumentApprovalPending;
    }


    /**
     * Gets the numberOfDocumentAwaitingApproval value for this HomeRequestSummaryDto.
     * 
     * @return numberOfDocumentAwaitingApproval
     */
    public int getNumberOfDocumentAwaitingApproval() {
        return numberOfDocumentAwaitingApproval;
    }


    /**
     * Sets the numberOfDocumentAwaitingApproval value for this HomeRequestSummaryDto.
     * 
     * @param numberOfDocumentAwaitingApproval
     */
    public void setNumberOfDocumentAwaitingApproval(int numberOfDocumentAwaitingApproval) {
        this.numberOfDocumentAwaitingApproval = numberOfDocumentAwaitingApproval;
    }


    /**
     * Gets the numberOfLearningTasks value for this HomeRequestSummaryDto.
     * 
     * @return numberOfLearningTasks
     */
    public int getNumberOfLearningTasks() {
        return numberOfLearningTasks;
    }


    /**
     * Sets the numberOfLearningTasks value for this HomeRequestSummaryDto.
     * 
     * @param numberOfLearningTasks
     */
    public void setNumberOfLearningTasks(int numberOfLearningTasks) {
        this.numberOfLearningTasks = numberOfLearningTasks;
    }


    /**
     * Gets the numberOfOpenRequests value for this HomeRequestSummaryDto.
     * 
     * @return numberOfOpenRequests
     */
    public int getNumberOfOpenRequests() {
        return numberOfOpenRequests;
    }


    /**
     * Sets the numberOfOpenRequests value for this HomeRequestSummaryDto.
     * 
     * @param numberOfOpenRequests
     */
    public void setNumberOfOpenRequests(int numberOfOpenRequests) {
        this.numberOfOpenRequests = numberOfOpenRequests;
    }


    /**
     * Gets the numberOfPoolGroupRequests value for this HomeRequestSummaryDto.
     * 
     * @return numberOfPoolGroupRequests
     */
    public int getNumberOfPoolGroupRequests() {
        return numberOfPoolGroupRequests;
    }


    /**
     * Sets the numberOfPoolGroupRequests value for this HomeRequestSummaryDto.
     * 
     * @param numberOfPoolGroupRequests
     */
    public void setNumberOfPoolGroupRequests(int numberOfPoolGroupRequests) {
        this.numberOfPoolGroupRequests = numberOfPoolGroupRequests;
    }


    /**
     * Gets the numberOfPoolRoleRequests value for this HomeRequestSummaryDto.
     * 
     * @return numberOfPoolRoleRequests
     */
    public int getNumberOfPoolRoleRequests() {
        return numberOfPoolRoleRequests;
    }


    /**
     * Sets the numberOfPoolRoleRequests value for this HomeRequestSummaryDto.
     * 
     * @param numberOfPoolRoleRequests
     */
    public void setNumberOfPoolRoleRequests(int numberOfPoolRoleRequests) {
        this.numberOfPoolRoleRequests = numberOfPoolRoleRequests;
    }


    /**
     * Gets the numberOfWorkflowDelayedRequests value for this HomeRequestSummaryDto.
     * 
     * @return numberOfWorkflowDelayedRequests
     */
    public int getNumberOfWorkflowDelayedRequests() {
        return numberOfWorkflowDelayedRequests;
    }


    /**
     * Sets the numberOfWorkflowDelayedRequests value for this HomeRequestSummaryDto.
     * 
     * @param numberOfWorkflowDelayedRequests
     */
    public void setNumberOfWorkflowDelayedRequests(int numberOfWorkflowDelayedRequests) {
        this.numberOfWorkflowDelayedRequests = numberOfWorkflowDelayedRequests;
    }


    /**
     * Gets the numberOfWorkflowPendingRequests value for this HomeRequestSummaryDto.
     * 
     * @return numberOfWorkflowPendingRequests
     */
    public int getNumberOfWorkflowPendingRequests() {
        return numberOfWorkflowPendingRequests;
    }


    /**
     * Sets the numberOfWorkflowPendingRequests value for this HomeRequestSummaryDto.
     * 
     * @param numberOfWorkflowPendingRequests
     */
    public void setNumberOfWorkflowPendingRequests(int numberOfWorkflowPendingRequests) {
        this.numberOfWorkflowPendingRequests = numberOfWorkflowPendingRequests;
    }


    /**
     * Gets the numberOfWorkflowUnderDeadlineRequests value for this HomeRequestSummaryDto.
     * 
     * @return numberOfWorkflowUnderDeadlineRequests
     */
    public int getNumberOfWorkflowUnderDeadlineRequests() {
        return numberOfWorkflowUnderDeadlineRequests;
    }


    /**
     * Sets the numberOfWorkflowUnderDeadlineRequests value for this HomeRequestSummaryDto.
     * 
     * @param numberOfWorkflowUnderDeadlineRequests
     */
    public void setNumberOfWorkflowUnderDeadlineRequests(int numberOfWorkflowUnderDeadlineRequests) {
        this.numberOfWorkflowUnderDeadlineRequests = numberOfWorkflowUnderDeadlineRequests;
    }


    /**
     * Gets the replacementId value for this HomeRequestSummaryDto.
     * 
     * @return replacementId
     */
    public java.lang.String getReplacementId() {
        return replacementId;
    }


    /**
     * Sets the replacementId value for this HomeRequestSummaryDto.
     * 
     * @param replacementId
     */
    public void setReplacementId(java.lang.String replacementId) {
        this.replacementId = replacementId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HomeRequestSummaryDto)) return false;
        HomeRequestSummaryDto other = (HomeRequestSummaryDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.numberOfDocumentApprovalPending == other.getNumberOfDocumentApprovalPending() &&
            this.numberOfDocumentAwaitingApproval == other.getNumberOfDocumentAwaitingApproval() &&
            this.numberOfLearningTasks == other.getNumberOfLearningTasks() &&
            this.numberOfOpenRequests == other.getNumberOfOpenRequests() &&
            this.numberOfPoolGroupRequests == other.getNumberOfPoolGroupRequests() &&
            this.numberOfPoolRoleRequests == other.getNumberOfPoolRoleRequests() &&
            this.numberOfWorkflowDelayedRequests == other.getNumberOfWorkflowDelayedRequests() &&
            this.numberOfWorkflowPendingRequests == other.getNumberOfWorkflowPendingRequests() &&
            this.numberOfWorkflowUnderDeadlineRequests == other.getNumberOfWorkflowUnderDeadlineRequests() &&
            ((this.replacementId==null && other.getReplacementId()==null) || 
             (this.replacementId!=null &&
              this.replacementId.equals(other.getReplacementId())));
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
        _hashCode += getNumberOfDocumentApprovalPending();
        _hashCode += getNumberOfDocumentAwaitingApproval();
        _hashCode += getNumberOfLearningTasks();
        _hashCode += getNumberOfOpenRequests();
        _hashCode += getNumberOfPoolGroupRequests();
        _hashCode += getNumberOfPoolRoleRequests();
        _hashCode += getNumberOfWorkflowDelayedRequests();
        _hashCode += getNumberOfWorkflowPendingRequests();
        _hashCode += getNumberOfWorkflowUnderDeadlineRequests();
        if (getReplacementId() != null) {
            _hashCode += getReplacementId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HomeRequestSummaryDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.dm.ecm.technology.totvs.com/", "homeRequestSummaryDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfDocumentApprovalPending");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfDocumentApprovalPending"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfDocumentAwaitingApproval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfDocumentAwaitingApproval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfLearningTasks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfLearningTasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfOpenRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfOpenRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfPoolGroupRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfPoolGroupRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfPoolRoleRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfPoolRoleRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfWorkflowDelayedRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfWorkflowDelayedRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfWorkflowPendingRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfWorkflowPendingRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfWorkflowUnderDeadlineRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfWorkflowUnderDeadlineRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replacementId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "replacementId"));
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
