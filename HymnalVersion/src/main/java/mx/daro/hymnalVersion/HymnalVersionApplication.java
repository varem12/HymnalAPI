package mx.daro.hymnalVersion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mx.daro.hymnalVersion.service.VersionService;

@SpringBootApplication
public class HymnalVersionApplication {

	public static void main(String[] args) {
		SpringApplication.run(HymnalVersionApplication.class, args);
	}


}
