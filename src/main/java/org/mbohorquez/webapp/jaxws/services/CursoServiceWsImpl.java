package org.mbohorquez.webapp.jaxws.services;


import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.mbohorquez.webapp.jaxws.models.Curso;
import org.mbohorquez.webapp.jaxws.repositories.CursoRepository;

import java.util.Arrays;
import java.util.List;

@Stateless
@WebService(endpointInterface="org.mbohorquez.webapp.jaxws.services.CursoServiceWs")
public class CursoServiceWsImpl implements CursoServiceWs {
    @Inject
    private CursoRepository repository;

    @Override
    @WebMethod
    public List<Curso> listar() {
        return repository.listar();
    }

    @Override
    @WebMethod
    public Curso guardar(Curso curso) {
        return repository.guardar(curso);
    }
}
