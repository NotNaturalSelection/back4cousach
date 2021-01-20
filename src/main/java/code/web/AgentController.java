package code.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import code.entities.Agent;
import code.entities.Shipment;
import code.repositories.AgentsRepository;
import code.repositories.ShipmentRepository;

@CrossOrigin
@RestController
@RequestMapping(value = "/agent")
public class AgentController {

    @Autowired
    private ShipmentRepository shipmentRepository;
    @Autowired
    private AgentsRepository agentsRepository;

    private void validatePassword(int id, String md5)
            throws AccessException {
        Agent agent = agentsRepository.findById(id);
        if (agent == null) {
            throw new AccessException("User with id="+id+" does not exist");
        }
        if (!agent.getMd5().equals(md5)) {
            throw new AccessException("Wrong password for user with id="+id);
        }
    }

    @PostMapping("/login")
    public Agent login(int id, String md5)
            throws AccessException {
        validatePassword(id, md5);
        return new Agent(id, md5);
    }

    @GetMapping("/shipments")
    public Page<Shipment> getShipments(
            @PageableDefault(page = 0, size = 10)
                    Pageable pageable,
            @RequestParam
                    int id,
            @RequestParam
                    String md5
    )
            throws AccessException {
        validatePassword(id, md5);
        return shipmentRepository.findAll(pageable);
    }

    @PostMapping("/shipments/confirm")
    public void confirmShipment(
            @RequestParam
                    int part_number,
            @RequestParam
                    int id,
            @RequestParam
                    String md5
    )
            throws AccessException {
        validatePassword(id, md5);
        shipmentRepository.confirmIncome(part_number);
    }
}
