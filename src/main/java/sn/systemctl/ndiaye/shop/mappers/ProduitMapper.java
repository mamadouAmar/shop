package sn.systemctl.ndiaye.shop.mappers;

import sn.systemctl.ndiaye.shop.dto.ProduitDTO;
import sn.systemctl.ndiaye.shop.mappers.generic.GenericMapper;
import sn.systemctl.ndiaye.shop.model.Produit;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface ProduitMapper extends GenericMapper<Produit, ProduitDTO> {

}
