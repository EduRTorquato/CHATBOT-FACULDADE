/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbot;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author eduar
 */
public class RespostaHora extends Resposta {
    private String identificador;

    public RespostaHora(String palavraChave){
        this.identificador = palavraChave;
    }
    
    
    
    @Override
    public boolean verifica(String entrada) {
        return entrada.contains(identificador);
    }

    @Override
    public String produz() {
        Date hora = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("hh:mm:ss");
        String horaFormatada = formatar.format(hora);
        return horaFormatada.toString();
        
    }
    
}
