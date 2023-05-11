import java.util.ArrayList;
import java.util.Collections;

public class Puerto {

  private String nombre;
  private ArrayList<Contenedor> contenedores;

  public Puerto(final String nombre) {
    this.nombre = nombre;
    this.contenedores = new ArrayList<Contenedor>();
  }

  public String getNombre() {
    return nombre;
  }

  public void addContenedor(Contenedor contenedor){
    this.contenedores.add(contenedor);
  }

  public ArrayList <Contenedor> getContenedores() {
    return contenedores;
  }

  public void mostrarContenedor(){
    Collections.sort(contenedores);
    for (Contenedor contenedor: this.contenedores){
      System.out.println(contenedores.toString());
    }
  }

  public Integer contenedoresPeligrosos(){
    int cantidadContenedoresPeligrosos = 0;
    for (Contenedor contenedor: contenedores) {
      if (contenedor.isMaterialPeligroso() && contenedor.getPaisProcedencia().equals("Desconocida")){
        cantidadContenedoresPeligrosos ++;
      }
    }
    return cantidadContenedoresPeligrosos;
  }
}

