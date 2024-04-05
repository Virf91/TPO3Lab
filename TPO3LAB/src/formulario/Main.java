package formulario;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginForm();
            }
        });
    }
    
//El main es el punto de entrada de la aplicación, donde 
//se crea una instancia de "LoginForm" y se muestra la ventana. 
    

}
