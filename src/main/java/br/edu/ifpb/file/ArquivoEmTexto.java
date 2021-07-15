package br.edu.ifpb.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class ArquivoEmTexto {
    private final Path file;
    public ArquivoEmTexto(Path file) {
        this.file = file;
    }
    public List<String> emTexto(){
        try {
            return Files.readAllLines(
                    file
            );
        } catch (IOException e) {
            return Collections.EMPTY_LIST;
        }
    }
}
