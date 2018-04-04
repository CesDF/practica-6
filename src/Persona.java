
public class Persona extends Direccion implements Comparable<Persona> {

	private String nombre;
	private String apellidos;
	private String dni;
	private int edad;

	public Persona(String nombre, String apellidos, String dni, int edad, String calle, int numero, int cp, String provincia) {
		super(calle, numero, cp, provincia);
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.dni=dni;
		this.edad=edad;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String toString() {
		
		return nombre + ", " + apellidos + ", " + dni + ", " + edad + ", " + getCalle() + ", " + getNumero() + ", " + getCp() + ", " + getProvincia() + "\n";
		
	}
	
	public int compareTo(Persona p) {
		return (this.apellidos).compareTo(p.getApellidos());
	}
	
	public boolean equals(Persona p) {
		return (this.apellidos).equals(p.getApellidos());
	}

	public char[] size() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
