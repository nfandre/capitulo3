/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execício3;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author André
 */
public class HeartRates {
   String nome;
   String sobrenome;
   int mes ;
   int dia;
   int ano;
   
   public HeartRates(String nome, String sobrenome, int mes, int dia, int ano){
       this.nome = nome;
       this.sobrenome = sobrenome;
       this.mes = mes;
       this.dia = dia;
       this.ano = ano;
   } 




   public int getIdade(int ano){
       Calendar c = Calendar.getInstance();
       
       return c.get(Calendar.YEAR)- ano;
   }
   public float getFrequenciaMax(int idade){
       return 220 - idade;
   }
   public float getFrequenciaAlvo(float frequenciaMax){
       return (float) (frequenciaMax * 0.6);
   }
   
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    
}
