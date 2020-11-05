package sistema;
/**
 * Clase hija de usuario en la cual establecemos los atributos del perfil que hereda usuario.
 * @author grupo 3 Fernando Cabrera, Jorge Navarrete, Karen Recabarren, Juvenal Colipi, Juan Lagos.
 *
 */
public class Administrativo extends Usuario {
	private String area;
	private String experiencia;
	
	
	public Administrativo() {
		super();
	}

	public Administrativo(String area, String experiencia,String nombre, String fechanacimiento, String run) {
		super(nombre, fechanacimiento, run);
		this.area = area;
		this.experiencia = experiencia;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", experiencia=" + experiencia + "]";
	}
	
	@Override
	public void analizarUsuario() {
		System.out.println("El nombre del Adminstrativo es: " + this.getNombre()
						  +"\nSu area es: "+ area + " y cuenta con: "+ experiencia+ " años de experiencia." );
	}
	/**
	 *Retorna los atributos del padre para mostrar en la lista de usuarios.
	 */
	public String mostrarusuario() {
		return "El nombre del usuario es: " + this.getNombre()
		           +"\nSu RUN es:"+ this.getRun();
	}
}
