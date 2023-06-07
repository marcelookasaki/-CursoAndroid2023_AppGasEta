package dev.omy.appgaseta.controller;

import java.util.ArrayList;
import java.util.List;

import dev.omy.appgaseta.model.Curso;

public class CursoController {

    private List listCursos;

    public List getListaCursos() {

        listCursos = new ArrayList<Curso>();

        listCursos.add(new Curso("Java"));
        listCursos.add(new Curso("Kotlin"));
        listCursos.add(new Curso("Swift"));
        listCursos.add(new Curso("Dart"));
        listCursos.add(new Curso("JavaScript"));
        listCursos.add(new Curso("HTML"));
        listCursos.add(new Curso("CSS"));
        listCursos.add(new Curso("GitHub"));
        listCursos.add(new Curso("Web"));
        listCursos.add(new Curso("NodeJS"));

        return listCursos;

    }

    public ArrayList<String> dadosParaSpinner() {

        ArrayList<String> dados = new ArrayList<>();

        for (int i = 0; i < getListaCursos().size(); i++ ) {

            Curso objeto = (Curso) getListaCursos().get(i);
            dados.add(objeto.getNomeCurso());
        }
        return dados;
    }

}
