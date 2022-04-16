package sn.systemctl.ndiaye.shop.mappers.generic;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface GenericMapper<E, D> {

	E asEntity(D d);

	D asDTO(E e);

	List<E> asEntityList(List<D> dList);

	List<D> asDTOList(List<E> eList);

}
