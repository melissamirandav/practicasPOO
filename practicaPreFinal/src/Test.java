import java.util.HashMap;
import java.util.Map;

public class Test {

  public static void main(String[] args) {
    Instituto instituto = new Instituto();

    OfertaAcademicaFactory ofertaAcademicaFactory = OfertaAcademicaFactory.getInstance();
    instituto.agregarOfertaAcademica(ofertaAcademicaFactory.crearOfertaAcademica("FRONTEND"));
    instituto.agregarOfertaAcademica(ofertaAcademicaFactory.crearOfertaAcademica("BACKEND"));
    instituto.agregarOfertaAcademica(ofertaAcademicaFactory.crearOfertaAcademica("FULLSTACK"));

    instituto.generarInforme();

    String len = "conilla";
    Map<String, Integer> mapa = new HashMap<>();
    for(String key: mapa.keySet()){
      if(key.contains("")){
len.charAt()
      }
    }
  }



}
