// Bu ve bundan sonraki 2, 3 dersimiz döngüler ile alakalı olacak.
// Bu dersimizde for döngüsü ile ilgili çalışmalar yapacağız.
public class Main{
    public static void main(String[] args){
        // Aşağıdaki kod bloğunda 1'den 10'a kadar olan sayıları yazdırdık.
        int i;
        for (i = 1; i <= 10; i++){
            System.out.println(i);
        }
        // Aşağıdaki kod bloğunda
        int j;
        int sum = 0;
        for (j = 0; j <= 10; j++){
            sum += j;
        }
        System.out.println(sum);
        int k;
        for (k = 1; k <= 3; k++){
            System.out.println("Hi, How are you?");
        }
        int l;
        for (l = 0; l <= 100; l+=2){
            // 100 e kadar olan çift sayılar
            System.out.println(l);
        }
    }
}