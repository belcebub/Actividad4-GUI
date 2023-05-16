/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author Joseph
 */
public class ConsolaDeSobremesa extends Consola {
    private int discoDuro;
    private String salidaDeVideo;

    public ConsolaDeSobremesa(int discoDuro, String salidaDeVideo, int clave, String nombre, int generacion, float precio) {
        super(clave, nombre, generacion, precio);
        this.discoDuro = discoDuro;
        this.salidaDeVideo = salidaDeVideo;
    }
    
    public int getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }

    public String getSalidaDeVideo() {
        return salidaDeVideo;
    }

    public void setSalidaDeVideo(String salidaDeVideo) {
        this.salidaDeVideo = salidaDeVideo;
    }
    
    @Override
    public float calcularPrecioFinal() {
        float precioFinal, precioGen, precioDd;
        if (getGeneracion() == 7) {
            precioGen = getPrecio() *.10f;
        } else {
            if (getGeneracion() == 8) {
                precioGen = getPrecio()*.15f;
            } else{
                precioGen = getPrecio()*.20f;
            }
        }
        
        if (getDiscoDuro() < 500) {
            precioDd = getPrecio()*.05f;
        } else {
            if (getDiscoDuro() >= 500 && getDiscoDuro() <= 1000) {
                precioDd = getPrecio()*.10f;
            } else{
                precioDd = getPrecio()*.15f;
            }
        }
        
        return precioFinal = getPrecio() + precioGen + precioDd;
        
    }
}
