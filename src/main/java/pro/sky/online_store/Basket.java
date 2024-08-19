package pro.sky.online_store;


import org.springframework.stereotype.Component;

import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
@SessionScope
public class Basket {
    private final List <Integer> idProduct;
    private final List <Basket> myBasket = new ArrayList<>();

    public Basket(List<Integer> idProduct) {
        this.idProduct = idProduct;
    }

    public List<Basket> getMyBasket() {
        return myBasket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return idProduct == basket.idProduct;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idProduct);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "idProduct=" + idProduct +
                '}';
    }

    public List<Integer> getIdProduct() {
        return idProduct;
    }

    public void addProduct(List <Integer> idProduct) {
        Basket basket = new Basket(idProduct);
        myBasket.add(basket);
    }

    public List <Basket> getProduct () {
        return myBasket;
    }

}
