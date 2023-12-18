package br.com.frb.sgportfolios.application.projeto;

import br.com.frb.sgportfolios.domain.projeto.Projeto;
import br.com.frb.sgportfolios.domain.projeto.enums.ProjetoStatus;

import java.time.LocalDate;

public record CreateProjetoOutput(
        Long id,
        String nome
) {
    public static CreateProjetoOutput from(final Long anId, final String nome) {
        return new CreateProjetoOutput(anId, nome);
    }

    public static CreateProjetoOutput from(final Projeto projeto) {
        return new CreateProjetoOutput(projeto.getId(), projeto.getNome());
    }
}
