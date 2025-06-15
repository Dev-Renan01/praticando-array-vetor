import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("========V E T O R 01 ========");
        double[] notas = new double[3];
        notas[0] = 5.423;
        notas[1] = 3.6;
        notas[2] = 7.0;

        for (double n : notas) {
            System.out.println(n);
        }
        System.out.println("========V E T O R 02 ========");

        double[] valores = {9.2, 3.9, 8.54};

        for(int i = 0; i < valores.length; i++){
            System.out.println(valores[i]);
        }

        System.out.println("======== M A T R I Z 01 ========");

        double matriz[][] = new double[2][3];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;

        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;


        for(int linhas = 0; linhas < matriz.length; linhas++){

            for(int colunas = 0; colunas < matriz[linhas].length; colunas++){
                System.out.print(matriz[linhas][colunas] + " ");
                System.out.println();
            }
        }

        System.out.println("======== S P L I T ========");
        String txt = "Thiago,curso java,344,67,89,2 ";

        String[]valorArray = txt.split(",");

        System.out.println("nome: " + valorArray[0]);
        System.out.println("curso: " + valorArray[1]);
        System.out.println("nota1: " + valorArray[2]);
        System.out.println("nota2: " + valorArray[3]);
        System.out.println("nota3: " + valorArray[4]);
        System.out.println("nota4: " + valorArray[5]);

        //Convertendo um Array em uma lista
        System.out.println("---------------");
        List<String> list = Arrays.asList(valorArray);

        for(String l : list){
            System.out.println(l);
        }

        System.out.println();
        //converter uma lista para um Array
        String[] conversaoArray = list.toArray(new String [6]);

        for(int i = 0; i<conversaoArray.length; i++){
            System.out.println(conversaoArray[i]);
        }
    }
}
