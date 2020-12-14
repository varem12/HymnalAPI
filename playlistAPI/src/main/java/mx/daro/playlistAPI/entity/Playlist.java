package mx.daro.playlistAPI.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.sun.istack.NotNull;

@Entity
public class Playlist {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer playlistId;

	@NotNull
	private String name;
	
	@NotNull
	private Integer userId;

	public Integer getPlaylistId() {
		return playlistId;
	}

	public void setPlaylistId(Integer playlistId) {
		this.playlistId = playlistId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Playlist [playlistId=" + playlistId + ", name=" + name + ", userId=" + userId + "]";
	}
	
}
