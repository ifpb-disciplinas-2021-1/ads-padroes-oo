package br.edu.ifpb.file;

import java.util.Base64;

public class DecodificadorDeTextoRSA extends Decodificador{

    protected DecodificadorDeTextoRSA(String texto) {
        super(texto);
    }
    public String decodificar(){
        return new StringBuilder(texto)
                .reverse()
                .toString();

    }
}
