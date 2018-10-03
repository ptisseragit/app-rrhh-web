/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frsf.ofa.cursojava.rrhh.web.logica;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import utn.frsf.ofa.cursojava.rrhh.web.modelo.Empleado;
import utn.frsf.ofa.cursojava.rrhh.web.modelo.Proyecto;

/**
 *
 * @author Cristian
 */
@ApplicationScoped
@Transactional
public class ProyectoLogicaMock implements ProyectoLogica{
    
    public ProyectoLogicaMock (){
    
    }
    
    @Override
    public boolean cupoDisponible(Proyecto p) {
        return true;
    }
    @Override
    public boolean tieneEmpleadoEfectivo(Proyecto p) {
        return true;
    }
    @Override
    public boolean presupuestoDisponible(Proyecto p, Empleado e) {
        return true;
    }
}
