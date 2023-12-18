package br.com.frb.sgportfolios.application.projeto;

import br.com.frb.sgportfolios.application.UseCase;
import br.com.frb.sgportfolios.domain.projeto.Projeto;
import br.com.frb.sgportfolios.domain.projeto.ProjetoGateway;

import java.util.Objects;

public class DefaultCreateProjetoUseCase extends CreateProjetoUseCase {

    private final ProjetoGateway projetoGateway;

    public DefaultCreateProjetoUseCase(final ProjetoGateway projetoGateway) {
        this.projetoGateway = Objects.requireNonNull(projetoGateway);
    }

    @Override
    public CreateProjetoOutput execute(CreateProjetoCommand anIn) {
        var projeto = Projeto.newProjeto(anIn.nome(), anIn.dataInicio(), anIn.dataPrevisaoFim(), anIn.dataFim(), anIn.descricao(), anIn.status(), anIn.orcamento(), anIn.risco(), anIn.gerenteId());
        projetoGateway.create(projeto);
    }
}
