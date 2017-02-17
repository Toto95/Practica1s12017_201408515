/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TABLERO;

/**
 *
 * @author Ottoniel
 */
public class nodoCabeza {
       public int posicion;
       public listaAsociada lista;
       public nodoCabeza siguiente;
       public nodoCabeza(int pos){
           this.posicion = pos;
           lista = new listaAsociada();
           siguiente = null;
           
       }
       
}
