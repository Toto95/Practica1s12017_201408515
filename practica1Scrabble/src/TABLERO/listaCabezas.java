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
public class listaCabezas {
        public nodoCabeza cab;
        public nodoCabeza ultimo;
        public listaCabezas(){
            cab = null;
            ultimo = null;
        }
       public void crearCabezas(int tamanio){
         for(int i = 1; i<= tamanio; i++){
             agregarCabeza(i);
         }  
       }
       public void crearColumnas(int tamanio){
           nodoCabeza aux = cab;
           while(aux!=null){
               for(int i = 1; i<= tamanio; i++){
                  nodoTablero nuevo = new nodoTablero(aux.posicion, i);
                  aux.lista.agregar(nuevo);
               }
               aux = aux.siguiente;
           }
       }
       public void modificarContenido(int x, int y, String contenido){
           nodoCabeza aux = cab;
           while(aux!=null){
               if(aux.posicion == x){
                   break;
               }
               aux = aux.siguiente;
           }
           if(aux == null){
               System.out.println("No lo encontro y se sale");
               return;
           }
           aux.lista.modificarContenido(y, contenido);
       }
       public void agregarCabeza(int x){
           nodoCabeza nuevo = new nodoCabeza(x);
           
           if(cab == null){
              cab = ultimo = nuevo;  
           }else{
               ultimo.siguiente = nuevo;
               ultimo = nuevo;
           }
       }
   
}
