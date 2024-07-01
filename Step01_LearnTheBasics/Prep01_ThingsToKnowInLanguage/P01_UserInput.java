package Step01_LearnTheBasics.Prep01_ThingsToKnowInLanguage;

import java.util.Arrays;
import java.util.Scanner;

public class P01_UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Something");

        int len = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();

        String[] strArr = str.split(" ");
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }

        System.out.println(len + "\n" + str + "\n" + Arrays.toString(strArr) + "\n" + Arrays.toString(arr));

        sc.close();

    }
}
