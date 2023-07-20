package entities;

public class CarroParticular extends VeiculoAutomotor{

    public CarroParticular(String modelo, int anoFabricacao, double valorMercado) {
        super(modelo, anoFabricacao, valorMercado);
    }

    @Override
    public double CalcularValorPremio() {
        double valor = getValorMercado() * 0.04;
        if (getAnoFabricacao() < 2000) {
            valor *= 0.05;
        }
        return valor;
    }

    @Override
    public String Descrever() {
        return String.format("Carro particular %s ano %d, avaliado em R$%.2f",
                getModelo(), getAnoFabricacao(), getValorMercado());
    }


}
