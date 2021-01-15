package code.entities.items;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ram", schema = "s265482")
public class Ram extends Item {
    @Column(name = "type")
    private String type;
    @Column(name = "size_gb")
    private int sizeGB;
    @Column(name = "form")
    private String form;
    @Column(name = "speed_mhz")
    private int speedMHz;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSizeGB() {
        return sizeGB;
    }

    public void setSizeGB(int sizeGB) {
        this.sizeGB = sizeGB;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public int getSpeedMHz() {
        return speedMHz;
    }

    public void setSpeedMHz(int speedMHz) {
        this.speedMHz = speedMHz;
    }
}
