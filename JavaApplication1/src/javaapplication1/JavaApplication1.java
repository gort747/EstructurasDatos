/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author 1006663484
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       public class Nodo<V> {
 
    private V value;
    private Nodo<V> izq;
    private Nodo<V> der;
     
    public Nodo(V value, Nodo<V> izq, Nodo<V> der) {
        super();
        this.value = value;
        this.izq = izq;
        this.der = der;
    }
 
    public V getValue() {
        return value;
    }
 
    public void setValue(V value) {
        this.value = value;
    }
 
    public Nodo<V> getIzq() {
        return izq;
    }
 
    public void setIzq(Nodo<V> izq) {
        this.izq = izq;
    }
 
    public Nodo<V> getDer() {
        return der;
    }
 
    public void setDer(Nodo<V> der) {
        this.der = der;
    }
}
    }
    

