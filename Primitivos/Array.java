public class Array {
    public static void main(String[] args) {
        // declara array y asigna valores
        int[] numeros = {10, 20, 30, 40, 50};
        // recorre array completa
        for(int i = 0; i < numeros.length; i++) {
            System.out.println("Indice: " + i + 
                               " Valor: " + numeros[i]);
        }
    }
}