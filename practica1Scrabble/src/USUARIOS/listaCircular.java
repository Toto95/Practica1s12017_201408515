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
public class listaCircular {
     public nodoUsuario primero;
     public nodoUsuario ultimo;
     public void agregarUsuario(nodoUsuario n){
        
         if(existeUsuario(n.nombre)){
            JOptionPane.showMessageDialog(null, "EL JUGADOR YA EXISTE");
            return;
         }
         if(primero==null){
             n.siguiente = n;
             n.anterior = n;
             primero = n;
             ultimo = n;
             
         }else{
             n.siguiente = primero;
             n.anterior = ultimo;
             ultimo.siguiente = n;
             ultimo = n;
             primero.anterior = ultimo;
            
         }
     }
     public void graficarCircular() throws IOException{
         File f = new File("usuarios.dot");
         FileWriter fw = new FileWriter("usuarios.dot");
         if(primero==null){
             return;
         }
         PrintWriter pw = new PrintWriter(fw);
         pw.println("digraph B{");
         nodoUsuario aux = primero;
         while(aux!=ultimo){
             pw.println("nodo"+aux.hashCode()+" -> nodo"+aux.siguiente.hashCode());
             pw.println("{rank = same; "+"nodo"+aux.hashCode()+ " nodo"+ aux.siguiente.hashCode()+"}");
             pw.println("nodo"+aux.hashCode()+"[label=\""+aux.nombre+"\",style=filled, fillcolor=\"#FF4000\"]");
             aux = aux.siguiente;
         }
        pw.println("nodo"+aux.hashCode()+" -> "+"nodo"+aux.siguiente.hashCode());
        pw.println("{rank = same; "+"nodo"+aux.hashCode()+ " nodo"+ aux.siguiente.hashCode()+"}");
        pw.println("nodo"+aux.hashCode()+"[label=\""+aux.nombre+"\",style=filled, fillcolor=\"#FF4000\"]");
        pw.println("}");
        pw.close();
        fw.close();
        String cmd = "cmd /c dot -Tpng usuarios.dot > C:\\Users\\Ottoniel\\Documents\\GitHub\\Practica1s12017_201408515\\practica1Scrabble\\src\\reportes\\usuarios.png";
        Process child = Runtime.getRuntime().exec(cmd);
        
     }
     public boolean existeUsuario(String nom){
         if(primero==null){
             return false;
         }
         nodoUsuario aux = primero;
         while(aux!=ultimo){
             if(aux.nombre.equals(nom)){
                 return true;
             }
             aux = aux.siguiente;
         }
         if(aux.nombre.equals(nom)){
             return true;
         }
         return false;
     }
     
}
