public class MyDate{
    private int dd,mm,yy;
    public MyDate ( int d, int  m , int y){ // constructor
        System.out.println("Mydate.Mydate()");
        dd = d;
        mm = m;
        yy = y;
    }
    public void setDate(int d){
        System.out.println("MyDate.setDate()");
        dd=d;
    }
    public void display(){
        System.out.println("Date is " +dd+"/"+mm+"/"+yy);
    }

    public static void main(String[] args) {
        MyDate d1 = new MyDate(11,11,2011);
        d1.display();
        d1.setDate(12);
        d1.display();
    }
}