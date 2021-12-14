/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientadoaobj;

/**
 *
 * @author jacks
 */
class Carro {
   String marca;
   String modelo;
   int numPassageiros;
   double capacidadeCombustivbel;
   double consumoCombustivel;
   
   //método sem retorno
   void exibirAutonomia(){
       double autonomia = capacidadeCombustivbel * consumoCombustivel;
       System.out.println("A autonomia do carro é: " + autonomia + "km");
   }
   
   //método com retorno
   double mostrarAutonomia(){
       return capacidadeCombustivbel * consumoCombustivel; 
   }
   
   //método com parâmetro
   double calcularCombustivel(double km){
       return km/consumoCombustivel;
   }
}
