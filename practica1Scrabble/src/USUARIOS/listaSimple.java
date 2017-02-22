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
    public listaSimple(){
        primero = null;
        ultimo = null;
    }
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
          if(Character.compare(aux.letra, caracter)==0){
              aux.letra = nuevo;
              break;
          }
          aux = aux.siguiente;
      }
     
  }
  public nodoFicha eliminarDelista(char caracter){
      if(primero == null){
          return null;
      }
      nodoFicha aux = primero;
      nodoFicha aux2 = primero;
      while(aux!=null){
          if(Character.compare(aux.letra, caracter)==0){
              System.out.println("Lo encuentra");
              if(primero == ultimo){
                  nodoFicha tm = primero;
                  primero = ultimo = null;
                  return tm;
                  
              }else{
                  if(aux == primero){
                      nodoFicha tm = primero;
                      primero = primero.siguiente;
                      return tm;
                     
                  }else if(aux == ultimo){
                      nodoFicha tm = aux2.siguiente;
                      aux2.siguiente = null;
                      ultimo = aux2;
                      return tm;
                      
                  }else{
                    aux2.siguiente = aux.siguiente;
                    return aux;
                    
                  }
                  
                  
              }
          }else{
              aux2 = aux;
              aux = aux.siguiente;
          }
      }
      return null;
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
          
      }
      return contador;
  }
   public void graficarFichas() throws IOException{
       File f = new File("fichas.dot");
       FileWriter fw = new FileWriter("fichas.dot");
       PrintWriter pw = new PrintWriter(fw);
       if(primero==null){
           
           System.out.println("No tiene fichas");
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
       pw.close();
        String cmd = "cmd /c dot -Tpng fichas.dot > C:\\Users\\Ottoniel\\Documents\\GitHub\\Practica1s12017_201408515\\practica1Scrabble\\src\\reportes\\fichasUsuario.png";
        Process child = Runtime.getRuntime().exec(cmd);
   }
}
