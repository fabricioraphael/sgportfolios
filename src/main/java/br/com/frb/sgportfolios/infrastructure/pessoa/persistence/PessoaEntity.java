package br.com.frb.sgportfolios.infrastructure.pessoa.persistence;

import br.com.frb.sgportfolios.domain.projeto.Projeto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity(name = "Pessoa")
@Table(name = "pessoa")
public class PessoaEntity {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 100)
    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Column(name = "datanascimento")
    private LocalDate datanascimento;

    @Size(max = 14)
    @Column(name = "cpf", length = 14)
    private String cpf;

    @Column(name = "funcionario")
    private Boolean funcionario;

    @Column(name = "gerente")
    private Boolean gerente;

    @OneToMany(mappedBy = "gerente")
    private List<Projeto> projetos;


    public PessoaEntity() {
    }

    public PessoaEntity(String nome, LocalDate datanascimento, String cpf, Boolean funcionario, Boolean gerente) {
        this.nome = nome;
        this.datanascimento = datanascimento;
        this.cpf = cpf;
        this.funcionario = funcionario;
        this.gerente = gerente;
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

    public LocalDate getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(LocalDate datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Boolean getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Boolean funcionario) {
        this.funcionario = funcionario;
    }

    public Boolean getGerente() {
        return gerente;
    }

    public void setGerente(Boolean gerente) {
        this.gerente = gerente;
    }

//    public List<Projeto> getProjetos() {
//        return projetos;
//    }
//
//    public void setProjetos(List<Projeto> projetos) {
//        this.projetos = projetos;
//    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", datanascimento=" + datanascimento +
                ", cpf='" + cpf + '\'' +
                ", funcionario=" + funcionario +
                ", gerente=" + gerente +
//                ", projetos=" + projetos +
                '}';
    }
}
