package br.com.frb.sgportfolios.domain.projeto.dto;

import br.com.frb.sgportfolios.domain.pessoa.Pessoa;
import br.com.frb.sgportfolios.domain.projeto.enums.ProjetoStatus;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public record ProjetoDTO(

        Long id,
        String nome,
        @DateTimeFormat( pattern = "dd/MM/yyyy")
        LocalDate dataInicio,
        @DateTimeFormat( pattern = "dd/MM/yyyy")
        LocalDate dataPrevisaoFim,
        @DateTimeFormat( pattern = "dd/MM/yyyy")
        LocalDate dataFim,
        String descricao,
        ProjetoStatus status,
        Float orcamento,
        String risco,
        Pessoa gerente
) {
}
