package hitung;

public class matematika {
    //membuat variabel
    private double bil1, bil2;
    
    //membuat constructor

    public matematika(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    
    //membuat method penjumlahan
    public double setPenjumlahan() {
        return bil1 + bil2;
    }
    
     //membuat method pengurangan
    public double setPengurangan() {
        return bil1 - bil2;
    }
    
     //membuat method perkalian
    public double setPerkalian() {
        return bil1 * bil2;
    }
    
     //membuat method pembagian
    public double setPembagian() {
        return bil1 / bil2;
    }
}
