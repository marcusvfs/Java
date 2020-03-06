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
public class Login {
     String[] user = {"admin","user","teste"};
    String[] pass = {"admin","user","teste"};
    int[] acess = {1,2,3};
    
    
    public int acesso(String usuario, String senha){
        int i ; 
        int k ;
        for(i=0;i<3;i++){
            for(k=0;i<3;i++){
                String userr = String.valueOf(user[i]);
                if(usuario.equals(userr)){
                    if( senha.equals(pass[i])){
                        return acess[i];
                        
               
                    }else{
                        JOptionPane.showMessageDialog( // Caixa de mensagem
                        null, // Janela da aplicação (opcional, pode ser null)
                        "Senha invalida", // Mensagem
                        "ERRO", // Título da caixa de mensagem
                        JOptionPane.ERROR_MESSAGE // Ícone da caixa de mensagem
                );
                        return 0; 
                
                    }
                }else{
                }
            }
            JOptionPane.showMessageDialog( // Caixa de mensagem
                        null, // Janela da aplicação (opcional, pode ser null)
                        "Usuario nao existe", // Mensagem
                        "ERRO", // Título da caixa de mensagem
                        JOptionPane.ERROR_MESSAGE); // Ícone da caixa de mensagem
        }
        return 0;
        
        
        
    }
}
    

