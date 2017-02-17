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
import javax.swing.JOptionPane;

/**
 *
 * @author Ottoniel
 */
public class listaSimple {
    public nodoFicha primero;
    public nodoFicha ultimo;
   public void agregar(nodoFicha a){
       a.siguiente = null;
       if(primero==null){
          primero = a;
          ultimo = a;
       }else{
           
           ultimo.siguiente = a;
           ultimo = a;
       }
   }
  public void modificarFicha(char caracter, char nuevo){
      if(primero==null){
          JOptionPane.showMessageDialog(null, "No tiene fichas");
          return;
      }
      nodoFicha aux = primero;
      while(aux !=null){
          if(caracter == aux.letra){
              aux.letra = nuevo;
              break;
          }
          aux = aux.siguiente;
      }
     
  }
  public void eliminarDelista(char caracter){
      if(primero == null){
          return;
      }
      nodoFicha aux = primero;
      nodoFicha aux2 = primero;
      while(aux!=null){
          if(aux.letra == caracter){
              if(primero == ultimo){
                  primero = ultimo = null;
              }else{
                  aux2.siguiente = aux.siguiente;
              }
          }else{
              aux2 = aux;
              aux = aux.siguiente;
          }
      }
  }
  public int tamanioLista(){
      int contador = 0;
      if(primero == null){
          return 0;
      }else{
          nodoFicha aux = primero;
          while(aux!=null){
              contador++;
              aux = aux.siguiente;
          }
          return contador;
      }
  }
   public void graficarFichas() throws IOException{
       File f = new File("fichas.dot");
       FileWriter fw = new FileWriter("fichas.dot");
       PrintWriter pw = new PrintWriter(fw);
       if(primero==null){
           return;
       }
       pw.println("digraph B{");
       nodoFicha aux = primero;
       while(aux!=null){
           if(aux.siguiente!=null){
             pw.println("nodo"+aux.hashCode()+" -> nodo"+aux.siguiente.hashCode());
             pw.println("{rank = same; "+"nodo"+aux.hashCode()+ " nodo"+ aux.siguiente.hashCode()+"}");
             
           }
           pw.println("nodo"+aux.hashCode()+"[label=\""+aux.letra+"\",style=filled, fillcolor=\"#FF4000\"]");
           aux = aux.siguiente;
       }
       pw.println("}");
        String cmd = "cmd /c dot -Tpng fichas.dot > C:\\Users\\Ottoniel\\Documents\\GitHub\\Practica1s12017_201408515\\practica1Scrabble\\fichasUsuario.png";
        Process child = Runtime.getRuntime().exec(cmd);
   }
}
