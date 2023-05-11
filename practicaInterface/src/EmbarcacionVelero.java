public class EmbarcacionVelero extends Embarcacion{
  private Integer cantidadMastiles;

  public EmbarcacionVelero(final Capitan capitan, final double precioBase,
      final double valorAdicional, final Integer anioFabricacion, final double eslora,
      final Integer cantidadMastiles) {
    super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
    this.cantidadMastiles = cantidadMastiles;
  }

  public boolean evaluarVeleros(){
    return cantidadMastiles>4;
  }

}
