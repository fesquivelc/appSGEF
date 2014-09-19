package org.sge.entidades;

import java.io.Serializable;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public  class Movimiento implements Serializable {


    @Column(nullable=false,length=2)
    @Basic
    private String destino;


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    @ManyToOne(targetEntity=Clinica.class)
    private Clinica clinica;


    @ManyToOne(targetEntity=Taller.class)
    private Taller taller;


    @Temporal(TemporalType.DATE)
    @Basic
    private Date fecha;


    @Column(name="codigo_guia_remision")
    @Basic
    private String codigoGuiaRemision;


    @OneToMany(cascade={CascadeType.ALL},fetch=FetchType.LAZY,targetEntity=DetalleMovimiento.class,mappedBy="movimiento")
    private List<DetalleMovimiento> detalleMovimientoLista;


    @Column(length=1)
    @Basic
    private char trato;


    @ManyToOne(targetEntity=Almacen.class)
    private Almacen almacen;


    @Column(length=2)
    @Basic
    private String origen;

    public Movimiento(){

    }


   public String getDestino() {
        return this.destino;
    }


  public void setDestino (String destino) {
        this.destino = destino;
    }



   public Long getId() {
        return this.id;
    }


  public void setId (Long id) {
        this.id = id;
    }



   public Clinica getClinica() {
        return this.clinica;
    }


  public void setClinica (Clinica clinica) {
        this.clinica = clinica;
    }



   public Taller getTaller() {
        return this.taller;
    }


  public void setTaller (Taller taller) {
        this.taller = taller;
    }



   public Date getFecha() {
        return this.fecha;
    }


  public void setFecha (Date fecha) {
        this.fecha = fecha;
    }



   public String getCodigoGuiaRemision() {
        return this.codigoGuiaRemision;
    }


  public void setCodigoGuiaRemision (String codigoGuiaRemision) {
        this.codigoGuiaRemision = codigoGuiaRemision;
    }



   public List<DetalleMovimiento> getDetalleMovimientoLista() {
        return this.detalleMovimientoLista;
    }


  public void setDetalleMovimientoLista (List<DetalleMovimiento> detalleMovimientoLista) {
        this.detalleMovimientoLista = detalleMovimientoLista;
    }



   public char getTrato() {
        return this.trato;
    }


  public void setTrato (char trato) {
        this.trato = trato;
    }



   public Almacen getAlmacen() {
        return this.almacen;
    }


  public void setAlmacen (Almacen almacen) {
        this.almacen = almacen;
    }



   public String getOrigen() {
        return this.origen;
    }


  public void setOrigen (String origen) {
        this.origen = origen;
    }

}

