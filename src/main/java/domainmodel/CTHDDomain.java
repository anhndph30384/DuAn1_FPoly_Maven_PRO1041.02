/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodel;

import java.math.BigDecimal;
import java.sql.Date;

/**
 *
 * @author portg
 */
public class CTHDDomain {

    private String idHD;
    private String idIMEI;
    private String idBH;
    private int soluong;
    private BigDecimal donGia;
    private int sale;
    private BigDecimal thanhTien;
    private Date NgayTao;
    private Date NgaySua;
    private int TrangThai;

    public CTHDDomain(String idHD, String idIMEI, String idBH, int soluong, BigDecimal donGia, int sale, BigDecimal thanhTien, Date NgayTao, Date NgaySua, int TrangThai) {
        this.idHD = idHD;
        this.idIMEI = idIMEI;
        this.idBH = idBH;
        this.soluong = soluong;
        this.donGia = donGia;
        this.sale = sale;
        this.thanhTien = thanhTien;
        this.NgayTao = NgayTao;
        this.NgaySua = NgaySua;
        this.TrangThai = TrangThai;
    }

    public CTHDDomain(String idIMEI, String idBH, int soluong, BigDecimal donGia, int sale, BigDecimal thanhTien, Date NgayTao, Date NgaySua, int TrangThai) {
        this.idIMEI = idIMEI;
        this.idBH = idBH;
        this.soluong = soluong;
        this.donGia = donGia;
        this.sale = sale;
        this.thanhTien = thanhTien;
        this.NgayTao = NgayTao;
        this.NgaySua = NgaySua;
        this.TrangThai = TrangThai;
    }

    public String getIdHD() {
        return idHD;
    }

    public void setIdHD(String idHD) {
        this.idHD = idHD;
    }

    public String getIdIMEI() {
        return idIMEI;
    }

    public void setIdIMEI(String idIMEI) {
        this.idIMEI = idIMEI;
    }

    public String getIdBH() {
        return idBH;
    }

    public void setIdBH(String idBH) {
        this.idBH = idBH;
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
        return "CTHDDomain{" + "idHD=" + idHD + ", idIMEI=" + idIMEI + ", idBH=" + idBH + ", soluong=" + soluong + ", donGia=" + donGia + ", sale=" + sale + ", thanhTien=" + thanhTien + ", NgayTao=" + NgayTao + ", NgaySua=" + NgaySua + ", TrangThai=" + TrangThai + '}';
    }

}
