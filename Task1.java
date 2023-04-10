import java.io.FileReader;
import java.io.IOException;

/**
Реализовать 3 метода чтобы в каждом из них получить разные исключения.
 */
public class Task1 {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7};
        byZero(10, 0);
        strLen(null);
        printValueByIndex(array, 12);
//      read();
    }
    public static void printValueByIndex(int[] array, int index){
        if(index > array.length-1) throw new ArrayIndexOutOfBoundsException("Элемента под таким индексом не существует");
        else System.out.printf("Элемент с индексом %d равен %d.\n",index, array[index]);
    }

    public static void byZero(int a, int b){
        int c = 0;
        try {
             c = a/b;
        }catch (ArithmeticException e){
            System.out.println("На ноль делить нельзя!");
        }
        System.out.println(c);

    }
    public static void strLen(String test){
        try {
            System.out.println(test.length());
        }catch (NullPointerException e){
            System.out.println("Строка не должна быть Null");
        }
    }
//    public static void read(){
//        FileReader test = null;
//        try {
//            test = new FileReader("test");
//            test.read();
//        }catch (RuntimeException | IOException e){
//            throw new RuntimeException(e);
//        }finally {                            //Всегда нужно помнить чтобы закрывать программу чтения.
//            if(test != null){
//                try {
//                    test.close();
//                }catch (IOException e){
//                    System.out.println("Исключение при закрытии");
//                }
//
//            }
//        }
//    }

}
