/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personaapp;

/**
 *
 * @author JR_Baide Iscoa
 */
public class Main {
    public static void main(String[] args) {
        Persona doctor = new Doctor("Jose Baide Iscoa", 53, "Tecnico en Laboratorio");
        Persona deportista = new Deportista("Itan Eliab", 16, "Fútbol");

        doctor.mostrarInfo();
        deportista.mostrarInfo();
    }
}

