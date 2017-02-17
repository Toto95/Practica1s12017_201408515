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
public class nodoTablero {
    public int x;
    public int y;
    public String contenido;
    public nodoTablero abajo;
    public nodoTablero arriba;
    
    public nodoTablero(int x, int y){
        this.x = x;
        this.y = y;
        abajo = null;
        arriba = null;
        contenido = "";
    }
    public void setContenido(String contenido){
        this.contenido = contenido;
    }
}
