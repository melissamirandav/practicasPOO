public abstract class Examen {

  private Alumno alumno;
  private String titulo;
  private String enunciado;
  private Double nota;

  public Examen(final Alumno alumno, final String titulo, final String enunciado,
      final Double nota) {
    this.alumno = alumno;
    this.titulo = titulo;
    this.enunciado = enunciado;
    this.nota = nota;
  }

  public Double getNota() {
    return nota;
  }

  public abstract boolean aprobado();

}
