package br.edu.ifpb.file;

public abstract class Decodificador {
    protected final String  texto;

    protected Decodificador(String texto) {
        this.texto = texto;
    }
    public abstract String decodificar();
}
