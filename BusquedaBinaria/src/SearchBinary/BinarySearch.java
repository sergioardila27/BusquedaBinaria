
package SearchBinary;


public class  BinarySearch {

    // Método principal de búsqueda binaria
    public static int BinarySearch(int[] arreglo, int valorBuscado) {
        int inicio = 0;                          // Define el índice inicial del arreglo
        int fin = arreglo.length - 1;            // Define el índice final del arreglo

        while (inicio <= fin) {                  // Bucle que continúa mientras el inicio sea menor o igual al fin
            int medio = inicio + (fin - inicio) / 2;  // Calcula el índice medio

            if (arreglo[medio] == valorBuscado) {    // Compara el elemento medio con el valor buscado
                return medio;                     // Si es igual, retorna el índice medio como resultado
            }
            else if (arreglo[medio] < valorBuscado) {  // Si el valor en medio es menor que el buscado
                inicio = medio + 1;                // Mueve el índice de inicio hacia la derecha del medio
            }
            else {                                // Si el valor en medio es mayor que el buscado
                fin = medio - 1;                  // Mueve el índice de fin hacia la izquierda del medio
            }
        }

        return -1;                               // Retorna -1 si el valor no está en el arreglo
    }

    // Método principal para probar la búsqueda binaria
    public static void main(String[] args) {
        int[] arreglo = {1, 3, 5, 7, 9, 11, 13}; // Arreglo ordenado
        int valorBuscado = 7;                    // Valor a buscar en el arreglo

        int resultado = BinarySearch(arreglo, valorBuscado); // Llama al método de búsqueda binaria

        if (resultado == -1) {                   // Verifica si el valor fue encontrado
            System.out.println("Valor no encontrado");
        } else {
            System.out.println("Valor encontrado en el índice: " + resultado); // Muestra el índice donde se encontró el valor
        }
    }
}
