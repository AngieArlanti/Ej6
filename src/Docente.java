//Herencia e interfaz
public class Docente extends Persona implements Guias {

	//Constructor de superclase
	public Docente(String nombre, String apellido, String dni, int pda) {
		super(nombre, apellido, dni, pda);
	}
	
	//Se sobreescribe método de superclase
	@Override
	public void fichar(){
		pda=pda+3;
	}

	//Se sobreescribe método de interfaz
	@Override
	public void guiar() {
		System.out.println("Soy docente siganme con calma");
	}
	
}
