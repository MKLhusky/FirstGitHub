package com.chihuo;
import java.util.Scanner;
public class PanDuan{
    Scanner input = new Scanner(System.in);
    public void panduan(ZhuTi zhu,ZhuCaiDan cai,DinCan dincan,ChaKan chakan,ShanChu shanchu,CaiPin caipin){
        int xuan = 0;
         do{
            //��ӡ���˵���Ϣ
            cai.zhucaidan();
            System.out.print("��ѡ��");
            xuan = input.nextInt();
            while (xuan < 1 || xuan > 6){
                System.out.print("������ѡ��");
                xuan = input.nextInt();
            }
            //�ж�ѡ��
            switch (xuan){
                case 1:
                    //��Ҫ����
                    // dincan.dincan(names,dishNames,times,addresses,money,dish,prices,zan);
                    dincan.dincan(zhu);
                    break;
                case 2:
                    //�鿴����
                    // chakan.chakan(names,dishNames,times,addresses,money,zhuangTai);
                    chakan.chakan(zhu);
                    break;
                case 3:
                    // ǩ�ն���
                    // chakan.qianshou(names, zhuangTai);
                    chakan.qianshou(zhu);
                    break;
                case 4:
                    // ɾ������
                    // shanchu.shanchu(names,dishNames,times,addresses,money,zhuangTai);
                    shanchu.shanchu(zhu);
                    break;
                case 5:
                    // ��Ҫ����
                    System.out.println("***��Ҫ����***");
                    caipin.caipin(zhu);                    
                    int xuan1 = input.nextInt();
                    caipin.caipin(zhu, xuan1);
                    // break;
                case 6:
                    //�˳�ϵͳ
                    break;
                default:
                    //�������
            }
            System.out.println("����0����,�����˳�ϵͳ");
            xuan = input.nextInt();
            
        }while(xuan == 0);
    }
}