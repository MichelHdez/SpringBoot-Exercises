/**
 * 
 */
package com.mx.CrudClientes.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author SccgYoMx
 *
 */
@Entity
@Table(name="CLIENTES_XIIF")
public class Empleados {
    @Id
    @Column(name = "ID",columnDefinition ="NUMBER", nullable = false )
    int id;

    @Column(name = "NOMBRE",columnDefinition ="NVARCHAR2(100)", nullable = false )
    String nombre;

    @Column(name = "APP",columnDefinition ="NVARCHAR2(100)", nullable = false )
    String app;

    @Column(name = "APM",columnDefinition ="NVARCHAR2(100)", nullable = false )
    String apm;

    @Column(name = "TELEFONO",columnDefinition ="NUMBER", nullable = false )
    long telefono;

    @Column(name = "CORREO",columnDefinition ="NVARCHAR2(100)", nullable = false )
    String correo;

    @Column(name = "ESTATUS",columnDefinition ="NUMBER", nullable = false )
    int estatus;

    public Empleados() {
    }

    public Empleados(int id) {
        this.id = id;
    }

    public Empleados(int id, String nombre, String app, String apm, long telefono, String correo, int estatus) {
        this.id = id;
        this.nombre = nombre;
        this.app = app;
        this.apm = apm;
        this.telefono = telefono;
        this.correo = correo;
        this.estatus = estatus;
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

    public String getApm() {
        return apm;
    }

    public void setApm(String apm) {
        this.apm = apm;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", app='" + app + '\'' +
                ", apm='" + apm + '\'' +
                ", telefono=" + telefono +
                ", correo='" + correo + '\'' +
                ", estatus=" + estatus +
                '}';
    }
}
