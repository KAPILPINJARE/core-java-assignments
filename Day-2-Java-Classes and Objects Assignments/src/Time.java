class Time
{
    private int hours;
    private int minutes;

    public void set(int hours,int minutes)
    {
        this.hours = hours;
        this.minutes = minutes;
    }
    
    public String disp()
    {
         return ("hours = " + hours + "," + "minutes = " + minutes);
    }

    public Time add(Time t2)
    {
        Time temp = new Time();        
        temp.minutes = (this.minutes + t2.minutes)%60;
        temp.hours = (this.hours + t2.hours) + (temp.minutes/60);
        return temp;    
    }
}