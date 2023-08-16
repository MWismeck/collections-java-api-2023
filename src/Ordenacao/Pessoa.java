package Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    //atributos
    private String Nome;

    private int Idade;

    private Double Altura;



    //construtor
    public Pessoa(String Nome, int Idade, Double Altura) {
        this.Nome = Nome;
        this.Idade = Idade;
        this.Altura = Altura;


    }


    //getters

    public String getNome() {
        return Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public Double getAltura() {
        return Altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + Nome + '\'' +
                ", idade=" + Idade +
                ", altura=" + Altura +
                '}';
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(Idade, p.getIdade());
    }

    class ComparatorPorAltura implements Comparator<Pessoa>{
        @Override
        public int compare(Pessoa p1, Pessoa p2) {
            return Double.compare(p1.getAltura(), p2.getAltura());
        }



    }

}

