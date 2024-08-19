package pro.sky.online_store;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;
import java.util.Objects;

@Component
@SessionScope
public class Basket {
    private final List <Integer> idProduct;

    public Basket(List<Integer> idProduct) {
        this.idProduct = idProduct;
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
}
