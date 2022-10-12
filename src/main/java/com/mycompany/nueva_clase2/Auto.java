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

    public String mostrarInfo() {
        var retorno = " El auto tiene placa " + this.placa + " el dueño del auto es: " + this.nombrePropietario + " y es de marca " + this.marca;

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

    public String getNumeroContinente() {
        var retorno = "";

        return retorno;
    }

    public String getProvincia() {
        var retorno = "";

        return retorno;
    }

}
