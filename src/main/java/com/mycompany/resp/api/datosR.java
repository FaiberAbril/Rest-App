package com.mycompany.resp.api;


import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("datos")
public class datosR {
   datosRepository dr = new datosRepository();
    
    
    @GET
    @Path("listar")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public List<datos> getdatos() {
        return dr.getdatoslista();
    }
    
    @GET
    @Path("dato/{id}")
     @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public datos getundato(@PathParam("id") int p){
        datos d;
       d = dr.getdatounidoc(p);
            return d;
    }  

    @POST
    @Path("add")
    @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public datos createdatos(datos a){
        dr.crear(a);
       return a;
    }
    
    
    
    
}
