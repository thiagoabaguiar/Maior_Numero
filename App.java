import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args){

        int[] arrayOfNumbers = new int[10];
        int biggerNumber;

        try (Scanner input = new Scanner(System.in)) {
           
            for (int i = 0; i < 10; i++){

                System.out.println("Digite um número: ");
                arrayOfNumbers[i] = input.nextInt();

            }

            biggerNumber = arrayOfNumbers[0];

            for (int i = 0; i <= (arrayOfNumbers.length-1); i++){
                
                if (arrayOfNumbers[i] > biggerNumber){
    
                    biggerNumber = arrayOfNumbers[i];
    
                };

            };
              
            System.out.println(Arrays.toString(arrayOfNumbers));
            System.out.println("O maior número digitado é: " + biggerNumber);

        }

    }

}