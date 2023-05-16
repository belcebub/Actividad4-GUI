/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author Joseph
 */
public class ConsolaPortatil extends Consola {
    private float tamPantalla;
    private int bateria;

    public ConsolaPortatil(float tamPantalla, int bateria, int clave, String nombre, int generacion, float precio) {
        super(clave, nombre, generacion, precio);
        this.tamPantalla = tamPantalla;
        this.bateria = bateria;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public float getTamPantalla() {
        return tamPantalla;
    }

    public void setTamPantalla(float tamPantalla) {
        this.tamPantalla = tamPantalla;
    }

    @Override
    public float calcularPrecioFinal() {
        float precioFinal, precioPul, precioTt;
        if(getBateria() < 5) {
            precioTt = getPrecio() * 0.10f;
        }else {
            if(getBateria() >= 5 && getBateria() < 7) {
                precioTt = getPrecio() * 0.15f;
            } else {
                precioTt = getPrecio() * 0.20f;
            }
        }
        
        if(getTamPantalla() < 4) {
            precioPul = getPrecio() * 0.05f;
        }else {
            if(getTamPantalla() >= 4 && getTamPantalla() < 6) {
                precioPul = getPrecio() * 0.10f;
            } else {
                precioPul = getPrecio() * 0.15f;
            }
        }
        return precioFinal = getPrecio() + precioPul + precioTt;
        
    }
    
    
}
