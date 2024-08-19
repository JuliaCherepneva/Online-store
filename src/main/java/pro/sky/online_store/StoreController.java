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

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
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
