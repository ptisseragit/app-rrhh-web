/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frsf.ofa.cursojava.rrhh.web.logica;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import utn.frsf.ofa.cursojava.rrhh.web.modelo.Empleado;

/**
 *
 * @author Cristian
 */
@ApplicationScoped
@Transactional
public class EmpleadoLogicaMock implements EmpleadoLogica{
    
    public EmpleadoLogicaMock(){
    
    }
    
    @Override
    public boolean puedeSumarseProyectoNuevo(Empleado e) {
        return true;
    }
}
