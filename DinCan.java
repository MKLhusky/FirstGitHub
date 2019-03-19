package com.chihuo;
import java.util.Scanner;


public class DinCan{
    public void dincan(ZhuTi zhu){
        Scanner input = new Scanner(System.in);
        CaiPin cai = new CaiPin();
        boolean boo = false;
        for (int i = 0; i < zhu.names.length; i++){
            if (zhu.names[i] == null){
                boo = true;
                System.out.println("***��Ҫ����***");
                System.out.println("�����붩����������");
                String name = input.next();
                cai.caipin(zhu);
                System.out.print("��ѡ����Ҫ��Ĳ�Ʒ��ţ�");
                int bianHao = input.nextInt();
                System.out.print("��ѡ������Ҫ�ķ�����");
                int fenShu = input.nextInt();
                System.out.print("�������Ͳ�ʱ��(�Ͳ�ʱ����10����20�������Ͳ�)");
                int time = input.nextInt();
                
                while(time < 10 || time > 20){
                    System.out.print("������������������룺");
                    time = input.nextInt();
                }
                
                System.out.print("�������Ͳ͵�ַ��");
                String address = input.next();
                System.out.println("���ͳɹ�");
            
                double zong = zhu.prices[bianHao-1] * fenShu;
                double canFei = zong > 50? 0 : 5;
                
                String dishs = zhu.dish[bianHao-1] + " "+fenShu+"��";
                System.out.println("�������ǣ�"+dishs);
                System.out.println("�Ͳ�ʱ�䣻"+time);
                System.out.println("�ͷѣ�"+zong+"Ԫ��"+"�Ͳͷ�"+canFei+"Ԫ��"+
                                    "�ܼƣ�"+(zong+canFei)+"Ԫ��");
                int b = bianHao-1;
            
                zhu.names[i] = name;
                zhu.times[i] = time;
                zhu.addresses[i] = address;
                zhu.money[i] = zong+canFei;
                zhu.dishNames[i] = dishs;
                break;
            }
        }
        if (!boo){
            System.out.println("�ʹ��������޷��ٶ�����");
        }
    }
}