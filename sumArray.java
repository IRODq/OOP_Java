import java.util.Scanner;
import java.util.Random;
public class sumArray {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int size,sum=0;
        System.out.println("Введите размер массива");
        size = in.nextInt();
        int Array[]= new int[size];
        for (int i=0; i<size; i++){
            Array[i] = random.nextInt(100);
            System.out.println(Array[i]);
            sum = sum + Array[i];
        }
        System.out.printf("Сумма %d",sum);
        }
    }
