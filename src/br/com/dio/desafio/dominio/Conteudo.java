package br.com.dio.desafio.dominio;

//classe abstrata não consegue instanciar normalmente
//não pode criar o objeto conteudo
public abstract class Conteudo {

    //final representa que é uma constante
    //é static pq vou poder acessar o XP_PADRAO fora da classe Conteudo
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
