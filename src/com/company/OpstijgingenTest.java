package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OpstijgingenTest {

    @Test
    void weigeringBijOpstijging() {
        Opstijgingen opstijgingen = new Opstijgingen(1000,50);
        assertFalse(opstijgingen.weigeringBijOpstijging(1005, 49,true));
        assertFalse(opstijgingen.weigeringBijOpstijging(1005, 51,false));
        assertTrue(opstijgingen.weigeringBijOpstijging(990, 60,true));
        assertTrue(opstijgingen.weigeringBijOpstijging(1005, 60,true));
    }

}