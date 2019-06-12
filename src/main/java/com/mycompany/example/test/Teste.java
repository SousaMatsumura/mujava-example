package com.mycompany.example.test;

import com.mycompany.example.main.Example;






public class Teste{
   //Teste com cobertura completa, mas sem consderar o valor limite   
   @Test
   public void myTest() {
      Example ex = new Example();
      assertTrue(ex.biggerThanTen(11));
      assertFalse(ex.biggerThanTen(9));
   }
   
   //Teste com cobertura completa, mas esqueceram os asserts
   @Test
   public void myTestV2() {
      Example ex = new Example();
      ex.biggerThanTen(11);
      ex.biggerThanTen(10);
      ex.biggerThanTen(9);
   }
}