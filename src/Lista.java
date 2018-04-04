import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Lista {
	
	private ArrayList<Persona> al=new ArrayList<Persona>();

	public Lista() {
		al=new ArrayList<Persona>();
	}
	
	public void cargar() {
		Persona p1=new Persona("Julio", "García Santos", "11111111A", 23, "C/ Los Olivos", 3, 38493, "Santa Cruz de Tenerife");
		Persona p2=new Persona("Ana", "Méndez Núñez", "22222222B", 22, "C/ Los Pinos", 25, 38403, "Santa Cruz de Tenerife");
		Persona p3=new Persona("María", "Sánchez Camacho", "33333333C", 45, "C/ Los Franceses", 23, 38505, "Las Palmas");
		Persona p4=new Persona("Julio", "Brito González", "44444444D", 30, "C/ Los Pinos", 25, 38403, "Las Palmas");
		
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		
	}
	
	public void listar() {
		for(Persona p: al) {
			System.out.println(p+"\n");
		}
	}
	
	public void ordenar() {
		Collections.sort(al);
	}
	
	public void insertar() {//añade el registro al final de la lista
		Persona p5=new Persona("Daniel", "Fuentes González", "55555555E", 36, "C/ La Pinocha", 27, 38453, "Las Palmas");
		al.add(p5);
		
	}
	
	public int contar() {
		return al.size();
	}

	public void remove(int i) {
			
	}
	
	public void buscarDNI(String dni) {
		for(Persona p: al) {
			if(dni.equals(p.getDni())) {
				System.out.println(al.toString());
			}else {
				System.out.println("El dni no existe");
			}
		}
	}
	
	public void buscarNombre(String nombre) {
		for(Persona p: al) {
			if(nombre.equals(p.getNombre())) {
				System.out.println(al.toString());
			}else {
				System.out.println("El nombre no existe");
			}
		}
	}
	
	public void guardar() {
		try {
			BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\Asus\\Documents\\Estudios\\2018 Digital Transformers\\Eclipse trabajos\\Lectura_escritura\\Persona.txt"));
			bw.write(al.toString());
			bw.close();
		}catch (IOException e) {
			System.out.println("No se ha podido escribir en el fichero");
		}
	}
	
}
