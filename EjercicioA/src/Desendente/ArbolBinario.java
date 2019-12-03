/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desendente;

/**
 *
 * @author ms3240
 */
public class ArbolBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        arbol1 al= new arbol1(23);
        Nodo nuevo = new Nodo(14);
        al.agregar(nuevo,al.getRaiz());
        al.rcorrerPreorden(al.getRaiz());
    }
    
}
