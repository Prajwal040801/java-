public class studentclass {
    int id;
    String name;
    studentclass(String name) {
        System.out.println("NAME :" +name);
    }
    studentclass(int id){
        System.out.println("ID:"+id);
    }
    studentclass() {
        System.out.println("Unknown");
    }

    public static void main(String[] args) {
        studentclass s = new studentclass( "prajwal");
        studentclass s1 = new studentclass( 23);
    }
}
