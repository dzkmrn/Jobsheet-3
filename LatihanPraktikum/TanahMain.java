package LatihanPraktikum;
import java.util.Scanner;
public class TanahMain {
    public static void main(String[] args) {
        Tanah[] tArray = new Tanah[3];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3;i++){
            tArray[i] = new Tanah();
            System.out.println("Tanah "+(i+1));
            System.out.print("Masukkan panjang : ");
            tArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar : ");
            tArray[i].lebar = sc.nextInt();
            System.out.println(" ");
        }

        for(int i = 0; i < 3;i++){
            System.out.println("Luas tanah "+i+ ":" +tArray[i].hitungLuas());
        }System.out.println(" ");

        int highest = tArray[0].hitungLuas();

        for(int i = 0;i<3;i++){
            if(tArray[i].hitungLuas() > highest) highest = tArray[i].hitungLuas();
        }System.out.println("Tanah terluas adalah : "+highest);
    }
}

