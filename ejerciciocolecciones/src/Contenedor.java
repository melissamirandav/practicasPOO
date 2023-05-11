public class Contenedor implements Comparable<Contenedor>{
  private Integer numeroIdentificacion;
  private String paisProcedencia;
  private boolean materialPeligroso;

  public Contenedor(final Integer numeroIdentificacion, final String paisProcedencia,
      final boolean materialPeligroso) {
    this.numeroIdentificacion = numeroIdentificacion;
    this.paisProcedencia = paisProcedencia;
    this.materialPeligroso = materialPeligroso;
  }

  public Integer getNumeroIdentificacion() {
    return numeroIdentificacion;
  }

  public void setNumeroIdentificacion(final Integer numeroIdentificacion) {
    this.numeroIdentificacion = numeroIdentificacion;
  }

  public String getPaisProcedencia() {
    return paisProcedencia;
  }

  public void setPaisProcedencia(final String paisProcedencia) {
    this.paisProcedencia = paisProcedencia;
  }

  public boolean isMaterialPeligroso() {
    return materialPeligroso;
  }

  public void setMaterialPeligroso(final boolean materialPeligroso) {
    this.materialPeligroso = materialPeligroso;
  }

  @Override
  public int compareTo(final Contenedor o) {
    return numeroIdentificacion.compareTo(o.numeroIdentificacion);
  }

  @Override
  public String toString() {
    return "Contenedor{" +
        "numeroIdentificacion=" + numeroIdentificacion +
        ", paisProcedencia='" + paisProcedencia + '\'' +
        ", materialPeligroso=" + materialPeligroso +
        '}';
  }
}
