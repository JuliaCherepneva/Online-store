package pro.sky.online_store;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StoreService {
    Basket add(List <Integer> idProduct);
    List<Basket> get ();

}
