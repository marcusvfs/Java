/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author marcu
 */
public class Validadores {
    
    public boolean validaTam(String t,int tam){
        if(t.length() > tam){
            return true;
        }else{
            return false;
        }
    }
    
    public String diminui(String texto, int tam){
        String[] g = texto.split("");
        String[] novo = new String[tam];
        String w = "";
        int k = g.length-1;
        g[k] = null;
        for(int i = 0 ; i < tam ; i++){
            if(g[i] != null){
                novo[i] = g[i];
            }else{
                
            }
            
        }
        return w;
    }
}
