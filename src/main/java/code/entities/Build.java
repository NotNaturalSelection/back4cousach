package code.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import code.entities.items.Base;
import code.entities.items.Drive;
import code.entities.items.Gpu;
import code.entities.items.Ram;

@Entity
@Table(name = "builds", schema = "s265482")
public class Build {
    @Id
    @Column(name = "id")
    private int id;

    @JoinColumn(name = "base_id", referencedColumnName = "id")
    @OneToOne(targetEntity = Base.class)
    private Base baseId;

    @JoinColumn(name = "gpu_id", referencedColumnName = "id")
    @OneToOne(targetEntity = Gpu.class)
    private Gpu gpuId;

    @JoinColumn(name = "ram1_id", referencedColumnName = "id")
    @OneToOne(targetEntity = Ram.class)
    private Ram ram1Id;

    @JoinColumn(name = "ram2_id", referencedColumnName = "id")
    @OneToOne(targetEntity = Ram.class)
    private Ram ram2Id;


    @OneToOne(targetEntity = Drive.class)
    @JoinColumn(name = "drive1_id", referencedColumnName = "id")
    private Drive drive1Id;

    @OneToOne(targetEntity = Drive.class)
    @JoinColumn(name = "drive2_id", referencedColumnName = "id")
    private Drive drive2Id;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Base getBaseId() {
        return baseId;
    }

    public void setBaseId(Base baseId) {
        this.baseId = baseId;
    }

    public Gpu getGpuId() {
        return gpuId;
    }

    public void setGpuId(Gpu gpuId) {
        this.gpuId = gpuId;
    }

    public Ram getRam1Id() {
        return ram1Id;
    }

    public void setRam1Id(Ram ram1Id) {
        this.ram1Id = ram1Id;
    }

    public Ram getRam2Id() {
        return ram2Id;
    }

    public void setRam2Id(Ram ram2Id) {
        this.ram2Id = ram2Id;
    }

    public Drive getDrive1Id() {
        return drive1Id;
    }

    public void setDrive1Id(Drive drive1Id) {
        this.drive1Id = drive1Id;
    }

    public Drive getDrive2Id() {
        return drive2Id;
    }

    public void setDrive2Id(Drive drive2Id) {
        this.drive2Id = drive2Id;
    }
}
