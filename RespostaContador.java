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
public class RespostaContador extends Resposta {
    private String identificador;
    private int conta = 0;
    
    
    public RespostaContador(String palavraChave){
        this.identificador = palavraChave;
    }
    
    
    @Override
    public boolean verifica(String entrada) {
        return entrada.contains(identificador);
    }

    @Override
    public String produz() {
        conta ++;
        return "A conta está em: " + conta;
    }
    
        
    
    
}
