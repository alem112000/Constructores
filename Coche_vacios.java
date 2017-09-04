/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author Administrador
 * En este código se utilizan consructores vacíos, por lo que, el objeto no tiene parámetros
 * al momento de ser instanciado.
 */


public class Coche_vacios{
    double distanciaMaxima;
 public Coche_vacios(){
     
 }
 public double distanciaMax(int velocidadPromedio,int cantGas){
     double tiempo = cantGas * 0.5;
    distanciaMaxima = tiempo*velocidadPromedio;
     return distanciaMaxima;
 }
         
}
