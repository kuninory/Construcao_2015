package com.mycompany.calculadatasemana;

import java.util.Scanner;

public class CalculaDataSemana {

    public static void main(String[] args) {

        /*
         O algoritmo consiste em:
         1- Descobrir a diferenca de dias entre o dia desejado e o dia verdadeiro;
         2- Aplicar a formula (diaSemana+diferenca)%7;
         3- Caso o resultado de 2 seja maior ou igual a 0, este sera o codigo do dia da semana;
         4- Caso o resultado de 2 seja menor que 0 deve ser aplicada a formula (7-Result2), assim teremos o codigo do dia da semana;
         5- Levar em consideracao o ano bissexto informado, caso o mesmo seja maior ou igual 
         que o ano desejado e menor que ano do dia refencia, deve ser adicionado 1 dia;
         */
        Scanner inInt = new Scanner(System.in);
        Scanner inString = new Scanner(System.in);

        System.out.println("Informe o ano Bissexto:");
        int anoBissexto = inInt.nextInt();

        System.out.println("Informe a data 1:");
        String dataRequerida = inString.nextLine();

        System.out.println("Informe a data 2:");
        String dataReal = inString.nextLine();

        System.out.println("Informe o codigo do dia da semana:");
        int codDiaSemanaReal = inInt.nextInt();

        int resultado = calculaDiaDaSemana(dataRequerida, dataReal, anoBissexto, codDiaSemanaReal);

        System.out.println("Resultado= " + resultado);

    }

    public static int calculaDiaDaSemana(String data1, String data2, int anoBissexto, int codDiaSemanaReal) {

        // 01/02/3333
        int dia1 = Integer.parseInt(data1.substring(0, 2));
        int mes1 = Integer.parseInt(data1.substring(3, 5));
        int ano1 = Integer.parseInt(data1.substring(6, 10));

        int dia2 = Integer.parseInt(data2.substring(0, 2));
        int mes2 = Integer.parseInt(data2.substring(3, 5));
        int ano2 = Integer.parseInt(data2.substring(6, 10));

        if ((ano1 < 0) || (ano2 < 0)) {

            return -1;
        }

        if ((mes1 > 12) || (mes2 > 12) || (mes1 < 1) || (mes2 < 1)) {

            return -1;
        }

        if ((codDiaSemanaReal > 6) || (codDiaSemanaReal < 0)) {

            return -1;
        }

        if ((anoBissexto < 0)) {

            return -1;
        }

        long diferenca = calculaDiferencaEmDias(data1, data2, anoBissexto);

        System.out.println("Diferenca de dias= " + diferenca);

        int aux1 = (codDiaSemanaReal + (int) (long) diferenca) % 7;
        if (aux1 >= 0) {
            System.out.println(aux1);

            return aux1;
        } else {
            int aux2 = (7 + aux1);

            return aux2;
        }

    }

    public static boolean bissexto(int ano) {

        return (ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0);
    }

    public static int contaBissextos(int ano) {

        return (ano / 4) - (ano / 100) + (ano / 400);
    }

    public static long dataParaSegundos(String data) {

        // 01/02/3333
        int dia = Integer.parseInt(data.substring(0, 2));
        int mes = Integer.parseInt(data.substring(3, 5));
        int ano = Integer.parseInt(data.substring(6, 10));

        long total = 0;

        /*
         31536000 = número de segundos em um ano não bissexto (365 dias)
         86400 = número de segundos em um dia (24 horas)
         */
        total += (ano - 1) * 31536000;

        int meses[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int m = 1; m < mes; m++) {
            total += meses[m - 1] * 86400;
        }

        total += (dia - 1) * 86400;

        /*
         Adiciona segundos para cada dia adicional dos anos bissextos
         */

        /* Número de dias adicionais, para os anos bissextos anteriores ao ano atual */
        int diasExtras = contaBissextos(ano - 1);
        total += diasExtras * 86400;

        /* Se o mês da data já passou de fereveiro e o ano atual é bissexto, adiciona mais um dia */
        if (bissexto(ano) && (mes - 1) >= 2) {
            total += 86400;
        }

        return total;
    }

    public static long calculaDiferencaEmSegundos(String data1, String data2) {

        long segundosd1 = dataParaSegundos(data1);
        long segundosd2 = dataParaSegundos(data2);

        if (segundosd1 > segundosd2) {

            return segundosd1 - segundosd2;
        } else {

            return -(segundosd2 - segundosd1);
        }
    }

    public static long calculaDiferencaEmDias(String data1, String data2, int anoBissexto) {

        long segundos = calculaDiferencaEmSegundos(data1, data2);

        int mes1 = Integer.parseInt(data1.substring(3, 5));
        int mes2 = Integer.parseInt(data2.substring(3, 5));
        int ano1 = Integer.parseInt(data1.substring(6, 10));
        int ano2 = Integer.parseInt(data2.substring(6, 10));

        if ((ano1 <= anoBissexto) && (ano2 >= anoBissexto)) {
            if (ano1 <= anoBissexto) {
                if ((mes1) >= 2) {
                    segundos += 86400;
                }
            } else if (ano2 >= anoBissexto) {
                if ((mes2) >= 2) {
                    segundos += 86400;
                }
            }
        }

        return segundos / 86400;
    }
}
