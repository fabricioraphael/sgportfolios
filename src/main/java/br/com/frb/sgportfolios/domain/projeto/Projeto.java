package br.com.frb.sgportfolios.domain.projeto;

import br.com.frb.sgportfolios.domain.pessoa.Pessoa;
import br.com.frb.sgportfolios.domain.projeto.enums.ProjetoStatus;
import jakarta.persistence.*;

import java.io.Serializable;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class Projeto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String nome;
    private LocalDate dataInicio;
    private LocalDate dataPrevisaoFim;
    private LocalDate dataFim;
    private String descricao;
    private ProjetoStatus status;
    private Float orcamento;
    private String risco;
    private Pessoa gerente;

    private Projeto(final Long id,
                    final String nome,
                    final LocalDate dataInicio,
                    final LocalDate dataPrevisaoFim,
                    final LocalDate dataFim,
                    final String descricao,
                    final ProjetoStatus status,
                    final Float orcamento,
                    final String risco,
                    final Pessoa gerente) {
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

    public static Projeto newProjeto(final String nome,
                                     final LocalDate dataInicio,
                                     final LocalDate dataPrevisaoFim,
                                     final LocalDate dataFim,
                                     final String descricao,
                                     final ProjetoStatus status,
                                     final Float orcamento,
                                     final String risco,
                                     final Pessoa gerente) {

        return new Projeto(null, nome, dataInicio, dataPrevisaoFim, dataFim, descricao, status, orcamento, risco, gerente);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataPrevisaoFim() {
        return dataPrevisaoFim;
    }

    public void setDataPrevisaoFim(LocalDate dataPrevisaoFim) {
        this.dataPrevisaoFim = dataPrevisaoFim;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ProjetoStatus getStatus() {
        return status;
    }

    public void setStatus(ProjetoStatus status) {
        this.status = status;
    }

    public Float getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Float orcamento) {
        this.orcamento = orcamento;
    }

    public String getRisco() {
        return risco;
    }

    public void setRisco(String risco) {
        this.risco = risco;
    }

    public Pessoa getGerente() {
        return gerente;
    }

    public void setGerente(Pessoa gerente) {
        this.gerente = gerente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Projeto)) {
            return false;
        }
        return id != null && id.equals(((Projeto) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataPrevisaoFim=" + dataPrevisaoFim +
                ", dataFim=" + dataFim +
                ", descricao='" + descricao + '\'' +
                ", status=" + status +
                ", orcamento=" + orcamento +
                ", risco='" + risco + '\'' +
                ", gerente=" + gerente +
                '}';
    }
}
