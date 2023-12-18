package br.com.frb.sgportfolios.domain.projeto.dto;

import java.time.LocalDate;

public record PessoaDTO(
        Long id,
        String nome,
        LocalDate datanascimento,
        String cpf,
        Boolean funcionario,
        Boolean gerente
) {

}
