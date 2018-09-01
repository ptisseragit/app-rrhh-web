package utn.frsf.ofa.cursojava.rrhh.web.modelo;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cristian
 */
@Entity
@DiscriminatorValue(value = "1")
public class Efectivo extends Empleado{


    //private Integer horasObligatorias;
    private Integer hs_minimas;
    //private Double sueldoBasico;
    private Double sueldo_basico;
    private Double comisiones;

    /*public Efectivo(Integer horasObligatorias, Double sueldoBasico, Double comisiones, Integer id, String nombre, String correoElectronico, String cuil, Date fechaIngreso, Integer horasTrabajadas) {
        super(id, nombre, correoElectronico, cuil, fechaIngreso, horasTrabajadas);
        this.horasObligatorias = horasObligatorias;
        this.sueldoBasico = sueldoBasico;
        this.comisiones = comisiones;
    }*/
       
    @Override
    public Double salario() {
        Double valorHorasExtra=0.0;
        /*if(this.getHorasTrabajadas()-this.getHorasObligatorias() > 0){
            valorHorasExtra= (this.getHorasTrabajadas()-this.getHorasObligatorias()) * (this.getSueldoBasico()/20);
        }*/
        if(this.getHs_trabajadas()-this.hs_minimas > 0){
            valorHorasExtra= (this.getHs_trabajadas()-this.getHs_minimas()) * (this.getSueldo_basico()/20);
        }
        
        return (this.getSueldo_basico() + this.getComisiones() + valorHorasExtra);
    }
    
    @Override
    public boolean esEfectivo(){
        return true;
    }
    
    @Override
    public boolean esContratado(){
        return false;
    }
    
    /*public Integer getHorasObligatorias() {
        return horasObligatorias;
    }

    public void setHorasObligatorias(Integer horasObligatorias) {
        this.horasObligatorias = horasObligatorias;
    }

    public Double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(Double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }*/

    public Integer getHs_minimas() {
        return hs_minimas;
    }

    public void setHs_minimas(Integer hs_minimas) {
        this.hs_minimas = hs_minimas;
    }

    public Double getSueldo_basico() {
        return sueldo_basico;
    }

    public void setSueldo_basico(Double suledo_basico) {
        this.sueldo_basico = suledo_basico;
    }
    
    

    public Double getComisiones() {
        return comisiones;
    }

    public void setComisiones(Double comisiones) {
        this.comisiones = comisiones;
    }
    
}
