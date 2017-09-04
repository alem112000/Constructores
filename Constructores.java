/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author Rangel Mendez Alejandro Emanuel
 */
public class Constructores {

    /**
     * @param args the command line arguments
     */
    
    static int velocidadPromedio;
    static int cantGas ;
    /**
 * En el siguiente código, se ejemplificará el mismo problema 
 * resuelto con constructores vacíos y con constructores que 
 * asignan un valor inicial al objeto creado.
 * La cantidad de gasolina está en litros y la velocidad en km/h.
 */
    public static void main(String[] args) {
        // TODO code application logic here
        
        velocidadPromedio=30;
        cantGas=25;
        Coche_parametros distMax = new Coche_parametros(cantGas,velocidadPromedio);
        distMax.setdistanciaMax();
        System.out.println(distMax.getcantGas()+"Litros de Gasolina    "+distMax.getdistanciaMax()+"Kilometros Distancia Maxima     "+distMax.getvelocidadPromedio()+"km/h Velocidad Promedio");
        System.out.println("Clase con constructor con parametros");
        /*
         Hasta aquí se trabaja con consructores que asignan parámetros al objeto desde que son inicializados.
        */
        double distanciaMaxima;
        Coche_vacios distMax2 = new Coche_vacios();
        distanciaMaxima = distMax2.distanciaMax(velocidadPromedio, cantGas);
        System.out.println(cantGas+"Litros de Gasolina    "+distanciaMaxima+"Kilometros Distancia Maxima     "+velocidadPromedio+"km/h Velocidad Promedio");
        System.out.println("Clase con constructor sin parametros(vacio)"); 
        /*
         No se envian parametros al constructor.
        La clase solamente devuelve valores sin necesidad de que sean parte del objeto.
        */
         distanciaMaxima=0;
         Coche_ambos distMax3 = new Coche_ambos(cantGas,velocidadPromedio);
        distMax.setdistanciaMax();
        System.out.println(distMax.getcantGas()+"Litros de Gasolina    "+distMax.getdistanciaMax()+"Kilometros Distancia Maxima     "+distMax.getvelocidadPromedio()+"km/h Velocidad Promedio");
         Coche_ambos distMax4 = new Coche_ambos();
        distanciaMaxima = distMax4.distanciaMax(velocidadPromedio, cantGas);
        System.out.println(cantGas+"Litros de Gasolina    "+distanciaMaxima+"Kilometros Distancia Maxima     "+velocidadPromedio+"km/h Velocidad Promedio");
         /*
          Se crean dos objetos de la misma clase, uno que se instancia con parametros, y otro que solamente devuelve un parametro
         los lenguajes orientados a objetos, permien la sobrecarga de constructores, por lo que dependiendo si se envían o no parámetros
        desde un inicio, se utiliza el constructor adecuado.
        */
         System.out.println("Clase con constructor con parametros y sin parametros");
    }
    
}
