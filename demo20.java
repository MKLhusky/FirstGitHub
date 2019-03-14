import java.util.Scanner;

public class demo20 {
    public static void main(String[] args) {
        //一、数据主体
        //订餐人 所定餐品信息 送餐时间 送餐地址 订单状态 总金额
        String names[] = new String[4];         //订单人姓名
        String dishNames[] = new String[4];     //菜名
        int times[] = new int[4];              //送餐时间
        String addresses[] = new String[4];     //送餐地址
        int zhuangTai[] = new int[4];          //订单状态
        double money[] = new double[4];       //总金额
        int jie = -1;                           //用户输入
        int num = -1;                           //用户输入退出
        int fenShu[] = new int[4];             //份数
        int zan[] = new int [4];               //点赞数

        //菜品信息
        String dish[] = {"红烧带鱼", "鱼香肉丝", "时令鲜蔬"};
        double danJia[] = {38.0, 20.0, 10.0};   //菜品价格
        Scanner input = new Scanner(System.in);
//        names[0] = "江小明";
//        dishNames[0] = "红烧鱼";
//        times[0] = 11;
//        addresses[0] = "清江浦区";
//        zhuangTai[0] = 0;

        //二、数据框架
        do{
//        循环
//        循环操作：
//        显示主菜单
            System.out.println("**********************************************");
            System.out.println("1,我要订餐");
            System.out.println("2,查看餐袋");
            System.out.println("3,签收订单");
            System.out.println("4,删除订单");
            System.out.println("5,我要点赞");
            System.out.println("6,退出系统");
            System.out.println("**********************************************");
//         选择一个功能编号
            System.out.print("请选择：");
            jie = input.nextInt();
            switch (jie){
                case 1:
                    //1，我要订餐
                    //显示菜品名
                    System.out.println("***我要订餐***");
                    int b = -1;                             //下标
                    boolean boo = false;                   //判断是否还有空的位置
                    for (int i = 0; i < names.length; i++){

                        //判断是否还有空的位置存放订单
                        if(names[i] == null){
                            boo = true;
                            System.out.println("请输入订餐人姓名：");
                            String name = input.next();

                            //打印菜品信息
                            System.out.println("序号\t" + "菜名\t\t\t" + "单价\t\t" + "点赞数");
                            for (int j = 0; j < danJia.length; j++) {
                                String jiaGe = danJia[j] + "元";
                                System.out.println((j+1) +"\t"+"\t" + dish[j] + "\t"+"\t" + jiaGe + "\t"+"\t" + zan[j]);
                            }
                            //用户录入信息
                            System.out.print("请选择您要点的菜品编号");
                            int hao = input.nextInt();
                            System.out.print("请选择您要点的份数");
                            int fen = input.nextInt();
                            System.out.print("请输入送餐时间(送餐时间是10点到12点整)");
                            int time = input.nextInt();
                            while (time < 10 || time > 12){
                                System.out.println("请输入送餐范围内的时间");
                                time = input.nextInt();
                            }
                            System.out.print("请输入送餐地址");
                            String address = input.next();
                            System.out.println("订餐成功！");

                            //打印用户录入的信息
                            String zong = dish[hao-1] + fen +"份";
                            double  canFei = danJia[hao-1] * fen;
                            double songFei = canFei > 50 ? 0 : 5;
                            System.out.println("您定的是："+zong);
                            System.out.println("送餐时间是："+time+"点");
                            System.out.println("餐费："+canFei+"元，送餐费："+songFei+"元，总计："+(canFei+songFei));

                            //将用户的信息存入系统
                            names[i] = name;
                            dishNames[i] = zong;
                            times[i] = time;
                            addresses[i] = address;
                            money[i] = canFei + songFei;
                            break;
                        }
                    }
                    if (!boo){
                        System.out.println("餐袋已满，不能再订单了！");
                    }

                    break;
                case 2:
                    //2，查看福袋
                    //遍历数组，判断订单状态
                    System.out.println("***查看福袋***");
                    System.out.println("序号"+"订餐人\t\t"+"餐品信息\t\t"+"送餐时间 "+"送餐地址\t"+"总金额\t"+"订单状态");
                    for (int i = 0; i < names.length; i++){
                        if (names[i] != null) {
                            String yuDin = zhuangTai[i] == 0 ? "已预订":"已完成";
                            System.out.println((i + 1) + "\t" + names[i] + "\t\t\t" + dishNames[i] + "\t\t" + times[i]
                                    + "\t\t " + addresses[i] + "\t\t" + money[i] + "元\t" + yuDin);
                        }
                    }
                    break;
                case 3:
                    //3，签收订单
                    //接收用户输入，判断订单是否已签收，将订单状态改变,
                    System.out.println("***签收订单***");
                    System.out.print("请输入要签收的订单");
                    int shuRu = input.nextInt();
                    if (names[shuRu-1] == null){
                        System.out.println("你要找的订单不存在！");
                        break;
                    }
                    if (zhuangTai[shuRu-1] == 0){
                        zhuangTai[shuRu-1] = 1;
                        System.out.println("签收成功！");
                    }else{
                        System.out.println("已签收过啦，请不要重复签收！");
                    }

                    break;
                case 4:
                    //4，删除订单
                    //接收用户输入
                    System.out.println("***删除订单***");
                    int end = names.length - 1;
                    System.out.print("请输入你要删除的订单编号");
                    int shuRu1 = input.nextInt();
                    if (names[shuRu1-1] != null && (shuRu1 >= 1 && shuRu1 < 4)){
                        if (zhuangTai[shuRu1-1] != 0){
                            for (int i = shuRu1-1; i < names.length-1; i++) {
                                names[i] = names[i+1];
                                dishNames[i] = dishNames[i+1];
                                times[i] = times[i+1];
                                addresses[i] = addresses[i+1];
                                money[i] = money[i+1];
                                zhuangTai[i] = zhuangTai[i+1];
                            }
                        }else{
                            System.out.println("您的订单还没有签收，无法删除！");
                            break;
                        }
                    }else{
                        System.out.println("您没有这个订单！");
                        break;
                    }
                    names[end] = null;
                    dishNames[end] = null;
                    times[end] = 0;
                    addresses[end] = null;
                    money[end] = 0.0;
                    zhuangTai[end] = 0;
                    System.out.println("删除订单完成！");

                    break;
                case 5:
                    //5，我要点赞
                    System.out.println("***我要点赞***");
                    //打印菜品信息
                    System.out.println("序号\t" + "菜名\t\t\t" + "单价\t\t" + "点赞数");
                    for (int j = 0; j < danJia.length; j++) {
                        String jiaGe = danJia[j] + "元";
                        System.out.println((j+1) +"\t"+"\t" + dish[j] + "\t"+"\t" + jiaGe + "\t"+"\t" + zan[j]);
                    }
                    System.out.print("请输入你要点赞的菜品编号：");
                    int shuRu2 = input.nextInt();
                    zan[shuRu2-1] += 1;
                    System.out.println("点赞成功!");
                    break;
                case 6:
                    //6，退出系统
                    break;
                default:
                    break;
            }
//         循环条件：输入0返回 或者0或者6或者以外的数字
            if (jie == 6){
                break;
            }else {
                while(num != 0) {
                    System.out.print("请输入0继续：");
                    num = input.nextInt();
                }
            }
        }while(num == 0);

        System.out.println("欢迎下次光临！");
    }
}
