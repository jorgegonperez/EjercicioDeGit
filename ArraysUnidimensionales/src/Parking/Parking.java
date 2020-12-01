/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parking;

import utilidad.Utilidad;

/**
 *
 * @author dam
 */
public class Parking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa miEmpresa;
        int numero= Utilidad.pedirNumero("Introduce el numero de plazas",1,100);
        miEmpresa= new Empresa(numero);
        
        
    }
    
}
