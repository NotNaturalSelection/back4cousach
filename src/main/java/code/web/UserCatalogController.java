package code.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public Page<Base> getBases(
            @PageableDefault(page = 0, size = 10)
                    Pageable pageable
    ) {
        return baseRepository.findAll(pageable);
    }
}
