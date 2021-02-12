package mx.daro.hymnalVersion.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.daro.hymnalVersion.entity.HymnalVersion;

@Repository
public interface VersionRepository extends CrudRepository<HymnalVersion, Integer>{
}
