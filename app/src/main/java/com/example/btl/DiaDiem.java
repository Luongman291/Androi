package com.example.btl;

public class DiaDiem {
    private int IdDiaDiem;
    private String TenDiaDiem,DiaChiCuThe,ThongTin;
    private float rate;

    public DiaDiem(int idDiaDiem, String tenDiaDiem, String diaChiCuThe, String thongTin, float rate) {
        this.IdDiaDiem = idDiaDiem;
        this.TenDiaDiem = tenDiaDiem;
        this.DiaChiCuThe = diaChiCuThe;
        this.ThongTin = thongTin;
        this.rate = rate;
    }

    public int getIdDiaDiem() {
        return IdDiaDiem;
    }

    public void setIdDiaDiem(int idDiaDiem) {
        IdDiaDiem = idDiaDiem;
    }

    public String getTenDiaDiem() {
        return TenDiaDiem;
    }

    public void setTenDiaDiem(String tenDiaDiem) {
        TenDiaDiem = tenDiaDiem;
    }

    public String getDiaChiCuThe() {
        return DiaChiCuThe;
    }

    public void setDiaChiCuThe(String diaChiCuThe) {
        DiaChiCuThe = diaChiCuThe;
    }

    public String getThongTin() {
        return ThongTin;
    }

    public void setThongTin(String thongTin) {
        ThongTin = thongTin;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }
}
