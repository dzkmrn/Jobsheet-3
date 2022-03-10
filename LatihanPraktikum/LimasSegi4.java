package LatihanPraktikum;

public class LimasSegi4 {
    public int sisA, tinggi, c;

    public LimasSegi4(int sa, int t){
        sisA = sa;
        tinggi = t;
    }

    public void cariC(){
        c = ((1/2*sisA*1/2*sisA)+(tinggi*tinggi));
        System.out.println("Limas segi empat mempunyai garis miring sepanjang : "+(Math.sqrt(c)));
    }
    
    public int hitungVolume(){
        return sisA*sisA*tinggi/3;
    }

    public Double hitungLuasP(){
        return (sisA*sisA)+(4*sisA*(Math.sqrt(c))/2);
    }
}
