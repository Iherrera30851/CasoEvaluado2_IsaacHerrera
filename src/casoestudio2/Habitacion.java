/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoestudio2;

/**
 *
 * @author isaacherrera
 */
public class Habitacion {
    private String estado;
    private String tipo;
    private String precio;

    public Habitacion(String estado, String tipo, String precio) {
        this.estado = estado;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    //to string
    @Override
    public String toString() {
        return "Habitacion{" + "estado=" + estado + ", tipo=" + tipo + ", precio=" + precio + '}';
    }
    
}