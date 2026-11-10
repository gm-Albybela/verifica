/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.verifica;

/**
 *
 * @author belardinelli.alberto
 */
public class GaraDITiro {
    public void main(String []Args){
    Arciere Arciere1 = new Arciere("pietro");
    Arciere Arciere2 = new Arciere("pietro");
    
    for(i=0;i<5;i++){
    Arciere1.tira();
    Arciere2.tira();
    }
    Arciere1.esitoFinale();
    Arciere2.esitoFinale();
    }
}
