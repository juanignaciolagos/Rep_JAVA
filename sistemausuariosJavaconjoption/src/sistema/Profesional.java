package sistema;
/**
 * Clase hija de usuario en la cual establecemmos los atributos del perfil que hereda usuario.
 * @author grupo 3 Fernando Cabrera, Jorge Navarrete, Karen Recabarren, Juvenal Colipi, Juan Lagos.
 *
 */
public class Profesional extends Usuario {
	private String titulo;
	private String fechaingreso;
	
	public Profesional() {
		super();
	}

	public Profesional(String titulo, String fechaingreso,String nombre, String fechanacimiento, String run) {
		super(nombre, fechanacimiento, run);
		this.titulo = titulo;
		this.fechaingreso = fechaingreso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechaingreso() {
		return fechaingreso;
	}

	public void setFechaingreso(String fechaingreso) {
		this.fechaingreso = fechaingreso;
	}

	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaingreso=" + fechaingreso + "]";
	}

	@Override
	public void analizarUsuario() {
		System.out.println("El nombre del profesional es: " + this.getNombre()
						  +"\nSu titulo es: "+ titulo + " y su Fecha de ingreso es: "+ fechaingreso );
	}
	/**
	 *Retorna los atributos del padre para mostrar en la lista de usuarios.
	 */
	public String mostrarusuario() {
		return "El nombre del usuario es: " + this.getNombre()
		           +"\nSu RUN es:"+ this.getRun();
	}
}
