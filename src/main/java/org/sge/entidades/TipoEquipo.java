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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tipo_equipo")
public  class TipoEquipo implements Serializable {


    @Basic
    private String nombre;


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    @OneToMany(cascade={CascadeType.ALL},fetch=FetchType.LAZY,targetEntity=Equipo.class,mappedBy="tipoEquipo")
    private List<Equipo> equipoLista;

    public TipoEquipo(){

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



   public List<Equipo> getEquipoLista() {
        return this.equipoLista;
    }


  public void setEquipoLista (List<Equipo> equipoLista) {
        this.equipoLista = equipoLista;
    }

    @Override
    public String toString() {
        return nombre;
    }

}

