
package com.mycompany.calculadatasemana;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculaDataSemanaTest {

    @Test
    public void testDatasVazias() {
        String data1 = "";
        String data2 = "";
        int anoBissexto = 0;
        int codDiaSemanaReal = 0;
        int expResult = -1;
        int result = CalculaDataSemana.calculaDiaDaSemana(data1, data2, anoBissexto, codDiaSemanaReal);
        assertEquals(expResult, result);
    }

    @Test
    public void testDataRequeridaVazia() {
        String dataRequerida = "";
        String dataReal = "05/09/2015";
        int anoBissexto = 0;
        int codDiaSemanaReal = 0;
        int expResult = -1;
        int result = CalculaDataSemana.calculaDiaDaSemana(dataRequerida, dataReal, anoBissexto, codDiaSemanaReal);
        assertEquals(expResult, result);
    }

    @Test
    public void testDataRealVazia() {
        String dataRequerida = "05/09/2015";
        String dataReal = "";
        int anoBissexto = 0;
        int codDiaSemanaReal = 0;
        int expResult = -1;
        int result = CalculaDataSemana.calculaDiaDaSemana(dataRequerida, dataReal, anoBissexto, codDiaSemanaReal);
        assertEquals(expResult, result);
    }

    @Test
    public void testDatasNaoPadronizadas() {
        String dataRequerida = "05/9/2015";
        String dataReal = "04/09/15";
        int anoBissexto = 4;
        int codDiaSemanaReal = 0;
        int expResult = -1;
        int result = CalculaDataSemana.calculaDiaDaSemana(dataRequerida, dataReal, anoBissexto, codDiaSemanaReal);
        assertEquals(expResult, result);
    }

    @Test
    public void testDiaMaiorQue31() {
        String dataRequerida = "32/09/2015";
        String dataReal = "04/09/2015";
        int anoBissexto = 4;
        int codDiaSemanaReal = 5;
        int expResult = -1;
        int result = CalculaDataSemana.calculaDiaDaSemana(dataRequerida, dataReal, anoBissexto, codDiaSemanaReal);
        assertEquals(expResult, result);
    }

    @Test
    public void testMesMaiorQue12() {
        String dataRequerida = "05/13/2015";
        String dataReal = "04/09/2015";
        int anoBissexto = 4;
        int codDiaSemanaReal = 5;
        int expResult = -1;
        int result = CalculaDataSemana.calculaDiaDaSemana(dataRequerida, dataReal, anoBissexto, codDiaSemanaReal);
        assertEquals(expResult, result);
    }

    @Test
    public void testCodDiaMaiorQue6() {
        String dataRequerida = "05/09/2015";
        String dataReal = "04/09/2015";
        int anoBissexto = 4;
        int codDiaSemanaReal = 7;
        int expResult = -1;
        int result = CalculaDataSemana.calculaDiaDaSemana(dataRequerida, dataReal, anoBissexto, codDiaSemanaReal);
        assertEquals(expResult, result);
    }

    @Test
    public void testAnoBissextoMenorQue0() {
        String dataRequerida = "05/09/2015";
        String dataReal = "04/09/2015";
        int anoBissexto = -1;
        int codDiaSemanaReal = -1;
        int expResult = -1;
        int result = CalculaDataSemana.calculaDiaDaSemana(dataRequerida, dataReal, anoBissexto, codDiaSemanaReal);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculaDiaDaSemana() {
        String dataRequerida = "05/09/2015";
        String dataReal = "04/09/2015";
        int anoBissexto = 4;
        int codDiaSemanaReal = 4;
        int expResult = 5;
        int result = CalculaDataSemana.calculaDiaDaSemana(dataRequerida, dataReal, anoBissexto, codDiaSemanaReal);
        assertEquals(expResult, result);
    }
    
}
