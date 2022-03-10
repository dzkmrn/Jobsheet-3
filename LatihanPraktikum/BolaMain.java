package LatihanPraktikum;
import java.util.Scanner;
public class BolaMain {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Bola[] blArray = new Bola[3];
    for(int i=0;i<blArray.length;i++){
        blArray[i] = new Bola();
        System.out.print("Masukkan r(jari-jari) bola ke-"+i+":");
        blArray[i].jari = sc.nextInt();
    }
    for(int i=0;i<blArray.length;i++){
        System.out.println("Luas Permukaan Bola ke-"+i+" adalah "+blArray[i].hitungLuasP());
        System.out.println("Volume Bola ke-"+i+" adalah "+ blArray[i].hitungVolume());
    }
    }    
}
