import javax.swing.*;
public class Entrada_Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre, por favor"); /*JOption Pane
		crea un cuadro para introducir informaci�n, con opci�n de aceptar y cancelar*/
		
		String edad=JOptionPane.showInputDialog("Introduce tu edad, por favor");
		
		int edad_usuario=Integer.parseInt(edad);// convierte a integer
		
		System.out.println("Hola, " + nombre_usuario + ". El a�o que viene tendr�s " + (edad_usuario+1) +" a�os.");
		
		

	}

}
