import store.models.Bread;
import store.models.Chocolate;
import store.models.ProductForSale;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[5];
        products[0] = new Chocolate("sweet", 15.5,"milky", "white", Boolean.TRUE);
        products[1] = new Bread("baguette", 8,"wheat", "wheat", "brown");
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products){
            if (product != null){
                product.showDetails();
            }
        }
    }
}