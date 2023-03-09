package ar.com.academia.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import ar.com.academia.dto.SocioDTO;
import ar.com.academia.entities.Socio;

@Mapper
public interface SocioMapper {
	 
	SocioMapper INSTANCE = Mappers.getMapper(SocioMapper.class);

	SocioDTO toDto(Socio socio);
	
	//Si se quiere ignorar un dato @Mapping(target = "dato", ignore = true)
	
}
