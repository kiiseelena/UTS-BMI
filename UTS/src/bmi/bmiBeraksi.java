package bmi;

/**
 *
 * @author kieee
 */
public class bmiBeraksi {
    int beratBadan;
    int tinggiBadan;
    
    public bmiBeraksi(int tinggiBadan, int beratBadan) {
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }
    
    public void operasiBMI(){
        int hasil = beratBadan / (tinggiBadan * 2 / 100);
        System.out.println("Hasil dari tinggi badan " + tinggiBadan + " dan berat badan " + beratBadan);
        if(hasil < 18){
            System.out.println("Adalah "+ hasil +" kategori berat badan kurang atau kurus");
        } else if(hasil >= 18 && hasil <= 22){
            System.out.println("Adalah "+ hasil +" kategori berat badan ideal");
        } else if(hasil >= 23 && hasil <= 24){
            System.out.println("Adalah "+ hasil +" kategori kelebihan berat badan atau gemuk");
        } else if(hasil >= 25 && hasil <= 30){
            System.out.println("Adalah "+ hasil +" kategori obesitas ke 1");
        } else{
            System.out.println("Adalah "+ hasil +" kategori obesitas ke 2");
        }
    }
}
