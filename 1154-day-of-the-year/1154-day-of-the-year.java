class Solution {
    public int dayOfYear(String date) {
        int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};

        String formate[]= date.split("-");

        int sum=0;
        int day=Integer.parseInt(formate[2]);
        int month=Integer.parseInt(formate[1]);
        int year=Integer.parseInt(formate[0]);

        for(int i=0;i<month-1;i++)
        sum+=days[i];

       // System.out.println(sum);
        sum+=day;

        if(month>2&&leapYear(year))
            sum++;

        return sum;
    }

    public boolean leapYear(int year)
    {
         return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}