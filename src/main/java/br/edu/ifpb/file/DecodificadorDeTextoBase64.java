package br.edu.ifpb.file;

import java.util.Base64;

public class DecodificadorDeTextoBase64 extends Decodificador{

    protected DecodificadorDeTextoBase64(String texto) {
        super(texto);
    }

    public String decodificar(){
        return new String(
             Base64.getDecoder().decode(
                     texto.getBytes()
             )
        );
    }
}
