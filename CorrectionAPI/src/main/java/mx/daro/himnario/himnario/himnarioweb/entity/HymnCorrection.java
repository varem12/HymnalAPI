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
	private String text;
	
	@NotNull 
	private Integer version;

	
	public Integer gethymnId() {
		return hymnId;
	}

	public void sethymnId(Integer hymnId) {
		this.hymnId = hymnId;
	}

	public Integer getnumber() {
		return number;
	}

	public void setnumber(Integer number) {
		this.number = number;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Hymn [hymnId=" + hymnId + ", number=" + number + ", email=" + email + ", text=" + text
				+ ", version=" + version + "]";
	}
	
}
