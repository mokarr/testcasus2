package com.company;

public class VliegtuigTotaalPrijs {

    private int gewicht;
    private int passagiers;
    private boolean afhandelingDoorLuchthaven;
    private boolean nlVliegtuig;
    private double prijs;


    public VliegtuigTotaalPrijs(int gewicht, int passagiers, boolean afhandelingDoorLuchthaven, boolean nlVliegtuig) {
        this.gewicht = gewicht;
        this.passagiers = passagiers;
        this.afhandelingDoorLuchthaven = afhandelingDoorLuchthaven;
        this.nlVliegtuig = nlVliegtuig;
    }

    public double getGewichtPrijs() {
        double totaalprijs = prijs;
        if (gewicht>=0 && gewicht<1000){

            totaalprijs = 100;

        }
        else if (gewicht>= 1000 && gewicht<5000){
            totaalprijs = 500;
        }
        else if (gewicht>= 5000){
            totaalprijs = 2500;
        }
        else totaalprijs = 0;

        if (passagiers > 2){
            totaalprijs = totaalprijs * 1.5;
        }
        if (afhandelingDoorLuchthaven){
            totaalprijs = totaalprijs + 800;

        }

        if (nlVliegtuig){
            totaalprijs = totaalprijs * 1.21;
        }
        return totaalprijs;

    }


    }

