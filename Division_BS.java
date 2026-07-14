import java.util.Scanner;

public class Division_BS {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int numerator=sc.nextInt();
        int denominator=sc.nextInt();
        
        int nc=0;
        if(numerator<0){
            nc++;
            numerator=-1*numerator;
        }
        if(denominator<0){
            nc++;
            denominator=-1*denominator;
        }
        float l=0;
        float r=numerator;
        float p=0;
        while(l<=r){
            p=(l+r)/2;
            if((p*denominator)==numerator){
                break;
            }
            else if((p*denominator)>numerator){
                r=p;
            }
            else{
                l=p;
            }
        }
        if(nc==2 || nc==0){
            System.out.println(p);
        }
        else{

            System.out.println(p*-1);
        }
        sc.close();
    
    }
}
