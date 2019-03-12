/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execício3;
import execício3.HeartRates;
import java.util.Scanner;

/**
 *
 * @author André
 */
public class Execício3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HeartRates hr = new HeartRates("","",0,0,0);
        Scanner sc = new Scanner(System.in);
        float frequenciaMax, frequenciaAlvo;
        int idade;
        
        
        System.out.println("Calculadora de frequêcia cardiaca");
        System.out.println("Informe seu dados:");
        System.out.print("Nome: ");
        hr.nome = sc.next();  
        System.out.print("Sobrenome: ");
        hr.sobrenome = sc.next();
        System.out.println("\nData de Nascimento: ");
        System.out.print("Dia: ");
        hr.dia = sc.nextInt();
        System.out.print("Mês: ");
        hr.mes = sc.nextInt();
        System.out.print("Ano: ");
        hr.ano = sc.nextInt();
        
        
        idade = hr.getIdade(hr.ano);
        frequenciaMax = hr.getFrequenciaMax(idade);
        frequenciaAlvo = hr.getFrequenciaAlvo(frequenciaMax);
        System.out.println("\n\nResultado:");
        System.out.println("Nome: " + hr.getNome());
        System.out.println("Sobrenome: " + hr.getSobrenome());
        System.out.println("Idade: " + idade);
        System.out.println("Frequência cardiaca máxima: " + frequenciaMax);
        System.out.println("Frequência cardiaca alvo: " + frequenciaAlvo );
    }
    
}
