// class Time {
//     private int hh,mm,ss;
//     public Time(){
//         hh=mm=ss=12;
//     }
//     public Time(int hh, int mm, int ss)
//         {
//         this.hh=hh;
//         this.mm=mm;
//         this.ss=ss;
//         }
//         public void show(){
//             System.out.printf("%02d:%02d:%02d%n",hh,mm,ss);
//         }
//      public static void main(String args[]){
//         Time t1=new Time ();
//         Time t2=new Time(12,5,12);
//         t1.show();
//         t2.show();
//      }
// }



     /////// NEW PROGRAM


// TIME FORMAT HH:MM:SS AM/PM
// class timeee{
//     int hour;
//     int minute;
//     int second;
//     void print(){
//         System.out.println("hour:"+hour+" minute:"+minute+" second:"+second);

//     }
//     void sum(timeee t1,timeee t2){
//         hour=t1.hour+t2.hour;
//         minute=t1.minute+t2.minute;
//         second=t1.second+t2.second;

//         if(second>60){
//             minute =  + second/60;
//             second = second%60;
//         }
//         if(minute>60){
//             hour = hour + minute/60;
//             minute = minute%60;
//         }
//         String meridian;

//         if(hour>12 && minute == 00 && second == 00){
//             meridian = "PM";
//         }
//         else {
//             meridian = "AM";
//         }

//         System.out.println("hour:"+hour+" minute:"+minute+" second:"+second +" "+meridian);
//     }
// }
// public class Time {
//     public static void main(String[] args) {

//         timeee t1 =  new timeee();
//         timeee t2 =  new timeee();
//         timeee t3 =  new timeee();
//         timeee t4 =  new timeee();

//         t1.hour = 12;
//         t1.minute = 59;
//         t1.second = 59;

//         t2.hour = 12;
//         t2.minute = 59;
//         t2.second = 59;

//         t3.hour = 12;
//         t3.minute = 59;
//         t3.second = 59;

//         t1.print();
//         t4.sum(t1,t2);
//     }
// }



     // NEW PROGRAM


// ADDITION OF TIME IN HH:MM:SS FORMAT

public class time {
    private int hh, mm, ss;
    public time(){
        hh=mm=ss=12;
    }
    public time(int h, int m, int s){
        this.hh = h;
        this.mm = m;
        this.ss = s;
    }
    public void show(){
        System.out.printf("%02d:%02d:%02d\n",hh,mm,ss);
    }
    public void Add(time t){
        this.hh += t.hh;
        this.mm += t.mm;
        this.ss += t.ss;
    }
    public void Add(time t1, time t2){
        ss = t1.ss + t2.ss;
        mm = t1.mm + t2.mm + ss/60;
        hh = t1.hh + t2.hh + mm/60;
        ss %= 60;
        mm %= 60;
    }
    public static void main(String[] args) {
        time t1 = new time();
        time t2 = new time();
        time t3 = new time(12,5,12);
        t1.show();
        t3.show();
        t2.Add(t1,t3);  // t2=t1+t3
        t2.show();
        t1.Add(t2); // t3=t3+t2
        t1.show();
    }
}