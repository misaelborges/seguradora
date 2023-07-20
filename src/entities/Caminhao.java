package entities;

public class Caminhao extends VeiculoAutomotor {

    private int quantidadeEixos;

    public Caminhao(String modelo, int anoFabricacao, double valorMercado, int quantidadeEixos) {
        super(modelo, anoFabricacao, valorMercado);
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double CalcularValorPremio() {
        double valor = getValorMercado() * 0.02;
        double valorEixo = quantidadeEixos * 50;
        return valor + valorEixo;
    }

    @Override
    public String Descrever() {
        return String.format("Caminhão %s ano %d, %d eixos, avaliado em R$%.2f",
                getModelo(), getAnoFabricacao(), quantidadeEixos, getValorMercado());
    }
}
