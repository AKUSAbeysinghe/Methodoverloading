public class Host {

    String hosting(String x ){
            return x;
    }

    int hosting(int x){
         return x;
    }

    double  hosting(double  x){
        return x;
    }

    public static void main(String[] args) {

        Host h=new Host();
        System.out.println(h.hosting(8));
        //uda method eka return wenwanam print eka danna argument ekath ekka
        System.out.println(h.hosting(89.654));
        System.out.println(h.hosting("Hoster"));
    }
}
