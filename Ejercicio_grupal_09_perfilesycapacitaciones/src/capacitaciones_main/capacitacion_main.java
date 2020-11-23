package capacitaciones_main;

import java.util.Scanner;


//por_cada_capacitacion_tener_registro_del_rut_nombre_direccion_comuna,n°_fono
  //por_cada_capacitacion_tener_hora_dia_cantidad 
public class capacitacion_main {

	public static void main(String[] args) {
		String fecha,hora,lugar,duracion,rut,nombre,direccion,comuna,telefono,asistnombre; 
		int x,edad,conta,contb,contc,cantidad;
		Scanner letras=new Scanner(System.in);
		Scanner num=new Scanner(System.in);
		conta=0;
		contb=0;
		contc=0;
		edad=0;
		asistnombre="asd";
		
	do {
		System.out.println("Ingrese fecha 00-00-0000");
		fecha= letras.nextLine();
	} while (fecha.length()!=10);
	do {
		System.out.println("Ingrese hora 24:00");
		hora= letras.nextLine();
	} while (hora.length()!=6);
	do {
		System.out.println("Ingrese lugar ");
		lugar= letras.nextLine();
	} while (lugar.length()>30);
	do {
		System.out.println("Ingrese duración 24:00");
		duracion= letras.nextLine();
	} while (duracion.length()!=6);
	do {
		System.out.println("Ingrese rut cliente");
		rut= letras.nextLine();
	} while (rut.length()>10);
	do {
		System.out.println("Ingrese nombre de la empresa");
		nombre= letras.nextLine();
	} while (nombre.length()>10);
	do {
		System.out.println("Ingrese direccion ");
		direccion= letras.nextLine();
	} while (direccion.length()>30);
	do {
		System.out.println("Ingrese comuna");
		comuna= letras.nextLine();
	} while (comuna.length()>10);
	do {
		System.out.println("Ingrese telefono");
		telefono= letras.nextLine();
	} while (telefono.length()!=10);
	do {
		System.out.println("cantidad de asistentes a ingresar");
		cantidad= num.nextInt();
	} while (cantidad>0);
		
for(x=0;x<cantidad;x++) {
	do {
			System.out.println("Ingrese nombre del asistente");
			asistnombre=letras.nextLine();
	} while (asistnombre.length()<10 && asistnombre.length()>2);
	do {
			System.out.println("Ingrese edad del asistente");
			edad= num.nextInt();
	} while (edad>0 && edad<120);					
			
			if (edad > 35) {
				conta=conta+1; 
			}
			else if (edad > 25) {
				contb=contb+1;;
			}
			else if  (edad<=25) {
				contc=contc+1;;
			}
			else {
				System.out.println("edad invalida");
			}
			
			
			
		}
		System.out.println("############################################################");
		System.out.println(" fecha: "+fecha
				+"\n hora: "+hora
				+"\n lugar: "+lugar
				+"\n duracion: "+duracion+" hora"
				+"\n cantidad de asistentes: "+(cantidad));
		System.out.println(" rut empresa: "+rut
				+"\n nombre empresa: "+nombre
				+"\n direccion: "+direccion
				+"\n comuna: "+comuna
				+"\n telefono: "+telefono);
		System.out.println(" menores de 25 años: "+contc
				+"\n entre 26 y 35 años: "+contb
				+"\n mayores de 35 años: "+conta);
		System.out.println("############################################################");
	}

}
