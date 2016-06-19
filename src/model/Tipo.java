package model;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Tipo {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) 
	private Key key;
	@Persistent private String tipo;
	@Persistent private String permisoId;
	public Tipo(String tipo, String permisoId) {
		super();
		this.tipo = tipo;
		this.permisoId = permisoId;
	}
	public String getKey() {
		return KeyFactory.keyToString(this.key);
	}
	public void setKey(Key key) {
		this.key = key;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPermisoId() {
		return permisoId;
	}
	public void setPermisoId(String permisoId) {
		this.permisoId = permisoId;
	}
	
	
}
