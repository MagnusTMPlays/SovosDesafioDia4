package com.sovos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Empresa extends Pessoa {

    public String contratar(){
        Random geradorNum = new Random();

        for (String n : arrayNomes ) {
            nome = n;
            idade = String.valueOf(geradorNum.nextInt(83)+18);
            funcionarios.add("Nome: "+ nome+" | "+"Idade: "+idade + "\n");
        }
        return null;
    }
    public ArrayList getFuncionarios(){
        return funcionarios;
    }

    public ArrayList testes(){
        Random geradorNum = new Random();
        String[][] teste = new String[][] {{"", ""},{"", ""},{"", ""},{"", ""},{"", ""},{"", ""},{"", ""},{"", ""},{"", ""},{"", ""}};

        for (String n : arrayNomes ) {
            nome = n;
            idade = String.valueOf(geradorNum.nextInt(83)+18);
            teste[Arrays.asList(arrayNomes).indexOf(nome)]= new String[]{nome, String.valueOf(idade)};
            int index = Arrays.asList(arrayNomes).indexOf(nome);
        }
        //Nested Array metodo deep:
        System.out.println(Arrays.deepToString(teste));
        return null;
    }

}
