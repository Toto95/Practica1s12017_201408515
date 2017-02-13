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
public class nodoFicha {
    public char letra;
    public int puntos;
    public nodoFicha siguiente;
    public nodoFicha(char letra, int puntos){
     this.letra = letra;
     this.puntos = puntos;
     siguiente = null;
    }
}
