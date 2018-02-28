package com.totvs.technology.ecm.workflow.ws;

public class WorkflowEngineServiceProxy implements com.totvs.technology.ecm.workflow.ws.WorkflowEngineService {
  private String _endpoint = null;
  private com.totvs.technology.ecm.workflow.ws.WorkflowEngineService workflowEngineService = null;
  
  public WorkflowEngineServiceProxy() {
    _initWorkflowEngineServiceProxy();
  }
  
  public WorkflowEngineServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initWorkflowEngineServiceProxy();
  }
  
  private void _initWorkflowEngineServiceProxy() {
    try {
      workflowEngineService = (new com.totvs.technology.ecm.workflow.ws.ECMWorkflowEngineServiceServiceLocator()).getWorkflowEngineServicePort();
      if (workflowEngineService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)workflowEngineService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)workflowEngineService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (workflowEngineService != null)
      ((javax.xml.rpc.Stub)workflowEngineService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.totvs.technology.ecm.workflow.ws.WorkflowEngineService getWorkflowEngineService() {
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService;
  }
  
  public java.lang.String importProcess(java.lang.String username, java.lang.String password, int companyId, java.lang.String processId, com.totvs.technology.ecm.workflow.ws.Attachment[] attachments, boolean newProcess, boolean overWrite, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.importProcess(username, password, companyId, processId, attachments, newProcess, overWrite, colleagueId);
  }
  
  public java.lang.String setDueDate(java.lang.String username, java.lang.String password, int companyId, int processInstanceId, java.lang.String userId, int threadSequence, java.lang.String newDueDate, int timeInSecods) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.setDueDate(username, password, companyId, processInstanceId, userId, threadSequence, newDueDate, timeInSecods);
  }
  
  public java.lang.String takeProcessTask(java.lang.String username, java.lang.String password, int companyId, java.lang.String userId, int processInstanceId, int threadSequence) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.takeProcessTask(username, password, companyId, userId, processInstanceId, threadSequence);
  }
  
  public java.lang.String[][] getInstanceCardData(java.lang.String username, java.lang.String password, int companyId, java.lang.String userId, int processInstanceId) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.getInstanceCardData(username, password, companyId, userId, processInstanceId);
  }
  
  public java.lang.String createWorkFlowProcessVersion(java.lang.String username, java.lang.String password, int companyId, java.lang.String processId) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.createWorkFlowProcessVersion(username, password, companyId, processId);
  }
  
  public java.lang.String getCardValue(java.lang.String username, java.lang.String password, int companyId, int processInstanceId, java.lang.String userId, java.lang.String cardFieldName) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.getCardValue(username, password, companyId, processInstanceId, userId, cardFieldName);
  }
  
  public com.totvs.technology.ecm.workflow.ws.ProcessDefinitionDto[] getAllProcessAvailableToExport(java.lang.String username, java.lang.String password, int companyId) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.getAllProcessAvailableToExport(username, password, companyId);
  }
  
  public java.lang.String[][] saveAndSendTask(java.lang.String username, java.lang.String password, int companyId, int processInstanceId, int choosedState, java.lang.String[] colleagueIds, java.lang.String comments, java.lang.String userId, boolean completeTask, com.totvs.technology.ecm.workflow.ws.ProcessAttachmentDto[] attachments, java.lang.String[][] cardData, com.totvs.technology.ecm.workflow.ws.ProcessTaskAppointmentDto[] appointment, boolean managerMode, int threadSequence) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.saveAndSendTask(username, password, companyId, processInstanceId, choosedState, colleagueIds, comments, userId, completeTask, attachments, cardData, appointment, managerMode, threadSequence);
  }
  
  public com.totvs.technology.ecm.workflow.ws.KeyValueDto[] setAutomaticDecisionClassic(java.lang.String username, java.lang.String password, int companyId, int processInstanceId, int iTaskAutom, int iTask, int condition, java.lang.String[] colleagueIds, java.lang.String comments, java.lang.String userId, boolean managerMode, int threadSequence) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.setAutomaticDecisionClassic(username, password, companyId, processInstanceId, iTaskAutom, iTask, condition, colleagueIds, comments, userId, managerMode, threadSequence);
  }
  
  public com.totvs.technology.ecm.workflow.ws.WebServiceMessage importProcessWithCardAndRelatedDatasets(java.lang.String username, java.lang.String password, int companyId, java.lang.String processId, com.totvs.technology.ecm.workflow.ws.Attachment[] processAttachs, boolean newProcess, boolean overWrite, java.lang.String colleagueId, int parentDocumentId, java.lang.String documentDescription, java.lang.String cardDescription, java.lang.String datasetName, com.totvs.technology.ecm.workflow.ws.Attachment[] cardAttachs, com.totvs.technology.ecm.workflow.ws.CardEventDto[] customEvents, com.totvs.technology.ecm.workflow.ws.GeneralInfoDto generalInfo, boolean update, int persistenceType, java.lang.String[] relatedDatasets) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.importProcessWithCardAndRelatedDatasets(username, password, companyId, processId, processAttachs, newProcess, overWrite, colleagueId, parentDocumentId, documentDescription, cardDescription, datasetName, cardAttachs, customEvents, generalInfo, update, persistenceType, relatedDatasets);
  }
  
  public com.totvs.technology.ecm.workflow.ws.DeadLineDto calculateDeadLineHours(java.lang.String username, java.lang.String password, int companyId, java.lang.String userId, java.lang.String data, int hora, int prazo, java.lang.String periodId) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.calculateDeadLineHours(username, password, companyId, userId, data, hora, prazo, periodId);
  }
  
  public com.totvs.technology.ecm.workflow.ws.ProcessDefinitionDto[] getAllProcessAvailableToImport(java.lang.String username, java.lang.String password, int companyId) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.getAllProcessAvailableToImport(username, password, companyId);
  }
  
  public java.lang.String cancelInstance(java.lang.String username, java.lang.String password, int companyId, int processInstanceId, java.lang.String userId, java.lang.String cancelText) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.cancelInstance(username, password, companyId, processInstanceId, userId, cancelText);
  }
  
  public int getActualThread(java.lang.String username, java.lang.String password, int companyId, int processInstanceId, int stateSequence) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.getActualThread(username, password, companyId, processInstanceId, stateSequence);
  }
  
  public int getWorkFlowProcessVersion(java.lang.String username, java.lang.String password, int companyId, java.lang.String processId) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.getWorkFlowProcessVersion(username, password, companyId, processId);
  }
  
  public com.totvs.technology.ecm.workflow.ws.ProcessDefinitionVersionDto[] getAvailableProcessOnDemand(java.lang.String username, java.lang.String password, int companyId, java.lang.String userId, int limit, int lastRowId) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.getAvailableProcessOnDemand(username, password, companyId, userId, limit, lastRowId);
  }
  
  public com.totvs.technology.ecm.workflow.ws.ProcessStateDto[] getAvailableStatesDetail(java.lang.String username, java.lang.String password, int companyId, java.lang.String processId, int processInstanceId, int threadSequence) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.getAvailableStatesDetail(username, password, companyId, processId, processInstanceId, threadSequence);
  }
  
  public byte[] exportProcessInZipFormat(java.lang.String username, java.lang.String password, int companyId, java.lang.String processId) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.exportProcessInZipFormat(username, password, companyId, processId);
  }
  
  public com.totvs.technology.ecm.workflow.ws.WebServiceMessage importProcessWithCard(java.lang.String username, java.lang.String password, int companyId, java.lang.String processId, com.totvs.technology.ecm.workflow.ws.Attachment[] processAttachs, boolean newProcess, boolean overWrite, java.lang.String colleagueId, int parentDocumentId, java.lang.String documentDescription, java.lang.String cardDescription, java.lang.String datasetName, com.totvs.technology.ecm.workflow.ws.Attachment[] cardAttachs, com.totvs.technology.ecm.workflow.ws.CardEventDto[] customEvents, boolean update) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.importProcessWithCard(username, password, companyId, processId, processAttachs, newProcess, overWrite, colleagueId, parentDocumentId, documentDescription, cardDescription, datasetName, cardAttachs, customEvents, update);
  }
  
  public java.lang.String[][] saveAndSendTaskByReplacement(java.lang.String username, java.lang.String password, int companyId, int processInstanceId, int choosedState, java.lang.String[] colleagueIds, java.lang.String comments, java.lang.String userId, boolean completeTask, com.totvs.technology.ecm.workflow.ws.ProcessAttachmentDto[] attachments, java.lang.String[][] cardData, com.totvs.technology.ecm.workflow.ws.ProcessTaskAppointmentDto[] appointment, boolean managerMode, int threadSequence, java.lang.String replacementId) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.saveAndSendTaskByReplacement(username, password, companyId, processInstanceId, choosedState, colleagueIds, comments, userId, completeTask, attachments, cardData, appointment, managerMode, threadSequence, replacementId);
  }
  
  public com.totvs.technology.ecm.workflow.ws.KeyValueDto[] startProcessClassic(java.lang.String username, java.lang.String password, int companyId, java.lang.String processId, int choosedState, java.lang.String[] colleagueIds, java.lang.String comments, java.lang.String userId, boolean completeTask, com.totvs.technology.ecm.workflow.ws.ProcessAttachmentDto[] attachments, com.totvs.technology.ecm.workflow.ws.KeyValueDto[] cardData, com.totvs.technology.ecm.workflow.ws.ProcessTaskAppointmentDto[] appointment, boolean managerMode) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.startProcessClassic(username, password, companyId, processId, choosedState, colleagueIds, comments, userId, completeTask, attachments, cardData, appointment, managerMode);
  }
  
  public java.lang.String cancelInstanceByReplacement(java.lang.String username, java.lang.String password, int companyId, int processInstanceId, java.lang.String userId, java.lang.String cancelText, java.lang.String replacementId) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.cancelInstanceByReplacement(username, password, companyId, processInstanceId, userId, cancelText, replacementId);
  }
  
  public com.totvs.technology.ecm.workflow.ws.DeadLineDto calculateDeadLineTime(java.lang.String username, java.lang.String password, int companyId, java.lang.String userId, java.lang.String data, int hora, int prazo, java.lang.String periodId) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.calculateDeadLineTime(username, password, companyId, userId, data, hora, prazo, periodId);
  }
  
  public java.lang.String[] simpleStartProcess(java.lang.String username, java.lang.String password, int companyId, java.lang.String processId, java.lang.String comments, com.totvs.technology.ecm.workflow.ws.ProcessAttachmentDto[] attachments, java.lang.String[][] cardData) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.simpleStartProcess(username, password, companyId, processId, comments, attachments, cardData);
  }
  
  public com.totvs.technology.ecm.workflow.ws.ProcessDefinitionVersionDto[] getAvailableProcess(java.lang.String username, java.lang.String password, int companyId, java.lang.String userId) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.getAvailableProcess(username, password, companyId, userId);
  }
  
  public java.lang.String[][] startProcess(java.lang.String username, java.lang.String password, int companyId, java.lang.String processId, int choosedState, java.lang.String[] colleagueIds, java.lang.String comments, java.lang.String userId, boolean completeTask, com.totvs.technology.ecm.workflow.ws.ProcessAttachmentDto[] attachments, java.lang.String[][] cardData, com.totvs.technology.ecm.workflow.ws.ProcessTaskAppointmentDto[] appointment, boolean managerMode) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.startProcess(username, password, companyId, processId, choosedState, colleagueIds, comments, userId, completeTask, attachments, cardData, appointment, managerMode);
  }
  
  public int[] getAllActiveStates(java.lang.String username, java.lang.String password, int companyId, java.lang.String userId, int processInstanceId) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.getAllActiveStates(username, password, companyId, userId, processInstanceId);
  }
  
  public java.lang.String releaseProcess(java.lang.String username, java.lang.String password, int companyId, java.lang.String processId) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.releaseProcess(username, password, companyId, processId);
  }
  
  public java.lang.String setTasksComments(java.lang.String username, java.lang.String password, int companyId, int processInstanceId, java.lang.String userId, int threadSequence, java.lang.String comments) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.setTasksComments(username, password, companyId, processInstanceId, userId, threadSequence, comments);
  }
  
  public com.totvs.technology.ecm.workflow.ws.ProcessDefinitionVersionDto[] searchProcess(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId, java.lang.String content, boolean favorite) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.searchProcess(username, password, companyId, colleagueId, content, favorite);
  }
  
  public com.totvs.technology.ecm.workflow.ws.AvailableUsersDto getAvailableUsersOnDemand(java.lang.String username, java.lang.String password, int companyId, int processInstanceId, int state, int threadSequence, int limit, int initialUser, java.lang.String userSearch) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.getAvailableUsersOnDemand(username, password, companyId, processInstanceId, state, threadSequence, limit, initialUser, userSearch);
  }
  
  public int getProcessFormId(java.lang.String username, java.lang.String password, int companyId, java.lang.String processId) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.getProcessFormId(username, password, companyId, processId);
  }
  
  public com.totvs.technology.ecm.workflow.ws.KeyValueDto[] saveAndSendTaskClassic(java.lang.String username, java.lang.String password, int companyId, int processInstanceId, int choosedState, java.lang.String[] colleagueIds, java.lang.String comments, java.lang.String userId, boolean completeTask, com.totvs.technology.ecm.workflow.ws.ProcessAttachmentDto[] attachments, com.totvs.technology.ecm.workflow.ws.KeyValueDto[] cardData, com.totvs.technology.ecm.workflow.ws.ProcessTaskAppointmentDto[] appointment, boolean managerMode, int threadSequence) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.saveAndSendTaskClassic(username, password, companyId, processInstanceId, choosedState, colleagueIds, comments, userId, completeTask, attachments, cardData, appointment, managerMode, threadSequence);
  }
  
  public com.totvs.technology.ecm.workflow.ws.AvailableUsersDto getAvailableUsersStartOnDemand(java.lang.String username, java.lang.String password, int companyId, java.lang.String processId, int state, int threadSequence, int limit, int initialUser, java.lang.String userSearch) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.getAvailableUsersStartOnDemand(username, password, companyId, processId, state, threadSequence, limit, initialUser, userSearch);
  }
  
  public java.lang.String[] getAvailableUsers(java.lang.String username, java.lang.String password, int companyId, int processInstanceId, int state, int threadSequence) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.getAvailableUsers(username, password, companyId, processInstanceId, state, threadSequence);
  }
  
  public java.lang.String getProcessImage(java.lang.String username, java.lang.String password, int companyId, java.lang.String userId, java.lang.String processId) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.getProcessImage(username, password, companyId, userId, processId);
  }
  
  public com.totvs.technology.ecm.workflow.ws.ProcessAttachmentDto[] getAttachments(java.lang.String username, java.lang.String password, int companyId, java.lang.String userId, int processInstanceId) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.getAttachments(username, password, companyId, userId, processInstanceId);
  }
  
  public com.totvs.technology.ecm.workflow.ws.WebServiceMessage importProcessWithCardAndPersistenceType(java.lang.String username, java.lang.String password, int companyId, java.lang.String processId, com.totvs.technology.ecm.workflow.ws.Attachment[] processAttachs, boolean newProcess, boolean overWrite, java.lang.String colleagueId, int parentDocumentId, java.lang.String documentDescription, java.lang.String cardDescription, java.lang.String datasetName, com.totvs.technology.ecm.workflow.ws.Attachment[] cardAttachs, com.totvs.technology.ecm.workflow.ws.CardEventDto[] customEvents, boolean update, int persistenceType) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.importProcessWithCardAndPersistenceType(username, password, companyId, processId, processAttachs, newProcess, overWrite, colleagueId, parentDocumentId, documentDescription, cardDescription, datasetName, cardAttachs, customEvents, update, persistenceType);
  }
  
  public java.lang.String[] getAvailableUsersStart(java.lang.String username, java.lang.String password, int companyId, java.lang.String processId, int state, int threadSequence) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.getAvailableUsersStart(username, password, companyId, processId, state, threadSequence);
  }
  
  public com.totvs.technology.ecm.workflow.ws.WebServiceMessage importProcessWithCardAndGeneralInfo(java.lang.String username, java.lang.String password, int companyId, java.lang.String processId, com.totvs.technology.ecm.workflow.ws.Attachment[] processAttachs, boolean newProcess, boolean overWrite, java.lang.String colleagueId, int parentDocumentId, java.lang.String documentDescription, java.lang.String cardDescription, java.lang.String datasetName, com.totvs.technology.ecm.workflow.ws.Attachment[] cardAttachs, com.totvs.technology.ecm.workflow.ws.CardEventDto[] customEvents, com.totvs.technology.ecm.workflow.ws.GeneralInfoDto generalInfo, boolean update, int persistenceType) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.importProcessWithCardAndGeneralInfo(username, password, companyId, processId, processAttachs, newProcess, overWrite, colleagueId, parentDocumentId, documentDescription, cardDescription, datasetName, cardAttachs, customEvents, generalInfo, update, persistenceType);
  }
  
  public java.lang.String takeProcessTaskByReplacement(java.lang.String username, java.lang.String password, int companyId, java.lang.String userId, int processInstanceId, int threadSequence, java.lang.String replacementId) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.takeProcessTaskByReplacement(username, password, companyId, userId, processInstanceId, threadSequence, replacementId);
  }
  
  public java.lang.String exportProcess(java.lang.String username, java.lang.String password, int companyId, java.lang.String processId) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.exportProcess(username, password, companyId, processId);
  }
  
  public int[] getAvailableStates(java.lang.String username, java.lang.String password, int companyId, java.lang.String processId, int processInstanceId, int threadSequence) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.getAvailableStates(username, password, companyId, processId, processInstanceId, threadSequence);
  }
  
  public java.lang.String updateWorkflowAttachment(java.lang.String username, java.lang.String password, int companyId, int processInstanceId, java.lang.String usuario, com.totvs.technology.ecm.workflow.ws.DocumentDto[] document, com.totvs.technology.ecm.workflow.ws.Attachment[] attachments) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.updateWorkflowAttachment(username, password, companyId, processInstanceId, usuario, document, attachments);
  }
  
  public com.totvs.technology.ecm.workflow.ws.ProcessHistoryDto[] getHistories(java.lang.String username, java.lang.String password, int companyId, java.lang.String userId, int processInstanceId) throws java.rmi.RemoteException, com.totvs.technology.ecm.workflow.ws.Exception{
    if (workflowEngineService == null)
      _initWorkflowEngineServiceProxy();
    return workflowEngineService.getHistories(username, password, companyId, userId, processInstanceId);
  }
  
  
}