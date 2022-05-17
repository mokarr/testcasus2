package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OpstijgingenTest {

    @Test
    void weigeringBijOpstijging() {
        Opstijgingen opstijgingen = new Opstijgingen(1000,50);
        assertFalse(opstijgingen.weigeringBijOpstijging(1005, 49));
        assertTrue(opstijgingen.weigeringBijOpstijging(800, 40));
        assertTrue(opstijgingen.weigeringBijOpstijging(1100, 60));
        assertTrue(opstijgingen.weigeringBijOpstijging(900, 60));
    }

}