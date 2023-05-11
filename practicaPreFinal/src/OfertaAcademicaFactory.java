public class OfertaAcademicaFactory {

  private static OfertaAcademicaFactory  instance;

  private OfertaAcademicaFactory() {
  }

  public static OfertaAcademicaFactory getInstance() {
    if(instance == null) {
      return new OfertaAcademicaFactory();
    }
      return instance;
  }

  public OfertaAcademica crearOfertaAcademica (String codigo){
    switch (codigo){
      case "FRONTEND":
        return new Curso("Front End", "Javascript", 16.0,
            2.0,1000.0);
      case "BACKEND":
        return new Curso("Back End", "Java", 20.0, 2.0,
            900.0);
      case "FULLSTACK":
        ProgramaIntensivo programaIntensivo = new ProgramaIntensivo ("Full-stack",
            "completo", 0.20);
        programaIntensivo.agregarOfertaAcademica(crearOfertaAcademica("FRONTEND"));
        programaIntensivo.agregarOfertaAcademica(crearOfertaAcademica("BACKEND"));
        return programaIntensivo;
    }

    return null;
  }
}
