package code.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import code.entities.CompatibleComponents;
import code.entities.Shipment;
import code.repositories.BaseRepository;
import code.repositories.CpuRepository;
import code.repositories.DisplayRepository;
import code.repositories.DriveRepository;
import code.repositories.GpuRepository;
import code.repositories.RamRepository;
import code.repositories.ShipmentRepository;

@Service
public class ComponentsService {
    @Autowired
    private BaseRepository baseRepository;

    @Autowired
    private CpuRepository cpuRepository;

    @Autowired
    private DisplayRepository displayRepository;

    @Autowired
    private DriveRepository driveRepository;

    @Autowired
    private GpuRepository gpuRepository;

    @Autowired
    private RamRepository ramRepository;

    @Autowired
    private ShipmentRepository shipmentRepository;

    public CompatibleComponents findCompatibleForBase(int baseId) {
        CompatibleComponents result = new CompatibleComponents();
        List<Integer> inStockPartNumbers = shipmentRepository
                .findAllByCountLeftIsGreaterThan(0)
                .stream()
                .map(Shipment::getPartNumber)
                .collect(Collectors.toList());


        result.setBase(baseRepository.findById(baseId));

        result.setCpus(cpuRepository.whereTdpLessThanAndInStock(result.getBase().getCpuMaxTdp(), inStockPartNumbers));
        result.setGpus(gpuRepository.wherePowerLessThanAndInStock(result.getBase().getGpuMaxPower(), inStockPartNumbers));
        result.setRam(ramRepository.findAllByFormInStock(result.getBase().getRamForm(), inStockPartNumbers));
        result.setDisplays(displayRepository.findAllBySizeInchesInStock(result.getBase().getDisplaySize(), inStockPartNumbers));
        result.setDrives(driveRepository.findInStock(inStockPartNumbers));
        return result;
    }
}
