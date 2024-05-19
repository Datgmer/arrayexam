package QuanLyKhoHang;

import java.util.Date;

public class WareHouse {
    protected int id;
    private Date date;
    private int quantity;

    public WareHouse(int id, Date date, int quantity) {
        this.id = id;
        this.date = date;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int idnew) {
        this.id = idnew;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantitynew) {
        this.quantity = quantitynew;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "WareHouse{" +
                "id=" + id +
                ", date=" + date +
                ", quantity=" + quantity +
                "}\n";
    }
}
