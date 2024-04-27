/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen2;

/**
 *
 * @author hecto
 */
public class Contrato extends EMPLEADO{

    public Contrato() {
    }

    public int getSalario() {
        return Salario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public void SalarioAnual(){
        int Anual = Salario * 12; 
        int Final = Anual + (Anual / 10);
        System.out.println("El salario por contrato es: " + Final);
    }
    
}
