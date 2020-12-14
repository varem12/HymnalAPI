package mx.daro.hymnalweb.hymnalpreferences.controller;

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

import mx.daro.hymnalweb.hymnalpreferences.entity.HymnalPreferences;
import mx.daro.hymnalweb.hymnalpreferences.service.HymnalPreferencesService;

@RestController
@RequestMapping(path = "/preferences")
public class HymnPreferencesController {
	
	@Autowired
	public HymnalPreferencesService service;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public Iterable<HymnalPreferences> getAllHymnalPreferences(){
		return service.getAllHymnsPreferences();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public HymnalPreferences save(@Valid @RequestBody HymnalPreferences hymnalPreferences) {
		return service.save(hymnalPreferences);
	}
	
	@DeleteMapping("/{hymnalPreferencesId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteById(@PathVariable("hymnalPreferencesId") Integer hymnalPreferencesId) {
		service.deleteById(hymnalPreferencesId);
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{userId}/{preferencesKey}")    
	public void deleteUserIdPreferencesKey(@PathVariable("userId") Integer userId, @PathVariable("preferencesKey") String preferencesKey) {
		service.deleteUserIdPreferencesKey(userId, preferencesKey);
	}
	
	@PutMapping("/{hymnalPreferencesId}")
	@ResponseStatus(HttpStatus.CREATED)
	public void updatePreferences(@PathVariable("hymnalPreferencesId")Integer hymnalPreferencesId, @RequestBody HymnalPreferences hymnalPreferences ) {
		service.updateValue(hymnalPreferencesId, hymnalPreferences.getValue());
	}
	
	
}
