/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frsf.ofa.cursojava.rrhh.web.logica;

/**
 *
 * @author Cristian
 */
public class PresupuestoSobrepasadoException extends GestionProyectosException{
 public PresupuestoSobrepasadoException(){
    super("Cuando agregamos empleados a un Proyecto, la suma de sus salarios no puede superar el 20% del presupuesto del proyecto.");
 }
}

