package com.mycompany.resp.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("datos")
public class datosR {

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public datos getdatos() {
        System.out.println("colon");
        datos a1 = new datos();
        a1.setName("faiber");
        a1.setPoints(60);

        return a1;
    }

}
