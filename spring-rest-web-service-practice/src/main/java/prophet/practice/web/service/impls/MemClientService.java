package prophet.practice.web.service.impls;

import org.springframework.stereotype.Service;
import prophet.practice.web.model.ClientDTO;
import prophet.practice.web.service.api.ClientService;

import java.util.HashMap;
import java.util.Map;

@Service
public class MemClientService implements ClientService {
    Map<Integer, ClientDTO> persist = new HashMap<>();

    @Override
    public void addClient(int id, String name) {
        persist.put(id, new ClientDTO(id, name));
    }

    @Override
    public ClientDTO getClient(int id) {
        return persist.get(id);
    }
}
