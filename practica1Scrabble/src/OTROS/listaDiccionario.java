/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OTROS;

import USUARIOS.nodoFicha;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Ottoniel
 */
public class listaDiccionario {
    nodoDiccionario primero;
    nodoDiccionario ultimo;
    public listaDiccionario(){
        
    }
    public void agregarPalabra(String palabra){
        nodoDiccionario nuevo = new nodoDiccionario(palabra);
        if(primero ==null){
            primero = ultimo = nuevo;
        }else{
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
    }
    public void graficarDiccionario() throws IOException{
        File f = new File("diccionario.dot");
       FileWriter fw = new FileWriter("diccionario.dot");
       PrintWriter pw = new PrintWriter(fw);
       if(primero==null){
           return;
       }
       pw.println("digraph B{");
       nodoDiccionario aux = primero;
       while(aux!=null){
           if(aux.siguiente!=null){
             pw.println("nodo"+aux.hashCode()+" -> nodo"+aux.siguiente.hashCode());
             pw.println("{rank = same; "+"nodo"+aux.hashCode()+ " nodo"+ aux.siguiente.hashCode()+"}");
             
           }
           pw.println("nodo"+aux.hashCode()+"[label=\""+aux.palabra+"\",style=filled, fillcolor=\"#FF4000\"]");
           aux = aux.siguiente;
       }
       pw.println("}");
        String cmd = "cmd /c dot -Tpng diccionario.dot > C:\\Users\\Ottoniel\\Documents\\GitHub\\Practica1s12017_201408515\\practica1Scrabble\\diccionario.png";
        Process child = Runtime.getRuntime().exec(cmd);
    }
}
