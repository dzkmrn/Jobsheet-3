package LatihanPraktikum;

public class LimasSegi4Main {
    public static void main(String[] args) {
        LimasSegi4[] lsArray = new LimasSegi4[2];

        lsArray[0] = new LimasSegi4(8, 15);
        lsArray[1] = new LimasSegi4(16, 20);

        for(int i = 0;i < 2;i++){
            lsArray[i].cariC();
            System.out.println("Limas segi 4 ke-"+(i+1)+" mempunyai volume : "+lsArray[i].hitungVolume()+", dan luas permukaan : "+lsArray[i].hitungLuasP());
            System.out.println(" ");
        }
    }
}
