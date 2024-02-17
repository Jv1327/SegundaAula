/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package user.segundaaula;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Joao Victor
 */
public class SegundaAula {

    public static void main(String[] args) {
        int a = 20; 
        String nome; 
        BufferedReader entrada;
        a = a * 2;
        System.out.println("O Valor de a é:" + a);
        
        try{
        entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite o Seu Nome:");
        nome = entrada.readLine();
        System.out.println("O seu Nome é:" + nome);
        }
        
        //Colocando Try Sempre vai dar Erro, só depois colocando catch ele corrigi o erro!!
        catch(IOException e) {
        System.out.println("Ocorreu um Erro!");
        }
    }
}
