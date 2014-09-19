package org.sge.entidades;

import java.io.Serializable;

import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public  class Clinica implements Serializable {


    @Basic
    private String nombre;


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    @Basic
    private String direccion;


    @Column(name="nombre_contacto")
    @Basic
    private String nombreContacto;


    @OneToMany(cascade={CascadeType.ALL},fetch=FetchType.LAZY,targetEntity=Movimiento.class,mappedBy="clinica")
    private List<Movimiento> movimientoLista;


    @Column(name="telefono_contacto")
    @Basic
    private String telefonoContacto;

    public Clinica(){

    }


   public String getNombre() {
        return this.nombre;
    }


  public void setNombre (String nombre) {
        this.nombre = nombre;
    }



   public Long getId() {
        return this.id;
    }


  public void setId (Long id) {
        this.id = id;
    }



   public String getDireccion() {
        return this.direccion;
    }


  public void setDireccion (String direccion) {
        this.direccion = direccion;
    }



   public String getNombreContacto() {
        return this.nombreContacto;
    }


  public void setNombreContacto (String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }



   public List<Movimiento> getMovimientoLista() {
        return this.movimientoLista;
    }


  public void setMovimientoLista (List<Movimiento> movimientoLista) {
        this.movimientoLista = movimientoLista;
    }



   public String getTelefonoContacto() {
        return this.telefonoContacto;
    }


  public void setTelefonoContacto (String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

}

