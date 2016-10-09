/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automata;

import automata.Clases.RIJ;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class Automata {

    /**
     * @param args the command line arguments
     */
    public static String metodo(RIJ a, String[][] contenido){
        if(a.getIndice()==0){
            return contenido[a.getSubindicea()-1][a.getSubindiceb()-1];
        }
        else
        {
            RIJ b= new RIJ();
            if(a.getIndice()==a.getSubindicea() && a.getSubindicea()==a.getSubindiceb()){
                a.setIndice(a.getIndice()-1);
                return metodo(a, contenido)+"+";
            }
            else{
                if(a.getIndice()==a.getSubindicea()){
                    a.setIndice(a.getIndice()-1);
                    b.setIndice(a.getIndice());
                    b.setSubindicea(a.getIndice()+1);
                    b.setSubindiceb(a.getIndice()+1);
                    return metodo(b,contenido)+"*"+metodo(a,contenido);
                }
                else{
                    a.setIndice(a.getIndice()-1);
                    b.setIndice(a.getIndice());
                    b.setSubindicea(a.getIndice()+1);
                    b.setSubindiceb(a.getIndice()+1);
                    return metodo(a,contenido)+metodo(b,contenido)+"*";
                }
            }
        }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
    
    Tablaautomata easy = new Tablaautomata();
    easy.setVisible(true);
    }
    
    
    
    
    
    
}
