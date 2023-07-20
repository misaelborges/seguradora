package service;

public class ServicoPropostaSeguro {

    public void emitir(BemSeguravel bem) {
        System.out.println("----------------------");
        System.out.println("Proposta de seguro");
        System.out.println("----------------------");
        System.out.println(bem.Descrever());
        System.out.printf("Prêmio: R$%.2f%n", bem.CalcularValorPremio());
    }

}
