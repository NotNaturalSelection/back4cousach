package code.entities.items;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "drives", schema = "s265482")
public class Drive extends Item {
    @Column(name = "form")
    private String form;
    @Column(name = "is_ssd")
    private boolean isSsd;
    @Column(name = "read_speed_gbs")
    private int readSpeedGBs;
    @Column(name = "write_speed_gbs")
    private int writeSpeedGBs;

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public boolean isSsd() {
        return isSsd;
    }

    public void setSsd(boolean ssd) {
        isSsd = ssd;
    }

    public int getReadSpeedGBs() {
        return readSpeedGBs;
    }

    public void setReadSpeedGBs(int readSpeedGBs) {
        this.readSpeedGBs = readSpeedGBs;
    }

    public int getWriteSpeedGBs() {
        return writeSpeedGBs;
    }

    public void setWriteSpeedGBs(int writeSpeedGBs) {
        this.writeSpeedGBs = writeSpeedGBs;
    }

}
