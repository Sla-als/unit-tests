package seminars.first.Shop;

import java.util.*;

import static org.assertj.core.api.Assertions.*;

public class ShopTest {
    /*
    1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
    2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
    3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
    */

    private static List<Product> products = Arrays.asList(
            new Product("Apple", 100),
            new Product("Banana", 200),
            new Product("Orange", 150));
    private static Shop shop = new Shop(products);

    public static void main(String[] args) {
        testProductList();
        testGetMostExpensiveProduct();
        testSortProductsByPrice();
    }
    public static void testProductList() {
        assertThat(shop.getProducts()).hasSize(3);
    }

    public static void testGetMostExpensiveProduct() {
        assertThat(shop.getMostExpensiveProduct().getCost()).isEqualTo( 200);
        assertThat(shop.getMostExpensiveProduct().getTitle()).isEqualTo( "Banana");
    }
    public static void testSortProductsByPrice() {
         assertThat(shop.sortProductsByPrice().get(0).getCost()).isEqualTo(100);
         assertThat(shop.sortProductsByPrice().get(1).getCost()).isEqualTo(150);
         assertThat(shop.sortProductsByPrice().get(2).getCost()).isEqualTo(200);
    }
}