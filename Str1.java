// Напишитепрограмму для объединения данной строки с самим собой заданное 
// количество раз(количество и строку мы вводим)

import java.util.Scanner;
 
public class Str1 {
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = in.nextLine();
        System.out.println(s);
        String result = s;
        System.out.print("Введите количество повторов: ");
        int n = in.nextInt();
        result = s.repeat(n);
            System.out.println(result);
          
    }
        
}
