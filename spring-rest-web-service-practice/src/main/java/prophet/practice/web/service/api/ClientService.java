package prophet.practice.web.service.api;

import prophet.practice.web.model.ClientDTO;

public interface ClientService {

    void addClient(int id, String name);
    ClientDTO getClient(int id);
}
