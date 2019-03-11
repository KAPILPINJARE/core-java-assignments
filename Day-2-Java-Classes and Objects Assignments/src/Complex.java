class Complex
{
    private double real;
    private double imaginary;

    public void set(double real,double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    public String disp()
    {
         return (real + " + " + "i(" + imaginary + ")");
    }

    public Complex add(Complex c2)
    {
        Complex c3 = new Complex();
        c3.real = this.real + c2.real;
        c3.imaginary = this.imaginary + c2.imaginary;
        return c3;   
    }
}
