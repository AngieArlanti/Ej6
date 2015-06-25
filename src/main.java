
public class main {

	public static void main(String[] args) {
		
		//En un primer momento creo tres personas de distintos rangos
		Persona p1 = new Docente("Jorge","Ramon","38823549",0);
		Persona p2 = new NoDocente("Claudia","Jorgelina","49932850",0);
		Persona p3 = new Alumno("Nicolas","Gonzalez","58731250",0);
		
		//Cada persona ficha y se le suman los correspondientes puntos de asistencia
		p1.fichar();
		p2.fichar();
		p3.fichar();
		
		//Muestra el nombre de la persona y los puntos acumulados por fichar
		System.out.println(p1.nombre+" "+p1.pda);
		System.out.println(p2.nombre+" "+p2.pda);
		System.out.println(p3.nombre+" "+p3.pda);

		//En el caso del incendio creo un docente y un no docente
		Docente d1= new Docente("Manuel","Pepito","78654309",0);
		NoDocente nd1= new NoDocente("Ricardo","Agustino","65432198",0);
		
		//Cada uno de estos guia
		d1.guiar();
		nd1.guiar();
	}

}
