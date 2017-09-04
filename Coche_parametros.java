/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author Administrador
 */
public class Coche_parametros {
     int cantGas;
     int velocidadPromedio;
     double distanciaMaxima;
     /**
      * 
      * @param cantGas
      * @param velocidadPromedio 
      * En este caso, el construtor asigna parámetros inciales al objeto 
      * instanciado en el main.
      */
public Coche_parametros(int cantGas, int velocidadPromedio){
    this.cantGas = cantGas;
    this.velocidadPromedio = velocidadPromedio;
    distanciaMaxima=0;
}
public int getvelocidadPromedio(){
  return velocidadPromedio;  
}
public int getcantGas(){
  return velocidadPromedio;  
}
public double getdistanciaMax(){
  return distanciaMaxima;  
}
public void setdistanciaMax(){
    double tiempo = cantGas * 0.5;
    distanciaMaxima = tiempo*velocidadPromedio;
}
}
