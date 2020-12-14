package mx.daro.playlistAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import mx.daro.playlistAPI.entity.PlaylistSong;

@Repository
public interface PlaylistSongRepository extends CrudRepository<PlaylistSong, Integer> {
}