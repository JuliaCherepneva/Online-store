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
    public List<Integer> add(List <Integer> idProduct){
        basket.addProduct(idProduct);
        return idProduct;

    }


    @Override
    public List<Integer> get(){
        return basket.getProduct();
    }
}
