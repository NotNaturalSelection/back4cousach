package code.entities.items;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bases", schema = "s265482")
public class Base extends Item {
    @Column(name = "gpu_allowed")
    private boolean gpuAllowed;
    @Column(name = "drive_slots")
    private int driveSlots;
    @Column(name = "ram_slots")
    private int ramSlots;
    @Column(name = "cpu_max_tdp")
    private int cpuMaxTdp;
    @Column(name = "gpu_max_power")
    private int gpuMaxPower;
    @Column(name = "display_size")
    private int displaySize;
    @Column(name = "ram_form")
    private String ramForm;
    @Column(name = "img_url")
    private String imgUrl;

    public String getRamForm() {
        return ramForm;
    }

    public void setRamForm(String ramForm) {
        this.ramForm = ramForm;
    }

    public int getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(int displaySize) {
        this.displaySize = displaySize;
    }

    public int getCpuMaxTdp() {
        return cpuMaxTdp;
    }

    public void setCpuMaxTdp(int cpuMaxTdp) {
        this.cpuMaxTdp = cpuMaxTdp;
    }

    public int getGpuMaxPower() {
        return gpuMaxPower;
    }

    public void setGpuMaxPower(int gpuMaxPower) {
        this.gpuMaxPower = gpuMaxPower;
    }

    public boolean isGpuAllowed() {
        return gpuAllowed;
    }

    public void setGpuAllowed(boolean gpuAllowed) {
        this.gpuAllowed = gpuAllowed;
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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
