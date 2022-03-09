package com.sovos;

public class Main {

    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        empresa.contratar();
        System.out.println(empresa.getFuncionarios());
        empresa.testes();
    }
}
