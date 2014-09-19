package org.sge.entidades;

import java.io.Serializable;

import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public  class Almacen implements Serializable {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    @Basic
    private String direccion;


    @ManyToOne(targetEntity=Empresa.class)
    private Empresa empresa;


    @Basic
    private String telefono;


    @OneToMany(cascade={CascadeType.ALL},fetch=FetchType.LAZY,targetEntity=Inventario.class,mappedBy="almacen")
    private List<Inventario> inventarioLista;


    @OneToMany(cascade={CascadeType.ALL},fetch=FetchType.LAZY,targetEntity=Movimiento.class,mappedBy="almacen")
    private List<Movimiento> movimientoLista;

    public Almacen(){

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



   public Empresa getEmpresa() {
        return this.empresa;
    }


  public void setEmpresa (Empresa empresa) {
        this.empresa = empresa;
    }



   public String getTelefono() {
        return this.telefono;
    }


  public void setTelefono (String telefono) {
        this.telefono = telefono;
    }



   public List<Inventario> getInventarioLista() {
        return this.inventarioLista;
    }


  public void setInventarioLista (List<Inventario> inventarioLista) {
        this.inventarioLista = inventarioLista;
    }



   public List<Movimiento> getMovimientoLista() {
        return this.movimientoLista;
    }


  public void setMovimientoLista (List<Movimiento> movimientoLista) {
        this.movimientoLista = movimientoLista;
    }

}

