/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personaapp;

/**
 *
 * @author JR_Baide Iscoa
 */
public class Doctor extends Persona {
    private String especialidad;

    public Doctor(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombre() + ", Edad: " + getEdad() + ", Especialidad: " + especialidad);
    }
}

