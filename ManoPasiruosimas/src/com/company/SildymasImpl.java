package com.company;

import java.util.Comparator;

public class SildymasImpl extends SaskaitaImpl implements  Sildymas {
    private double vandensSildymoKaina;
    private int skaitiklioNr;
    private int skaitiklisNuo;
    private int skaitiklisIki;

    public SildymasImpl(int saskaitosNr, String laikotarpis, String tiekejas, double mokejimoSuma, double vandensSildymoKaina, int skaitiklioNr, int skaitiklisNuo, int skaitiklisIki) {
        super(saskaitosNr, laikotarpis, tiekejas, mokejimoSuma);
        this.vandensSildymoKaina = vandensSildymoKaina;
        this.skaitiklioNr = skaitiklioNr;
        this.skaitiklisNuo = skaitiklisNuo;
        this.skaitiklisIki = skaitiklisIki;

    }

    @Override
    public double getVandensSildymoKaina() {
        return this.vandensSildymoKaina;
    }

    @Override
    public void setVandensSildymoKaina(double vandensSildymoKaina) {
        this.vandensSildymoKaina=vandensSildymoKaina;

    }

    @Override
    public int getSkaitiklioNr() {
        return this.skaitiklioNr;
    }

    @Override
    public void setSkaitiklioNr(int skaitiklioNr) {
        this.skaitiklioNr=skaitiklioNr;

    }

    @Override
    public int getSkaitiklisNuo() {
        return this.skaitiklisNuo;
    }

    @Override
    public void setSkaitiklisNuo(int skaitiklisNuo) {
        this.skaitiklisNuo=skaitiklisNuo;

    }

    @Override
    public int getSkaitiklsIki() {
        return this.skaitiklisIki;
    }

    @Override
    public void setSkaitiklisIki(int skaitiklisIki) {
        this.skaitiklisIki=skaitiklisIki;

    }

    @Override
    public String toString() {
        return "SildymasImpl{" +
                " saskaitosNr=" + getSaskaitosNr() +
                ", laikotarpis=" + getLaikotarpis() +
                ", tiekejas=" + getTiekejas() +
                ", mokejimoSuma=" + getMokejimoSuma() +
                ", vandensSildymoKaina=" + getVandensSildymoKaina() +
                ", skaitiklioNr=" + skaitiklioNr +
                ", skaitiklisNuo=" + skaitiklisNuo +
                ", skaitiklisIki=" + skaitiklisIki +
                '}';
    }

    public static Comparator<SildymasImpl> sildymasComparator = new Comparator<SildymasImpl>() {
        @Override
        public int compare(SildymasImpl kaina1, SildymasImpl kaina2) {
           double vandensSildymoKaina1=kaina1.getVandensSildymoKaina();
            double vandensSildymoKaina2=kaina2.getVandensSildymoKaina();

            return (int) (vandensSildymoKaina2 - vandensSildymoKaina1);
        }
    };
}



