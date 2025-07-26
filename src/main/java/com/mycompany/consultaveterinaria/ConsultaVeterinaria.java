/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consultaveterinaria;

import java.util.ArrayList;

/**
 *
 * @author herbert
 */
public class ConsultaVeterinaria {

    public static void main(String[] args) {
    ArrayList<Mascota> listaMascotas = new ArrayList<>();

        listaMascotas.add(new Perro());
        listaMascotas.add(new Gato());
        listaMascotas.add(new Conejo());
        listaMascotas.add(new Tortuga());  // Mini-ejercicio: funciona gracias al principio de sustitución

        for (Mascota m : listaMascotas) {
            m.hacerSonido();    // Polimorfismo
            m.descansar();      // Método concreto común

            // Uso controlado de instanceof para comportamientos adicionales
            if (m instanceof AtencionEspecial) {
                ((AtencionEspecial) m).recibirAtencionEspecial();
            }

            if (m instanceof Vacunable) {
                ((Vacunable) m).vacunar();
            }

            System.out.println();  // Espaciado para claridad
        }
    }
}
