package Opdracht2;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

        int [] someArr = {0,1, 2,3,4,5,6,7};
        int count = IntStream.of(someArr).reduce(0,(acc,el) -> acc + 1);
        int max = IntStream.of(someArr).reduce(0,(acc,el) -> acc<el?el:acc);
         int min = IntStream.of(someArr).reduce(0,(acc,el) -> acc>el?el:acc);
        int sum = IntStream.of(someArr).reduce(0,(acc,el)-> acc+el);
        OptionalDouble avarage =  IntStream.of(someArr).average();
        int red =  IntStream.of(someArr).reduce(0,(acc,el)-> acc + el * el);


        System.out.println("Count is: " + count);
        System.out.println("Maximum is: " + max);
        System.out.println("Minimum is: " + min);
        System.out.println("Sum is: " + sum);

        if(avarage.isPresent()){
            System.out.println("Average is: " + avarage.getAsDouble());
        }else{
            System.out.println("No result");
        }

        System.out.println("Reduce is: " + red);

        String [] stArr = {"All", "you", "need", "is", "love"};
        Stream<String> stringStream = Stream.of(stArr);
        String result = stringStream.reduce("",(acc,el)->acc + el + ";");
        System.out.println(result);

    }
}
