import java.util.Random;

public class EvenOddNumber {
    public static void main(String[] args) {
        int number = new Random().nextInt(99) + 1;
        System.out.println("Selected Number: " + number);

        if (number <= 0) {
            System.out.prinln(number + " = Invalid" ); //It isn't possible to get this result from our randint but just in case!
        }

        if(number % 2 == 0){
            System.out.println(number + " = EVEN");
        }

        else {
            System.out.println(number + " = ODD");
        }

    }
}
