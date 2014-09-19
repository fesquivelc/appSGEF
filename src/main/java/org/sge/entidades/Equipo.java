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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public  class Equipo implements Serializable {


    @Column(length=140)
    @Basic
    private String nombre;


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    @ManyToOne(targetEntity=TipoEquipo.class)
    private TipoEquipo tipoEquipo;


    @OneToMany(cascade={CascadeType.ALL},fetch=FetchType.LAZY,targetEntity=Inventario.class,mappedBy="equipo")
    private List<Inventario> inventarioLista;


    @Basic
    private String foto;

    public Equipo(){

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



   public TipoEquipo getTipoEquipo() {
        return this.tipoEquipo;
    }


  public void setTipoEquipo (TipoEquipo tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }



   public List<Inventario> getInventarioLista() {
        return this.inventarioLista;
    }


  public void setInventarioLista (List<Inventario> inventarioLista) {
        this.inventarioLista = inventarioLista;
    }



   public String getFoto() {
        return this.foto;
    }


  public void setFoto (String foto) {
        this.foto = foto;
    }

}

