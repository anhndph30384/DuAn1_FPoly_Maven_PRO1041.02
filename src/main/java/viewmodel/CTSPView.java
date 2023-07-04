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
public class CTSPView {

    private String id;
    private String maSP;
    private String NSX;
    private String IMEI;
    private String dong;
    private String mausac;
    private String GPU;
    private String CPU;
    private String Chipset;
    private String OCung;
    private int RAM;
    private String HDH;
    private String DPG;
    private String thang;
    private String mota;
    private BigDecimal GN;
    private BigDecimal GB;
    private Date NgayTao;
    private Date NgaySua;
    private int TrangThai;

    public CTSPView(String id, String maSP, String NSX, String IMEI, String dong, String mausac, String GPU, String CPU, String Chipset, String OCung, int RAM, String HDH, String DPG, String thang, String mota, BigDecimal GN, BigDecimal GB, Date NgayTao, Date NgaySua, int TrangThai) {
        this.id = id;
        this.maSP = maSP;
        this.NSX = NSX;
        this.IMEI = IMEI;
        this.dong = dong;
        this.mausac = mausac;
        this.GPU = GPU;
        this.CPU = CPU;
        this.Chipset = Chipset;
        this.OCung = OCung;
        this.RAM = RAM;
        this.HDH = HDH;
        this.DPG = DPG;
        this.thang = thang;
        this.mota = mota;
        this.GN = GN;
        this.GB = GB;
        this.NgayTao = NgayTao;
        this.NgaySua = NgaySua;
        this.TrangThai = TrangThai;
    }

    public CTSPView(String maSP, String NSX, String IMEI, String dong, String mausac, String GPU, String CPU, String Chipset, String OCung, int RAM, String HDH, String DPG, String thang, String mota, BigDecimal GN, BigDecimal GB, Date NgayTao, Date NgaySua, int TrangThai) {
        this.maSP = maSP;
        this.NSX = NSX;
        this.IMEI = IMEI;
        this.dong = dong;
        this.mausac = mausac;
        this.GPU = GPU;
        this.CPU = CPU;
        this.Chipset = Chipset;
        this.OCung = OCung;
        this.RAM = RAM;
        this.HDH = HDH;
        this.DPG = DPG;
        this.thang = thang;
        this.mota = mota;
        this.GN = GN;
        this.GB = GB;
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

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getNSX() {
        return NSX;
    }

    public void setNSX(String NSX) {
        this.NSX = NSX;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public String getDong() {
        return dong;
    }

    public void setDong(String dong) {
        this.dong = dong;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getChipset() {
        return Chipset;
    }

    public void setChipset(String Chipset) {
        this.Chipset = Chipset;
    }

    public String getOCung() {
        return OCung;
    }

    public void setOCung(String OCung) {
        this.OCung = OCung;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getHDH() {
        return HDH;
    }

    public void setHDH(String HDH) {
        this.HDH = HDH;
    }

    public String getDPG() {
        return DPG;
    }

    public void setDPG(String DPG) {
        this.DPG = DPG;
    }

    public String getThang() {
        return thang;
    }

    public void setThang(String thang) {
        this.thang = thang;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public BigDecimal getGN() {
        return GN;
    }

    public void setGN(BigDecimal GN) {
        this.GN = GN;
    }

    public BigDecimal getGB() {
        return GB;
    }

    public void setGB(BigDecimal GB) {
        this.GB = GB;
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
        return "CTHDDomain{" + "id=" + id + ", maSP=" + maSP + ", NSX=" + NSX + ", IMEI=" + IMEI + ", dong=" + dong + ", mausac=" + mausac + ", GPU=" + GPU + ", CPU=" + CPU + ", Chipset=" + Chipset + ", OCung=" + OCung + ", RAM=" + RAM + ", HDH=" + HDH + ", DPG=" + DPG + ", thang=" + thang + ", mota=" + mota + ", GN=" + GN + ", GB=" + GB + ", NgayTao=" + NgayTao + ", NgaySua=" + NgaySua + ", TrangThai=" + TrangThai + '}';
    }

}
