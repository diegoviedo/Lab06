package model;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Recurso {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) 
	private Key key;
	@Persistent private String recurso;
	@Persistent private String permisoId;
	public Recurso(String recurso, String permisoId) {
		super();
		this.recurso = recurso;
		this.permisoId = permisoId;
	}
	public String getKey() {
		return KeyFactory.keyToString(this.key);
	}
	public void setKey(Key key) {
		this.key = key;
	}
	public String getRecurso() {
		return recurso;
	}
	public void setRecurso(String recurso) {
		this.recurso = recurso;
	}
	public String getPermisoId() {
		return permisoId;
	}
	public void setPermisoId(String permisoId) {
		this.permisoId = permisoId;
	}
	
}
