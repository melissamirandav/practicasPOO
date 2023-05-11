public class EmbarcacionYate extends Embarcacion implements Comparable<EmbarcacionYate>{

  private Integer cantidadCamarotes;

  public EmbarcacionYate(final Capitan capitan, final double precioBase,
      final double valorAdicional,
      final Integer anioFabricacion, final double eslora, final Integer cantidadCamarotes) {
    super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
    this.cantidadCamarotes = cantidadCamarotes;
  }


  @Override
  public int compareTo(final EmbarcacionYate yate) {
    return yate.cantidadCamarotes - cantidadCamarotes;
  }
}
