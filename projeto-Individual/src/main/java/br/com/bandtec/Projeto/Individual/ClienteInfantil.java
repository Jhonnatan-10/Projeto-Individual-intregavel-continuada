package br.com.bandtec.Projeto.Individual;

public class ClienteInfantil extends Cliente{

    //Construtor

    public ClienteInfantil(Integer id, String nome, String horaMarcada, Double valorCorte) {
        super(id, nome, horaMarcada, valorCorte);
    }

    //Métodos


    @Override
    public Double calcCorte() {
        Double valor = 15.0;
        valor += getValorCorte();
        return valor;
    }


    @Override
    public String toString() {
        return "Infantil: " + "\n" +
                super.toString();
    }
}
