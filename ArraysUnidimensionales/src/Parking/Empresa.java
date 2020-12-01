/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parking;

/**
 *
 * @author dam
 */
public class Empresa {

    String[] plazas;

    public Empresa() {
        plazas = new String[100];

    }

    public Empresa(int numeroPlazas) {
        plazas = new String[numeroPlazas];
    }

    public void incializarPlazas() {
        for (int nplaza = 0; nplaza < plazas.length; nplaza++) {
            plazas[nplaza] = "LIBRE";
        }

    }

    public int busqueda() {
        int nplaza;
        boolean encontrado;
        encontrado = false;
        nplaza = 0;
        while (!encontrado && nplaza < plazas.length) {
            if (plazas[nplaza].equalsIgnoreCase("libre")) {
                encontrado = true;

            } else {
                nplaza++;
            }
        }
        return nplaza;
    }

    public void entrada() {
        int nplaza;
        nplaza = busqueda();
        if (nplaza < plazas.length) {
            System.out.println("La plaza asignada es " + nplaza);
            plazas[nplaza] = "ocupada";
        } else {
            System.out.println("Parking completo");
        }
    }
    public void salida(){
        int nplaza;
        nplaza=Utilidad.pedirNumero("Plaza que deja libre",0,plazas.length-1);
        if(plazas[nplaza].equalsIgnoreCase("ocupado"))
        {
            System.out.println("Plaza liberada");
            plazas[nplaza]="libre";
        } else {
            System.out.println("La plaza ya estaba libre");
        }
    }
}
