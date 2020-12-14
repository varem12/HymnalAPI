package mx.daro.himnario.himnario.himnarioweb.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
@Entity
public class HymnCorrection {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer hymnId;
	
	@NotNull
	private Integer number;
	
	@NotNull
	private String email;
	
	@NotNull
	private String deviceInfo;
	
	@NotNull
	private String text;
	
	@NotNull 
	private String version;

	public Integer getHymnId() {
		return hymnId;
	}

	public void setHymnId(Integer hymnId) {
		this.hymnId = hymnId;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDeviceInfo() {
		return deviceInfo;
	}

	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	
	
}
