package Task4.b;

public class RaceCycle {

    public static void main(String[] args) {
        race();
    }

    public static void race (){

        for (int i = 1; i <=20 ; i++) {
            if (i==6 || i == 12 || i==18){
                continue;
            }
            System.out.println("Race " + i);
        }

    }

}
