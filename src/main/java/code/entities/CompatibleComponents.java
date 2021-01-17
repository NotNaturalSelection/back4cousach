package code.entities;

import java.util.ArrayList;
import java.util.List;

import code.entities.items.Base;
import code.entities.items.Cpu;
import code.entities.items.Display;
import code.entities.items.Drive;
import code.entities.items.Gpu;
import code.entities.items.Ram;

public class CompatibleComponents {
    private Base base;

    private List<Cpu> cpus = new ArrayList<>();

    private List<Gpu> gpus = new ArrayList<>();

    private List<Ram> ram = new ArrayList<>();

    private List<Drive> drives = new ArrayList<>();

    private List<Display> displays = new ArrayList<>();

//    private List<Integer> missingPartNumbers = new ArrayList<>();

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public List<Cpu> getCpus() {
        return cpus;
    }

    public void setCpus(List<Cpu> cpus) {
        this.cpus = cpus;
    }

    public List<Gpu> getGpus() {
        return gpus;
    }

    public void setGpus(List<Gpu> gpus) {
        this.gpus = gpus;
    }

    public List<Ram> getRam() {
        return ram;
    }

    public void setRam(List<Ram> ram) {
        this.ram = ram;
    }

    public List<Drive> getDrives() {
        return drives;
    }

    public void setDrives(List<Drive> drives) {
        this.drives = drives;
    }

    public List<Display> getDisplays() {
        return displays;
    }

    public void setDisplays(List<Display> displays) {
        this.displays = displays;
    }

//    public List<Integer> getMissingPartNumbers() {
//        return missingPartNumbers;
//    }
//
//    public void setMissingPartNumbers(List<Integer> missingPartNumbers) {
//        this.missingPartNumbers = missingPartNumbers;
//    }
}
