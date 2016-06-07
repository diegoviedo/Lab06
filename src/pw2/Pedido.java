package pw2;

public class Pedido {
	
	private String usuario;
	private String pedido;

	
	public Pedido(){
	}
	
	public Pedido(String usuario, String pedido) {
		super();
		this.usuario= usuario;
		this.pedido = pedido;
		
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPedido() {
		return pedido;
	}

	public void setPedido(String pedido) {
		this.pedido = pedido;
	}

}
