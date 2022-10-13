/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.nueva_clase2;

/**
 *
 * @author usuario
 */
public class Nueva_clase2 {

    public static void main(String[] args) {
        
        var auto1 = new Auto();
        
        auto1.marca= "Chevrolet";
        auto1.nombrePropietario= "Erick Salinas";
        auto1.placa= "BBU-786";
        auto1.color="Blanco";
        auto1.year=2018;
        auto1.precio= 25614.85;
        
        System.out.println(auto1.mostrarInfo()+" el pais de origen del auto es "+auto1.getPaisMarca());
        System.out.println("El auto tiene "+auto1.calcularEdad(2022)+" años ");
        System.out.println()
        
        var auto2 = new Auto();
        
        auto2.marca= "Toyota";
        auto2.nombrePropietario= "Gabriel Salas";
        auto2.placa= "FFU-786";
        auto2.color="Plateado";
        auto2.year=2022;
        auto2.precio= 30000;      
        
        System.out.println(auto2.mostrarInfo()+" el pais de origen del auto es "+auto2.getPaisMarca());
         
        var auto3 = new Auto();
        
        auto3.marca="Jetour";
        auto3.nombrePropietario= "Luis Miguel";
        auto3.placa= "FFU-111";
       
        System.out.println(auto3.mostrarInfo()+" el pais de origen del auto es "+auto3.getPaisMarca());
        
        var auto4 = new Auto();
        
        auto4.marca= "Mercedes";
        auto4.nombrePropietario= "Julio Jaramillo";
        auto4.placa= "FFU-566";
      
        System.out.println(auto4.mostrarInfo()+" el pais de origen del auto es "+auto4.getPaisMarca());
        
        var auto5 = new Auto();
        
        auto5.marca= "Kia";
        auto5.nombrePropietario= "Gabriela Salinas";
        auto5.placa= "PPP-266";
      
        System.out.println(auto5.mostrarInfo()+" el pais de origen del auto es "+auto5.getPaisMarca());
        
    }
}
