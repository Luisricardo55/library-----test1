package service;

import model.Livro;
import model.Autor;
import model.Categoria;
import model.Editora;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BibliotecaService {
    private Map<Categoria, List<Livro>> LivrosPorCategoria = new HashMap<>();

}
