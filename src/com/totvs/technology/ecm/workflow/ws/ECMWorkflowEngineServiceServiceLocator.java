/**
 * ECMWorkflowEngineServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.totvs.technology.ecm.workflow.ws;

public class ECMWorkflowEngineServiceServiceLocator extends org.apache.axis.client.Service implements com.totvs.technology.ecm.workflow.ws.ECMWorkflowEngineServiceService {

    public ECMWorkflowEngineServiceServiceLocator() {
    }


    public ECMWorkflowEngineServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ECMWorkflowEngineServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WorkflowEngineServicePort
    private java.lang.String WorkflowEngineServicePort_address = "http://10.0.0.63:7180/webdesk/ECMWorkflowEngineService";

    public java.lang.String getWorkflowEngineServicePortAddress() {
        return WorkflowEngineServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WorkflowEngineServicePortWSDDServiceName = "WorkflowEngineServicePort";

    public java.lang.String getWorkflowEngineServicePortWSDDServiceName() {
        return WorkflowEngineServicePortWSDDServiceName;
    }

    public void setWorkflowEngineServicePortWSDDServiceName(java.lang.String name) {
        WorkflowEngineServicePortWSDDServiceName = name;
    }

    public com.totvs.technology.ecm.workflow.ws.WorkflowEngineService getWorkflowEngineServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WorkflowEngineServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWorkflowEngineServicePort(endpoint);
    }

    public com.totvs.technology.ecm.workflow.ws.WorkflowEngineService getWorkflowEngineServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.totvs.technology.ecm.workflow.ws.ECMWorkflowEngineServiceServiceSoapBindingStub _stub = new com.totvs.technology.ecm.workflow.ws.ECMWorkflowEngineServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getWorkflowEngineServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWorkflowEngineServicePortEndpointAddress(java.lang.String address) {
        WorkflowEngineServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.totvs.technology.ecm.workflow.ws.WorkflowEngineService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.totvs.technology.ecm.workflow.ws.ECMWorkflowEngineServiceServiceSoapBindingStub _stub = new com.totvs.technology.ecm.workflow.ws.ECMWorkflowEngineServiceServiceSoapBindingStub(new java.net.URL(WorkflowEngineServicePort_address), this);
                _stub.setPortName(getWorkflowEngineServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WorkflowEngineServicePort".equals(inputPortName)) {
            return getWorkflowEngineServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.workflow.ecm.technology.totvs.com/", "ECMWorkflowEngineServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.workflow.ecm.technology.totvs.com/", "WorkflowEngineServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WorkflowEngineServicePort".equals(portName)) {
            setWorkflowEngineServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
