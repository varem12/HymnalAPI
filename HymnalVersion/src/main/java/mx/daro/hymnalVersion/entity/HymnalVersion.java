package mx.daro.hymnalVersion.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class HymnalVersion implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@NotNull
	private Integer versionId;
	
	@NotNull
	private Integer number;
	
	public Integer getVersionId() {
		return versionId;
	}
	public void setVersionId(Integer versionId) {
		this.versionId = versionId;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "HymnalVersion [versionId=" + versionId + ", number=" + number + "]";
	}

}
