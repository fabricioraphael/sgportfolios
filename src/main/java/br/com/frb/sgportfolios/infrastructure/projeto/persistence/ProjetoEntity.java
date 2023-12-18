package br.com.frb.sgportfolios.infrastructure.projeto.persistence;

import br.com.frb.sgportfolios.domain.projeto.Projeto;
import br.com.frb.sgportfolios.domain.projeto.enums.ProjetoStatus;
import br.com.frb.sgportfolios.infrastructure.pessoa.persistence.PessoaEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity(name = "Projeto")
@Table(name = "projeto")
public class ProjetoEntity {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 200)
    @Column(name = "nome", length = 200, nullable = false)
    private String nome;

    @Column(name = "data_inicio")
    private LocalDate dataInicio;

    @Column(name = "data_previsao_fim")
    private LocalDate dataPrevisaoFim;

    @Column(name = "data_fim")
    private LocalDate dataFim;

    @Size(max = 5000)
    @Column(name = "descricao", length = 5000)
    private String descricao;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private ProjetoStatus status;

    @Column(name = "orcamento")
    private Float orcamento;

    @Size(max = 45)
    @Column(name = "risco", length = 45)
    private String risco;

    @ManyToOne
    @JoinColumn(name = "idgerente", nullable = false)
    private PessoaEntity gerente;

    public ProjetoEntity() {
    }

    private ProjetoEntity(Long id, String nome, LocalDate dataInicio, LocalDate dataPrevisaoFim, LocalDate dataFim, String descricao, ProjetoStatus status, Float orcamento, String risco, PessoaEntity gerente) {
        this.id = id;
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataPrevisaoFim = dataPrevisaoFim;
        this.dataFim = dataFim;
        this.descricao = descricao;
        this.status = status;
        this.orcamento = orcamento;
        this.risco = risco;
        this.gerente = gerente;
    }

    public static ProjetoEntity from(final Projeto projeto) {
        var gerente = new PessoaEntity(projeto.getId());
        return new ProjetoEntity(projeto.getId(), projeto.getNome(), projeto.getDataInicio(), projeto.getDataPrevisaoFim(), projeto.getDataFim(), projeto.getDescricao(), projeto.getStatus(), projeto.getOrcamento(), projeto.getRisco(), gerente);
    }
}
