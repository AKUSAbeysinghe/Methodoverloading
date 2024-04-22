public class Student {

    static void studentId(String name,int id){
        System.out.println("Name:- "+ name+"Id:- "+ id);
    }

    static void studentId(int id,String name){
        System.out.println("Name:- "+ name+"Id:- "+ id);
    }

}

class Test1{
    public static void main(String[] args) {
        Student.studentId("Gawesh",25245);
        Student.studentId(12345,"Amal Dumal");
    }

}
