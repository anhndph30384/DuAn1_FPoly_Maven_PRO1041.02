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
public class NSXView {

    private String id;
    private String ma;
    private String ten;
    private String qg;
    private Date NgayTao;
    private Date NgaySua;
    private int TrangThai;

    public NSXView() {
    }

    public NSXView(String id, String ma, String ten, String qg, Date NgayTao, Date NgaySua, int TrangThai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.qg = qg;
        this.NgayTao = NgayTao;
        this.NgaySua = NgaySua;
        this.TrangThai = TrangThai;
    }

    public NSXView(String ma, String ten, String qg, Date NgayTao, Date NgaySua, int TrangThai) {
        this.ma = ma;
        this.ten = ten;
        this.qg = qg;
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

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getQg() {
        return qg;
    }

    public void setQg(String qg) {
        this.qg = qg;
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
        return "SanPhamDomain{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + ", NgayTao=" + NgayTao + ", NgaySua=" + NgaySua + ", TrangThai=" + TrangThai + '}';
    }

}
