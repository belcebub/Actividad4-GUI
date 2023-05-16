/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author Joseph
 */
public class AdmonConsola {
    private Consola consolas[];
    private int cont;

    public AdmonConsola() {
        consolas = new Consola[100];
        cont = 0;
    }

    public int getCont() {
        return cont;
    }
    
    int busqueda(int clave) {
        for (int x=0; x<cont; x++) {
            if (consolas[x].getClave() == clave) {
                return x;
            }
        }
        return -1;
    }

    void altas(Consola c) {
        consolas[cont] = c;
        cont++;
    }

    Consola getConsola(int celda) {
        return consolas[celda];
    }

    Consola[] consultaGeneral() {
        Consola consolasT[] = new Consola[cont];
        Consola aux;
        
        //Copiar los empleados al arreglo temporal
        for(int x=0; x<consolasT.length; x++) {
            consolasT[x] = consolas[x];
        }
        
        //Ordenar el arreglo por la clave
        for(int a=0; a<consolasT.length - 1; a++){
            for(int b=0; b<consolasT.length - 1 - a; b++) {
                if(consolasT[b].getClave() > consolasT[b+1].getClave()) {
                    aux = consolasT[b];
                    consolasT[b] = consolasT[b+1];
                    consolasT[b+1] = aux;
                }
            }
        }//Fin del for a
        return consolasT;
    }

    void modificar(Consola c, int celda) {
        consolas[celda] = c;
    }

    void eliminar(int celda) {
        for (int x=celda; x<cont-1; x++) {
            consolas[x] = consolas[x+1];
      }
        cont--;
    }
    
    
}
