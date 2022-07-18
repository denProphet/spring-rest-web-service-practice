package prophet.practice.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import prophet.practice.web.model.ClientDTO;
import prophet.practice.web.service.api.ClientService;


@RestController
@AllArgsConstructor
public class ClientController {

    /**
     * Делаем инькцию по интерефейсу
     **/
    private ClientService service;

    /**
     * Get-запрос по рут ендоинту
     * Требуем параметр id из front, передаем в метод getCustomer (Back),
     * Возвращаем Клиета по id из метода сервис
     **/
    @GetMapping("/client")
    public ClientDTO getCustomer(@RequestParam  int id) {
        return service.getClient(id);
    }

    /**
     * Post-запрос по рут ендоинту
     * Требуем параметры id,name из front, передаем в метод addCustomer (Back),
     * добавляенм Клиета через метод сервис
     **/
    @PostMapping("/client")
    public void addCustomer(@RequestParam int id,
                            @RequestParam String name) {
        service.addClient(id, name);
    }

}
