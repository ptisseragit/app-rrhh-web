/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frsf.ofa.cursojava.rrhh.web.resources;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import utn.frsf.ofa.cursojava.rrhh.web.modelo.Cliente;
import utn.frsf.ofa.cursojava.rrhh.web.modelo.Empleado;
import utn.frsf.ofa.cursojava.rrhh.web.service.EmpleadoService;

/**
 *
 * @author Cristian
 */
@Stateless
@Path("/empleado")
public class EmpleadoResource {
@Inject EmpleadoService empleadoService; 
 @GET
 public Response listarEmpleados(@QueryParam("nombre") String nombre){
    List<Empleado> lista = new ArrayList<>();
    if(nombre!=null && nombre.trim().length()>0){
        lista = empleadoService.porNombre(nombre);
    }
    else {
        lista = empleadoService.todos();
    }
    return Response.ok(lista).build();
 }
 
 @GET
 @Path("{id}")
    public Response buscarPorId(@PathParam("id") Integer idEmpleado){
    return Response.ok(empleadoService.porId(idEmpleado)).build();
 }
 
 @POST
 public Response crearCliente(Empleado emp){
    empleadoService.guardar(emp);
    return Response.ok().build();
 }
 @PUT
    public Response actualizarCliente(Empleado emp){
    empleadoService.guardar(emp);
    return Response.ok("PUT"+emp.getNombre()).build();
 }

 @DELETE
 @Path("{id}")
    public Response actualizarCliente(@PathParam("id") Integer idEmpleado){
    empleadoService.borrar(idEmpleado);
    return Response.ok("DELETE ok").build();
 }
}
