package br.com.frb.sgportfolios.infrastructure.service.impl;

import br.com.frb.sgportfolios.domain.pessoa.Pessoa;
import br.com.frb.sgportfolios.domain.projeto.dto.PessoaDTO;
import br.com.frb.sgportfolios.domain.projeto.mapper.PessoaMapper;
import br.com.frb.sgportfolios.infrastructure.pessoa.persistence.PessoaRepository;
import br.com.frb.sgportfolios.infrastructure.service.PessoaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class PessoaServiceImpl implements PessoaService {
    private final Logger log = LoggerFactory.getLogger(ProjetoServiceImpl.class);

    private final PessoaRepository pessoaRepository;

    private final PessoaMapper pessoaMapper;

    public PessoaServiceImpl(final PessoaRepository pessoaRepository, final PessoaMapper pessoaMapper) {
        this.pessoaRepository = pessoaRepository;
        this.pessoaMapper = pessoaMapper;
    }

    @Override
    public PessoaDTO save(PessoaDTO pessoaDTO) {
        log.debug("Request to save Projeto : {}", pessoaDTO);

        Pessoa pessoa = pessoaMapper.toEntity(pessoaDTO);
        pessoa = pessoaRepository.save(pessoa);
        return pessoaMapper.toDto(pessoa);
    }

    @Override
    public Optional<PessoaDTO> partialUpdate(PessoaDTO pessoaDTO) {
        return pessoaRepository
                .findById(pessoaDTO.id())
                .map(existingProjeto -> {
                    pessoaMapper.partialUpdate(existingProjeto, pessoaDTO);
                    return existingProjeto;
                })
                .map(pessoaRepository::save)
                .map(pessoaMapper::toDto);
    }

    @Override
    public List<PessoaDTO> findAll() {
        return pessoaRepository.findAll().stream().map(pessoaMapper::toDto).collect(Collectors.toCollection(LinkedList::new));
    }

    @Override
    public Optional<PessoaDTO> findOne(Long id) {
        return pessoaRepository.findById(id).map(pessoaMapper::toDto);
    }

    @Override
    public void delete(Long id) {
        pessoaRepository.deleteById(id);
    }

    @Override
    public List<Pessoa> findAllGerente() {
        return pessoaRepository.findAllByGerente(true);
    }
}
