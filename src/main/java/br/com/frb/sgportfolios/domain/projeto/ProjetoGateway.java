package br.com.frb.sgportfolios.domain.projeto;

import java.util.List;
import java.util.Optional;

public interface ProjetoGateway {

    Projeto create(Projeto projeto);

    void deleteById(Long anId);

    Optional<Projeto> findById(Long anId);

    Projeto update(Projeto projeto);

    List<Projeto> findAll();
}
