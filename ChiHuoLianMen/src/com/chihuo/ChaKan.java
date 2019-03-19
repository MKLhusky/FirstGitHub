package com.chihuo;
import java.util.Scanner;
public class ChaKan{
    Scanner input = new Scanner(System.in);
    public void chakan(ZhuTi zhu){
        String zhuang = "";
        System.out.println("***�鿴�ʹ�***");
        System.out.println("���\t������\t��Ʒ��Ϣ\t�Ͳ�ʱ��\t�Ͳ͵�ַ\t�ܽ��\t����״̬");
        for (int i = 0; i < zhu.names.length; i++){
            if (zhu.zhuangTai[i] == 0){
                zhuang = "��Ԥ��";
            }else{
                zhuang = "�����";
            }
            if (zhu.names[i] != null){
                System.out.println((i+1)+"\t"+zhu.names[i]+"\t"+zhu.dishNames[i]+"\t"+zhu.times[i]+"\t"+
                                zhu.addresses[i]+"\t\t"+zhu.money[i]+"\t"+zhuang);
            }
        }
    }
    
    
    public void qianshou(ZhuTi zhu){
        System.out.println("***ǩ�ն���***");
        System.out.print("��ѡ��Ҫǩ�յĶ�����ţ�");
        int xuHao = input.nextInt();
        while (xuHao < 1 || xuHao >zhu.names.length){
            System.out.print("������Χ���޷�ǩ��,���������룺");
            xuHao = input.nextInt();
        }
        if (zhu.names[xuHao-1] != null && zhu.zhuangTai[xuHao-1] == 0){
            zhu.zhuangTai[xuHao-1] = 1;
            System.out.println("����ǩ����ɣ���");
        }else{
            System.out.println("������ǩ�գ��벻Ҫ�ظ�ǩ��");
        }
        
    }
}