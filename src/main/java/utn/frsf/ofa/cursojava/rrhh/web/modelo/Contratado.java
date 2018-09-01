/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frsf.ofa.cursojava.rrhh.web.modelo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Cristian
 */
@Entity
@DiscriminatorValue(value = "0")
public class Contratado extends Empleado{
    //private Double valorHoraTrabajada;
    private Double costo_hora;
    
    @Override
    public Double salario() {
        //return(this.getHorasTrabajadas()*this.valorHoraTrabajada);
        return(this.getHs_trabajadas()*this.costo_hora);
    }
    
    @Override
    public boolean esEfectivo(){
        return false;
    }
    
    @Override
    public boolean esContratado(){
        return true;
    }
    
    /*public Double getValorHoraTrabajada() {
        return valorHoraTrabajada;
    }

    public void setValorHoraTrabajada(Double valorHoraTrabajada) {
        this.valorHoraTrabajada = valorHoraTrabajada;
    }*/

    public Double getCosto_hora() {
        return costo_hora;
    }

    public void setCosto_hora(Double costo_hora) {
        this.costo_hora = costo_hora;
    }
    
    
    
}
