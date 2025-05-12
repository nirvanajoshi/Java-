public class Time {
    int h;
    int m;
    int s;
    Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }
    public Time add(Time t1, Time t2, Time t3) {
         t3.s = t1.s + t2.s;
         if (t3.s >= 60) {
            t3.m=1;
            t3.s -= 60;
    }
            t3.m += t1.m + t2.m;
            if (t3.m >= 60) {
                t3.h=1;
                t3.m -= 60;
        }
            t3.h += t1.h + t2.h;
            if (t3.h >= 24) {
                t3.h -= 24;
        }
            return t3;
        }
    public void display(Time t3) {
        System.out.println("Time: " + t3.h + ":" + t3.m + ":" + t3.s);
    }
    public static void main(String[] args) {
        Time t1 = new Time(10, 30, 45);
        Time t2 = new Time(5, 45, 20);
        Time t3 = new Time(0, 0, 0);
        t3 = t3.add(t1, t2, t3);
        t3.display(t3);
    }
    
}
