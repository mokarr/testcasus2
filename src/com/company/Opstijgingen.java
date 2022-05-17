package com.company;

public class Opstijgingen {


        private int maximaleGewichtVliegtuig;
        private int minimalewindSnelheid;


        public Opstijgingen (int maximaleGewichtVliegtuig, int minimalewindSnelheid ) {
            this.maximaleGewichtVliegtuig = maximaleGewichtVliegtuig;
            this.minimalewindSnelheid = minimalewindSnelheid;
        }
        public boolean weigeringBijOpstijging (int gewicht, int wind) {
            return (gewicht < maximaleGewichtVliegtuig) || (wind > minimalewindSnelheid);

        }


}
