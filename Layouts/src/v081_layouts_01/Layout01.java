package v081_layouts_01;

import java.awt.FlowLayout;
import javax.swing.*;



public class Layout01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoLayout marco = new MarcoLayout();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}

}//Fin Clase Layout01

class MarcoLayout extends JFrame{
	
	public MarcoLayout() {
		
		setBounds(800, 300, 300, 200);
		setTitle("Marco Layout");
		
		PanelLayout lalamina = new PanelLayout();
		
		//v081-16:47 Creación del objeto FlowLayout
		FlowLayout disposicion = new FlowLayout(FlowLayout.LEFT);
		//v081-18:03 Utilazación del método setLayout() pertenciente a la clase "JPanel" que lo hereda de "Container" para darle el fotmato al objeto "lamina" pert
		setLayout(disposicion);
		
		//v081-19:00 Código abreviado instaciadon el objeto FLowLayout dentro del método setLayout()
		//setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(lalamina);
		
	}
	private static final long serialVersionUID = 1L;
}

class PanelLayout extends JPanel{
	
	 public PanelLayout(){
		 add(new JButton("Amarillo"));
		 add(new JButton("Rojo"));
		 add(new JButton("Azul"));
	 }
	 private static final long serialVersionUID = 1L;
}

		 