package LatihanPraktikum;
import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Mahasiswa[] array = new Mahasiswa[3];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            array[i] = new Mahasiswa();
            array[0] = new Mahasiswa();
            System.out.println("Mahasiswa ke- "+(i+1));
            System.out.print("Masukan nama : ");
            array[i].nama = sc.next();
            System.out.print("Masukan nim : ");
            array[i].nim = sc.nextInt();
            System.out.print("Masukan jenis kelamin : ");
            array[i].kelamin = sc.next();
            System.out.print("Masukan ipk : ");
            array[i].ipk = sc.nextDouble();
        }System.out.println(" ");

        for(int i = 0;i < 3;i++){
            System.out.println("Tampilkan data mahasiswa");
            System.out.println("Mahasiswa ke "+(i+1));
            System.out.println("nama : "+array[i].nama);
            System.out.println("nim : "+array[i].nim);
            System.out.println("jenis kelamin : "+array[i].kelamin);
            System.out.println("IPK : "+array[i].ipk);
        }
    }
}
