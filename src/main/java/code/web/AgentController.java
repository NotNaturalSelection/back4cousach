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

@RestController
@RequestMapping(value = "/agent")
public class AgentController {

    @Autowired
    private ShipmentRepository shipmentRepository;
    @Autowired
    private AgentsRepository agentsRepository;

    private void validatePassword(int id, String md5)
            throws IllegalAccessException {
        Agent agent = agentsRepository.getOne(id);
        if (!agent.getMd5().equals(md5)) {
            throw new IllegalAccessException("Wrong password for user with id="+id);
        }
    }
    @CrossOrigin
    @PostMapping("/login")
    public Agent login(int id, String md5)
            throws IllegalAccessException {
        validatePassword(id, md5);
        return new Agent(id, md5);
    }
    @CrossOrigin
    @GetMapping("/shipments")
    public Page<Shipment> getShipments(
            @PageableDefault(page = 0, size = 10)
                    Pageable pageable,
            @RequestParam
                    int id,
            @RequestParam
                    String md5
    )
            throws IllegalAccessException {
        validatePassword(id, md5);
        return shipmentRepository.findAll(pageable);
    }

    @CrossOrigin
    @PostMapping("/shipments/confirm")
    public void confirmShipment(
            @RequestParam
                    int part_number,
            @RequestParam
                    int id,
            @RequestParam
                    String md5
    )
            throws IllegalAccessException {
        validatePassword(id, md5);
        shipmentRepository.confirmIncome(part_number);
    }
}
