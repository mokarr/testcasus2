package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VliegtuigTotaalPrijsTest {

    @Test
    void totaalPrijs1() {
        assertEquals (100, new VliegtuigTotaalPrijs(1,2,false,false).getGewichtPrijs(), 0.001);
    }
    @Test
    void totaalPrijs2() {
        assertEquals (150, new VliegtuigTotaalPrijs(1,4,false,false).getGewichtPrijs(), 0.001);
    } @Test
    void totaalPrijs3() {
        assertEquals (1149.50, new VliegtuigTotaalPrijs(1,4,true,true).getGewichtPrijs(), 0.001);
    }
    @Test
    void totaalPrijs4() {
        assertEquals (1875.50, new VliegtuigTotaalPrijs(1000,4,true,true).getGewichtPrijs(), 0.001);
    }
    @Test
    void totaalPrijs5() {
        assertEquals (500, new VliegtuigTotaalPrijs(4999,2,false,false).getGewichtPrijs(), 0.001);
    }
    @Test
    void totaalPrijs6() {
        assertEquals (3025, new VliegtuigTotaalPrijs(5000,2,false,true).getGewichtPrijs(), 0.001);
    }
    @Test
    void totaalPrijs7() {
        assertEquals (5505.50, new VliegtuigTotaalPrijs(5000,4,true,true).getGewichtPrijs(), 0.001);
    }

}