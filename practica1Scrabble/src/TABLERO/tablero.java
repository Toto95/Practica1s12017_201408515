/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TABLERO;

import USUARIOS.nodoFicha;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Ottoniel
 */
public class tablero {
    int tamanio;
    public listaCabezas lista;
    public tablero(){
        lista = new listaCabezas();
    }
    public void crearMatriz(int tam){
        tamanio = tam;
        lista.crearCabezas(tam);
        lista.crearColumnas(tam);
    }
    public void modificarNodo(int x, int y, String contenido){
        lista.modificarContenido(x, y, contenido);
    }
    public void graficar() throws IOException{
        File f = new File("tablero.dot");
       FileWriter fw = new FileWriter("tablero.dot");
       PrintWriter pw = new PrintWriter(fw);
       if(lista.cab==null){
           return;
       }
       pw.println("digraph B{");
       nodoCabeza aux = lista.cab;
       while(aux!=null){
        nodoTablero temp = aux.lista.primero;
        while(temp!=null){
         pw.println("nodo"+temp.x+temp.y+"[label=\"X="+temp.x+" Y="+temp.y+"\n"+temp.contenido+"\",style=filled, fillcolor=\"#FF4000\"]");
        if(temp.x ==1){
            if(temp.arriba!=null){
                pw.println("nodo"+temp.x+temp.y+" -> nodo"+temp.arriba.x+temp.arriba.y);
            }
            if(temp.abajo!=null){
                pw.println("nodo"+temp.x+temp.y+" -> nodo"+temp.abajo.x+temp.abajo.y);
            }
          pw.println("nodo"+temp.x+temp.y+" -> nodo"+(temp.x + 1)+temp.y);
          pw.println("{rank = same; "+"nodo"+temp.x+temp.y+" nodo"+(temp.x+1)+temp.y+"}");
          
        }else if(temp.x == tamanio){
            if(temp.arriba!=null){
                pw.println("nodo"+temp.x+temp.y+" -> nodo"+temp.arriba.x+temp.arriba.y);
            }
            if(temp.abajo!=null){
                pw.println("nodo"+temp.x+temp.y+" -> nodo"+temp.abajo.x+temp.abajo.y);
            }
          pw.println("nodo"+temp.x+temp.y+" -> nodo"+(temp.x - 1)+temp.y);
          //pw.println("{rank = same; "+"nodo"+temp.x+temp.y+" nodo"+(temp.x+1)+temp.y+"}");
          
        }else{
            if(temp.arriba!=null){
                pw.println("nodo"+temp.x+temp.y+" -> nodo"+temp.arriba.x+temp.arriba.y);
            }
            if(temp.abajo!=null){
                pw.println("nodo"+temp.x+temp.y+" -> nodo"+temp.abajo.x+temp.abajo.y);
            }
            pw.println("nodo"+temp.x+temp.y+" -> nodo"+(temp.x - 1)+temp.y);
            pw.println("nodo"+temp.x+temp.y+" -> nodo"+(temp.x + 1)+temp.y);
            pw.println("{rank = same; "+"nodo"+temp.x+temp.y+" nodo"+(temp.x+1)+temp.y+"}");
         
        }
        temp = temp.abajo;
        }
        aux = aux.siguiente;
       }
       
       pw.println("}");
        String cmd = "cmd /c dot -Tpng tablero.dot > C:\\Users\\Ottoniel\\Documents\\GitHub\\Practica1s12017_201408515\\practica1Scrabble\\tablero.png";
        Process child = Runtime.getRuntime().exec(cmd);
    }
}
