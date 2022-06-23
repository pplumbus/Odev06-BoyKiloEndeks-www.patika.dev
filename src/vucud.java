import java.util.Scanner;
// Kilo (kg) / Boy(m) * Boy(m)

public class vucud {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
            Double kilo, boy, indeks;
            

        System.out.println("Kilonuz : ");
            kilo = scan.nextDouble();
        System.out.println("Boyunuz : ");
            boy =scan.nextDouble();

        indeks = kilo / (boy * boy);
        System.out.println("Vucud Endeksiniz : " + indeks);



    }


}
