package br.com.frb.sgportfolios.infrastructure.service;

import br.com.frb.sgportfolios.domain.pessoa.Pessoa;
import br.com.frb.sgportfolios.domain.projeto.dto.PessoaDTO;

import java.util.List;
import java.util.Optional;

public interface PessoaService {

    PessoaDTO save(PessoaDTO pessoaDTO);

    Optional<PessoaDTO> partialUpdate(PessoaDTO pessoaDTO);

    List<PessoaDTO> findAll();

    Optional<PessoaDTO> findOne(Long id);

    void delete(Long id);

    List<Pessoa> findAllGerente();
}
