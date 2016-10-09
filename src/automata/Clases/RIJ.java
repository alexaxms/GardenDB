/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automata.Clases;

/**
 *
 * @author Alex
 */
public class RIJ {
    String Contenido;
    int indice;
    int subindicea;
    int subindiceb;

    public RIJ(String Contenido, int indice, int subindicea, int subindiceb) {
        this.Contenido = Contenido;
        this.indice = indice;
        this.subindicea = subindicea;
        this.subindiceb = subindiceb;
    }

    public RIJ() {
        this.Contenido = "";
        this.indice = 0;
        this.subindicea = 0;
        this.subindiceb = 0;
    }

    public String getContenido() {
        return Contenido;
    }

    @Override
    public String toString() {
        return "RIJ{" + "Contenido=" + Contenido + ", indice=" + indice + ", subindicea=" + subindicea + ", subindiceb=" + subindiceb + '}';
    }

    public void setContenido(String Contenido) {
        this.Contenido = Contenido;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public int getSubindicea() {
        return subindicea;
    }

    public void setSubindicea(int subindicea) {
        this.subindicea = subindicea;
    }

    public int getSubindiceb() {
        return subindiceb;
    }

    public void setSubindiceb(int subindiceb) {
        this.subindiceb = subindiceb;
    }
    
}

