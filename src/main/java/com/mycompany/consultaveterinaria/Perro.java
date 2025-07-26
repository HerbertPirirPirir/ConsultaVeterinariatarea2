/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consultaveterinaria;

/**
 *
 * @author herbert
 */
public class Perro extends Mascota implements Vacunable {
     @Override
    public void hacerSonido() {
        System.out.println("El perro dice: Guau");
    }

    @Override
    public void vacunar() {
        System.out.println("El perro ha sido vacunado.");
    }
}
