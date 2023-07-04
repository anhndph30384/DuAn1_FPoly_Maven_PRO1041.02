/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel;

import domainmodel.*;
import java.math.BigDecimal;
import java.sql.Date;

/**
 *
 * @author portg
 */
public class CTHDView {

    private String maHD;
    private String IMEI;
    private String maBH;
    private int soluong;
    private BigDecimal donGia;
    private int sale;
    private BigDecimal thanhTien;
    private Date NgayTao;
    private Date NgaySua;
    private int TrangThai;

    public CTHDView(String maHD, String IMEI, String maBH, int soluong, BigDecimal donGia, int sale, BigDecimal thanhTien, Date NgayTao, Date NgaySua, int TrangThai) {
        this.maHD = maHD;
        this.IMEI = IMEI;
        this.maBH = maBH;
        this.soluong = soluong;
        this.donGia = donGia;
        this.sale = sale;
        this.thanhTien = thanhTien;
        this.NgayTao = NgayTao;
        this.NgaySua = NgaySua;
        this.TrangThai = TrangThai;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public String getMaBH() {
        return maBH;
    }

    public void setMaBH(String maBH) {
        this.maBH = maBH;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public BigDecimal getDonGia() {
        return donGia;
    }

    public void setDonGia(BigDecimal donGia) {
        this.donGia = donGia;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public BigDecimal getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(BigDecimal thanhTien) {
        this.thanhTien = thanhTien;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public Date getNgaySua() {
        return NgaySua;
    }

    public void setNgaySua(Date NgaySua) {
        this.NgaySua = NgaySua;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public String toString() {
        return "CTHDView{" + "maHD=" + maHD + ", IMEI=" + IMEI + ", maBH=" + maBH + ", soluong=" + soluong + ", donGia=" + donGia + ", sale=" + sale + ", thanhTien=" + thanhTien + ", NgayTao=" + NgayTao + ", NgaySua=" + NgaySua + ", TrangThai=" + TrangThai + '}';
    }

}
