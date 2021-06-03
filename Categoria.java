package edu.eci.cvds.samples.entities;

import java.sql.Date;
import java.time.LocalDate;
import java.util.UUID;

public class Categoria {
    private String idCategoria;
    private String nombre;
    private String descripcion;
    private Date fechaDeCreacion;
    private String estado;
    private Date fechaDeModificacion;
    public Categoria(String nombre, String descripcion){
        this.idCategoria = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaDeCreacion = Date.valueOf(LocalDate.now());
        this.estado = "Activa";
        this.fechaDeModificacion = Date.valueOf(LocalDate.now());
    }
    public Categoria(String idCategoria,String nombre, String descripcion, Date fechaDeCreacion,String estado, Date fechaDeModificacion){

    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaDeModificacion() {
        return fechaDeModificacion;
    }

    public void setFechaDeModificacion(Date fechaDeModificacion) {
        this.fechaDeModificacion = fechaDeModificacion;
    }

    @Override
    public String toString(){
        return "Categoria{" + "idCategoria="+idCategoria+", nombre="+nombre+", descripcion="+descripcion+", estado="+estado+"}\n";
    }
}
