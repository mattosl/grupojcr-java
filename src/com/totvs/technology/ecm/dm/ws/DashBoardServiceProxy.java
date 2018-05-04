package com.totvs.technology.ecm.dm.ws;

public class DashBoardServiceProxy implements com.totvs.technology.ecm.dm.ws.DashBoardService {
  private String _endpoint = null;
  private com.totvs.technology.ecm.dm.ws.DashBoardService dashBoardService = null;
  
  public DashBoardServiceProxy() {
    _initDashBoardServiceProxy();
  }
  
  public DashBoardServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initDashBoardServiceProxy();
  }
  
  private void _initDashBoardServiceProxy() {
    try {
      dashBoardService = (new com.totvs.technology.ecm.dm.ws.ECMDashBoardServiceServiceLocator()).getDashBoardServicePort();
      if (dashBoardService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)dashBoardService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)dashBoardService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (dashBoardService != null)
      ((javax.xml.rpc.Stub)dashBoardService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.totvs.technology.ecm.dm.ws.DashBoardService getDashBoardService() {
    if (dashBoardService == null)
      _initDashBoardServiceProxy();
    return dashBoardService;
  }
  
  public com.totvs.technology.ecm.dm.ws.DocumentDto[] findCheckoutDocuments(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception{
    if (dashBoardService == null)
      _initDashBoardServiceProxy();
    return dashBoardService.findCheckoutDocuments(username, password, companyId, colleagueId);
  }
  
  public com.totvs.technology.ecm.dm.ws.DocumentDto[] findDocumentsToApprove(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception{
    if (dashBoardService == null)
      _initDashBoardServiceProxy();
    return dashBoardService.findDocumentsToApprove(username, password, companyId, colleagueId);
  }
  
  public com.totvs.technology.ecm.dm.ws.DocumentDto[] findAgreementDocuments(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception{
    if (dashBoardService == null)
      _initDashBoardServiceProxy();
    return dashBoardService.findAgreementDocuments(username, password, companyId, colleagueId);
  }
  
  public com.totvs.technology.ecm.dm.ws.WorkflowProcessDto[] findMyRequests(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception{
    if (dashBoardService == null)
      _initDashBoardServiceProxy();
    return dashBoardService.findMyRequests(username, password, companyId, colleagueId);
  }
  
  public com.totvs.technology.ecm.dm.ws.DocumentDto[] findDocumentsToApproveOnDemand(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId, int limit, int lastRowId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception{
    if (dashBoardService == null)
      _initDashBoardServiceProxy();
    return dashBoardService.findDocumentsToApproveOnDemand(username, password, companyId, colleagueId, limit, lastRowId);
  }
  
  public com.totvs.technology.ecm.dm.ws.HomeRequestSummaryDto getSummaryRequests(int companyId, java.lang.String user, java.lang.String password, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception{
    if (dashBoardService == null)
      _initDashBoardServiceProxy();
    return dashBoardService.getSummaryRequests(companyId, user, password, colleagueId);
  }
  
  public com.totvs.technology.ecm.dm.ws.TaskVODto[] fillTypeTasksOfReplacement(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId, java.lang.String replacementId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception{
    if (dashBoardService == null)
      _initDashBoardServiceProxy();
    return dashBoardService.fillTypeTasksOfReplacement(username, password, companyId, colleagueId, replacementId);
  }
  
  public com.totvs.technology.ecm.dm.ws.WorkflowProcessDto[] findCancelledTasks(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception{
    if (dashBoardService == null)
      _initDashBoardServiceProxy();
    return dashBoardService.findCancelledTasks(username, password, companyId, colleagueId);
  }
  
  public com.totvs.technology.ecm.dm.ws.WorkflowProcessDto[] findWorkflowTasksOnDemand(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId, int limit, int lastRowId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception{
    if (dashBoardService == null)
      _initDashBoardServiceProxy();
    return dashBoardService.findWorkflowTasksOnDemand(username, password, companyId, colleagueId, limit, lastRowId);
  }
  
  public com.totvs.technology.ecm.dm.ws.WorkflowProcessDto[] findConsensusTasks(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception{
    if (dashBoardService == null)
      _initDashBoardServiceProxy();
    return dashBoardService.findConsensusTasks(username, password, companyId, colleagueId);
  }
  
  public int[] fillStatusTask(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception{
    if (dashBoardService == null)
      _initDashBoardServiceProxy();
    return dashBoardService.fillStatusTask(username, password, companyId, colleagueId);
  }
  
  public com.totvs.technology.ecm.dm.ws.WorkflowProcessDto[] findCompletedTasks(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception{
    if (dashBoardService == null)
      _initDashBoardServiceProxy();
    return dashBoardService.findCompletedTasks(username, password, companyId, colleagueId);
  }
  
  public com.totvs.technology.ecm.dm.ws.WorkflowProcessDto[] findExpiredWorkflowTasks(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception{
    if (dashBoardService == null)
      _initDashBoardServiceProxy();
    return dashBoardService.findExpiredWorkflowTasks(username, password, companyId, colleagueId);
  }
  
  public java.lang.String getUrlEcm(long companyId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception{
    if (dashBoardService == null)
      _initDashBoardServiceProxy();
    return dashBoardService.getUrlEcm(companyId);
  }
  
  public com.totvs.technology.ecm.dm.ws.WorkflowProcessDto[] getOpenTasksByColleagueGroupsOnDemand(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId, int limit, int lastRowId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception{
    if (dashBoardService == null)
      _initDashBoardServiceProxy();
    return dashBoardService.getOpenTasksByColleagueGroupsOnDemand(username, password, companyId, colleagueId, limit, lastRowId);
  }
  
  public int[] fillChronoTasks(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId, int yearIni, int yearFin, int mounthIni, int mounthFin, int dayIni, int dayFin, int kindTask) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception{
    if (dashBoardService == null)
      _initDashBoardServiceProxy();
    return dashBoardService.fillChronoTasks(username, password, companyId, colleagueId, yearIni, yearFin, mounthIni, mounthFin, dayIni, dayFin, kindTask);
  }
  
  public com.totvs.technology.ecm.dm.ws.DocumentDto[] findMyDocumentsOnDemand(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId, int limit, int lastRowId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception{
    if (dashBoardService == null)
      _initDashBoardServiceProxy();
    return dashBoardService.findMyDocumentsOnDemand(username, password, companyId, colleagueId, limit, lastRowId);
  }
  
  public com.totvs.technology.ecm.dm.ws.WorkflowProcessDto[] findMyManagerTasks(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception{
    if (dashBoardService == null)
      _initDashBoardServiceProxy();
    return dashBoardService.findMyManagerTasks(username, password, companyId, colleagueId);
  }
  
  public com.totvs.technology.ecm.dm.ws.WorkflowProcessDto[] findWorkflowTasks(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception{
    if (dashBoardService == null)
      _initDashBoardServiceProxy();
    return dashBoardService.findWorkflowTasks(username, password, companyId, colleagueId);
  }
  
  public com.totvs.technology.ecm.dm.ws.WorkflowTaskDto[] getOpenTasksByColleagueRoles(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception{
    if (dashBoardService == null)
      _initDashBoardServiceProxy();
    return dashBoardService.getOpenTasksByColleagueRoles(username, password, companyId, colleagueId);
  }
  
  public com.totvs.technology.ecm.dm.ws.DocumentDto[] findMyDocuments(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception{
    if (dashBoardService == null)
      _initDashBoardServiceProxy();
    return dashBoardService.findMyDocuments(username, password, companyId, colleagueId);
  }
  
  public com.totvs.technology.ecm.dm.ws.WorkflowProcessDto[] getOpenTasksByColleagueRolesOnDemand(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId, int limit, int lastRowId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception{
    if (dashBoardService == null)
      _initDashBoardServiceProxy();
    return dashBoardService.getOpenTasksByColleagueRolesOnDemand(username, password, companyId, colleagueId, limit, lastRowId);
  }
  
  public com.totvs.technology.ecm.dm.ws.WorkflowTaskDto[] getOpenTasksByColleagueGroups(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception{
    if (dashBoardService == null)
      _initDashBoardServiceProxy();
    return dashBoardService.getOpenTasksByColleagueGroups(username, password, companyId, colleagueId);
  }
  
  public com.totvs.technology.ecm.dm.ws.WorkflowProcessDto[] findMyRequestsOnDemand(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId, int limit, int lastRowId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception{
    if (dashBoardService == null)
      _initDashBoardServiceProxy();
    return dashBoardService.findMyRequestsOnDemand(username, password, companyId, colleagueId, limit, lastRowId);
  }
  
  public com.totvs.technology.ecm.dm.ws.TaskVODto[] fillTypeTasks(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception{
    if (dashBoardService == null)
      _initDashBoardServiceProxy();
    return dashBoardService.fillTypeTasks(username, password, companyId, colleagueId);
  }
  
  public com.totvs.technology.ecm.dm.ws.WorkflowProcessDto[] findTransferredTasks(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception{
    if (dashBoardService == null)
      _initDashBoardServiceProxy();
    return dashBoardService.findTransferredTasks(username, password, companyId, colleagueId);
  }
  
  
}