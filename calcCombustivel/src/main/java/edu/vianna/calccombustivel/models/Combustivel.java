package edu.vianna.calccombustivel.models;

public class Combustivel {
    private double gasolina;
    private double etanol;

    public Combustivel() {
    }

    public Combustivel(double gasolina, double etanol) {
        this.gasolina = gasolina;
        this.etanol = etanol;
    }

    public boolean compensaGasolina() {
        double percentual = etanol / gasolina;
        if (percentual >= 0.7) {
            return true;
        } else {
            return false;
        }
    }



    public double getGasolina() {
        return gasolina;
    }

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }

    public double getEtanol() {
        return etanol;
    }

    public void setEtanol(double etanol) {
        this.etanol = etanol;
    }
}
