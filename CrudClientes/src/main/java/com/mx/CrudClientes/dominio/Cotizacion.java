package com.mx.CrudClientes.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="COTIZACIONES")
public class Cotizacion {

    @Id
    @Column(name = "ID", columnDefinition = "NUMBER")
    int id;

    @Column(name = "NOMBRE",columnDefinition = "NVARCHAR2(100)")
    String nombre;
    @Column(name = "APP",columnDefinition = "NVARCHAR2(100)")
    String app;
    @Column(name = "CORREO",columnDefinition = "NVARCHAR2(100)")
    String correo;
    @Column(name = "DESCRIPCION", columnDefinition = "NVARCHAR2(255)")
    String descripcion;
    @Column(name = "DIRECCION", columnDefinition = "NVARCHAR2(100)")
    String direccion;

    public Cotizacion(int id) {
        this.id = id;
    }

    public Cotizacion() {
    }

    public Cotizacion(int id, String nombre, String app, String correo, String descripcion, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.app = app;
        this.correo = correo;
        this.descripcion = descripcion;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cotizacion{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", app='" + app + '\'' +
                ", correo='" + correo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
