package perfiles_ejerciciogrupal8;

import java.util.Scanner;

public class IngresoPerfiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int perfil;
		String name,date,id,address,phone,cant;
		Scanner in=new Scanner(System.in);
		
		do {
		System.out.println("1: cliente"
				+ "\n2: profesional"
				+ "\n3: administrativo");
		System.out.println("seleccione perfil\n");
		perfil= in.nextInt();
		} while (perfil<1 || perfil>3);
			
		switch(perfil) {
		
		case 1: System.out.println("perfil nombre del cliente");
				name=in.next();
				System.out.println("ingrese fecha de nacimiento del cliente");
				date=in.next();
				System.out.println("ingrese rut del cliente");
				id=in.next();
				System.out.println("perfil direccion del cliente");
				address=in.next();
				System.out.println("ingrese telefono del cliente");
				phone=in.next();
				System.out.println("ingrese cantidad de empleado del cliente");
				cant=in.next();
				System.out.println(name+" "+date+" "+id+" "+address+" "+phone+" "+cant);
				break;
				
		case 2: System.out.println("perfil nombre del profesional");
				name=in.next();
				System.out.println("ingrese fecha de nacimiento del profesional");
				date=in.next();
				System.out.println("ingrese rut del profesional");
				id=in.next();
				System.out.println("perfil años de experiencia del profesional");
				address=in.next();
				System.out.println("ingrese departamento del profesional");
				phone=in.next();
				System.out.println(name+" "+date+" "+id+" "+address+" "+phone);
				break;
				
		case 3: System.out.println("perfil nombre del administrativo");
				name=in.next();
				System.out.println("ingrese fecha de nacimiento del administrativo");
				date=in.next();
				System.out.println("ingrese rut del administrativo");
				id=in.next();
				System.out.println("perfil funcion del administrativo");
				address=in.next();
				System.out.println("ingrese nombre del cargo de administrativo");
				phone=in.next();
				System.out.println(name+" "+date+" "+id+" "+address+" "+phone);
				break;

				
		}
		in.close();
	}

}
