package mx.daro.hymnalVersion.service;

import java.util.Optional;
import java.util.logging.Logger;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import mx.daro.hymnalVersion.entity.HymnalVersion;
import mx.daro.hymnalVersion.repository.VersionRepository;


@Transactional
@Service
public class VersionService {
	
	Logger logger = Logger.getLogger("VersionService");
	
	@Autowired
	private VersionRepository dataDao;
	
	@Cacheable(cacheNames = "versionCache", key="#versionId")
	public Optional<HymnalVersion> getByVersionId(Integer versionId ) {
		logger.info("** data from DB **");
		return dataDao.findById(versionId);
	}


}
