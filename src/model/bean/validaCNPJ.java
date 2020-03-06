/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author total
 */
public class validaCNPJ {
    
    public boolean validaCNPJ(String recebeCnpj){
        double[] i_cnpj;
        double[] multi1 = {5,4,3,2,9,8,7,6,5,4,3,2};
        double[] multi2 = {6,5,4,3,2,9,8,7,6,5,4,3,2};
        double soma_dig1 = 0;
        double soma_dig2 = 0;
        double div_d1;
        double div_d2;
        double d1;
        double d2;
        
        
        
        i_cnpj = new double[14];
        String[] cnpj = recebeCnpj.split("");
        int k = 0;
        for(int i= 0; i < recebeCnpj.length();i++){
            char valida = recebeCnpj.charAt(i);
            if( valida <= '9' && valida >='0'){
                 
                i_cnpj[k] = Double.parseDouble(cnpj[i]);
                k++;
          //System.out.println(" "+Arrays.toString(i_cnpj));  
                 }else{}
                 
            }
        
        
       
    
        
        for (int i = 0 ; i < 12 ; i++){
            double soma = i_cnpj[i] * multi1[i];
            soma_dig1 += soma;
            //System.out.println(""+i_cnpj[i]+"*"+multi1[i]+"="+soma);
        }
        //System.out.println(soma_dig1+ "");
        div_d1 = soma_dig1%11;
        //System.out.println(""+div_d1);
        
        if(div_d1 < 2){
            d1 = 0;
        }else{
            d1 = 11 - div_d1;
        }
        //System.out.println(""+d1);
        
        
        for (int i = 0 ; i < 13 ; i++){
            double soma = i_cnpj[i] * multi2[i];
            soma_dig2 += soma;
            //System.out.println(""+i_cnpj[i]+"*"+multi2[i]+"="+soma);
        }
        //System.out.println(soma_dig2+ "");
        div_d2 = soma_dig2%11;
        //System.out.println(""+div_d2);
        
        if(div_d2 < 2){
            d2 = 0;
        }else{
            d2 = 11 - div_d2;
        }
        //System.out.println(""+d2);
        
        if(d1 == i_cnpj[12] & d2 == i_cnpj[13]){
            //System.out.println("true");
            return true;
        }else{
            return false;

            
        }
    }
}

