package pruebas;
import java.util.Scanner;

public class operadores {

	public static void main(String[] args) {
		//ctrl +d = eliminar linea
		
		//operadores matematicos
		
		/*
		 
		 + 
		 - 
		 *
		 /
		 %   (modulo)
		  
		    >       <     >=       <=       !=     ==
		  
		 
		  && AND
		  || inclusivo OR
		  ! NOT
		  xor exclusivo XOR  o es uno o es el otro pero no los dos
		   
		  
		  
		 */
		
		
		
		boolean a=false;
		boolean b=false;
		boolean c= a&&b;
		System.out.println(c ? 1 : 0);   //si es verdadero muestrame 1 si es falso muestrame 0
		//operador ternario
		
		// cond ?  SiVerdad  : SiFalso;
		
		
		int edad = 10;
		int edad1 = 20;
		int res = edad+edad1;
		
		double alto = 198.7;  //toca agregar la f para saber que era float
		float ancho = 199.2f;
		
		double resDiv = alto/ancho;//para quedarme con el float del double
		float resDiv1 =(float) alto/ancho;
		System.out.println(resDiv);
		System.out.println();
		
		
		//aplica a tipos de datos stting
		
		String nombre="carlos";
		String apellido="lopez";
		String resStr= nombre+" "+apellido; //concatenar
		System.out.println("nombre + apellido "+ resStr);
		
		Scanner teclado = new Scanner(System.in);
		//ahora puedo leer datos del teclado
		
		int e = teclado.nextInt();
		int f= teclado.nextInt();
		
		System.out.println("la suma es= "+ (e+f));
		
		//cerrar el teclado, el recurso
		teclado.close();
		
		//f5,  f6 debug linea por linea ,f7,f8 desde la linea que este parada al final 
		
	}

}
