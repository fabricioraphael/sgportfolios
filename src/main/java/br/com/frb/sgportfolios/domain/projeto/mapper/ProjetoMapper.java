package br.com.frb.sgportfolios.domain.projeto.mapper;

import br.com.frb.sgportfolios.domain.projeto.Projeto;
import br.com.frb.sgportfolios.domain.projeto.dto.ProjetoDTO;
import org.mapstruct.Mapper;
import java.util.Set;
import org.mapstruct.*;

@Mapper(componentModel = "spring", uses = {})
public interface ProjetoMapper extends EntityMapper<ProjetoDTO, Projeto> {

//    ProjetoDTO entityToDTO(Projeto projeto);
//
//    List<ProjetoDTO> entityToDTO(Iterable<Projeto> project);
//
//    Projeto dtoToEntity(ProjetoDTO projetoDTO);
//
//    List<Projeto> dtoToEntity(Iterable<ProjetoDTO> projetos);

    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    ProjetoDTO toDtoId(Projeto projeto);

    @Named("idSet")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    Set<ProjetoDTO> toDtoIdSet(Set<Projeto> projeto);
}
