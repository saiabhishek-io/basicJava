package abhishek.io;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(canPack(1,0,4));
    }
    private static boolean canPack(int b, int s, int g){
        bigKg = b*5;
        smallKg = s*1;
        for ( int i =0; i<= g; i++){
            if ((i*bigKg + smallKg) == g){
                return true;
                break;}
            else if ((i*smallKg + bigKg) == g){
                return true;
                break;}
            else if (g<b || g<s){
                return false;
                break;}
            }
        }
    }
}
