public class Main {
    //fibonacci serisinde kaçıncı sayı olduğunu bulalım
    static int Fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return Fibonacci(n-1 ) + Fibonacci(n-2);
    }
    public static void main(String[] args) {
        // Dizideki her iki sayının toplamı sonraki sayıyı veriyorsa fibonacci serisidir
        // 1 1 2 3 5 8 13 21...
        // f(6) = f(4) + f(5)
        System.out.println(Fibonacci(23));
    }
}

//        1. adım:
//
//        if( n == 1 || n == 2)
//        return 1;         -------------> kısmında n'nin f(1) ve f(2)'de = 1 olduğunu sisteme kabul ettiriyoruz.
//
//        dolayısı ile
//        * f(1) = 1
//        * f(2) = 1  oldu.
//
//        n'nin 4. elemanını ele aldığımızda yani (n = 4) dediğimizde işlem adım adım şu şekilde başlıyor:
//
//        * Formül : return fibo (n-1) + fibo(n-2);  --------> sistem bu formülü döngüye sokmaya başlıyor.
//
//        2. adım :   f(4) = f(4 - [1]) + f(4 - [2]) =
//        f(4) = f(3) + f(2)  -----> sistem f(3)'ün değerini bilmiyor, döngü devam ediyor
//
//        3. adım :   f(3) = f(3 - [1]) + f(f3 - [2]) =
//        f(3) = f(2) + f(1) ------> en başta f(1) ve f(2)'nin  1 olduğunu sisteme kabul ettirmiştik
//
//        4. adım :   f(3) = f(2) + f(1) =
//        f(3) = 1 + 1 =
//        f(3) = 2
//
//        5. adım :   f(4) = f(3) + f(2) =
//        f(4) = 2 + 1 =
//        f(4) = 3

