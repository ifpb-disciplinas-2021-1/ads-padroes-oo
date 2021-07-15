package br.edu.ifpb.file;

import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArquivoEmTexto arquivo = new ArquivoEmTexto(
                Paths.get("/Users/job/Documents/dev/ifpb/2021-1/ads-padroes-poo/a.tex")
        );
        List<String> linhas = arquivo.emTexto();
        linhas.stream()
                .map(linha-> new DecodificadorDeTextoRSA(linha).decodificar())
                .forEach(System.out::println);

        String segredo = "bsOjbyBkaWdh";
        Decodificador decodificador = new DecodificadorDeTextoBase64(segredo);
        System.out.println(
                decodificador.decodificar()
        );

    }
}
