package com.hoctienganh.demo2;

public class ListBuaSang {
    private String monAn;
    private String kcal;

    public ListBuaSang(String monAn, String kcal) {
        this.monAn = monAn;
        this.kcal = kcal;
    }

    public String getMonAn() {
        return monAn;
    }

    public void setMonAn(String monAn) {
        this.monAn = monAn;
    }

    public String getKcal() {
        return kcal;
    }

    public void setKcal(String kcal) {
        this.kcal = kcal;
    }
}
