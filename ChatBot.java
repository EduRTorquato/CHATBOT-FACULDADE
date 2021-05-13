/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbot;

/**
 *
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author eduar
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ChatBot {
    private ArrayList<Resposta> respostas = new ArrayList<>();

    public String processar(String texto){
        for(int i = 0; i < respostas.size(); i++ ){
            Resposta r = respostas.get(i);
            if(r.verifica(texto)){
                return r.produz();
            }
        }
    return "Não entendi, tente falar de outra forma!";
        
        }
   
    
    
    
    public void adiciona(Resposta r){
        respostas.add(r);
        
    }
   
}