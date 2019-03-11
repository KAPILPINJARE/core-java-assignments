class Distance
{
    private int feet;
    private double inches;

    public void set(int feet,double inches)
    {
        this.feet = feet;
        this.inches = inches;
    }
    
    public String disp()
    {
         return ("feet = " + feet + " , " + "inches = " + inches);
    }

    public Distance add(Distance d2)
    {
        Distance temp = new Distance();
        temp.feet = this.feet + d2.feet;
        temp.inches = this.inches + d2.inches;
        return temp;    
    }
}