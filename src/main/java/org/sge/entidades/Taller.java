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
public  class Taller implements Serializable {


    @Basic
    private String nombre;


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    @ManyToOne(optional=false,targetEntity=Empresa.class)
    private Empresa empresa;


    @OneToMany(cascade={CascadeType.ALL},fetch=FetchType.LAZY,targetEntity=Movimiento.class,mappedBy="taller")
    private List<Movimiento> movimientoLista;

    public Taller(){

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



   public Empresa getEmpresa() {
        return this.empresa;
    }


  public void setEmpresa (Empresa empresa) {
        this.empresa = empresa;
    }



   public List<Movimiento> getMovimientoLista() {
        return this.movimientoLista;
    }


  public void setMovimientoLista (List<Movimiento> movimientoLista) {
        this.movimientoLista = movimientoLista;
    }

}

