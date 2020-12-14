package mx.daro.playlistAPI.controller;

import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import mx.daro.playlistAPI.entity.PlaylistSong;
import mx.daro.playlistAPI.service.PlaylistSongService;

@RestController
@RequestMapping(path = "/playlistSong")
public class PlaylistSongController {
	
	@Autowired
	public PlaylistSongService service;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public Iterable<PlaylistSong> getAllplaylistSong(){
		return service.getAllPlaylistSong();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Optional<PlaylistSong> geByIdplaylistSong(@PathVariable("id") Integer playlistSongId){
		return service.getByIdplaylistSong(playlistSongId);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public PlaylistSong save(@Valid @RequestBody PlaylistSong playlistSong) {
		PlaylistSong savePlaylistSong = service.save(playlistSong);
		return savePlaylistSong;
	}
	
	@DeleteMapping("/{playlistSongId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void DeleteByIdPlaylistSong(@PathVariable("playlistSongId") Integer playlistSongId) {
		service.deleById(playlistSongId);
	}
	
}