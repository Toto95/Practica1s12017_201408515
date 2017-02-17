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
public class listaAsociada {
       public nodoTablero primero;
       public nodoTablero ultimo;
       public listaAsociada(){
          primero = null;
          ultimo = null;
       }
       public void agregar(nodoTablero nuevo){
           
           if(primero == null){
               primero = ultimo = nuevo;
           }else if(primero.y> nuevo.y){
               insertarFrente(nuevo);
           }else if(ultimo.y< nuevo.y){
               insertarUltimo(nuevo);
           }else{
               insertarMedio(nuevo);
           }
       }
       void insertarFrente(nodoTablero n){
           n.abajo = primero;
           primero.arriba = n;
           n.arriba = null;
           primero = n;
       }
       
       void insertarUltimo(nodoTablero n){
           n.arriba = ultimo;
           n.abajo = null;
           ultimo.abajo = n;
           ultimo = n;
           
       }
       void insertarMedio(nodoTablero n){
           nodoTablero aux = primero;
           while(aux!=null){
               if(aux.y> n.y){
                  nodoTablero tmp = aux.arriba;
                  tmp.abajo = n;
                  n.arriba = tmp;
                  n.abajo = aux;
                  aux.arriba = n;
               }else{
                   aux = aux.abajo;
               }
           }
       }
       public void modificarContenido(int y, String contenido){
           if(primero ==null){
               return;
           }
           nodoTablero aux = primero;
           while(primero!=null){
               if(aux.y == y){
                   aux.contenido = contenido;
                   break;
               }else{
                   aux = aux.abajo;
               }
           }
       }
       
}
