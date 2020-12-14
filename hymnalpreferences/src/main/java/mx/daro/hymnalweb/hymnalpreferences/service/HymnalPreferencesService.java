package mx.daro.hymnalweb.hymnalpreferences.service;

import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mx.daro.hymnalweb.hymnalpreferences.entity.HymnalPreferences;
import mx.daro.hymnalweb.hymnalpreferences.repository.HymnalPreferencesRepository;

@Transactional
@Service
public class HymnalPreferencesService {
	
	@Autowired
	private HymnalPreferencesRepository dataDao;
	
	public HymnalPreferences save(HymnalPreferences preferences) {
		return dataDao.save(preferences);
	}
	
	public Iterable<HymnalPreferences> getAllHymnsPreferences(){
		return dataDao.findAll();
	}
	
	public Optional<HymnalPreferences> getbyHymnalPreferencesId(Integer hymnalPreferencesId){
		return dataDao.findById(hymnalPreferencesId);
	}
	
	public void deleteById(Integer hymnalPreferencesId) {
		dataDao.deleteById(hymnalPreferencesId);
	}
	
	public void deleteUserIdPreferencesKey(Integer userId, String key ) {
		dataDao.deleteByuserIdAndKey(userId, key);
	}
	
	public void updateValue(Integer hymnalPreferencesId, String value) {
		dataDao.updateValue(hymnalPreferencesId, value);
	}

}
