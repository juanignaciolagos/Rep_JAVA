package sistema;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


/**
 * Esta clase es el metodo principal que permite ejecutar el programa.
 * @author grupo 3 Fernando Cabrera, Jorge Navarrete, Karen Recabarren, Juvenal Colipi, Juan Lagos.
 * @version 1.5
 *  
 */
public class Principal {
	public static SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
	public static Calendar calendar = new GregorianCalendar();
	public static void main(String[] args) {
		
		Date fecha;
		String temp = "";
		int opcion = 0, temp2 = 0, dia = 0, mes = 0, anio = 0;
		Contenedor listausuario = new Contenedor();
		Contenedor listacapacitacion = new Contenedor();
		Scanner numeros = new Scanner(System.in);  //Escanner para enteros.
		Scanner letras = new Scanner(System.in); //Escanner para texto.
		
		
do  {		
		
		System.out.println("###########################* MENU PRINCIPAL *#############################");
		System.out.println("Seleccione una opcion (numero de cada renglon): "
						   +"\n1.**Almacenar Cliente**"
						   +"\n2.**Almacenar Profesional**"
						   +"\n3.**Almacenar Administrativo**"
						   +"\n4.**Almacenar Capacitaciones**"
						   +"\n5.**Eliminar Usuario**"
						   +"\n6.**Listar Usuarios**"
						   +"\n7.**Listar Usuarios por Tipos**"
						   +"\n8.**Listar Capacitaciones**"
						   +"\n9.**Salir del Programa**");
		System.out.println("##########################################################################");
		System.out.println("");
		opcion = numeros.nextInt();	
		
		switch (opcion) {
		case 1:	
				Cliente cliente = new Cliente();
				do {
					System.out.println("Escriba rut de cliente: ");
					temp = letras.nextLine();				
					cliente.setRun(temp); 
				} while (temp.length()<9 || temp.length()>10);
				do {
					System.out.println("Escriba nombre del cliente: ");
					temp = letras.nextLine();
					cliente.setNombre(temp);
				} while (temp.length()<=5 || temp.length()>=31);
				
				//entrada del atributo fecha para la clase cliente.
				 
					System.out.println("Escriba la fecha de nacimiento del cliente: ");
					do {
					System.out.println("Escriba el dia");
					dia = numeros.nextInt();
					} while (dia<0 || dia>31);
					do {
					System.out.println("Escriba el mes");
					mes = numeros.nextInt()-1;
					} while (mes<0 || mes>12);
					do {
					System.out.println("Escriba el año");
					anio = numeros.nextInt();
					} while (anio<1900 || anio>2020);
					
					cargarfecha(dia-304, mes, anio);
					
					fecha = getfecha();
					temp = sdf.format(fecha);
					cliente.setFechanacimiento(temp);;
				
				
				do { 
					System.out.println("Escriba Apellidos de cliente: ");
					temp = letras.nextLine();
					cliente.setApellidos(temp);
				} while (temp.length()<5 || temp.length()>31);
				do {
					System.out.println("Escriba telefono: ");
					temp = letras.nextLine();
					cliente.setTelefono(temp);
				} while (temp.length()<0);
				do {
					System.out.println("Ingrese AFP de cliente: "); 
					temp = letras.nextLine();
					cliente.setAfp(temp);
				} while (temp.length()<3 || temp.length()>31);
				do {
					System.out.println("Seleccione numero Sistema de salud cliente:"
							+ "\n1.-Fonasa"
							+ "\n2.-Isapre ");
					temp2=numeros.nextInt();
				} while (temp2<0 || temp2>2);
				do {
					System.out.println("Escriba su direccion: ");
					temp = letras.nextLine();
					cliente.setDireccion(temp);
				} while (temp.length()>70);
				do {
					System.out.println("Escriba comuna: ");
					temp = letras.nextLine();
					cliente.setComuna(temp); 
				} while (temp.length()>50);
				do {
					System.out.println("Escriba su edad: ");
					temp2 = numeros.nextInt();
					cliente.setEdad(temp2);
				} while (temp2<0 || temp2>=150);
				listausuario.agregarusuario(cliente);
				System.out.println("");
				break;
		case 2:			
				Profesional profe = new Profesional();
				do {
					System.out.println("Escriba rut del Profesional: ");
					temp = letras.nextLine();
					profe.setRun(temp);
				} while (temp.length()<9 || temp.length()>10);
				do {
					System.out.println("Escriba nombre del profesional: ");
					temp = letras.nextLine();
					profe.setNombre(temp);
				} while (temp.length()<5 || temp.length()>=31);
				do {
					System.out.println("Escriba la fecha de nacimiento del profesional DD/MM/AAAA: ");
					temp = letras.nextLine();
					profe.setFechanacimiento(temp);
				} while (temp.length()!=10);
				do {
					System.out.println("Escriba el titulo del profesional: (min 10 caracter)");
					temp = letras.nextLine();
					profe.setTitulo(temp);
				} while (temp.length()<10 || temp.length()>50);
				do {
					System.out.println("Escriba la fecha de ingreso del profesional DD/MM/AAAA: ");
					temp = letras.nextLine();
					profe.setFechaingreso(temp);
				} while (temp.length()!=10);
				listausuario.agregarusuario(profe);
				System.out.println("");
				break;
		case 3: 
				Administrativo admi = new Administrativo();
				do {
					System.out.println("Escriba rut del Administrativo  ");
					temp = letras.nextLine();
					admi.setRun(temp);
				} while (temp.length()<9 || temp.length()>10);
				do {
					System.out.println("Escriba nombre del Administrativo: ");
					temp = letras.nextLine();
					admi.setNombre(temp);
				} while (temp.length()<5 || temp.length()>=31);
				do {
					System.out.println("Escriba la fecha de nacimiento del Administrativo DD/MM/AAAA: ");
					temp = letras.nextLine();
					admi.setFechanacimiento(temp);
					} while (temp.length()!=10);
				do {
					System.out.println("Escriba el area del Administrativo: ");
					temp=letras.nextLine();
					admi.setArea(temp);
				} while (temp.length()<5 || temp.length()>21);
				do {
					System.out.println("Escriba la experiencia del Administrativo: ");
					temp=letras.nextLine();
					admi.setExperiencia(temp);
				} while (temp.length()>100);
				listausuario.agregarusuario(admi);
				System.out.println("");
				break;
		case 4:
				Capacitacion capa = new Capacitacion();
				do {
					System.out.println("Escriba la ID de la capacitacion (solo numero de ID): ");
					temp2=numeros.nextInt();
					capa.setIdcapa(temp2);
				}while(temp.length() < 0 );
				do {
					System.out.println("Escriba el rut del cliente que tomara la capacitacion: ");
					temp=letras.nextLine();
					capa.setRutclte(temp);
				}while(temp.length() < 9 || temp.length() > 10);
				do {
					System.out.println("Escriba el dia de la capacitacion (ejemplo:Lunes)");
					temp = letras.nextLine();
					capa.setDia(temp);
				}while(temp.length() < 5 || temp.length() > 9);
				do {
					System.out.println("Escriba la hora de la capacitacion: (HH:MM) ");
					temp = letras.nextLine();
					capa.setHora(temp);
				}while(temp.length() != 5);
				do {
					System.out.println("Escriba el lugar de la capacitacion: (min 10 caracter)");
					temp = letras.nextLine();
					capa.setLugar(temp);
				}while(temp.length() < 10 || temp.length() > 50);
				do {
					System.out.println("Escriba la duracion de la capacitacion: (minutos) ");
					temp = letras.nextLine();
					capa.setDuracion(temp);
				}while(temp.length() > 70 );
				do {
					System.out.println("Escriba la cantidad de asistentes de la capacitacion: (numero) ");
					temp2 = numeros.nextInt();
					capa.setCantasist(temp2);
				}while(temp2 < 1 || temp2 > 1000);				
				listacapacitacion.agregarcapa(capa);
				System.out.println("");
				break;
		case 5:	
				listausuario.eliminarusuario();				
				break;
		case 6:
				listausuario.desplegar();
				System.out.println("");
				break;
		case 7:
				listausuario.tipousuario();
				System.out.println("");
				break;
		case 8:
				System.out.println("***********LISTA DE CAPACITACION******");
				listacapacitacion.desplegarcapa();
				System.out.println("");
				break;
				
		case 9: 
			
			System.out.println("######################################");
			System.out.println("EL PROGRAMA A FINALIZADO");
			System.out.println("######################################");
		
			
			break;
		}
	
}	while (opcion != 9);	
		
		
		

		
		
  numeros.close();
  letras.close();
		
		
		
	

	}

	public static void cargarfecha(int dia, int mes, int anio) {
		 calendar.set(anio, mes, dia);
		
		 
	}	
	
	public static Date getfecha() {
		return calendar.getTime();
		
	}


}	



