package buiduythanh.edu.model;

import java.io.Serializable;

public class BaiHat implements Serializable {
    int ma;
    String ten;
    String caSi;

    public BaiHat() {
    }

    public BaiHat(int ma, String ten, String caSi) {
        this.ma = ma;
        this.ten = ten;
        this.caSi = caSi;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCaSi() {
        return caSi;
    }

    public void setCaSi(String caSi) {
        this.caSi = caSi;
    }
}
