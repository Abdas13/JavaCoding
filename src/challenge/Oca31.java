package challenge;

public class Oca31 {
    public static void main(String[] args) {
        boolean keepgoing=true;
        int count=0;
        int x=3;

        while (count++<3){
            int y=(1+2*count)%3;
            switch (y){
                default:
                case 1: x-=1; break;
                case 2: x+=5;
            }
        }
        System.out.println(x);
    }
}
