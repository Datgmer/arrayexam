import QuanLyKhoHang.*;

import java.util.*;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 3, 1, 2, 3, 1};
        String[] arrName = {"Quan", "Ao", "Dien Thoai", "Quan", "Ao", "Dien Thoai", "Quan", "Ao", "Dien Thoai", "Ao"};
        ArrayList<WareHouse> wareHouses = new ArrayList<>();
        ArrayList<ItemProduct> itemProducts = new ArrayList<>();
        ArrayList<Cart> carts = new ArrayList<>();
        System.out.print("Hãy nhập số lượng hoá đơn: ");
        int soLuong = in.nextInt();
        for(int i = 1; i<= soLuong; i++){
            System.out.println(STR."Sản phẩm \{i}");
            System.out.print("quantity: ");
            int quantity = in.nextInt();
            System.out.print("name: ");
            in.nextLine();
            String name = in.nextLine();
            Cart item = new Cart(quantity,name.trim());
            carts.add(item);
        }
        System.out.println(carts);
        int[] arrY = {2000,2020,2023,2000,2020,2023,2000,2020,2023,2022};
        int[] arrM = {1,4,3,7,8,2,5,3,8,6};
        int[] arrD = {1,4,25,24,14,17,9,3,8,6};
        int[] arrKho = {200,250,400,100,300,40,50,160,50,500};
        for(int i =0; i<arr.length ; i++){
            WareHouse item = new WareHouse(arr[i],new Date(arrY[i]-1900,arrM[i]-1,arrD[i]),arrKho[i]);
            wareHouses.add(item);
            ItemProduct info = new ItemProduct(arr[i],arrName[i].trim());
            itemProducts.add(info);
        }
        System.out.println(wareHouses);
        wareHouses.sort(Comparator.comparing(WareHouse::getDate));
        for(Cart a : carts){
            if(a.getQuantityBuy() == 0){
                continue;
            }
            String name = a.getName();
            loop2:
            for(ItemProduct b : itemProducts){
                if(b.getName().equalsIgnoreCase(name)){
                    int id = b.getId();
                    for(WareHouse c : wareHouses){
                        if(id == c.getId()){
                            if(a.getQuantityBuy() <= c.getQuantity()){
                                c.setQuantity(c.getQuantity() - a.getQuantityBuy());
                                break loop2;
                            }else{
                                a.setQuantityBuy(a.getQuantityBuy() - c.getQuantity());
                                c.setQuantity(0);
                            }
                        }
                    }
                }
            }
        }
        List<WareHouse> wareHouses1 = wareHouses.stream().filter(i -> i.getQuantity() != 0).toList();
        System.out.println(wareHouses1);
    }
}