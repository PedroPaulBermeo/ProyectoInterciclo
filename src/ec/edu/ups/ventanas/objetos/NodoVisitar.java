/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.ventanas.objetos;

/**
 *
 * @author Pedro Bermeo
 */
public class NodoVisitar implements Comparable<NodoVisitar> {

    private Coordenada nodo;
    private Double distancia;

    public NodoVisitar() {
    }

    public Coordenada getNodo() {
        return nodo;
    }

    public void setNodo(Coordenada nodo) {
        this.nodo = nodo;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return "NodoVisitar{" + "nodo=" + nodo + ", distancia=" + distancia + '}';
    }

    @Override
    public int compareTo(NodoVisitar t) {
        if (this.distancia > t.getDistancia()) {
            return 1;
        } else if (this.distancia < t.getDistancia()) {
            return -1;
        }
        return 0;

    }

}
