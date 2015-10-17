/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.booleanworks.bomworkshop2015a.jerseyservices;

import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author vortigern
 */
@Path("t001")
public class TestService001 {

    @GET
    @Produces( MediaType.APPLICATION_JSON)
    public Object getHello() {

        ArrayList<String> obj = new ArrayList<String>();
        obj.add("001");
        obj.add("002");
        obj.add("003");
        

        return obj;
    }
}
