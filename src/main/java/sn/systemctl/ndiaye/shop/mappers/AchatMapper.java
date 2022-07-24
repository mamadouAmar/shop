package sn.systemctl.ndiaye.shop.mappers;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import sn.systemctl.ndiaye.shop.dto.AchatDTO;
import sn.systemctl.ndiaye.shop.mappers.generic.GenericMapper;
import sn.systemctl.ndiaye.shop.model.Achat;

//@Component
@Mapper(componentModel = "spring")
public interface AchatMapper extends GenericMapper<Achat, AchatDTO>{

}
