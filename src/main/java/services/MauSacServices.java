/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import RepositoryInterface.IMauSacReposytory;
import ServicesInterface.IMauSacSerivces;
import domainmodel.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
import repository.MauSacRepository;
import viewmodel.MauSacView;

/**
 *
 * @author ADMIN
 */
public class MauSacServices implements IMauSacSerivces {

    private final IMauSacReposytory reposytory = new MauSacRepository();

    @Override
    public List<MauSacView> getList() {
        List<MauSacDomain> lst = reposytory.getList();
        List<viewmodel.MauSacView> lst1 = new ArrayList<>();
        for (domainmodel.MauSacDomain a : lst) {
            lst1.add(new viewmodel.MauSacView(a.getId(), a.getMa(), a.getNgayTao(), a.getNgaySua(), a.getTrangThai()));
        }
        return lst1;
    }

    @Override
    public Integer them(MauSacView mau) {
        MauSacDomain mauS = new MauSacDomain(mau.getMa(),mau.getTen(),mau.getNgayTao(),mau.getNgaySua(), mau.getTrangThai());
        return reposytory.them(mauS);
    }

    @Override
    public Integer sua(MauSacView mau) {
        MauSacDomain mauS = new MauSacDomain(mau.getMa(),mau.getTen(),mau.getNgayTao(),mau.getNgaySua(), mau.getTrangThai());
        return reposytory.sua(mauS);
    }

    @Override
    public Integer xoa(String ma) {
        return reposytory.xoa(ma);
    }
}
