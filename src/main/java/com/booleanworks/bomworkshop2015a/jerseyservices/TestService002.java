/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.booleanworks.bomworkshop2015a.jerseyservices;

import com.booleanworks.bomworkshop2015a.entity.oagi10.bom.v1.BOMHeaderType;
import com.booleanworks.bomworkshop2015a.entity.oagi10.bom.v1.BOMType;
import com.booleanworks.bomworkshop2015a.entity.oagi10.bom.v1.OpenIDType;
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author vortigern
 */
@Path("t002")
public class TestService002 {

    @GET
    @Produces( MediaType.APPLICATION_JSON)
    public Object getHello() {

        
        BOMType testBOM = new BOMType() ;
        testBOM.setBOMHeader(new BOMHeaderType());
        testBOM.getBOMHeader().setID(new OpenIDType());
        testBOM.getBOMHeader().getID().setValue("test");
                

        

        return testBOM;
    }
}
