/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.booleanworks.bomworkshop2015a.jerseyservices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author vortigern
 */
@Path("test")
public class TestService {
    public static final String CLICHED_MESSAGE = "Hello World!";
 
@GET
@Produces("text/plain")
    public String getHello() {
        return CLICHED_MESSAGE;
    }
}