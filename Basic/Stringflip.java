package Basic;

public class Stringflip {
    StringBuilder sb;
    public static void main(String[] Args){
        new Stringflip();
    }
    public Stringflip(){
        System.out.println(flip("Nicki"));
    }
    public String flip(String s){
        sb = new StringBuilder();
        for (int x=(s.length()-1);x>=0;x--){

            sb.append(s.charAt(x));
        }
        return sb.toString();
    }
}
