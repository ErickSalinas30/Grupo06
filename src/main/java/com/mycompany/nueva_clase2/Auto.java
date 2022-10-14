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
    int cilindrajeMotor;

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
        var marcaPais=this.getPaisMarca();
        switch(marcaPais){
            case "Africa":
                retorno=1;
                break;
            case "EEUU":
                retorno=2;
                break;
            case "Asia":
                retorno=3;
                break;
            case "Europa":
                retorno=4;
                break;
            case "Oceania":
                retorno=5;
                break;
            default:
                retorno=0;
        }
                        
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
            case "X":
                retorno="Cotopaxi";
                break;
            case "H":
                retorno="Chimborazo";
                break;
            default:
                retorno="Provincia no definida";
                                                          
        }

        return retorno;
    }
    
    public double calcularIVA(){
        var retorno=0.0d;
        retorno=+this.precio*0.12;
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
     public double calcularCostoMatricula(int yearActual){
        var retorno=0.0d;
        var edad=this.calcularEdad(yearActual);
    
        
        return retorno;
    }
    
    public String esTaxi(){
        var retorno="";
        
        return retorno;    
    }
    
    public boolean sePuedeAsegurar(int yearActual){
        var retorno=false;
        var edad=this.calcularEdad(yearActual);
        if(edad<=5 && this.precio<10000)
        {
            retorno=true;
        }else{
            if(edad>=10 && edad<=15 && this.precio>=10000 && this.precio<=20000){
                retorno=true;
            }else{
                if(edad>15 && this.precio>=20000 && this.precio<=30000){
                    retorno=true;                    
                }else{
                    if(edad>15){
                        retorno=false;
                    }
                }
            }
            
        }
        return retorno;
    }
    
    public boolean esClasico(int yearActual, int yearClasico){
        var retorno=false;
        
        return retorno;      
    }

    public int calcularEdad(int yearActual){
        var retorno=0;
        retorno=yearActual-this.year;
        
      
        return retorno;      
    }
    
    public boolean esPlacaValida(){
        var retorno=false;
        var longitud=this.placa.length();
        if(longitud==7){
            var caracter1=this.placa.charAt(0);
            var caracter2=this.placa.charAt(1);
            var caracter3=this.placa.charAt(2);
            var caracter4=this.placa.charAt(3);
            var caracter5=this.placa.charAt(4);
            var caracter6=this.placa.charAt(5);
            var caracter7=this.placa.charAt(6);
            if(caracter1==letra )           
                    
        }
            
        
        
        
        return retorno;      
    }
    
    
    
    /*
    Edad >20: tasa solidaria 0
    Edad 0-5 y cilindraje < 1500 : tasa solidaria 15% costo
    Edad 0-5 y cilindraje >1500 <2000 : tasa solidaria 20% costo
    Edad 0-5 y cilindraje > 2000 : tasa solidaria 25% costo
    Edad 5-15 y cilindraje > 1500  <2000 : tasa solidaria 15% costo
    Edad 5-15 y cilindraje < 1500 : tasa solidaria 10% costo
    Edad 5-15 y cilindraje >2000 : tasa solidaria 18% costo
    Edad 15-20 : tasa solidaria 5%
    Edad >20: tasa solidaria 0
    
    */
    public double calcularTasaSolidaria(int yearActual, double limitePrecio){
        var retorno=0.0d;
        
        return retorno;      
    }
    
    
    
}
