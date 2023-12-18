package br.com.frb.sgportfolios.infrastructure.pessoa.persistence;

import br.com.frb.sgportfolios.domain.pessoa.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    List<Pessoa> findAllByGerente(boolean isGerente);
}
