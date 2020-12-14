package mx.daro.hymnalweb.hymnalpreferences.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.daro.hymnalweb.hymnalpreferences.entity.HymnalPreferences;

@Repository
public interface HymnalPreferencesRepository extends CrudRepository<HymnalPreferences, Integer> {

	public void deleteByuserIdAndKey(Integer userId, String key);

	@Modifying (clearAutomatically = true)
	@Query(value = "UPDATE hymnal_preferences SET value = ?2 WHERE hymnal_preferences_id = ?1", nativeQuery=true)
	public void updateValue(Integer hymnalPreferencesId, String value);

}
