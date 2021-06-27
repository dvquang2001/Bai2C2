package com.example.model;

public class Contact {
    private int hinhdaidien;
    private String ten;
    private int hinh;

    public Contact() {
    }

    public Contact(int hinhdaidien, String ten, int hinh) {
        this.hinhdaidien = hinhdaidien;
        this.ten = ten;
        this.hinh = hinh;
    }

    public int getHinhdaidien() {
        return hinhdaidien;
    }

    public void setHinhdaidien(int hinhdaidien) {
        this.hinhdaidien = hinhdaidien;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
