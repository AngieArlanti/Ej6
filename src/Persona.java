
public abstract class Persona {

	//Atributos
	String nombre;
	String apellido;
	String dni;
	int pda;
	
	//Constructor
	public Persona(String nombre, String apellido, String dni, int pda) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.pda = pda;
	}

	//Métodos
	public String getNombre() {
		return nombre;
	}


	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getPda() {
		return pda;
	}

	public void setPda(int pda) {
		this.pda = pda;
	}

	public abstract void fichar();
}
