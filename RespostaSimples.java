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
public class RespostaSimples extends Resposta{
    private String identificador;
    private String texto;

    public RespostaSimples(String palavraChave, String texto){
        this.identificador = palavraChave;
        this.texto = texto;
    }
   
    

    @Override
    public boolean verifica(String entrada) {
       return entrada.contains(identificador);
    }

    @Override
    public String produz() {
        return this.texto;
    }

    
}
