package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();

        //Insertando un nuevo objeto de tipo Persona
//        Persona personaNueva = new Persona("Carlos", "Esparza", "cesparza@mail.com", "554456587");
//        personaDao.insertar(personaNueva);

        //Modificar un objeto de persona existente
//        Persona personaModificar = new Persona(4, "Juan Carlos", "Esparza", "jcesparza@mail.com", "554456587");
//        personaDao.actualizar(personaModificar);

        //Eliminar un registro
        Persona personaEliminar = new Persona(4);
        personaDao.eliminar(personaEliminar);
        
        //Listado Persona
        List<Persona> personas = personaDao.seleccionar();

        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });
    }
}
