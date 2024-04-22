public class Server {

    static int plus(int x, int y) {
        return (x + y);
    }

    static int plus(int x, int y, int z) {
        return (x + y + z);
    }
}
    class Test{
    public static void main(String[] args) {

        System.out.println(Server.plus( 89,37));
        System.out.println(Server.plus(64,8965,654));
    }
}
