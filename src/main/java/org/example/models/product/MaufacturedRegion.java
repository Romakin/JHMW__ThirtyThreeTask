package org.example.models.product;

public enum MaufacturedRegion {
    ASIA("AS"),
    EUROPE("EU"),
    SOUTH_AMERICA("SA"),
    NORTH_AMERICA("NA"),
    AUSTRALIA("AU"),
    AFRICA("AF");

    String code;

    MaufacturedRegion(String af) {
        code = af;
    }

    public String getCode() {
        return code;
    }
}
