package com.example.khiem_1000_bai_tap.mangHS_bai115;

public class HocSinh {
    private String hoTen;
    public float diemToan;
    public float diemVan;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String tenHs) {
        this.hoTen = tenHs;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float monToan) {
        diemToan = monToan;
    }

    public float getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(float monVan) {
        diemVan = monVan;
    }

    public float diemTb() {
        return (diemToan + diemVan) / 2;
    }


}
