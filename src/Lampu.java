public class Lampu extends Alat implements Kontrol, Pantau {
    public static final int BATAS_CAHAYA = 40;

    private int cahaya;

    public Lampu(String id, String nama, int cahaya) {
        super(id, nama);
        this.cahaya = cahaya;
    }

    public Lampu(String id, String nama, int cahaya, boolean hidup) {
        super(id, nama, hidup);
        this.cahaya = cahaya;
    }

    public int getCahaya() {
        return cahaya;
    }

    public void setCahaya(int cahaya) {
        this.cahaya = cahaya;
    }

    @Override
    public void nyalakan() {
        if (!isHidup()) {
            setHidup(true);
            System.out.println(getNama() + " dinyalakan");
        } else {
            System.out.println(getNama() + " sudah menyala");
        }
    }

    @Override
    public void matikan() {
        if (isHidup()) {
            setHidup(false);
            System.out.println(getNama() + " dimatikan");
        } else {
            System.out.println(getNama() + " sudah mati");
        }
    }

    @Override
    public void otomatis() {
        if (cahaya < BATAS_CAHAYA) {
            if (!isHidup()) {
                setHidup(true);
                System.out.println("Ruangan gelap, lampu menyala otomatis");
            } else {
                System.out.println("Lampu sudah menyala");
            }
        } else {
            if (isHidup()) {
                setHidup(false);
                System.out.println("Ruangan terang, lampu mati otomatis");
            } else {
                System.out.println("Lampu sudah mati");
            }
        }
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Cahaya : " + cahaya + "%");
    }

    @Override
    public void status() {
        System.out.println(getNama() + ": " +
                (isHidup() ? "ON" : "OFF"));
    }
}

