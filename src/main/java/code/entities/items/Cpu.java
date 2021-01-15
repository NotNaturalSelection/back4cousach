package code.entities.items;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cpus", schema = "s265482")
public class Cpu extends Item {

    @Column(name = "model")
    private String model;

    @OneToOne(targetEntity = Gpu.class)
    @JoinColumn(name = "integrated_gpu_id", referencedColumnName = "id")
    private Gpu integratedGpu;

    @Column(name = "core_speed_mhz")
    private double speed;

    @Column(name = "core_number")
    private int coreNumber;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Gpu getIntegratedGpu() {
        return integratedGpu;
    }

    public void setIntegratedGpu(Gpu integratedGpu) {
        this.integratedGpu = integratedGpu;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getCoreNumber() {
        return coreNumber;
    }

    public void setCoreNumber(int coreNumber) {
        this.coreNumber = coreNumber;
    }
}
