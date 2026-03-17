public class ArrayBidimensional {
    public static void main(String[] args) {
        // construye la matriz 2x2
        int[][] matriz = new int[3][3];
        int contador = 1;
        // llena la matriz
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matriz[i][j] = contador;
                contador++;
            }
        }
        // recorre la matriz
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}