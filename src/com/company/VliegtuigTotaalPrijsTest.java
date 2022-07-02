package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VliegtuigTotaalPrijsTest {

    @Test
    void totaalPrijs1() {
        assertEquals (1089, new VliegtuigTotaalPrijs(750,2,true,true).getGewichtPrijs(), 0.001);
    }
    @Test
    void totaalPrijs2() {
        assertEquals (150, new VliegtuigTotaalPrijs(750,4,false,false).getGewichtPrijs(), 0.001);
    } @Test
    void totaalPrijs3() {
        assertEquals (605, new VliegtuigTotaalPrijs(1500,2,false,true).getGewichtPrijs(), 0.001);
    }
    @Test
    void totaalPrijs4() {
        assertEquals (1550, new VliegtuigTotaalPrijs(1500,4,true,false).getGewichtPrijs(), 0.001);
    }
    @Test
    void totaalPrijs5() {
        assertEquals (3993, new VliegtuigTotaalPrijs(7000,2,true,true).getGewichtPrijs(), 0.001);
    }
    @Test
    void totaalPrijs6() {
        assertEquals (3750, new VliegtuigTotaalPrijs(7000,4,false,false).getGewichtPrijs(), 0.001);
    }


}