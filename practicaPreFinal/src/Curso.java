public class Curso extends OfertaAcademica{
  private Double horasMensuales;
  private Double cantidadMeses;
  private Double valorPorHora;

  public Curso(final String nombre, final String descripcion, final Double horasMensuales,
      final Double cantidadMeses, final Double valorPorHora) {
    super(nombre, descripcion);
    this.horasMensuales = horasMensuales;
    this.cantidadMeses = cantidadMeses;
    this.valorPorHora = valorPorHora;
  }

  @Override
  public double calcularPrecio() {
    return horasMensuales*cantidadMeses*valorPorHora;
  }


}
