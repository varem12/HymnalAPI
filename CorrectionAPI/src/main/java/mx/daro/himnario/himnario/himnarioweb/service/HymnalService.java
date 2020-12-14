package mx.daro.himnario.himnario.himnarioweb.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.daro.himnario.himnario.himnarioweb.entity.HymnCorrection;
import mx.daro.himnario.himnario.himnarioweb.repository.HymnalRepository;

@Transactional
@Service
public class HymnalService {

	
	@Autowired   
	private HymnalRepository dataDao; 
	
	public HymnCorrection save(HymnCorrection hymn) {
		return dataDao.save(hymn);
	}	
	
	public Iterable<HymnCorrection> getAllHymns() {
		return dataDao.findAll();
	}

	public void delete(Integer version, Integer number) {
		dataDao.deleteByVersionAndNumber(version, number);
	}
	
	public void deleteById(Integer hymnId) {
		dataDao.deleteById(hymnId);
	}
	
	public void update(HymnCorrection hymn) {
		// TODO Auto-generated method stub
	}
	
	public HymnCorrection get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
