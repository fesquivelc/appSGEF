package org.sge.entidades;

import java.io.Serializable;

import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public  class Empresa implements Serializable {


    @Basic
    private String nombre;


    @OneToMany(cascade={CascadeType.ALL},fetch=FetchType.LAZY,targetEntity=Taller.class,mappedBy="empresa")
    private List<Taller> tallerLista;


    @OneToMany(cascade={CascadeType.ALL},fetch=FetchType.LAZY,targetEntity=Almacen.class,mappedBy="empresa")
    private List<Almacen> almacenLista;


    @Column(length=22)
    @Id
    private String ruc;

    public Empresa(){

    }


   public String getNombre() {
        return this.nombre;
    }


  public void setNombre (String nombre) {
        this.nombre = nombre;
    }



   public List<Taller> getTallerLista() {
        return this.tallerLista;
    }


  public void setTallerLista (List<Taller> tallerLista) {
        this.tallerLista = tallerLista;
    }



   public List<Almacen> getAlmacenLista() {
        return this.almacenLista;
    }


  public void setAlmacenLista (List<Almacen> almacenLista) {
        this.almacenLista = almacenLista;
    }



   public String getRuc() {
        return this.ruc;
    }


  public void setRuc (String ruc) {
        this.ruc = ruc;
    }

}

