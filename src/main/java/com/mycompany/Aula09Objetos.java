package com.mycompany;

public class Aula09Objetos {
    public static void main(String[] args) {
    /*
     * Em java, toda classe ou tipo abstrato é um objeto, pois possui caracteristicas
     * e funcionalidade
     * 
     * Eles herdam funçoes da classe mãe java.lang.object é correto afirmar que java.lang.object é uma super classe 
     * de qualquer outra classe ou tipo abstrato.
     */
    Integer numero = 10;
    int numero2 =10;

    //Retornar se as variavel/classe é uma instancia de outra classe
    System.out.println(numero instanceof Object);
    
    // Método compareIo pertence ao tipo abstrato Integer 
    numero.compareTo(numero2);


    }
    
}
