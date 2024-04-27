/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen2;

/**
 *
 * @author hecto
 */
public class Parcial extends EMPLEADO{
private int Horas;

    public Parcial() {
    }

    public Parcial(int Horas) {
        this.Horas = Horas;
    }

    public int getHoras() {
        return Horas;
    }
    
    public int getSalario() {
        return Salario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setHoras(int Horas) {
        this.Horas = Horas;
    }
    
    public void setSalario(int Salario) {
        this.Salario = Salario;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public void SalarioHoras(){
        int Final = Salario * Horas;
        System.out.println("El salario por tiempo por horas es: " + Final);
    }
    
}
