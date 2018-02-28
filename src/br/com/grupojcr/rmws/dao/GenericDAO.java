package br.com.grupojcr.rmws.dao;


import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

import org.apache.log4j.Logger;


@Stateless
public class GenericDAO {
	
	protected static Logger LOG = Logger.getLogger(GenericDAO.class);

	@PersistenceContext(unitName = "corporeRM")
	protected EntityManager manager;
	
	@Resource(mappedName="java:jboss/datasources/corporeRMDS")
	protected DataSource datasource;


}