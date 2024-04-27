/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen2;

import com.mycompany.examen2.EMPLEADO;

/**
 *
 * @author hecto
 */
public class Completo extends EMPLEADO{
    
    public Completo() {
    
    }
    public Completo(int Salario, String nombre) {

    }

    public String getNombre() {
        return Nombre;
    }

    public int getSalario() {
        return Salario;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }
    
    public void SalarioAnual(){
        int Anual = Salario * 12; 
        int Final = Anual + (Anual / 10);       
        System.out.println("El Salario de tiempo completo es: " + Final);
    }
    
}
