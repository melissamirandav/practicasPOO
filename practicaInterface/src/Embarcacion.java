public class Embarcacion {

  private Capitan capitan;
  private double precioBase;
  private double valorAdicional;
  private Integer anioFabricacion;
  private double eslora;

  public Embarcacion(final Capitan capitan, final double precioBase, final double valorAdicional,
      final Integer anioFabricacion, final double eslora) {
    this.capitan = capitan;
    this.precioBase = precioBase;
    this.valorAdicional = valorAdicional;
    this.anioFabricacion = anioFabricacion;
    this.eslora = eslora;
  }

  public double getPrecioBase() {
    return precioBase;
  }

  public Integer getAnioFabricacion() {
    return anioFabricacion;
  }

  public double getValorAdicional() {
    return valorAdicional;
  }

  public double calcularMontoAlquiler(){
    return anioFabricacion>2020?precioBase+valorAdicional:precioBase;
  }
}
