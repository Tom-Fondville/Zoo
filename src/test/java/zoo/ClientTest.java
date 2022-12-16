package zoo;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    public void visite(){
        Client client = new Client(1,new BigDecimal(100),1);
        client.addVisite(new Infrastructure("La lure", 200, new BigDecimal(100) ));


        assertEquals(1,client.getInfrastructureVisitee().size());
        assertEquals("La lure",client.getInfrastructureVisitee().get(0).getNom());

    }

}