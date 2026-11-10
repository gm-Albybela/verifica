/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.verifica;

/**
 *
 * @author belardinelli.alberto
 */
import java.util.Random;

public class Arciere {
private int [] Tiro= new int [5] ;
private String Nome;

    public String getNome() {
        return Nome;
    }

    public int[] getTiro() {
        return Tiro;
    }
    

    public Arciere(String Nome) {
        this.Nome = Nome;
      
    }
    //metodo che regola il tiro e il random del punteggio
    public void tira(int b,int i){
        if(b<Tiro.length){
            Random r = new Random();

            for(i=0;i<5;i++){
                Tiro[i]= r.nextInt(11);
            }    
        }
    }

    
    public int punteggioFine(){
        int puntiF=0;
        for(int i=0;i<Tiro.length;i++){
            puntiF+=Tiro[i];
        }
        return puntiF;
        
    }
    public String esitoFinale(){
    System.out.println("Nome"+Nome);
    System.out.println("Punteggio finale"+punteggioFine);
    System.out.println("");
    System.out.println("");
    
    
    
    }
    
   
}
