package pro.sky.online_store;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class StoreController {
    private final StoreService storeService;
    private Basket basket;

    public StoreController(StoreService storeService, Basket basket) {
        this.storeService = storeService;
        this.basket = basket;
    }

    public StoreService getStoreService() {
        return storeService;
    }

    public Basket getBasket() {
        return basket;
    }

    @GetMapping (path = "/add")
    public Basket add(@RequestParam("idProduct") List <Integer> idProduct){
        return storeService.add(idProduct);
    }
    @GetMapping (path = "/get")
    public List<Basket> get(){
        return storeService.get();
    }

}
