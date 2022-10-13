/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nueva_clase2;

/**
 *
 * @author usuario
 */
public class Auto {

    String placa;
    String marca;
    String nombrePropietario;
    int year;
    String color;
    double precio;

    public String mostrarInfo() {
        var retorno = " El auto tiene placa " + this.placa + " el dueño del auto es: " 
                + this.nombrePropietario + " y es de marca " + this.marca+" el año de fabricacion es "+this.year
                + " el color es "+this.color+" y su costo es de "+this.precio;

        return retorno;
    }

    public String getPaisMarca() {
        var retorno = "";
        if (this.marca.equals("Chevrolet")) {
            retorno = "EEUU";
        } else {
            if (this.marca.equals("Toyota")) {
                retorno = "Japon";
            } else {
                if (this.marca.equals("Jetour")) {
                    retorno = "China";
                } else {
                    if (this.marca.equals("Mercedes")) {
                        retorno = "Alemania";
                    } else {
                        retorno = "No definido";
                    }
                }
            }

        }
        return retorno;
    }

    public int getNumeroContinente() {
        var retorno = 0;
        var paisMarca=this.getPaisMarca();
        switch (paisMarca)
        
        
        
        return retorno;
    }

    public String getProvincia() {
        var retorno = "";
        var primeraLetra="";
        primeraLetra=this.placa.substring(0,1);
        switch (primeraLetra){
            case "A":
                retorno="Azuay";
                break;
            case "B":
                retorno="Bolivar";
                break;
            case "U":
                retorno="Cañar";
                break;
            case "C":
                retorno="Carchi";
                break;
            default:
                retorno="Provincia no definida";
                                                          
        }

        return retorno;
    }
    
    public double calcularIVA(){
        var retorno=0.0d;
        
        return retorno;
    }
    
    
    //la depresiacion no puede exeder el precio 
    public double calcularDepresiacion(int yearActual){
        var retorno=0.0d;
        var edad=this.calcularEdad(yearActual);
        retorno= edad*0.1*this.precio;
        
        return retorno;
    }
    
    //si la edad es de 5 años el costo de la matricula es de 10% precio
    //
    public double costoMatricula(int yearActual){
        var retorno="";
        
        return retorno;        
    }
    
    public String esTaxi(){
        var retorno="";
        
        return retorno;    
    }
    
    public boolean sePuedeAsegurar(){
        var retorno=false;
        var edad=this.calcularEdad(yearActual);
        if(edad<=5 && this.precio<10000)
        
        return retorno;
    }
    
    public boolean esClasico(yearActual: int,yearClasico: int ){
        var retorno="";
        
        return retorno;      
    }

    public int calcularEdad(int yearActual){
        var retorno=0;
        retorno=yearActual-this.year;
        
      
        return retorno;      
    }
    
    public String esPlacaValida(){
        var retorno="";
        
        return retorno;      
    }
    
    public String tasaSolidaria(){
        var retorno="";
        
        return retorno;      
    }
    
}
