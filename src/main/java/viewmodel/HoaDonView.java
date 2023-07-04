/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel;

import domainmodel.*;
import java.sql.Date;

/**
 *
 * @author portg
 */
public class HoaDonView {

    private String id;
    private String maNV;
    private String maKH;
    private String ma;
    private Date NgayTT;
    private Date NgayTao;
    private Date NgaySua;
    private int TrangThai;

    public HoaDonView() {
    }

    public HoaDonView(String id, String maNV, String maKH, String ma, Date NgayTT, Date NgayTao, Date NgaySua, int TrangThai) {
        this.id = id;
        this.maNV = maNV;
        this.maKH = maKH;
        this.ma = ma;
        this.NgayTT = NgayTT;
        this.NgayTao = NgayTao;
        this.NgaySua = NgaySua;
        this.TrangThai = TrangThai;
    }

    public HoaDonView(String maNV, String maKH, String ma, Date NgayTT, Date NgayTao, Date NgaySua, int TrangThai) {
        this.maNV = maNV;
        this.maKH = maKH;
        this.ma = ma;
        this.NgayTT = NgayTT;
        this.NgayTao = NgayTao;
        this.NgaySua = NgaySua;
        this.TrangThai = TrangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public Date getNgayTT() {
        return NgayTT;
    }

    public void setNgayTT(Date NgayTT) {
        this.NgayTT = NgayTT;
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
        return "HoaDonDomain{" + "id=" + id + ", maNV=" + maNV + ", maKH=" + maKH + ", ma=" + ma + ", NgayTT=" + NgayTT + ", NgayTao=" + NgayTao + ", NgaySua=" + NgaySua + ", TrangThai=" + TrangThai + '}';
    }

}
