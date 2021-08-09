package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

public class TestManejoUsuarios {

    public static void main(String[] args) {

        UsuarioDAO usuarioDao = new UsuarioDAO();

        
//      utilizando metodo INSERT.  Insertando un nuevo objeto de tipo persona  
//         Usuario usuario1 = new Usuario("Gisse Nieto", "colorun"); 
//         usuarioDao.insertar(usuario1);
      

  
      
      
//    utilizando metodo UPDATE (Actualizar) para Modificar un objeto persona existente 
//       Usuario usuario1 = new Usuario(5, "Sandra Diaz", "5dfdsfDSF");
//       usuarioDao.actualizar(usuario1);
      
      
      
      
      // utilizando metodo DELETE, para eliminar un objeto tipo persona 
       Usuario usuarioEliminar = new Usuario(3);
      usuarioDao.eliminar(usuarioEliminar);
      
  
      
      
        
      // Utilizando metodo SELECCIONAR 
      
        List<Usuario> users = usuarioDao.seleccionar();

        for (Usuario user : users) {

            System.out.println("user = " + user);

        }

        
        
    }

}
