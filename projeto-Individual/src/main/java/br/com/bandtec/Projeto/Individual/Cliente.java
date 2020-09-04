package br.com.bandtec.Projeto.Individual;

public abstract class Cliente {
    //Atributos
    private Integer id;
    private String nome;
    private String horaMarcada;
    private Double valorCorte = 0.0;

    // Construtor
    public Cliente(Integer id, String nome, String horaMarcada, Double valorCorte) {
        this.id = id;
        this.nome = nome;
        this.horaMarcada = horaMarcada;
        this.valorCorte = valorCorte;
    }

    // Métodos
       public abstract Double calcCorte();


    @Override
    public String toString() {
        return "Clientes:" + "\n" +
                "id= " + id + ", nome= " + nome + ", horaMarcada='" + horaMarcada + ", valorCorte=" + valorCorte + "\t";
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getHoraMarcada() {
        return horaMarcada;
    }

    public Double getValorCorte() {
        return valorCorte;
    }

    public void setValorCorte(Double valorCorte) {
        this.valorCorte = valorCorte;
    }


}
