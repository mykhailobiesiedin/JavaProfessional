package lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        int sheep = 1;
        int [][] battleField = new int[][] {
                {1, 1, 0, 0, 1},
                {0, 0, 1, 0, 0},
                {1, 0, 1, 0, 0},
                {1, 0, 1, 0, 0},
                {1, 0, 1, 0, 0},
        };
//        battleField [0] [1] = sheep;
//        battleField [0] [2] = sheep;
//        battleField [0] [3] = sheep;
//        battleField [0] [4] = sheep;
//
//        battleField [1] [4] = sheep;
//        battleField [2] [4] = sheep;
//
//        battleField [3] [0] = sheep;
        int shipCounter = 0;

       for (int x =0; x< battleField.length; x++){
           for (int y=0; y< battleField[x].length; y++){
               int cell = battleField [x] [y];
               if ( cell == sheep && ( battleField[x][y+1] ==0) && (battleField[x+1][y] ==0)){
                   shipCounter++;
               }
           }
       }
        System.out.println(shipCounter);
    }
}
