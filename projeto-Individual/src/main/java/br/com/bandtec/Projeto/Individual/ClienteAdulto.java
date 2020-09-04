package br.com.bandtec.Projeto.Individual;

public class ClienteAdulto extends Cliente{

    //Construtor

    public ClienteAdulto(Integer id, String nome, String dataNasc, String telefone, String email, String endereco, String horaMarcada, Double valorCorte) {
        super(id, nome, horaMarcada, valorCorte);
    }

    //Métodos

    @Override
    public Double calcCorte() {
        Double valor = 25.0;
        valor += getValorCorte();
        return valor;
    }

    @Override
    public String toString() {
        return "Adulto: " + "\n" +
                super.toString();
    }
}

