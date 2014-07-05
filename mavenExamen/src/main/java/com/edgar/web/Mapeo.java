package com.edgar.web;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="escuela")
public class Mapeo implements Serializable {
    @Basic(optional = false)
    @Column(name = "calificacion")
    private float calificacion;
    
    @Id
    @Column(name="nombre")
    private String nombre;

    public Mapeo() {
    }

    public Mapeo(float calificacion, String nombre) {
        this.calificacion = calificacion;
        this.nombre = nombre;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Mapeo{" + "calificacion=" + calificacion + ", nombre=" + nombre + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Float.floatToIntBits(this.calificacion);
        hash = 53 * hash + (this.nombre != null ? this.nombre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mapeo other = (Mapeo) obj;
        if (Float.floatToIntBits(this.calificacion) != Float.floatToIntBits(other.calificacion)) {
            return false;
        }
        if ((this.nombre == null) ? (other.nombre != null) : !this.nombre.equals(other.nombre)) {
            return false;
        }
        return true;
    }

    
}
