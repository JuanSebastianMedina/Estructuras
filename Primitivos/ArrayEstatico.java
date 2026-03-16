public class ArrayEstatico {
    public static void main(String[] args) {
        // define la array
        int[] numeros = new int[5];
        // asigna valores
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        // Acceso por indice
        System.out.println("Elemento en índice 2: " + numeros[2]);
        // Recorrido completo
        System.out.println("Contenido del array:");
        for(int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}