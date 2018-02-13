package Task4.c;

public class RandomNumber {

    public static void main(String[] args) {

        random();

    }

    public static void random (){

        double number;
        do {
            number = Math.random();
            if (number == 0){
                break;
            }
            if (number <0.5){
                System.out.println("Tails");
            }else{
                System.out.println("Eagle");
            }
        }while (true);

    }

}
