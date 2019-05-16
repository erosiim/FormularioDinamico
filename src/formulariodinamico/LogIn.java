package formulariodinamico;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alonso Escamilla
 */
public class LogIn extends FormRegistro{

    public LogIn() {
        this.setTitle("Login");
        this.setSize(1280, 720);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        btnRegistrar.setText("Ingresar");   
    }

    
    @Override
    protected void enviar() {
        String sql = "SELECT usuario,contrasena FROM usuarios WHERE( usuario = '" + txtUsuario.getText() +"' and contrasena = '" + txtContraseña.getText() + "');";
        ResultSet rs = Conection.getInstance().executeQuery(sql);
        try {
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "BIENVENIDO");
                CreadorFormulario creat = new CreadorFormulario();
                jDesktopPane1.add(creat);
                creat.setVisible(true); 
                
            }else{
                JOptionPane.showMessageDialog(null, "ERROR, NO ENCONTRADO");
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);        
        }
        
    }
    
}
