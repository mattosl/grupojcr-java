/**
 * DashBoardService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.totvs.technology.ecm.dm.ws;

public interface DashBoardService extends java.rmi.Remote {
    public com.totvs.technology.ecm.dm.ws.DocumentDto[] findCheckoutDocuments(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception;
    public com.totvs.technology.ecm.dm.ws.DocumentDto[] findDocumentsToApprove(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception;
    public com.totvs.technology.ecm.dm.ws.DocumentDto[] findAgreementDocuments(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception;
    public com.totvs.technology.ecm.dm.ws.WorkflowProcessDto[] findMyRequests(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception;
    public com.totvs.technology.ecm.dm.ws.DocumentDto[] findDocumentsToApproveOnDemand(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId, int limit, int lastRowId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception;
    public com.totvs.technology.ecm.dm.ws.HomeRequestSummaryDto getSummaryRequests(int companyId, java.lang.String user, java.lang.String password, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception;
    public com.totvs.technology.ecm.dm.ws.TaskVODto[] fillTypeTasksOfReplacement(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId, java.lang.String replacementId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception;
    public com.totvs.technology.ecm.dm.ws.WorkflowProcessDto[] findCancelledTasks(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception;
    public com.totvs.technology.ecm.dm.ws.WorkflowProcessDto[] findWorkflowTasksOnDemand(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId, int limit, int lastRowId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception;
    public com.totvs.technology.ecm.dm.ws.WorkflowProcessDto[] findConsensusTasks(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception;
    public int[] fillStatusTask(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception;
    public com.totvs.technology.ecm.dm.ws.WorkflowProcessDto[] findCompletedTasks(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception;
    public com.totvs.technology.ecm.dm.ws.WorkflowProcessDto[] findExpiredWorkflowTasks(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception;
    public java.lang.String getUrlEcm(long companyId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception;
    public com.totvs.technology.ecm.dm.ws.WorkflowProcessDto[] getOpenTasksByColleagueGroupsOnDemand(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId, int limit, int lastRowId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception;
    public int[] fillChronoTasks(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId, int yearIni, int yearFin, int mounthIni, int mounthFin, int dayIni, int dayFin, int kindTask) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception;
    public com.totvs.technology.ecm.dm.ws.DocumentDto[] findMyDocumentsOnDemand(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId, int limit, int lastRowId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception;
    public com.totvs.technology.ecm.dm.ws.WorkflowProcessDto[] findMyManagerTasks(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception;
    public com.totvs.technology.ecm.dm.ws.WorkflowProcessDto[] findWorkflowTasks(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception;
    public com.totvs.technology.ecm.dm.ws.WorkflowTaskDto[] getOpenTasksByColleagueRoles(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception;
    public com.totvs.technology.ecm.dm.ws.DocumentDto[] findMyDocuments(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception;
    public com.totvs.technology.ecm.dm.ws.WorkflowProcessDto[] getOpenTasksByColleagueRolesOnDemand(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId, int limit, int lastRowId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception;
    public com.totvs.technology.ecm.dm.ws.WorkflowTaskDto[] getOpenTasksByColleagueGroups(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception;
    public com.totvs.technology.ecm.dm.ws.WorkflowProcessDto[] findMyRequestsOnDemand(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId, int limit, int lastRowId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception;
    public com.totvs.technology.ecm.dm.ws.TaskVODto[] fillTypeTasks(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception;
    public com.totvs.technology.ecm.dm.ws.WorkflowProcessDto[] findTransferredTasks(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.totvs.technology.ecm.dm.ws.Exception;
}
