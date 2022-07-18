package prophet.practice.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor

public class ClientDTO {

    int id;
    String name;

}
