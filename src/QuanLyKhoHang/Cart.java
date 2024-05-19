package QuanLyKhoHang;

public class Cart {
    private int quantityBuy;
    private String name;

    public Cart(int quantityBuy, String name) {
        this.quantityBuy = quantityBuy;
        this.name = name;
    }

    public int getQuantityBuy() {
        return quantityBuy;
    }

    public void setQuantityBuy(int quantityBuy) {
        this.quantityBuy = quantityBuy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "quantityBuy=" + quantityBuy +
                ", name='" + name + '\'' +
                "}\n";
    }
}
