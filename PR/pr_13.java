
class date{
    int day;
    int year;
    int month;

    public date(int x,int y,int z){
        day = x;
        month = y;
        year = z;
    }

    public void setday(int d){
        day = d;
    }
    public int getday(){
        return day;
    }

    public void setmonth(int m){
        month=m;
    }

    public int getmonth(){
        return day;
    }

    public void setyear(int y){
        year = y;
    }

    public int getyear(){
        return year;
    }


    // public void set(int d,int m,int y){
    //     day = d;
    //     month = m;
    //     year = y;
    // }

    // public void get(){
    //     System.out.println("DD/MM/YYYY : " + day + "/" + month + "/" + year);
    // }


}

public class pr_13 {
    public static void main(String[] args) {
        date d = new date(12,03,2023);

        System.out.println("\nDate 1:");
        d.setday(02);
        System.out.println("Day : "+ d.getday());
        
        d.setmonth(04);
        System.out.println("Month : "+ d.getmonth());
        
        d.setyear(2023);
        System.out.println("Year : "+ d.getyear());

        System.out.println("\nDate 2:");
        d.setday(03);
        System.out.println("Day : "+ d.getday());
        
        d.setmonth(05);
        System.out.println("Month : "+ d.getmonth());
        
        d.setyear(2024);
        System.out.println("Year : "+ d.getyear());
        System.out.println("\n23DIT066 - Vinit Saspara");

    }
}
