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
public class Orientadoaobj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Carro clio = new Carro();
        clio.marca = "Renault";
        clio.modelo = "hatch";
        clio.numPassageiros = 5;
        clio.capacidadeCombustivbel = 100;
        clio.consumoCombustivel = 0.5;
        
        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;
        fusca.capacidadeCombustivbel = 30;
        fusca.consumoCombustivel = 0.15;
        
        System.out.println(clio.numPassageiros);
        clio.exibirAutonomia();
        fusca.exibirAutonomia();
        
        double autonomiaClio = clio.mostrarAutonomia();
        System.out.println(autonomiaClio);
        double autonomiaFusca = fusca.mostrarAutonomia();
        System.out.println(autonomiaFusca);
        
        
        double qtdCombustivel = clio.calcularCombustivel(10);
        double qtdCombustivel21 = clio.calcularCombustivel(156);
        
        System.out.println(qtdCombustivel);
        System.out.println(qtdCombustivel21);
        
        
        
        
        
        ContaBancaria primeiraConta = new ContaBancaria();
        primeiraConta.agencia = 333;
        primeiraConta.numConta = 6542;
        primeiraConta.banco = "Itau";
        primeiraConta.nomeTitular = "João Pedro";
        primeiraConta.saldo = 4500.00;
        
        primeiraConta.depositar();
    }
    
}
