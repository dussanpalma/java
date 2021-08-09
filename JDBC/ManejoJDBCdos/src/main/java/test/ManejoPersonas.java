package test;

import datos.Conexion;
import datos.PersonaJDBC;
import domain.Persona;
import java.sql.*;

public class ManejoPersonas {

    public static void main(String[] args) {

        Connection conexion = null;

        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            PersonaJDBC personaJdbc = new PersonaJDBC(conexion);

            Persona cambioPersona = new Persona(); 
            cambioPersona.setId_persona(20);
            cambioPersona.setNombre("Duvan ");
            cambioPersona.setApellido("Solano");
            cambioPersona.setEmail("dussan@hotmail.com");
            cambioPersona.setTelefono("3200255");
            personaJdbc.update(cambioPersona);
            
            
            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Dussan");
            nuevaPersona.setApellido("Palma");
            nuevaPersona.setEmail("dussan@hotmail.com");
            nuevaPersona.setTelefono("3200255");
            personaJdbc.insert(nuevaPersona);


            Persona elimnarPersona = new Persona();
            elimnarPersona.setId_persona(21);
            personaJdbc.delete(elimnarPersona);
            conexion.commit();
            System.out.println("Se ha hecho commit de la transacción");

            
            
            
        } catch (SQLException ex) {

            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {

                ex1.printStackTrace();

            }

        }

    }
}
