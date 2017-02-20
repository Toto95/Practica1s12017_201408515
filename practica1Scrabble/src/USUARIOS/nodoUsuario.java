/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USUARIOS;

/**
 *
 * @author Ottoniel
 */
public class nodoUsuario {
    public String nombre;
    public listaSimple fichas;
    public nodoUsuario siguiente;
    public nodoUsuario anterior;
    
    public nodoUsuario(String nombre){
        this.nombre = nombre;
       siguiente = null;
       anterior = null;
       fichas = new listaSimple();
    }
}
