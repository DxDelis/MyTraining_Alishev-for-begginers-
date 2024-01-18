package lessons10_19;

public class Multidimensional_arrays {
    public static void main(String[] args) {
        int[] number = {1,2,3};
        int[][] matrice = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};

        for(int i = 0; i < matrice.length; i++) { //внешний цикл,который проходится по строкам
            for(int j = 0; j < matrice.length;j++){ //внутренний цикл,который проходит по каждому элементу в строке
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }


    }
}
