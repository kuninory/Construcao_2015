/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.calculadatasemana;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Felipe
 */
public class CalculaDataSemanaTest {
    
    public CalculaDataSemanaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculaDiaDaSemana method, of class CalculaDataSemana.
     */
    @Test
    public void testCalculaDiaDaSemana() {
        System.out.println("calculaDiaDaSemana");
        String data1 = "";
        String data2 = "";
        int anoBissexto = 0;
        int codDiaSemanaReal = 0;
        int expResult = 0;
        int result = CalculaDataSemana.calculaDiaDaSemana(data1, data2, anoBissexto, codDiaSemanaReal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bissexto method, of class CalculaDataSemana.
     */
    @Test
    public void testBissexto() {
        System.out.println("bissexto");
        int ano = 0;
        boolean expResult = false;
        boolean result = CalculaDataSemana.bissexto(ano);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contaBissextos method, of class CalculaDataSemana.
     */
    @Test
    public void testContaBissextos() {
        System.out.println("contaBissextos");
        int ano = 0;
        int expResult = 0;
        int result = CalculaDataSemana.contaBissextos(ano);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dataParaSegundos method, of class CalculaDataSemana.
     */
    @Test
    public void testDataParaSegundos() {
        System.out.println("dataParaSegundos");
        String data = "";
        long expResult = 0L;
        long result = CalculaDataSemana.dataParaSegundos(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculaDiferencaEmSegundos method, of class CalculaDataSemana.
     */
    @Test
    public void testCalculaDiferencaEmSegundos() {
        System.out.println("calculaDiferencaEmSegundos");
        String data1 = "";
        String data2 = "";
        long expResult = 0L;
        long result = CalculaDataSemana.calculaDiferencaEmSegundos(data1, data2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculaDiferencaEmDias method, of class CalculaDataSemana.
     */
    @Test
    public void testCalculaDiferencaEmDias() {
        System.out.println("calculaDiferencaEmDias");
        String data1 = "";
        String data2 = "";
        int anoBissexto = 0;
        long expResult = 0L;
        long result = CalculaDataSemana.calculaDiferencaEmDias(data1, data2, anoBissexto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
