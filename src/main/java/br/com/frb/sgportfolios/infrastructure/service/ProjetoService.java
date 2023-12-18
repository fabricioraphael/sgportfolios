package br.com.frb.sgportfolios.infrastructure.service;

import br.com.frb.sgportfolios.domain.projeto.Projeto;
import br.com.frb.sgportfolios.domain.projeto.dto.ProjetoDTO;

import java.util.List;
import java.util.Optional;

public interface ProjetoService {

    ProjetoDTO save(ProjetoDTO projetoDTO);

    Optional<ProjetoDTO> partialUpdate(ProjetoDTO projetoDTO);

    List<ProjetoDTO> findAll();

    Optional<ProjetoDTO> findOne(Long id);

    void delete(Long id);
}
