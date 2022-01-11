public class Motor {

    private int id;
    private String nama = null;
    private String type = null;

    public Motor(int id, String nama, String type) {
        this.id = id;
        this.nama = nama;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getType() {
        return type;
    }
}