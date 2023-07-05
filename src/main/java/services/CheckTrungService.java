/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import repository.CheckTrungRepoditory;

/**
 *
 * @author ADMIN
 */
public class CheckTrungService {
    public static  Integer checkTrung(String ma,String bang,String tenCot){
        return CheckTrungRepoditory.checkTrung(ma, bang, tenCot);
    }
}
