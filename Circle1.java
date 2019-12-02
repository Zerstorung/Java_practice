import java.util.*;
public class Circle1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        计算一个数的阶乘
/*        System.out.println("请输入你想阶乘的正整数");
        int a = input.nextInt();
        if(0<a){
            int b = a;
            do {
                b = b * (--a);
                System.out.println(b);
            }while (2<a);
        } else{
            System.out.println("error");
        }
*/
//        计算第一个数到第二个数之间所有整数的和（可类其他运算）
/*        System.out.println("请输入一个数作为起点");
        int a = input.nextInt();
        System.out.println("请输入第二个数作为终点，需大于第一个数");
        int b = input.nextInt();
        if(a<b){
            int i = a;  //记录总数
            while (a<b){
                a = a+1;
                i = i + a;
            }
            System.out.println("结果为："+i);
        }else {
            System.out.println("error");
        }
*/
//阶乘求和
/*        System.out.println("请输入一个数作为起点");
        int a = input.nextInt();
        System.out.println("请输入第二个数作为终点，需大于第一个数");
        int b = input.nextInt();
        int num = 0;//记录总数
        do {
            int k = 1;
            int r = 1;
            while (k<=a) {      //对比输入值获得自增，自增值对比输入值
                r *= k;
                k++;
                }
                num += r;
                a++;
        }while (a<=b);
        System.out.println("总数"+num);
*/
//斐波那契数列
/*        System.out.println("请输入斐波那契数列个数");
        int a = input.nextInt();
        int b = 1;
        int b1 = 1;
        int c = 0;
        if (a<=2){
            System.out.println("第"+a+"个斐波那契数列的值为1");
        }else {
            for (int i = 2; i < a; i++) {
                c = b + b1;
                b = b1;
                b1 = c;
            }
            System.out.println("第" + a + "个斐波那契数列的值为" + c);
        }
*/
//打印乘法表
/*        for (int a = 1;a<= 9;a++){
            for (int b = 1;b<=a;b++) {
                System.out.print(b+"*"+a+"="+(a*b)+"  ");
            }
            System.out.println();
        }
*/
//倒叙打印星号
/*        for(int a = 1;a<=5;a++){
            for (int b = 5;b>0;b--){
                if (b<=a){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
*/
//打印金字塔
        for (int a = 1;a<=5;a++){
            for(int b =a;b<5;b++){
                System.out.print(" ");
            }
            for (int b=1;b<=a*2-1;b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}