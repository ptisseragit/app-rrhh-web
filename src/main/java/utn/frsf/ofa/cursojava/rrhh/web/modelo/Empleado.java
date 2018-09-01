package utn.frsf.ofa.cursojava.rrhh.web.modelo;


import java.util.Date;
import java.util.List;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

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
@Table(name="empleados") 
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.INTEGER, name ="TIPO_EMPLEADO" )

public abstract class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    //private String correoElectronico;
    private String correo;
    private String cuil;
    //private Date fechaIngreso;
    private Date fecha_ingreso;
    //private Integer horasTrabajadas;
    private Integer hs_trabajadas;
    
    @ManyToMany(mappedBy = "empleados")
    protected List<Proyecto> proyectosAsignados;
    /*public Empleado(Integer id, String nombre, String correoElectronico, String cuil, Date fechaIngreso, Integer horasTrabajadas) {
        this.id = id;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.cuil = cuil;
        this.fechaIngreso = fechaIngreso;
        this.horasTrabajadas = horasTrabajadas;
    }*/

    public abstract Double salario();
    public abstract boolean esEfectivo();
    public abstract boolean esContratado();

    public List<Proyecto> getProyectosAsignados() {
        return proyectosAsignados;
    }

    public void setProyectosAsignados(List<Proyecto> proyectosAsignados) {
        this.proyectosAsignados = proyectosAsignados;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }*/

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    /*public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }*/

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }
    
    

    /*public Integer getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(Integer horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }*/

    public Integer getHs_trabajadas() {
        return hs_trabajadas;
    }

    public void setHs_trabajadas(Integer hs_trabajadas) {
        this.hs_trabajadas = hs_trabajadas;
    }
    
    
    
}
