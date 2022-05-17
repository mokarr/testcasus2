package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VliegtuigTest {

    @Test
    void gewichtPrijs1() {
        int gewicht = 0;
        assertEquals (100, new Vliegtuig (gewicht).getprijs(), 0.001);
    }
    @Test
    void gewichtPrijs2() {
        int gewicht = 1;
        assertEquals (100, new Vliegtuig (gewicht).getprijs(), 0.001);
    }
    @Test
    void gewichtPrijs3() {
        int gewicht = 990;
        assertEquals (100, new Vliegtuig (gewicht).getprijs(), 0.001);
    }
    @Test
    void gewichtPrijs4(){
        int gewicht = 1000;
        assertEquals (500, new Vliegtuig (gewicht).getprijs(), 0.001);
    }
    @Test
    void gewichtPrijs5() {
        int gewicht = 1001;
        assertEquals (500, new Vliegtuig (gewicht).getprijs(), 0.001);
    }
    @Test
    void gewichtPrijs6() {
        int gewicht = 4999;
        assertEquals (500, new Vliegtuig (gewicht).getprijs(), 0.001);
    }
    @Test
    void gewichtPrijs7() {
        int gewicht = 5000;
        assertEquals (2500, new Vliegtuig (gewicht).getprijs(), 0.001);
    }
    @Test
    void gewichtPrijs8() {
        int gewicht = 5001;
        assertEquals (2500, new Vliegtuig (gewicht).getprijs(), 0.001);
    }
}