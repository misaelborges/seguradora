package entities;

import service.BemSeguravel;

public class ImovelResidencial implements BemSeguravel {

    private double valorMercado;
    private int areaConstruida;

    public ImovelResidencial(double valorMercado, int areaConstruida) {
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public int getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(int areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    @Override
    public double CalcularValorPremio() {
        return (valorMercado * 0.001) + (areaConstruida * 0.30);
    }

    @Override
    public String Descrever() {
        return toString();
    }

    @Override
    public String toString() {
        return "Imóvel residencial com " +
                + areaConstruida + "m2 de área construida," +
                " avaliada em R$" + String.format("%.2f", valorMercado);
    }
}

