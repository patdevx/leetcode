public class Main {
    public static void main(String[] args) {
        //run(5);
        //a =1  num1= 1*2
        //a = 2 num2= 2*2
        //a = 3 num3 = (num1+num2)* 2
        //a= 4 num4= （num1+num2+num3)*2

        // 1 1 3 5 10
        // a== 1  num1 = 1;
        // a== 2  num2 = 1;
        // a== 3  num3 = num1+num2; 3
        // a== 4  num4 = num3+ num1+num2; 5
        // a== 5  num5 = num4+num3+ num1+num2; 10
        // a== 6  num6 = num5+num4+num3+ num1+num2; 20

        run2(5);
    }

    private static void run2(int a ){


    }

    static void run(int a ){
        if (a==1 || a ==2){
            return;
        }
        //大德 有个额外的1
        int b = 1;
        int c = 1;
        for(int i =3; i<=a; i++){

            int d = (1+b+c);
            c = b;
            b = d;


            System.out.print(i+"\t c:"+c +"\t tol:");

            System.out.println(d);
        }
    }



}