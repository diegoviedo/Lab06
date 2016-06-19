package model;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Usuario {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) 
	private Key key;
	@Persistent private String nombre;
	@Persistent private String gmail;
	@Persistent private String permisoId;
	public Usuario(String nombre, String gmail, String permisoId) {
		super();
		this.nombre = nombre;
		this.gmail = gmail;
		this.permisoId = permisoId;
	}
	
	public String getKey() {
		return KeyFactory.keyToString(this.key);
	}
	public void setKey(Key key) {
		this.key = key;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public String getPermisoId() {
		return permisoId;
	}
	public void setPermisoId(String permisoId) {
		this.permisoId = permisoId;
	}
}
