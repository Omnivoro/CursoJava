package v083_layout_03;

import java.awt.*;
import javax.swing.*;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//v083-7:58 Instancia de MarcoCalculadora
		MarcoCalculadora calculadora = new MarcoCalculadora();
		calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculadora.setVisible(true);
	}
}//Fin del código principal

//v083-06:22
class MarcoCalculadora extends JFrame{
	
	//083-07:05 Constructor de la clase
	public MarcoCalculadora() {
		
		setTitle("Calculadora");
		setBounds(500, 300, 450, 300);
		//083-12:40
		LaminaCalculadora milamina = new LaminaCalculadora();
		add(milamina);
	}
}

//v083-09:32
class LaminaCalculadora extends JPanel{
	
	
	public LaminaCalculadora() {
		
		//v083-10:17
		setLayout(new BorderLayout());
		//083-11:10 Las pantallas de las calculadoras tienen por defecto un "0" cuando se encienden
		JButton pantalla = new JButton("0");
		//083-11:48
		add(pantalla, BorderLayout.NORTH);
		
		//v083-13:08 Deshabilitación de la funcionalidad del botón
		pantalla.setEnabled(false);
		
		//v083-14:30 Creación de una lámina de filas 4 y columnas 4
		milamina2.setLayout(new GridLayout(4,4));
		
		//Clase interna para crear botones gracias a la colobararción de Juan Marchant con su comentario
		class ponerBotones{
			public void  ponerBotones() {
				String cadena = "789/456*123-0.=+"; 
				String temp;
				for (int i = 0; i < 4; i++ ){     
					for ( int j = 0; j < 4; j++ ) {       
						temp = Character.toString(cadena.charAt(0));       
						JButton boton = new JButton(temp);
						milamina2.add(boton);
						cadena = cadena.substring(1);
						}
					} 
			}
		}
		
		//LaminaCalculadora.ponerBotones(); Intento fallido de clase interna estática
		//Inner Classes
		//As with instance methods and variables, an inner class is associated with an instance of its enclosing class and has direct access to that object's methods and fields. 
		//Also, because an inner class is associated with an instance, it cannot define any static members itself.
		//https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html
		
		//v083-22:58 Intancia de ponerBotones para agregar los botones a "milamina2"
		ponerBotones botones = new ponerBotones();
		botones.ponerBotones();
		
		add(milamina2, BorderLayout.CENTER);
		}	
	//v083-14:27 Creación de la segunda lámina. Pudo haberse creado una clase llamada LaminaCalculadora2 e instanciarla dentro de este constructor
	//v083-21:43 "milamina2" debe declararse fuera del constructor para que su ámbito sea el de la clase y pueda ser usada por los demás métodos
	private JPanel milamina2 = new JPanel();
}