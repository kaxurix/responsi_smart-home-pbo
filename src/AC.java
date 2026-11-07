public class AC extends Alat implements Kontrol, Pantau {
    public static final int BATAS_SUHU = 28;

    private int suhu;

    public AC(String id, String nama, int suhu) {
        super(id, nama);
        this.suhu = suhu;
    }

    public AC(String id, String nama, int suhu, boolean hidup) {
        super(id, nama, hidup);
        this.suhu = suhu;
    }

    public int getSuhu() {
        return suhu;
    }

    public void setSuhu(int suhu) {
        this.suhu = suhu;
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
        if (suhu > BATAS_SUHU) {
            if (!isHidup()) {
                setHidup(true);
                System.out.println("Suhu panas, AC menyala otomatis");
            } else {
                System.out.println("AC sudah menyala");
            }
        } else {
            if (isHidup()) {
                setHidup(false);
                System.out.println("Suhu normal, AC mati otomatis");
            } else {
                System.out.println("AC sudah mati");
            }
        }
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Suhu   : " + suhu + " C");
    }

    @Override
    public void status() {
        System.out.println(getNama() + ": " +
                (isHidup() ? "ON" : "OFF"));
    }
}
