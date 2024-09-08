package com.example.springbootgit.Collections;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//La estructura TreeSet se utiliza para almacenar elementos con la particularidad
// de mantener ordenado en un Árbol. Los elementos no pueden ser duplicados, los elementos estan
// Ordenados.
public class TreeSetExample {

    public static void main(String[] args){
        Set treeSet = new TreeSet();
        //El metodo add agrega el elemento al set
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(20);
        treeSet.add(10);
        treeSet.add(30);
        //Imprimo el treeSet
        System.out.println("El treeSet es:" + treeSet);

        //El metodo Remove quita el elemento pasado por parametro
        treeSet.remove(5);
        System.out.println("El treeSet sin el 5 es:" + treeSet);

        //El  metodo "clear" borra todos los elementos
        //treeSet.clear();
        //System.out.println("El treeSet borrado" + treeSet);

        //El metodo "contains" dice si el elemento existe (retorna un bool)
        boolean exists = treeSet.contains(10);
        System.out.println("Esta el 10 en el TreeSet: " + exists);

        //El metodo "size" nos dice el tamaño
        int sizeTreeSet = treeSet.size();
        System.out.println("El tamaño del treeSet es: " + sizeTreeSet);

        //El metodo "isEmpty" nos dice si esta vacio.
        boolean isEmpty = treeSet.isEmpty();
        System.out.println("El treeSet esta vacio: " + isEmpty);

        //El metodo "iterator" es para iterar el TreeSet y con "descendingIterator" es en orde decendente
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());  // Imprime los elementos en orden ascendente
        }
    }
}
