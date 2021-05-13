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
public class RespostaData extends Resposta{
    private String identificador;
    
    
    
    public RespostaData(String palavraChave){
        this.identificador = palavraChave;
    }

    @Override
    public boolean verifica(String entrada) {
        return entrada.contains(identificador);
    }

    @Override
    public String produz() {
        Date data = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("d/MM/yy");
        String formatado = formato.format(data);
        return formatado.toString(); 
    }
   
    
}
