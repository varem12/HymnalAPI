package mx.daro.playlistAPI.service;

import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mx.daro.playlistAPI.entity.PlaylistSong;
import mx.daro.playlistAPI.repository.PlaylistSongRepository;

@Transactional
@Service
public class PlaylistSongService {

	@Autowired
	private PlaylistSongRepository dataDao;
	
	public Iterable<PlaylistSong> getAllPlaylistSong(){
		return dataDao.findAll();
	}
	
	public Optional<PlaylistSong> getByIdplaylistSong(Integer playlistSongId){
		return dataDao.findById(playlistSongId);
	}
	
	public PlaylistSong save(PlaylistSong playlistSong) {
		return dataDao.save(playlistSong);
	}
	
	public void deleById(Integer playlistSongId) {
		dataDao.deleteById(playlistSongId);
	}

}
