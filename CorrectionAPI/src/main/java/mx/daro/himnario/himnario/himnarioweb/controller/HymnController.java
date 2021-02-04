package mx.daro.himnario.himnario.himnarioweb.controller;

import javax.servlet.http.HttpServletRequest;
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

import mx.daro.himnario.himnario.himnarioweb.entity.HymnCorrection;
import mx.daro.himnario.himnario.himnarioweb.service.HymnalService;
import mx.daro.himnario.himnario.himnarioweb.service.RequestInfoService;


@RestController
@RequestMapping(path = "/HymnCorrection" )
public class HymnController {

	@Autowired
	private HymnalService service;
	
	@Autowired
	private RequestInfoService requestInfoService;
/*
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public Iterable<HymnCorrection> getAllHymns() {
		return service.getAllHymns();
	}
*/
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public HymnCorrection save (HttpServletRequest request, @Valid @RequestBody HymnCorrection hymnCorrection) {
		hymnCorrection.setIp(requestInfoService.getClientIp(request));
		return service.save(hymnCorrection);
	}

	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{version}/{number}")    
	public void deletehymn (@PathVariable("version") Integer version, @PathVariable("number") Integer number) {
		service.delete(version, number);
	}
	
	@DeleteMapping("/{hymnId}")   
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteById (@PathVariable("hymnId") Integer hymnId) {
		service.deleteById(hymnId);
	}

}
