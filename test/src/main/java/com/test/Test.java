package com.test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;

public class Test {

	public static void main(String[] args) {
		
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine() ;
		
		RepositoryService repositoryService = processEngine.getRepositoryService() ;
		repositoryService.createDeployment().addClasspathResource("diagrams/MyProcess.bpmn").deploy() ;
	}
	
}
