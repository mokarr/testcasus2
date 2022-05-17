package com.company;

public class Vliegtuig {


    private int gewichtVliegtuig ;




    public Vliegtuig (int gewichtVliegtuig) {
        this.gewichtVliegtuig = gewichtVliegtuig;
    }

    public int getprijs() {
        if (gewichtVliegtuig>=0 && gewichtVliegtuig<1000){
            return 100;
        }
        if (gewichtVliegtuig>= 1000 && gewichtVliegtuig<5000){
            return 500;
        }
        if (gewichtVliegtuig>= 5000){
            return  2500;
        }
        else return 0;
    }



}
