package com.mycompany;

public class aula03operadores {

    public static void main(String[] args) {
        /**
        * tipos de comentario
        */

        //comentário de uma linha

        /**
         * comentários de 
         * multiplas
         * linhas
         */

        /**
         *declaração de varíaveis
        */

        String var1; // toda varíavel declarada sem valor, automaticamente é null,
        String var2 = null; // varíavel declarada sem valor null
        String var3 = ""; // varíavel declarada com valor vazio (diferente de null)
        
        /** 
         * operadores matemáticos
         */

        int num1 = 10;
        int num2 = 2;

        // soma
        int soma = num1 + num2;
        System.out.println("a soma entre " + num1 + "e" + num2 + " é: " + soma);

        //subtração 
        int subtração = num1 - num2;
        System.out.println("a subtração de " + num1 " por " + num2 + " é: " + subtração);

        //Multiplicação 
        int Multiplicação = num1 * num2;
        System.out.println("a multiplicação de " + num1 + " por " + num2 + " é: " + multiplicação);

        // divisão 
        int divisão = num1 / num2;
        System.out.println(" a divisão de " + num1 + " por " + num2 + " é: " + divisão);


        
    
    }
}