/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulariodinamico;

import javax.swing.JOptionPane;

/**
 *
 * @author Alonso Escamilla
 */
public class  Registrar extends FormRegistro{

    public Registrar() {
        this.setTitle("Registro");
        this.setSize(1280, 720);
    }
    
    
    @Override
    protected void enviar() {
       String sql = "INSERT INTO usuarios (usuario,contrasena,correo,cargo) VALUES ( '" + txtUsuario.getText() +"','" + txtContraseña.getText() + "','" + txtCorreo.getText() + "','" + txtCargo.getText() + "');";
       if(Conection.getInstance().execute(sql)){
           JOptionPane.showMessageDialog(null, "Registrado con éxito");
           this.dispose();
        }else{
           JOptionPane.showMessageDialog(null, "ERROR");
       }
    }
    
    
}
