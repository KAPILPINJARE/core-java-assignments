public class Employee
{
    private int id;
    private String name;
    private double monthlyBasic;
    private double pf = monthlyBasic * 0.10;
  
    double hra = monthlyBasic*0.5;
    int medicalAllowance = 1250;
    int conveyanceAllowance = 800;
  
    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setMonthlyBasic(double monthlyBasic)
    {
        this.monthlyBasic = monthlyBasic;
    }
    public double getMonthlyBasic()
    {
        return monthlyBasic;
    }
    public void setPfRate(double monthlyBasic)
    {
        this.pf = pf = monthlyBasic * 0.10;
    }
    public double getPfRate()
    {
        if(pf > 6500)
          return 6500.0;
        else
          return pf;
    }

    public double getAnnualBasic()
    { 
         return (12 * monthlyBasic);
    }

    public double getMonthlyGrossSalary()
    {
        return (monthlyBasic + hra + medicalAllowance + conveyanceAllowance);      
    }

    public double getAnnualGrossSalary() //
    {    
         return (12 * getMonthlyGrossSalary());   
    } 

    public double getMonthlyDeductions() 
    {
        return (pf + esic() + profTax());
    }

    public double esic()
    {
        if(monthlyBasic*4.75 <=5000)
           return monthlyBasic*4.75;
        else
           return 0.0;      
    }

    public double profTax()
    {
        if(getMonthlyGrossSalary() <=10000)
             return 50;
        else
             return 100;
    }
     
    public double getMonthlyTakeHome()
    {
        return (getMonthlyGrossSalary() - getMonthlyDeductions());
    }
    
    public double getAnnualTakeHome()
    {
         return (12 * getMonthlyTakeHome());
    }
}