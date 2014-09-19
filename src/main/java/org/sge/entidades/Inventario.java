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
public  class Inventario implements Serializable {


    @ManyToOne(targetEntity=Equipo.class)
    private Equipo equipo;


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    @OneToMany(cascade={CascadeType.ALL},fetch=FetchType.LAZY,targetEntity=DetalleMovimiento.class,mappedBy="inventario")
    private List<DetalleMovimiento> detalleMovimientoLista;


    @Basic
    private String nroSerie;


    @Basic
    private boolean disponible;


    @ManyToOne(targetEntity=Almacen.class)
    private Almacen almacen;

    public Inventario(){

    }


   public Equipo getEquipo() {
        return this.equipo;
    }


  public void setEquipo (Equipo equipo) {
        this.equipo = equipo;
    }



   public Long getId() {
        return this.id;
    }


  public void setId (Long id) {
        this.id = id;
    }



   public List<DetalleMovimiento> getDetalleMovimientoLista() {
        return this.detalleMovimientoLista;
    }


  public void setDetalleMovimientoLista (List<DetalleMovimiento> detalleMovimientoLista) {
        this.detalleMovimientoLista = detalleMovimientoLista;
    }



   public String getNroSerie() {
        return this.nroSerie;
    }


  public void setNroSerie (String nroSerie) {
        this.nroSerie = nroSerie;
    }



    public boolean isDisponible() {
        return this.disponible;
    }


  public void setDisponible (boolean disponible) {
        this.disponible = disponible;
    }



   public Almacen getAlmacen() {
        return this.almacen;
    }


  public void setAlmacen (Almacen almacen) {
        this.almacen = almacen;
    }

}

