//Herencia e interfaz
public class NoDocente extends Persona implements Guias {

	//Constructor de superclase
	public NoDocente(String nombre, String apellido, String dni, int pda) {
		super(nombre, apellido, dni, pda);
		// TODO Auto-generated constructor stub
	}

	//Se sobreescribe método de superclase
//	@Override
//	public void fichar()
//	{
//		pda=pda+2;
//	}
//	
	//Se sobreescribe método de interfaz
	@Override
	public void guiar() {
		System.out.println("No soy docente siganme con calma");
	}
}
