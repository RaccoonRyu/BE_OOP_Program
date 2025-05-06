package Java_Post_Advanced2.CH02_Collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int addCount) {
        Integer existCount = cartMap.getOrDefault(product, 0);
        // 상품이 존재하는지를 먼저 판단하고 상품이 하나도 없으면 count만큼 put하고, 존재하면 existCount에 count를 더한 만큼으로 개수 갱신
        cartMap.put(product, existCount + addCount);

    }

    public void minus(Product product, int minusCount) {
        Integer existCount = cartMap.getOrDefault(product, 0);
        Integer newCount = existCount - minusCount;
        if(newCount <= 0) { // 기존 수량보다 빼는 수량이 더 많은 경우 Cart에서 해당 상품 삭제
            cartMap.remove(product);
        } else {
            cartMap.put(product, newCount);
        }

    }

    public void printAll() {
        // 모든 상품 출력
        for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
            System.out.println("상품 : " + entry.getKey() + "수량 : " + entry.getValue());
        }
    }
}
