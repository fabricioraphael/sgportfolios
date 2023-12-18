package br.com.frb.sgportfolios.infrastructure.controllers;

import br.com.frb.sgportfolios.domain.projeto.Projeto;
import br.com.frb.sgportfolios.domain.projeto.enums.ProjetoRisco;
import br.com.frb.sgportfolios.domain.projeto.enums.ProjetoStatus;
import br.com.frb.sgportfolios.domain.projeto.dto.ProjetoDTO;
import br.com.frb.sgportfolios.domain.projeto.mapper.ProjetoMapper;
import br.com.frb.sgportfolios.infrastructure.service.PessoaService;
import br.com.frb.sgportfolios.infrastructure.service.ProjetoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;
import java.util.Map;

@Controller
public class ProjetoController {

    private final ProjetoService projetoService;
    private final PessoaService pessoaService;
    private final ProjetoMapper projetoMapper;

    public ProjetoController(final ProjetoService projetoService, final PessoaService pessoaService, final ProjetoMapper projetoMapper) {
        this.projetoService = projetoService;
        this.pessoaService = pessoaService;
        this.projetoMapper = projetoMapper;
    }

    @GetMapping("/projetos/listar")
    public String index(Map<String, Object> model){
        var projetos = projetoService.findAll();

        System.out.println("projetos: " + projetos);

        model.put("projetos", projetos);

        return "projetos/listar";
    }

    @GetMapping("/projetos/criar")
    public String novo(Map<String, Object> model){
        var gerentes = pessoaService.findAllGerente();

        model.put("projetoStatus", ProjetoStatus.values());
        model.put("projetoRisco", ProjetoRisco.values());
        model.put("projeto", new Projeto());
        model.put("gerentes", gerentes);

        return "projetos/criar";
    }

    @PostMapping("/projetos/salvar")
    public String salvar(@ModelAttribute("projeto") ProjetoDTO projetoDTO){
        System.out.println("projetoDTO: " + projetoDTO);

        projetoService.save(projetoDTO);

        return "redirect:/projetos/listar";
    }

    @GetMapping("/projeto")
    public String findOne(Map<String, Object> model){
        model.put("time", new Date());
        model.put("message", "PROJETOSSSS");
        model.put("message", "PROJETOSSSS");

        var projeto = projetoService.findOne(1l);

        model.put("projeto", projeto);

        System.out.println("projeto: " + projeto.get());

        return "welcome";
    }
}
