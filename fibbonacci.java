package podstawy;

public class fibbonacci {
    public static void main(String[] args) {
        int zm1, zm2, x;
        zm1 = 0;
        zm2 = 1;
        for(int i=1;i<15;i++){
            x=zm1+zm2;
            zm2=zm1;
            zm1=x;
            System.out.print(x+" ,");
        }
    }
}
