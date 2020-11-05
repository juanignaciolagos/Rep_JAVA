package sistema;

import java.util.Scanner;

import javax.swing.JOptionPane;


/**
 * Esta clase es el metodo principal que permite ejecutar el programa.
 * @author grupo 3 Fernando Cabrera, Jorge Navarrete, Karen Recabarren, Juvenal Colipi, Juan Lagos.
 * @version 1.5
 *  
 */
public class Principal {

	public static void main(String[] args) {

		String temp = "";
		int opcion = 0, temp2 = 0;
		Contenedor listausuario = new Contenedor();
		Contenedor listacapacitacion = new Contenedor();
		Scanner numeros = new Scanner(System.in);  //Escanner para enteros.
		Scanner letras = new Scanner(System.in); //Escanner para texto.

		
do  {		
		
	opcion = Integer.parseInt(JOptionPane.showInputDialog("###########################* MENU PRINCIPAL *#############################"
						   +"\nSeleccione una opcion (numero de cada renglon): "
						   +"\n1.**Almacenar Cliente**"
						   +"\n2.**Almacenar Profesional**"
						   +"\n3.**Almacenar Administrativo**"
						   +"\n4.**Almacenar Capacitaciones**"
						   +"\n5.**Eliminar Usuario**"
						   +"\n6.**Listar Usuarios**"
						   +"\n7.**Listar Usuarios por Tipos**"
						   +"\n8.**Listar Capacitaciones**"
						   +"\n9.**Salir del Programa**"));
	
		System.out.println("");
	
		
		switch (opcion) {
		case 1:	
				Cliente cliente = new Cliente();
				do {
					temp = JOptionPane.showInputDialog(null,"Escriba rut de cliente: ");		
					cliente.setRun(temp); 
				} while (temp.length()<9 || temp.length()>10);
				do {
					temp = JOptionPane.showInputDialog(null,"Escriba nombre del cliente: ");
					cliente.setNombre(temp);
				} while (temp.length()<=5 || temp.length()>=31);
				do { 
					temp = JOptionPane.showInputDialog(null,"Escriba la fecha de nacimiento del cliente ocupar formato "
							+ "DD/MM/AAAA: ");
					cliente.setFechanacimiento(temp);
				} while (temp.length() !=10);
				do { 
					temp = JOptionPane.showInputDialog("Escriba Apellidos de cliente: ");
					cliente.setApellidos(temp);
				} while (temp.length()<5 || temp.length()>31);
				do {
					temp = JOptionPane.showInputDialog("Escriba telefono: ");
					cliente.setTelefono(temp);
				} while (temp.length()<0);
				do {
					temp = JOptionPane.showInputDialog("Ingrese AFP de cliente: "); 
					cliente.setAfp(temp);
				} while (temp.length()<3 || temp.length()>31);
				do {
					temp2 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione numero Sistema de salud cliente:"
							+ "\n1.-Fonasa"
							+ "\n2.-Isapre "));
				} while (temp2<0 || temp2>2);
				do {
					temp = JOptionPane.showInputDialog("Escriba su direccion: ");
					cliente.setDireccion(temp);
				} while (temp.length()>70);
				do {
					temp = JOptionPane.showInputDialog("Escriba comuna: ");
					cliente.setComuna(temp); 
				} while (temp.length()>50);
				do {
					temp2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba su edad: "));
					cliente.setEdad(temp2);
				} while (temp2<0 || temp2>=150);
				listausuario.agregarusuario(cliente);
				System.out.println("");
				break;
		case 2:			
				Profesional profe = new Profesional();
				do {
					temp = JOptionPane.showInputDialog("Escriba rut del Profesional: ");
					profe.setRun(temp);
				} while (temp.length()<9 || temp.length()>10);
				do {
					temp = JOptionPane.showInputDialog("Escriba nombre del profesional: ");
					profe.setNombre(temp);
				} while (temp.length()<5 || temp.length()>=31);
				do {
					temp = JOptionPane.showInputDialog("Escriba la fecha de nacimiento del profesional DD/MM/AAAA: ");
					profe.setFechanacimiento(temp);
				} while (temp.length()!=10);
				do {
					temp = JOptionPane.showInputDialog("Escriba el titulo del profesional: (min 10 caracter)");
					profe.setTitulo(temp);
				} while (temp.length()<10 || temp.length()>50);
				do {
					temp = JOptionPane.showInputDialog("Escriba la fecha de ingreso del profesional DD/MM/AAAA: ");
					profe.setFechaingreso(temp);
				} while (temp.length()!=10);
				listausuario.agregarusuario(profe);
				System.out.println("");
				break;
		case 3: 
				Administrativo admi = new Administrativo();
				do {
					temp = JOptionPane.showInputDialog("Escriba rut del Administrativo  ");
					admi.setRun(temp);
				} while (temp.length()<9 || temp.length()>10);
				do {
					temp = JOptionPane.showInputDialog("Escriba nombre del Administrativo: ");
					admi.setNombre(temp);
				} while (temp.length()<5 || temp.length()>=31);
				do {
					temp = JOptionPane.showInputDialog("Escriba la fecha de nacimiento del Administrativo DD/MM/AAAA: ");
					admi.setFechanacimiento(temp);
					} while (temp.length()!=10);
				do {
					temp = JOptionPane.showInputDialog("Escriba el area del Administrativo: ");
					admi.setArea(temp);
				} while (temp.length()<5 || temp.length()>21);
				do {
					temp = JOptionPane.showInputDialog("Escriba la experiencia del Administrativo: ");
					admi.setExperiencia(temp);
				} while (temp.length()>100);
				listausuario.agregarusuario(admi);
				System.out.println("");
				break;
		case 4:
				Capacitacion capa = new Capacitacion();
				do {
					temp = JOptionPane.showInputDialog("Escriba la ID de la capacitacion (solo numero de ID): ");
					capa.setIdcapa(temp2);
				}while(temp.length() < 0 );
				do {
					temp = JOptionPane.showInputDialog("Escriba el rut del cliente que tomara la capacitacion: ");
					capa.setRutclte(temp);
				}while(temp.length() < 9 || temp.length() > 10);
				do {
					temp = JOptionPane.showInputDialog("Escriba el dia de la capacitacion (ejemplo:Lunes)");
					capa.setDia(temp);
				}while(temp.length() < 5 || temp.length() > 9);
				do {
					temp = JOptionPane.showInputDialog("Escriba la hora de la capacitacion: (HH:MM) ");
					capa.setHora(temp);
				}while(temp.length() != 5);
				do {
					temp = JOptionPane.showInputDialog("Escriba el lugar de la capacitacion: (min 10 caracter)");
					capa.setLugar(temp);
				}while(temp.length() < 10 || temp.length() > 50);
				do {
					temp = JOptionPane.showInputDialog("Escriba la duracion de la capacitacion: (minutos) ");
					capa.setDuracion(temp);
				}while(temp.length() > 70 );
				do {
					temp2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba la cantidad de asistentes de la capacitacion: (numero) "));
					capa.setCantasist(temp2);
				}while(temp2 < 1 || temp2 > 1000);				
				listacapacitacion.agregarcapa(capa);
				System.out.println("");
				break;
		case 5:	
				listausuario.eliminarusuario();				
				break;
		case 6:
				System.out.println("**********LISTA DE USUARIOS**********");
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

}
