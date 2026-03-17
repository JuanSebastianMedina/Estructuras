public class ArrayMultidimensional {
    public static void main(String[] args) {
        int[][][] cubo = new int[2][3][4];
        // Llenar el array
        int valor = 1;
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    cubo[i][j][k] = valor++;
                }
            }
        }
        // Mostrar el contenido
        for (int i = 0; i < cubo.length; i++) {
            System.out.println("Bloque " + i);
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    System.out.print(cubo[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}