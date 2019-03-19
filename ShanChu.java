package com.chihuo;
import java.util.Scanner;

public class ShanChu{
    Scanner input = new Scanner(System.in);
    public void shanchu(ZhuTi zhu){
        System.out.println("***ɾ������***");
        System.out.println("������Ҫɾ���Ķ�����ţ�");
        int shan = input.nextInt();
        while (shan < 1 || shan >zhu.names.length){
            System.out.print("������Χ���޷�ɾ��,���������룺");
            shan = input.nextInt();
        }
        int s = shan - 1;
        if (zhu.names[s] != null || zhu.zhuangTai[s] == 1){
            System.out.println("ɾ���ɹ���");
            zhu.names[s] = null;
            zhu.dishNames[s] = null;
            zhu.times[s] = 0;
            zhu.addresses[s] = null;
            zhu.money[s] = 0.0;
            zhu.zhuangTai[s] = 0;
        }else if(zhu.names[s] != null || zhu.zhuangTai[s] == 0){
            System.out.println("��ѡ��Ķ���δǩ�գ�����ɾ��");
        }
    }
}