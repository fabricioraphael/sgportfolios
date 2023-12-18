package br.com.frb.sgportfolios.infrastructure.projeto.persistence;

import br.com.frb.sgportfolios.domain.projeto.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long> {}
