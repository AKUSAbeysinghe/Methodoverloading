public class Idea {
    static void quote(int x,int y){
        System.out.println("I think " + x + " plus " +y+ " = "+(x+y));
    }

    static void  quote(String x){
        System.out.println("I think "+ x +" is the investment...!");
    }

    public static void main(String[] args) {
        quote(50,100);
        quote("Education");
    }
}
