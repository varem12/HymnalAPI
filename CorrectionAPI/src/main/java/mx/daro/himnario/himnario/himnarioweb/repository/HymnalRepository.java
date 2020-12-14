package mx.daro.himnario.himnario.himnarioweb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.daro.himnario.himnario.himnarioweb.entity.HymnCorrection;
@Repository

public interface HymnalRepository extends CrudRepository<HymnCorrection, Integer>{
	
	public void deleteByVersionAndNumber(Integer version, Integer numberHymnal);
		
}
