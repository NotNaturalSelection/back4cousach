package code.entities.items;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "displays", schema = "s265482")
public class Display extends Item {
    @Column(name = "size_inches")
    private double sizeInches;
    @Column(name = "resolution")
    private String resolution;
    @Column(name = "display_type")
    private String displayType;

    public double getSizeInches() {
        return sizeInches;
    }

    public void setSizeInches(double sizeInches) {
        this.sizeInches = sizeInches;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }
}
