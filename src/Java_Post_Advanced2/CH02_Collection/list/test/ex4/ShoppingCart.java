package Java_Post_Advanced2.CH02_Collection.list.test.ex4;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    // List를 사용하여 쇼핑 카트에 상품 담기
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    // 각 상품명 상품 합계와 전체 상품 가격의 합 출력
    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (Item item : items) {
            System.out.println("상품명 : " + item.getName() + ", 합계 : " + item.getTotalPrice());
        }
        System.out.println("전체 가격 합 : " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
