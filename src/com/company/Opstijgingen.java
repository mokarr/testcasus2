package com.company;

public class Opstijgingen {


        private int maximaleGewichtVliegtuig;
        private int minimalewindSnelheid;
        private boolean toestemming;


        public Opstijgingen (int maximaleGewichtVliegtuig, int minimalewindSnelheid) {
            this.maximaleGewichtVliegtuig = maximaleGewichtVliegtuig;
            this.minimalewindSnelheid = minimalewindSnelheid;
            this.toestemming = true;
        }
        public boolean weigeringBijOpstijging (int gewicht, int wind,boolean toestemming) {
             if(toestemming == true && ((gewicht < maximaleGewichtVliegtuig) || (wind > minimalewindSnelheid)))
            return true;
             else return  false;

        }


}
