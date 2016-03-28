/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemamain;

/**
 *
 * @author Jesus
 */
public class proveedores {
    
    String codigo, nombre,telefono,RNC, descripcion ,estado;

    public proveedores(String codigo, String nombre, String telefono, String RNC, String descripcion, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.RNC = RNC;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRNC() {
        return RNC;
    }

    public void setRNC(String RNC) {
        this.RNC = RNC;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    
}
