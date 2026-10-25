void main() {
    double vize1 = 60.0;
    double vize2 = 70.0;
    double final1 = 75.0;
    double orta = vize1 / 4 + vize2 / 4 + final1 / 2;
    System.out.println("Hesaplanan Ortalama:" + orta);
    if (orta < 50) {
        System.out.println("Durum:Kaldınız");
    } else if (orta < 75) {
        System.out.println("Durum: Geçtin");
    } else if (orta < 85) {
        System.out.println("Durum: Teşekkür belgesi aldın");
    } else {
        System.out.println("Durum: Takdir belgesi aldın");
    }
}