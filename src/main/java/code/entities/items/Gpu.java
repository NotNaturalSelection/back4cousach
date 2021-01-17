package code.entities.items;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "gpus", schema = "s265482")
public class Gpu extends Item {
    @Column(name = "core_speed_mhz")
    private int coreSpeedMHz;
    @Column(name = "memory_speed_mhz")
    private int memorySpeedMHz;
    @Column(name = "memory_size_gb")
    private int memorySizeGB;

    @Column(name = "power")
    private int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getCoreSpeedMHz() {
        return coreSpeedMHz;
    }

    public void setCoreSpeedMHz(int coreSpeedMHz) {
        this.coreSpeedMHz = coreSpeedMHz;
    }

    public int getMemorySpeedMHz() {
        return memorySpeedMHz;
    }

    public void setMemorySpeedMHz(int memorySpeedMHz) {
        this.memorySpeedMHz = memorySpeedMHz;
    }

    public int getMemorySizeGB() {
        return memorySizeGB;
    }

    public void setMemorySizeGB(int memorySizeGB) {
        this.memorySizeGB = memorySizeGB;
    }

}
