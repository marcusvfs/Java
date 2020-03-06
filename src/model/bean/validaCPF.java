/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import javax.swing.JOptionPane;


/**
 *
 * @author total
 */
public class validaCPF {
    
    public int ValidaCpf(String recebeCpf){
        double[] i_cpf;
        double soma_d1 = 0;
        double soma_d2 = 0;
        double div_d1 = 0;
        double div_d2 = 0;
        int pos_d1 = -1;
        int pos_d2 = -1;
        double d1;
        double d2;
        boolean tudoIgual = false;
        i_cpf = new double[11];
        int k = 0;
        
        String[] cpf = recebeCpf.split("");
        
        
        for(int i= 0; i < recebeCpf.length();i++){
            char valida = recebeCpf.charAt(i);
            if( valida <= '9' && valida >='0'){
                
                i_cpf[k] = Double.parseDouble(cpf[i]);
                k++;
                
            } else {
                

            }
            }
        
            
        double numero = i_cpf[0];
        for (int i = 0; i < 11;i++){
            if (i_cpf[i] != numero){
                tudoIgual = true;
                break;
            }else{
                tudoIgual = false;
            }
        }
      
        if(tudoIgual == false){
            return 3;
	
        }else{
            
            
          

            for(int i = 10; i >= 2 ; i--){
                pos_d1++;
                double soma = i_cpf[pos_d1] * i;
                soma_d1 += soma;
               // System.out.println(i_cpf[pos_d1]+"*"+i+"="+soma);
            }
            //System.out.println(soma_d1);

            div_d1 = soma_d1%11;

            //System.out.println(div_d1);

            if(div_d1 < 2){
                d1 = 0;
            }else{
                d1 = 11 - div_d1;
            }
           // System.out.println(d1);

            for(int i = 11; i >= 2 ; i--){
                pos_d2++;
                double soma = i_cpf[pos_d2] * i;
                soma_d2 += soma;
                //System.out.println(i_cpf[pos_d2]+"*"+i+"="+soma);
            }

            div_d2 = soma_d2%11;

            //System.out.println(div_d2);

            if(div_d2 < 2){
                d2 = 0;
            }else{
                d2 = 11 - div_d2;
            }

            //System.out.println(d2);

            if(d1 == i_cpf[9] && d2 == i_cpf[10]){
                //System.out.println("true");
                return 0;
            }
            }
        return 1;
        }
        
    }

        
        
        
        
        
        
        
        
    

