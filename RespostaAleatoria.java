/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbot;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author eduar
 */
public class RespostaAleatoria extends Resposta {
    private String identificador;
    private ArrayList<String> opcoes;
    private Random gerador;
    
    public RespostaAleatoria(String palavraChave, ArrayList<String>opcoes){
        this.identificador = palavraChave;
        this.opcoes = opcoes;
        this.gerador = new Random(10);
    }

    @Override
    public boolean verifica(String entrada) {
        return entrada.contains(identificador);
    }

    @Override
    public String produz() {
         int index = gerador.nextInt(opcoes.size());
         return opcoes.get(index);
    }
    
    
    
    
}
