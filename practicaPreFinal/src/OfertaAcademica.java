public abstract class OfertaAcademica {

  private String nombre;
  private String descripcion;

  public OfertaAcademica(final String nombre, final String descripcion) {
    this.nombre = nombre;
    this.descripcion = descripcion;
  }

  public abstract double calcularPrecio();

  @Override
  public String toString() {
    return "Nombre: "+ nombre + "Precio: $" + calcularPrecio();
  }
}
