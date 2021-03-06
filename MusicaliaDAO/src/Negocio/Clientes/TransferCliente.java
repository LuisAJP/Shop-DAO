/**
 * 
 */
package Negocio.Clientes;

//import com.sun.org.apache.xpath.internal.operations.Bool;


public class TransferCliente {
	
	private Integer ID;
	
	private String nombre;
	
	private String apellido;
	
	private String DNI;
	
	private String direccion;
	
	
	private Boolean socio;
	
	private Boolean activo;
	
	public TransferCliente() {}
	public TransferCliente(String nombre, String apellido, String dni, String direccion, Boolean socio) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.DNI = dni;
		this.direccion= direccion;
		this.socio = socio;
		
	}
	
	public TransferCliente(Integer id,String nombre, String apellido, String dni, String direccion, Boolean socio) {
		this.ID=id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.DNI = dni;
		this.direccion= direccion;
		this.socio = socio;
		
	}
	
	public Integer getID() {
		return this.ID;
	}

	
	public void setID(Integer ID) {
		this.ID = ID;
	}

	
	public String getNombre() {
		return this.nombre;
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public String getApellido() {
		return this.apellido;
	}

	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	
	public String getDNI() {
		return this.DNI;
	}

	
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}

	
	public String getDireccion() {
		return this.direccion;
	}

	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
	public Boolean getActivo() {
		return this.activo;
	}

	
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	
	public Boolean getSocio() {
		return this.socio;
	}

	
	public void setSocio(Boolean socio) {
		this.socio = socio;
	}
	
	@Override
	public String toString() {
		return ID + ": " + nombre + " " + apellido + " DNI: " + DNI + 
		" Socio: "+ socio+ " activo: " + activo;
	}
	
}