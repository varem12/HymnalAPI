package mx.daro.playlistAPI.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import mx.daro.playlistAPI.entity.Playlist;

@Repository
public interface PlayListRepository extends CrudRepository<Playlist, Integer> {
 
	@Modifying (clearAutomatically = true)
	@Query(value = "UPDATE playlist SET name = ?2 WHERE playlist_id = ?1", nativeQuery=true)
	public void updateName(Integer playlistId, String namePlaylist);
	
}