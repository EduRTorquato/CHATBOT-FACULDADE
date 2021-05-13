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
import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        
        ChatBot bot = new ChatBot();
        
        // Criando as resposta:
        Resposta respSimples = new RespostaSimples("nome", "Meus amigos me chamam de AnhembiBot.");
        Resposta respData = new RespostaData("dia");
        Resposta respHora = new RespostaHora("horas");
        Resposta respContador = new RespostaContador("conta");
        
        // Criando as piadas:
        ArrayList<String> piada = new ArrayList<>();
        piada.add("Você sabe como os computadores se alimentam? Com biTscoitos");
        piada.add("Como eu digo  'já estou indo' em códigos? JAVAi ");
        piada.add("Eu fui comprar uma calça camuflada, mas não achei, pois ela estava camuflada");
         Resposta respConta = new RespostaAleatoria("piada", piada);
         ArrayList<String> curiosidades = new ArrayList();
         curiosidades.add("Você sabia que toda coca cola consumida no mundo até hoje encheria o mar mediterraneo duas vezes? O.O");
         curiosidades.add("O primeiro passo na lua foi dado por um pé tamanho 41, haja sapato");
         curiosidades.add("O primeiro beijo da história do cinema aconteceu no filme The Kiss, de 1896!");
         curiosidades.add("O BRASIL NÃO FOI DESCOBERTO PELOS PORTUGUESES!!");
         Resposta respConta1 = new RespostaAleatoria("curiosidades", curiosidades);
         
        
       // adicionando as respostas ao chatbot
        bot.adiciona(respSimples);
        bot.adiciona(respData);
        bot.adiciona(respHora);
        bot.adiciona(respContador);
        bot.adiciona(respConta);
        bot.adiciona(respConta1);
        
        System.out.println (" ------------------------------------");
        System.out.println (" Iniciando o chatbot ");
        System.out.println (" ------------------------------------");
        Scanner entrada = new Scanner(System.in);
        String texto;
        while(true){
            System.out.println("> ");
            texto = entrada.nextLine();
            System.out.println(bot.processar(texto));
        }
        
    }
    
}