package com.chihuo;
import java.util.Scanner;
public class ChiHuo{
    public static void main(String[] args){
        ZhuTi zhu = new ZhuTi();
        Scanner input = new Scanner(System.in);
        ZhuCaiDan cai = new ZhuCaiDan();
        DinCan dincan = new DinCan();
        ChaKan chakan = new ChaKan();
        ShanChu shanchu = new ShanChu();
        CaiPin caipin = new CaiPin();
        PanDuan panduan = new PanDuan();
        panduan.panduan(zhu,cai,dincan,chakan,shanchu,caipin);
        
        System.out.println("ллʹ�ã��ټ���");
    }
}