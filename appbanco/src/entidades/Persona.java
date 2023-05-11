package entidades;

public class Persona {
  private String nombre;
  private int cedula;

  public Persona(String nombre, int cedula) {
    this.nombre = nombre;
    this.cedula = cedula;
  }

  public String getNombre() {
    return nombre;
  }
  public int getCedula() {
    return cedula;
  }

  @Override
  public String toString(){
    return "Nombre: " + nombre + " Cedula: " + cedula;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + cedula;
    result = prime * result + ((nombre == null)? 0 : nombre.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if(obj == null){
      return false;
    }
    if(!(obj instanceof Persona)){
      return false;
    }
    Persona otro = (Persona) obj;
    if(otro.getCedula() != this.cedula){
      return false;
    }
    return true;
  }
}
