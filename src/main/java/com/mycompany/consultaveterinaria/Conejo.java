/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consultaveterinaria;

/**
 *
 * @author herbert
 */
public class Conejo extends Mascota implements AtencionEspecial {
    @Override
    public void hacerSonido() {
        System.out.println("El conejo hace: *ronquido suave*");
    }

    @Override
    public void recibirAtencionEspecial() {
        System.out.println("El conejo necesita cuidados especiales para sus dientes.");
    }
}
