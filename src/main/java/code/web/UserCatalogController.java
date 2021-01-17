package code.web;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import code.entities.BaseWithMinPrice;
import code.entities.items.Base;
import code.entities.items.Cpu;
import code.entities.items.Display;
import code.entities.items.Drive;
import code.entities.items.Gpu;
import code.entities.items.Ram;
import code.repositories.BaseRepository;
import code.repositories.CpuRepository;
import code.repositories.DisplayRepository;
import code.repositories.DriveRepository;
import code.repositories.GpuRepository;
import code.repositories.RamRepository;
import code.responseEntities.CompatibleComponents;
import code.services.ComponentsService;

@CrossOrigin
@RestController
@RequestMapping("/catalog")
public class UserCatalogController {
    @Autowired
    private CpuRepository cpuRepository;
    @Autowired
    private GpuRepository gpuRepository;
    @Autowired
    private DriveRepository driveRepository;
    @Autowired
    private RamRepository ramRepository;
    @Autowired
    private DisplayRepository displayRepository;
    @Autowired
    private BaseRepository baseRepository;
    @Autowired
    private ComponentsService componentsService;

    @GetMapping(value = "/cpus")
    public Page<Cpu> getCpus(
            @PageableDefault(page = 0, size = 10)
                    Pageable pageable
    ) {
        return cpuRepository.findAll(pageable);
    }

    @GetMapping(value = "/gpus")
    public Page<Gpu> getGpus(
            @PageableDefault(page = 0, size = 10)
                    Pageable pageable
    ) {
        return gpuRepository.findAll(pageable);
    }

    @GetMapping(value = "/drives")
    public Page<Drive> getDrives(
            @PageableDefault(page = 0, size = 10)
                    Pageable pageable
    ) {
        return driveRepository.findAll(pageable);
    }

    @GetMapping(value = "/ram")
    public Page<Ram> getRam(
            @PageableDefault(page = 0, size = 10)
                    Pageable pageable
    ) {
        return ramRepository.findAll(pageable);
    }

    @GetMapping(value = "/displays")
    public Page<Display> getDisplays(
            @PageableDefault(page = 0, size = 10)
                    Pageable pageable
    ) {
        return displayRepository.findAll(pageable);
    }

    @GetMapping(value = "/bases")
    public Page<BaseWithMinPrice> getBases(
            @PageableDefault(page = 0, size = 10)
                    Pageable pageable
    ) {
        Page<Base> bases = baseRepository.findAll(pageable);
        return new PageImpl<>(bases
                                      .getContent()
                                      .stream()
                                      .map(it -> new BaseWithMinPrice(it, componentsService.findBaseMinPrice(it.getId())))
                                      .collect(Collectors.toList()));
    }

    @GetMapping(value = "/bases/{id}")
    public CompatibleComponents getBase(
            @PathVariable(name = "id")
                    int id
    ) {
        return componentsService.findCompatibleForBase(id);
    }


}
