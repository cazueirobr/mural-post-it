package br.com.edu.utfpr.muralpostit.model.domain;

public class PostIt {
    private String tema;
    private String colaborador;
    private String texto;

    public PostIt(String tema, String colaborador, String texto){
        this.tema = tema;
        this.colaborador = colaborador;
        this.texto = texto;

    }

    public String getTema(){
        return tema;
    }
    public String getColaborador(){
        return colaborador;
    }

    public String getTexto(){
        return texto;
    }
}
