class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee e = new Employee();
        e.setId(20);
        e.setName("kapil");
        e.setMonthlyBasic(24000.00);
        System.out.print("employee basic salary is  =  ");
        System.out.println(e.getMonthlyBasic());
      
        System.out.print("employee Annual basic salary is  =  ");
        System.out.println(e.getAnnualBasic()); 
       
        System.out.print("employee Monthly gross salary is  =  ");
        System.out.println(e.getMonthlyGrossSalary());

        System.out.print("employee Annual gross salary is  =  ");
        System.out.println(e.getAnnualGrossSalary()); 

        System.out.print("employee monthly deduction is  =  ");
        System.out.println(e.getMonthlyDeductions()); 

        System.out.print("employee monthly take home salary is  =  ");
        System.out.println(e.getMonthlyTakeHome()); 

        System.out.print("employee Annual take home salary is  =  ");
        System.out.println(e.getAnnualTakeHome()); 
    }
}