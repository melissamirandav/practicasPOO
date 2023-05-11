public class Lista<T> {
  private T[] elementos;
  private int tamaño;

  public Lista() {
    elementos = (T[]) new Object[10];
    tamaño = 0;
  }

  public void agregar(T elemento) {
    elementos[tamaño] = elemento;
    tamaño++;
  }

  public T obtener(int indice) {
    return elementos[indice];
  }
}

