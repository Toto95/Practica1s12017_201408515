/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USUARIOS;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Ottoniel
 */
public class colaFichas {
    nodoFicha cabeza;
    nodoFicha ultimo;
    public colaFichas(){}
    public void agregar(nodoFicha nuevo){
        nuevo.siguiente = null;
        if(cabeza == null){
            cabeza = nuevo;
            ultimo = nuevo;
        }else{
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
                 
        }
    }
    public nodoFicha eliminarDeCola(){
        if(cabeza == null){
            return null;
        }else{
            nodoFicha aux = cabeza;
            cabeza = cabeza.siguiente;
            return aux;
        }
        
    }
    public void graficarCola() throws IOException{
        File f = new File("cola.dot");
       FileWriter fw = new FileWriter("cola.dot");
       PrintWriter pw = new PrintWriter(fw);
       if(cabeza==null){
           return;
       }
       pw.println("digraph B{");
       nodoFicha aux =cabeza;
       while(aux!=null){
           if(aux.siguiente!=null){
             pw.println("nodo"+aux.hashCode()+" -> nodo"+aux.siguiente.hashCode());
             pw.println("{rank = same; "+"nodo"+aux.hashCode()+ " nodo"+ aux.siguiente.hashCode()+"}");
             
           }
           pw.println("nodo"+aux.hashCode()+"[label=\""+aux.letra+"\",style=filled, fillcolor=\"#FF4000\"]");
           aux = aux.siguiente;
       }
       pw.println("}");
       String cmd = "cmd /c dot -Tpng cola.dot > C:\\Users\\Ottoniel\\Documents\\GitHub\\Practica1s12017_201408515\\practica1Scrabble\\colaFichas.png";
        Process child = Runtime.getRuntime().exec(cmd);
    }
    
}
