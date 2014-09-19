package org.sge.entidades;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="detalle_movimiento")
public  class DetalleMovimiento implements Serializable {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    @Basic
    private String descripcion;


    @ManyToOne(targetEntity=Inventario.class)
    private Inventario inventario;


    @ManyToOne(targetEntity=Movimiento.class)
    private Movimiento movimiento;

    public DetalleMovimiento(){

    }


   public Long getId() {
        return this.id;
    }


  public void setId (Long id) {
        this.id = id;
    }



   public String getDescripcion() {
        return this.descripcion;
    }


  public void setDescripcion (String descripcion) {
        this.descripcion = descripcion;
    }



   public Inventario getInventario() {
        return this.inventario;
    }


  public void setInventario (Inventario inventario) {
        this.inventario = inventario;
    }



   public Movimiento getMovimiento() {
        return this.movimiento;
    }


  public void setMovimiento (Movimiento movimiento) {
        this.movimiento = movimiento;
    }

}

