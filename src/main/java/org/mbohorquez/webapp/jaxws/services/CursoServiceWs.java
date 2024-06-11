package org.mbohorquez.webapp.jaxws.services;

import jakarta.jws.WebService;
import org.mbohorquez.webapp.jaxws.models.Curso;

import java.util.List;

@WebService
public interface CursoServiceWs {
    List<Curso> listar();
    Curso guardar(Curso curso);
}
