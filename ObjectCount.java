public class ObjectCount {
    private int dd, mm, yy;
    static int cnt = 0;

    public ObjectCount(int d, int m, int y) {
        System.out.println("ObjectCount.MyDate()");
        cnt++;
        dd = d;
        mm = m;
        yy = y;
    }

    public void display() {
        System.out.println("date is " + dd + "/" + mm + "/" + yy);
    }

    public static void main(String[] args) {
        ObjectCount o1 = new ObjectCount(11, 11, 1111);
        o1.display();
        ObjectCount o2 = new ObjectCount(12, 11, 1111);
        o2.display();
        ObjectCount o3 = new ObjectCount(13, 11, 1111);
        o3.display();
        System.out.println("count of the object is : " + ObjectCount.cnt);
    }
}