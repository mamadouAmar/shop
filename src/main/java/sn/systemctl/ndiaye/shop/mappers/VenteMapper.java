package sn.systemctl.ndiaye.shop.mappers;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import sn.systemctl.ndiaye.shop.dto.VenteDTO;
import sn.systemctl.ndiaye.shop.mappers.generic.GenericMapper;
import sn.systemctl.ndiaye.shop.model.Vente;


@Component
@Mapper(componentModel = "spring")
public interface VenteMapper extends GenericMapper<Vente, VenteDTO>{

}
