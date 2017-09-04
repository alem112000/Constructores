/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author Administrador
 * Se incluyen metodos para instanciar al objeto con parametros, o para asignarle parametros después o solamente
 * devolver valores, dependiendo de si se envian parametros al momento de instanciar o no.
 */
public class Coche_ambos {
     int cantGas;
     int velocidadPromedio;
     double distanciaMaxima;
     public Coche_ambos(){
     
 }
public Coche_ambos(int cantGas, int velocidadPromedio){
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

 public double distanciaMax(int velocidadPromedio,int cantGas){
     double tiempo = cantGas * 0.5;
    distanciaMaxima = tiempo*velocidadPromedio;
     return distanciaMaxima;
 }
}
