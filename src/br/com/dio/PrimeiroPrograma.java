package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        /*int a =5;
        int b = 3;

        System.out.println("Hello World!" + (a+b));*/
    }
}

class Livro {
    public String nome;
    public Integer npags;

    public Livro(String nome, Integer npags) {
        this.nome = nome;
        this.npags = npags;
    }

    public Livro() {     }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNpags() {
        return npags;
    }

    public void setNpags(Integer npags) {
        this.npags = npags;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", npags=" + npags +
                '}';
    }
}
