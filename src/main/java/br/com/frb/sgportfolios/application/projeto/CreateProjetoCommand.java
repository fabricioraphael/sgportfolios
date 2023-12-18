package br.com.frb.sgportfolios.application.projeto;

import br.com.frb.sgportfolios.domain.pessoa.Pessoa;
import br.com.frb.sgportfolios.domain.projeto.enums.ProjetoStatus;

import java.time.LocalDate;

public record CreateProjetoCommand(
        String nome,
        LocalDate dataInicio,
        LocalDate dataPrevisaoFim,
        LocalDate dataFim,
        String descricao,
        ProjetoStatus status,
        Float orcamento,
        String risco,
        String gerenteId
) {
    public static CreateProjetoCommand with(
            final String nome,
            final LocalDate dataInicio,
            final LocalDate dataPrevisaoFim,
            final LocalDate dataFim,
            final String descricao,
            final ProjetoStatus status,
            final Float orcamento,
            final String risco,
            final String gerenteId
    ) {
        return new CreateProjetoCommand(nome, dataInicio, dataPrevisaoFim, dataFim, descricao, status, orcamento, risco, gerenteId);
    }
}
