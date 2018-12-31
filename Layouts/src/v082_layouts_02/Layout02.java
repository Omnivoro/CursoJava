package v082_layouts_02;
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
		
		//v082-15:55 Instancia de la clase PanelLayout02
		PanelLayout2 lamina2 = new PanelLayout2();
		
		//v082-17:30 Indicación de la dispocisión de las dos láminas dentro del marco
		add(lalamina,BorderLayout.NORTH);
		add(lamina2, BorderLayout.SOUTH);
	}
	private static final long serialVersionUID = 1L;
}

class PanelLayout extends JPanel{
	
	 public PanelLayout(){
		 
		 //v082-06:59 Instancia del clase BorderLayout dentro del método setLayour()
		 //setLayout(new BorderLayout());
		 
		 //v082-11:20 Constructor BoderLayout(int hgap, int vgap) Constructs a border layout with the specified gaps between components.
		 setLayout(new FlowLayout(FlowLayout.LEFT));
		 //v082-07:24 Establecimiento de la posición de cada botón
		 add(new JButton("Amarillo"), BorderLayout.NORTH);
		 add(new JButton("Rojo"),BorderLayout.SOUTH);
	 }
	 private static final long serialVersionUID = 1L;
}

//v082-13:35 Creación de la segunda lámina con otra distribución de sus componentes
class PanelLayout2 extends JPanel{
	
	public PanelLayout2(){
		
		 setLayout(new BorderLayout());
		 add(new JButton("Azul"),BorderLayout.WEST);
		 add(new JButton("Green"),BorderLayout.EAST);
		 //v082-10:29 Si no se especifica la posición este botón aparecera en el centro
		 add(new JButton("Negro"));
	}
	private static final long serialVersionUID = 1L;
}