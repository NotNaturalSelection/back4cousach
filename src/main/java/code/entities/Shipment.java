package code.entities;

import java.time.Duration;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shipments", schema = "s265482")
public class Shipment {
    @Id
    @Column(name = "part_number")
    private int partNumber;

    @Column(name = "count_left")
    private int countLeft;

    @Column(name = "delivery_date", columnDefinition = "DATE")
    private LocalDate deliveryDate;

    @Column(name = "delivery_interval")
    private String deliveryInterval;

    @Column(name = "delivery_size")
    private int deliverySize;

    public int getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    public int getCountLeft() {
        return countLeft;
    }

    public void setCountLeft(int countLeft) {
        this.countLeft = countLeft;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryInterval() {
        return deliveryInterval;
    }

    public void setDeliveryInterval(String deliveryInterval) {
        this.deliveryInterval = deliveryInterval;
    }

    public int getDeliverySize() {
        return deliverySize;
    }

    public void setDeliverySize(int deliverySize) {
        this.deliverySize = deliverySize;
    }
}
