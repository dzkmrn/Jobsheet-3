package LatihanPraktikum;

public class Kubus {
        public int sisi;
    
        public Kubus(int s) {
            sisi = s;
        }
    
        public double hitungVolume(){
            return sisi*sisi*sisi;
        }
    
        public double hitungLuasP(){
            return 6*(sisi*sisi);
        }
}
