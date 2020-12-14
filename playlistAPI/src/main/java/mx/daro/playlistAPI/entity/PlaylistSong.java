package mx.daro.playlistAPI.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.sun.istack.NotNull;

@Entity
public class PlaylistSong {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer playlistSongId;
	
	@NotNull
	private Integer number;
	
	@NotNull
	private Integer version;
	
	@NotNull
	private String type;
	
	@NotNull
	private Integer playlistId;

	public Integer getPlaylistSongId() {
		return playlistSongId;
	}

	public void setPlaylistSongId(Integer playlistSongId) {
		this.playlistSongId = playlistSongId;
	}

	public Integer getnumber() {
		return number;
	}

	public void setnumber(Integer number) {
		this.number = number;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getPlaylistId() {
		return playlistId;
	}

	public void setPlaylistId(Integer playlistId) {
		this.playlistId = playlistId;
	}

	@Override
	public String toString() {
		return "PlaylistSong [playlistSongId=" + playlistSongId + ", number=" + number + ", version=" + version
				+ ", type=" + type + ", playlistId=" + playlistId + "]";
	}

}
