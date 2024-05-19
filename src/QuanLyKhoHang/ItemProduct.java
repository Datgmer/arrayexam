package QuanLyKhoHang;

public class ItemProduct {
    private int id;
    private String name;

    public ItemProduct(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ItemProduct{" +
                "name='" + name + '\'' +
                ", id=" + id +
                "}\n";
    }
}
