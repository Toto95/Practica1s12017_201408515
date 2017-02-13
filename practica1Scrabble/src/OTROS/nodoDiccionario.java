/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OTROS;

/**
 *
 * @author Ottoniel
 */
public class nodoDiccionario {
    public String palabra;
    public nodoDiccionario siguiente;
    public nodoDiccionario(String nuevo){
     palabra = nuevo;
     siguiente = null;
    }
}
