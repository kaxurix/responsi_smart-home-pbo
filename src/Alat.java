
public abstract class Alat {
    public static final String LOKASI = "Rumah";

    private final String id;
    private String nama;
    private boolean hidup;

    public Alat(String id, String nama) {
        this.id = id;
        this.nama = nama;
        this.hidup = false;
    }

    public Alat(String id, String nama, boolean hidup) {
        this(id, nama);
        this.hidup = hidup;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public boolean isHidup() {
        return hidup;
    }

    public void setHidup(boolean hidup) {
        this.hidup = hidup;
    }

    public void info() {
        System.out.println("ID     : " + id);
        System.out.println("Nama   : " + nama);
        System.out.println("Status : " + (hidup ? "ON" : "OFF"));
    }

    public abstract void otomatis();
}
