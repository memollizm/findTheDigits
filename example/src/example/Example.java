package example;
import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        
        //Girilen sayı dizisinde kaç tane rakam olduğunu bulan program.
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi dizisi giriniz: ");
        String giris = scan.nextLine();
        
        System.out.println("******************");
        System.out.println(CountDigit(giris));
    }
    
    public static int CountDigit(String kelime){
        int sonuc=0;
        for(int i=0;i<kelime.length();i++){
            if(Character.isDigit(kelime.charAt(i)))
                sonuc ++;
        }
        return sonuc;
    }
}
