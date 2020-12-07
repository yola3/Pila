/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;


public class Pilas {
    int Pila [];//vector para almacenar los datos a la pila
    int Cima;//variable para saber que dato esta primero

    public Pilas(int Tamano) {//tamaño de la pila
        Pila = new int[Tamano];
        Cima = 0;

    }

    public void Insertar(int datos) {//metodo para insertar las dato a la pila
        Pila[Cima] = datos;
        Cima++;
    }

   

    public boolean vacio() {//metodo para saber si la pila esta vacia o llena 
        if (Cima == 0) {
            return true;

        } else {
            return false;
        }
    }

    public int tamaño() {//metodo para saber el tamaño d ela pila y mostrarlo en pantalla
        return Pila.length ;
        

    }
    
    
}
