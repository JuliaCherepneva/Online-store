package pro.sky.online_store;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StoreService {
    List<Integer> add(List <Integer> idProduct);
    List<Integer> get ();

}
