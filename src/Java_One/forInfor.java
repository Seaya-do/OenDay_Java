package Java_One;

public class forInfor {
    public static void main(String[] args) {
        for (int i =0; i <4; i++){      //바깥쪽 for문
            System.out.println("======================");
            for (int j=0; j < 4; j++){      //안쪽 for 문
                System.out.println("[" + i + ", " + j + "]" );
            }
            System.out.println('\n');


        }

        //구구단 출력
        for (int k = 2; k < 10; k++){
            for (int t = 1; t < 10; t++){

                System.out.println("[" + k + "x" + t + "=" +(k*t) + "]");

            }
            System.out.println("======================");
        }
    }
}
