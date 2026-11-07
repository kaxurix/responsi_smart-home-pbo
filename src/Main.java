
public class Main {
    public static void main(String[] args) {

        Lampu lampu = new Lampu("L01", "Lampu Kamar", 20);
        AC ac = new AC("A01", "AC Kamar", 32, false);

        System.out.println("=== SMART HOME ===");
        System.out.println("Lokasi: " + Alat.LOKASI);

        System.out.println("\n=== DATA PERANGKAT ===");
        lampu.info();
        System.out.println();
        ac.info();

        System.out.println("\n=== LAMPU OTOMATIS ===");
        lampu.otomatis();
        lampu.otomatis();

        lampu.setCahaya(80);
        System.out.println("Cahaya sekarang: " + lampu.getCahaya() + "%");
        lampu.otomatis();

        System.out.println("\n=== AC OTOMATIS ===");
        ac.otomatis();
        ac.otomatis();

        ac.setSuhu(24);
        System.out.println("Suhu sekarang: " + ac.getSuhu() + " C");
        ac.otomatis();

        System.out.println("\n=== KONTROL MANUAL ===");
        lampu.nyalakan();
        ac.nyalakan();
        lampu.matikan();
        ac.matikan();

        System.out.println("\n=== INTERFACE ===");
        Kontrol kontrol = new Lampu("L02", "Lampu Teras", 50);
        kontrol.nyalakan();
        kontrol.matikan();

        Pantau pantau = new AC("A02", "AC Ruang Tamu", 26);
        pantau.status();

        System.out.println("\n=== DATA AKHIR ===");
        lampu.info();
        System.out.println();
        ac.info();
    }
}
