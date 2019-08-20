package com.mycompany.resp.api;


import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
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
    
    
    @PUT
    @Path("up")
    @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public datos actualizar(datos a){
        System.out.println("co" + a.getName());
          dr.actualizar(a);
        return a;
    }
    
    @DELETE
    @Path("delete/{id}")
    public List<datos> eliminar(@PathParam("id")int id){
        datos d;
        d = dr.getdatounidoc(id);
        if(d != null){
         dr.eliminar(d);
        }
       
        return dr.getdatoslista();

    }
    
    
    
}
