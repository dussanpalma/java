package domain;

// buenas practicas 
public class Usuario {
    
    private int id_usuario; 
    private String usuario; 
    private String password; 

    public Usuario() {
    }

    public Usuario(int idUsuario) {
        this.id_usuario = idUsuario;
    }

    public Usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public Usuario(int idUsuario, String usuario, String password) {
        this.id_usuario = idUsuario;
        this.usuario = usuario;
        this.password = password;
    }

    public int getIdUsuario() {
        return id_usuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.id_usuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario " + "idUsuario = " + id_usuario + ", usuario = " + usuario + ", password = " + password;
    }
    
    
    

  
}


