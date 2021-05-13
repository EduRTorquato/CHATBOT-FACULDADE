/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbot;

/**
 *
 * @author eduar
 */
public abstract class Resposta {
   protected String entrada;
   
  
   

    public abstract boolean verifica(String entrada);

    public abstract String produz(); 
}
