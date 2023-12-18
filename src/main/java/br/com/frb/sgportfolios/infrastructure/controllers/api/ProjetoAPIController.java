package br.com.frb.sgportfolios.infrastructure.controllers.api;

import br.com.frb.sgportfolios.domain.projeto.dto.ProjetoDTO;
import br.com.frb.sgportfolios.infrastructure.service.ProjetoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProjetoAPIController {

    private final Logger log = LoggerFactory.getLogger(ProjetoAPIController.class);

    private final ProjetoService projetoService;

    public ProjetoAPIController(ProjetoService projetoService) {
        this.projetoService = projetoService;
    }

    @GetMapping("/projetos")
    public List<ProjetoDTO> getAllProjetos() {
        log.debug("REST request to get all Projetos");
        return projetoService.findAll();
    }

    @PostMapping("/projetos")
    public ProjetoDTO createProjeto(final ProjetoDTO projetoDTO) {
        log.debug("REST request to get all Projetos projetoDTO: " + projetoDTO);
        return projetoService.save(projetoDTO);
    }
}
