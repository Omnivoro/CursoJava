package v081_layouts_02;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;

public class Layout02 {

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
		
		//v081-16:47 Creaci�n del objeto FlowLayout
		//FlowLayout disposicion = new FlowLayout(FlowLayout.LEFT);
		//v081-18:03 Utilazaci�n del m�todo setLayout() pertenciente a la clase "JPanel" que lo hereda de "Container" para darle el fotmato al objeto "lamina" pert
		//setLayout(disposicion);
		
		//v081-19:00 C�digo abreviado instaciadon el objeto FLowLayout dentro del m�todo setLayout()
		//setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(lalamina);
	}
	private static final long serialVersionUID = 1L;
}

class PanelLayout extends JPanel{
	
	 public PanelLayout(){
		 
		 //v082-06:59 Instancia del clase BorderLayout dentro del m�todo setLayour()
		 //setLayout(new BorderLayout());
		 
		 //v082-11:20 Constructor BoderLayout(int hgap, int vgap) Constructs a border layout with the specified gaps between components.
		 setLayout(new BorderLayout(10, 20));
		 //v082-07:24 Establecimiento de la posici�n de cada bot�n
		 add(new JButton("Amarillo"), BorderLayout.NORTH);
		 add(new JButton("Rojo"),BorderLayout.SOUTH);
		 add(new JButton("Azul"),BorderLayout.WEST);
		 add(new JButton("Green"),BorderLayout.EAST);
		 //v082-10:29 Si no se especifica la posici�n este bot�n aparecera en el centro
		 add(new JButton("Negro"));
	 }
	 private static final long serialVersionUID = 1L;
}