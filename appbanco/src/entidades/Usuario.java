package entidades;

public class Usuario extends Persona{

  private String userName;
  private String password;

  public Usuario(String userName, String password, String nombre, int cedula){
    super(nombre, cedula);
    this.userName = userName;
    this.password = password;
  }

  public String getUserName(){
    return userName;
  }
  public String getPassword(){
    return password;
  }

  public void cambiarContrasenia(String password){
    this.password = password;
  }

  @Override
  public String toString(){
    return new StringBuilder().append("UserName").append(this.userName).append("password")
        .append(this.password).toString();
  }

  @Override
  public boolean equals(Object obj){
    if(obj == null){
      return false;
    }
    if(!(obj instanceof Usuario)){
      return false;
    }
    Usuario nuevoUsuario = (Usuario)obj;
    return nuevoUsuario.getPassword().equals(password) && nuevoUsuario.getUserName().equals(userName)
        && super.equals(nuevoUsuario);
  }
}
