package br.com.frb.sgportfolios.infrastructure.service.impl;

import br.com.frb.sgportfolios.domain.projeto.Projeto;
import br.com.frb.sgportfolios.domain.projeto.dto.ProjetoDTO;
import br.com.frb.sgportfolios.domain.projeto.mapper.ProjetoMapper;
import br.com.frb.sgportfolios.infrastructure.projeto.persistence.ProjetoRepository;
import br.com.frb.sgportfolios.infrastructure.service.ProjetoService;
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
public class ProjetoServiceImpl implements ProjetoService {

    private final Logger log = LoggerFactory.getLogger(ProjetoServiceImpl.class);

    private final ProjetoRepository projetoRepository;

    private final ProjetoMapper projetoMapper;

    public ProjetoServiceImpl(ProjetoRepository projetoRepository, ProjetoMapper projetoMapper) {
        this.projetoRepository = projetoRepository;
        this.projetoMapper = projetoMapper;
    }

    @Override
    public ProjetoDTO save(ProjetoDTO projetoDTO) {
        log.debug("Request to save Projeto : {}", projetoDTO);

        Projeto projeto = projetoMapper.toEntity(projetoDTO);
        projeto = projetoRepository.save(projeto);
        return projetoMapper.toDto(projeto);
    }

    @Override
    public Optional<ProjetoDTO> partialUpdate(ProjetoDTO projetoDTO) {
        return projetoRepository
                .findById(projetoDTO.id())
                .map(existingProjeto -> {
                    projetoMapper.partialUpdate(existingProjeto, projetoDTO);
                    return existingProjeto;
                })
                .map(projetoRepository::save)
                .map(projetoMapper::toDto);
    }

    @Override
    public List<ProjetoDTO> findAll() {
        return projetoRepository.findAll().stream().map(projetoMapper::toDto).collect(Collectors.toCollection(LinkedList::new));
    }

    @Override
    public Optional<ProjetoDTO> findOne(Long id) {
        return projetoRepository.findById(id).map(projetoMapper::toDto);
    }

    @Override
    public void delete(Long id) {
        projetoRepository.deleteById(id);
    }
}
