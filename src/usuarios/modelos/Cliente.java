/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

/**
 *
 * @author estudiante
 */
public class Cliente extends Usuario{
    //Atributos heredados
    
    //Constructor
    public Cliente(String correo, String clave, String apellido, String nombre) {
        super(correo, clave, apellido, nombre);
    }
    
    //Metodos
    @Override
    public void mostrar(){
        System.out.println("*** CLIENTE: " + this.verNombre() + " " + this.verApellido()+" ***"); 
        System.out.println("Correo electronico: " + this.verCorreo()+". Clave: "+ this.verClave());
    }
}
