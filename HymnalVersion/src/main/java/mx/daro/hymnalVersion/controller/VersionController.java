package mx.daro.hymnalVersion.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import mx.daro.hymnalVersion.entity.HymnalVersion;
import mx.daro.hymnalVersion.service.VersionService;

@RestController
@RequestMapping(path = "/version")
public class VersionController {
	
	@Autowired
	public VersionService service;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public Optional<HymnalVersion> getByVersionId(){
		return service.getByVersionId(1);
	}

}
