package com.chihuo;
public class CaiPin{
    //��Ʒ��Ϣ
    public void caipin(ZhuTi zhu){
        System.out.println("���"+"\t"+"����"+"\t"+"����"+"\t"+"������");
        for (int i = 0; i < zhu.dish.length; i++){
            System.out.println("1\t"+zhu.dish[i]+"\t"+zhu.prices[i]+zhu.zan[i]);
        }
    }
    public void caipin(ZhuTi zhu, int xuan1){
        xuan1 -= 1;
        zhu.zan[xuan1] += 1;
        System.out.println("���޳ɹ���");
    }
    
}