//Herencia e interfaz
public class Alumno extends Persona {

	//Constructor de superclase
	public Alumno(String nombre, String apellido, String dni, int pda) {
		super(nombre, apellido, dni, pda);
		// TODO Auto-generated constructor stub
	}

	//Se sobreescribe método de superclase
	@Override
	public void fichar()
	{
		pda=pda+1;
	}
}
