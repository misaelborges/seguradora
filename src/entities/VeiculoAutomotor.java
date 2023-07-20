package entities;

import service.BemSeguravel;

public abstract class VeiculoAutomotor implements BemSeguravel {

    private String modelo;
    private double valorMercado;
    private int anoFabricacao;

    public VeiculoAutomotor(String modelo, int anoFabricacao, double valorMercado) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.valorMercado = valorMercado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}
