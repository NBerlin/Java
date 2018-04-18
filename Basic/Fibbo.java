package Basic;

public class Fibbo {
    int first=0;
    int second=0;
    public static void main(String[] args){
        new Fibbo();
    }
    public Fibbo(){
        fibbonaci();
    }
    public void fibbonaci(){
        for (int x=0;x<20;x++){
            System.out.println(first+second);
            int temp=first;
            first=first+second;
            second=temp;
            if(first==0){
                second=1;
            }
        }
    }
}
