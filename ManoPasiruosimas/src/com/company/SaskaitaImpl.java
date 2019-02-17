package com.company;

public class SaskaitaImpl implements Saskaita {
    private int saskaitosNr;
    private String laikotarpis;
    private String tiekejas;
    private double mokejimoSuma;

    public SaskaitaImpl(int saskaitosNr, String laikotarpis, String tiekejas, double mokejimoSuma) {
        this.saskaitosNr = saskaitosNr;
        this.laikotarpis = laikotarpis;
        this.tiekejas = tiekejas;
        this.mokejimoSuma = mokejimoSuma;
    }

    @Override
    public int getSaskaitosNr() {
        return this.saskaitosNr;
    }

    @Override
    public void setSaskaitosNr(int saskaitosNr) {
        this.saskaitosNr = saskaitosNr;

    }

    @Override
    public String getLaikotarpis() {
        return this.laikotarpis;
    }

    @Override
    public void setLaikotarpis(String laikotarpis) {
        this.laikotarpis=laikotarpis;

    }

    @Override
    public String getTiekejas() {
        return this.tiekejas;
    }

    @Override
    public void setTiekejas(String tiekejas) {
        this.tiekejas=tiekejas;

    }

    @Override
    public double getMokejimoSuma() {
        return this.mokejimoSuma;
    }

    @Override
    public void setMokejimoSuma(double mokejimoSuma) {
        this.mokejimoSuma=mokejimoSuma;

    }
}
