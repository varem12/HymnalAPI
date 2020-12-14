package mx.daro.playlistAPI.controller;

import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import mx.daro.playlistAPI.entity.Playlist;
import mx.daro.playlistAPI.service.PlayListService;

@RestController
@RequestMapping(path = "/playlist")
public class PlayListController {
	
	@Autowired
	public PlayListService service;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public Iterable<Playlist> getAllPlaylist(){
		return service.getAllPlaylist();
	}

	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Optional<Playlist> getByIdPlaylist(@PathVariable("id") Integer playlistId) {
		return service.getByIdPlaylist(playlistId);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Playlist save(@Valid @RequestBody Playlist playlist) {
		return service.save(playlist);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void DeleteByIdPlayList(@PathVariable("id") Integer playlistId) {
		service.deleteById(playlistId);
	} 

	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public void UpdatePlaylist(@PathVariable("id")Integer playlistId, @RequestBody Playlist playlist) {
		service.updateName(playlistId, playlist.getName());
	}
	
}