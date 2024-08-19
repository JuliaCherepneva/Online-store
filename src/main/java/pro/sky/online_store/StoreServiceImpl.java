package pro.sky.online_store;

import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class StoreServiceImpl implements StoreService{
    private final Basket basket;

    public StoreServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public Basket add(List <Integer> idProduct){
        basket.addProduct(idProduct);
        return basket;

    }

    public Basket getBasket() {
        return basket;
    }

    @Override
    public List<Basket> get(){
        return basket.getProduct();
    }
}
