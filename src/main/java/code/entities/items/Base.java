package code.entities.items;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bases", schema = "s265482")
public class Base extends Item {
    @Column(name = "gpu_allowed")
    private boolean gpuAllowed;
    @JoinColumn(name = "display_id", referencedColumnName = "id")
    @OneToOne(targetEntity = Display.class)
    private Display display;
    @JoinColumn(name = "cpu_id", referencedColumnName = "id")
    @OneToOne(targetEntity = Cpu.class)
    private Cpu cpu;
    @Column(name = "drive_slots")
    private int driveSlots;
    @Column(name = "ram_slots")
    private int ramSlots;
    @Column(name = "name")
    private String name;

    public boolean isGpuAllowed() {
        return gpuAllowed;
    }

    public void setGpuAllowed(boolean gpuAllowed) {
        this.gpuAllowed = gpuAllowed;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public int getDriveSlots() {
        return driveSlots;
    }

    public void setDriveSlots(int driveSlots) {
        this.driveSlots = driveSlots;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
