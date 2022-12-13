package seminars.second.simple_shopping_cart;

import java.util.List;
import java.util.Scanner;

public class UI {
    Cart cart = new Cart();
    private int userChoice = 0;

    public UI() {
        menu();
    }

    public void startScreen() {
        System.out.println("1. Показать список доступных продуктов");
        System.out.println("2. Перейти в корзину");
        System.out.println("0. Выход");
    }

    public void storeProductsMenu() {
        System.out.println("1. Добавить в корзину");
        System.out.println("2. Удалить из корзины");
        System.out.println("0. Выход");
    }

    public void menu() {
        do {
            startScreen();
            getUserInput();

            switch (userChoice) {
                case 1:
                    displayStoreProducts();
                    storeProductsMenu();
                    getUserInput();
                    innerChoice();
                    break;
                case 2:
                    showCart();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:

                    break;
            }
        } while (userChoice != 0);
    }

    private void innerChoice() {
        switch (userChoice) {
            case 1:
                addProductToCart();
                showCart();
                break;
            case 2:
                removeProductFromCart();
                break;
            default:

                break;
        }
    }

    private int getUserInput() throws NumberFormatException {
        Scanner in = new Scanner(System.in);
        userChoice = Integer.parseInt(in.nextLine());
        return userChoice;
    }

    private void displayStoreProducts() {
        List<Product> products = new Products().getProducts();
        for (Product prod : products) {
            System.out.println(
                    prod.getPid() + " - " +
                            prod.getName() + " " +
                            "| " + prod.getPrice() + "р. " +
                            "| " + prod.getStock() + "шт. "
            );
        }
    }

    private void addProductToCart() {
        int pid = getUserInput();
        cart.addProductToCartByPID(pid);
    }

    private void showCart() {
        cart.printCartItems();
    }

    private void removeProductFromCart() {
        int pid = getUserInput();
        cart.removeProductByPID(pid);
    }
}
