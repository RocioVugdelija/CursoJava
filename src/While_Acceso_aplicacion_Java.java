import javax.swing.*;
public class While_Acceso_aplicacion_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave = "Rocio";
		
		String password ="";// hace que est� vac�a
		
		while(clave.equals(password)==false){
			
			password=JOptionPane.showInputDialog("Introduce la contrase�a, por favor");
			
			if (clave.equals(password)==false){
				
				System.out.println("Contrase�a incorrecta.");
				
			}
			
		}
		System.out.println("Contrase�a correcta. Acceso permitido.");
		
	}

}
