/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.booleanworks.bomworkshop2015a.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;
import org.slf4j.LoggerFactory;
//import org.slf4j.*;

/**
 *
 * @author vortigern
 */
public class TestJob implements StatefulJob{

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        LoggerFactory.getLogger(getClass()).debug("Test job is alive !!!!");
        System.out.println("Test job is alive !!!!");
    }
    
}
