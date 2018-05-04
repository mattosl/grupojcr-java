/**
 * ECMDashBoardServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.totvs.technology.ecm.dm.ws;

public class ECMDashBoardServiceServiceLocator extends org.apache.axis.client.Service implements com.totvs.technology.ecm.dm.ws.ECMDashBoardServiceService {

    public ECMDashBoardServiceServiceLocator() {
    }


    public ECMDashBoardServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ECMDashBoardServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DashBoardServicePort
    private java.lang.String DashBoardServicePort_address = "http://10.0.0.62:8180/webdesk/ECMDashBoardService";

    public java.lang.String getDashBoardServicePortAddress() {
        return DashBoardServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DashBoardServicePortWSDDServiceName = "DashBoardServicePort";

    public java.lang.String getDashBoardServicePortWSDDServiceName() {
        return DashBoardServicePortWSDDServiceName;
    }

    public void setDashBoardServicePortWSDDServiceName(java.lang.String name) {
        DashBoardServicePortWSDDServiceName = name;
    }

    public com.totvs.technology.ecm.dm.ws.DashBoardService getDashBoardServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DashBoardServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDashBoardServicePort(endpoint);
    }

    public com.totvs.technology.ecm.dm.ws.DashBoardService getDashBoardServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.totvs.technology.ecm.dm.ws.ECMDashBoardServiceServiceSoapBindingStub _stub = new com.totvs.technology.ecm.dm.ws.ECMDashBoardServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getDashBoardServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDashBoardServicePortEndpointAddress(java.lang.String address) {
        DashBoardServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.totvs.technology.ecm.dm.ws.DashBoardService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.totvs.technology.ecm.dm.ws.ECMDashBoardServiceServiceSoapBindingStub _stub = new com.totvs.technology.ecm.dm.ws.ECMDashBoardServiceServiceSoapBindingStub(new java.net.URL(DashBoardServicePort_address), this);
                _stub.setPortName(getDashBoardServicePortWSDDServiceName());
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
        if ("DashBoardServicePort".equals(inputPortName)) {
            return getDashBoardServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.dm.ecm.technology.totvs.com/", "ECMDashBoardServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.dm.ecm.technology.totvs.com/", "DashBoardServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DashBoardServicePort".equals(portName)) {
            setDashBoardServicePortEndpointAddress(address);
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
