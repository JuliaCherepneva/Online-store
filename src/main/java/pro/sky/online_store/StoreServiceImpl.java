package pro.sky.online_store;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class StoreServiceImpl implements StoreService{
    private final List<Basket> myBasket = new ArrayList<>();
    private final Basket basket;

    public StoreServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public Basket add(List <Integer> idProduct){
        Basket basket = new Basket(idProduct);
        myBasket.add(basket);
        return basket;
    }

    @Override
    public List<Basket> get(){
        return myBasket;
    }
}
