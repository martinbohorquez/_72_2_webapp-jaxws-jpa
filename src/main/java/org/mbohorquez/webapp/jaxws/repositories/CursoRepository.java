package org.mbohorquez.webapp.jaxws.repositories;

import org.mbohorquez.webapp.jaxws.models.Curso;

import java.util.List;

public interface CursoRepository {
    List<Curso> listar();

    Curso guardar(Curso curso);
}
