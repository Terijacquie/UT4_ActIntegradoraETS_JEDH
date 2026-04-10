public class Main {
    /***
     *  Programa cuya función es acumular un valor hasta llegar a la condición
     * mediante un bucle do while
     * @param args
     */
    public static void main(final String[] args) {
        int total = 0;
        int valorBase = 15;
        int valorAgregado = 20;
        int acumulador = 0;

        do {
            valorAgregado = 10 + valorBase;
            acumulador = acumulador + valorAgregado;
            acumulador++;
            total = 15;
            /* Se han eliminado tanto el if como el else
             * porque no cumplían ninguna funcionalidad, al igual que la resta del acumulador(siempre era false),
             * ya que no tenía sentido sumar con ++ y luego restar*/

            int valorTemporal;
            valorTemporal = acumulador;

            total = valorTemporal;
        } while (acumulador < 100);
    }
}
