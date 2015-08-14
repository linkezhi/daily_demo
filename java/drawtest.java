public class drawtest{
    public static void main(String[] args) {
        print(8);
    }
    public static void print(int r){
        //以（r，r）为远点
        int x = 0;
        int y = 0;
        int h = 2;
        int space = 0;
        for (int i=0;i<=r*2 ;i+=h ) {
            x=getx(r,y);
            System.out.print(getspace(x)+"*");//不输出换行符

            space=(r-x)*2;

            System.out.println(getspace(space)+"*");

            y+=h;
        }

    }


    public static int getx(int r ,int y){
        int h;
        double l;
        //获取打印点到圆心距离
        h= y-r;
        //获取打印点的x坐标
        l=Math.round(r-(Math.sqrt(r*r-h*h)));
        return (int) l;


    }


    public static String getspace(int x){
        String str="";
        for (int j=0;j<x;j++){
            str+=" ";
        }
        return str;

    }


}