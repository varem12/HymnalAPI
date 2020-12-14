package mx.daro.hymnalweb.hymnalpreferences.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class HymnalPreferences {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer hymnalPreferencesId;
	
	@NotNull
	private Integer userId;
	
	@NotNull
	@Column(name = "`key`")
	private String key;
	
	private String value;

	public Integer getHymnalPreferencesId() {
		return hymnalPreferencesId;
	}

	public void setHymnalPreferencesId(Integer hymnalPreferencesId) {
		this.hymnalPreferencesId = hymnalPreferencesId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "HymnalPreferences [hymnalPreferencesId=" + hymnalPreferencesId + ", userId=" + userId + ", key=" + key
				+ ", value=" + value + "]";
	}



}
