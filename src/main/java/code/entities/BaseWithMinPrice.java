package code.entities;

import code.entities.items.Base;

public class BaseWithMinPrice extends Base {
    private int minPrice;

    public int getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public BaseWithMinPrice(Base base, int minPrice) {
        setGpuAllowed(base.isGpuAllowed());
        setImgUrl(base.getImgUrl());
        setPrice(base.getPrice());
        setCpuMaxTdp(base.getCpuMaxTdp());
        setGpuMaxPower(base.getGpuMaxPower());
        setDisplaySize(base.getDisplaySize());
        setDriveSlots(base.getDriveSlots());
        setRamForm(base.getRamForm());
        setRamSlots(base.getRamSlots());
        setId(base.getId());
        setPart_number(base.getPart_number());
        setName(base.getName());
        this.minPrice = minPrice;
    }
}
