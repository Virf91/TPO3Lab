package formulario;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class LoginForm extends JFrame implements ActionListener {

    private JTextField emailField;
    private JTextField passField;

    public LoginForm() {
        setTitle("Formulario");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new GridLayout(3,2));  // esto es para que tenga 3 filas y 2 columnas
        
        JLabel emailLabel = new JLabel("Email");
        emailField = new JTextField();
        JLabel passLabel = new JLabel("Contraseña");
        passField = new JTextField();
        JButton loginButton = new JButton("Registrar");
        
        loginButton.addActionListener(this); //si se hace clic en el botón loginButton, se generará un evento de acción
        
        // agrego todos los componentes al contenedor:
        
        add(emailLabel);
        add(emailField);
        add(passLabel);
        add(passField);
        add(new JLabel()); // Espacio vacío
        add(loginButton);

        setVisible(true); // para que se puedan ver
        
    }
    
// el "actionPerformed" implementa la interfaz ActionListener 
// y se utiliza para manejar el evento de 
// clic del botón de inicio de sesión.
   public void actionPerformed(ActionEvent e) { 
    String email = emailField.getText();
    String password = passField.getText();

    if (email.equals("alumno@ulp.edu.ar") && password.equals("12345678")) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JOptionPane.showMessageDialog(LoginForm.this, "¡Bienvenido!");
            }
        });
    } else {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JOptionPane.showMessageDialog(LoginForm.this, "Usuario y/o contraseña incorrectos");
            }
        });
    }
}


}
