// Напишите программу , чтобы проверить, содержит ли данная строка только цифры.

public class Number {
    
    public static void main(String[] args) {
        String string1 ="4565hj67";
        String string2 ="345as4356fg";
        System.out.println("Первая строка: ");
        System.out.println(string1);
        System.out.println("Вторая строка: ");
        System.out.println(string2);
        System.out.println("\nПервая строка содержит только цифры: ");
        boolean result1 = digits(string1);
        System.out.println(result1);
        System.out.println("Вторая строка содержит только цифры: ");
        boolean result2 = digits(string2);
        System.out.println(result2);
    }
    
  public static boolean digits(String string) {
       for (int i = 0; i < string.length(); i++) {
           if (!Character.isDigit(string.charAt(i))) {
               return false;
           }
       }
       return true;
    }    
}