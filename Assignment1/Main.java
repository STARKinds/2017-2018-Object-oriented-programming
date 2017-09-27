import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("请输入红包总金额：");
    Double money = s.nextDouble();
    System.out.print("请输入红包数：");
    int num = s.nextInt();
    Luckmoney run=new Luckmoney();
    run.set(money,num);
    int i;
    for(i=0;i<num;i++)
        run.go();
    }
    }

class Luckmoney{
    double money;
    int num;
    public void set(double total_in, int count_in){
        money=total_in;
        num=count_in;
    }
    public void go(){
        if (num<=1){
            System.out.println(Math.floor(money*100)/100 + "元");
            return;
        }
        Random r =new Random();
        double min = 0.01;
        double max = 2 * money / num;
        double money_out = r.nextDouble()* max;
        money_out=(money_out<=min)?min:money_out;
        money_out=Math.floor(money_out*100)/100;
        System.out.println(money_out + "元");
        money=money-money_out;
        num--;
        }
    }
