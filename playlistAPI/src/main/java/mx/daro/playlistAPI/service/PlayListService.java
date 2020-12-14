package mx.daro.playlistAPI.service;

import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mx.daro.playlistAPI.entity.Playlist;
import mx.daro.playlistAPI.repository.PlayListRepository;

@Transactional
@Service
public class PlayListService {
	
	@Autowired
	private PlayListRepository dataDao;
	
	public Iterable<Playlist> getAllPlaylist(){
		return dataDao.findAll();
	}
	
	public Optional<Playlist> getByIdPlaylist(Integer playlistId){
		return dataDao.findById(playlistId);
	}
	
	public Playlist save(Playlist playlist) {
		return dataDao.save(playlist);
	}
	public void updateName(Integer playlistId,String namePlaylist){
		dataDao.updateName(playlistId, namePlaylist);
	}	
	
	public void deleteById(Integer playlistId) {
		dataDao.deleteById(playlistId);
	}
	
}
