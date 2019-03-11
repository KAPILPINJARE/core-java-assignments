import java.util.Scanner;

class TelevisionTest
{
   public static void main(String[] args)
   {
        Scanner sc = new Scanner(System.in);
        
        Television t = new Television();
        System.out.println("turn on the tv say on ");
        t.setTvPower(sc.next());
        
	System.out.println("change the volume increase or decrease give any number");
        t.setCurrentVolume(sc.nextInt());
        
	System.out.println("change channel");
        t.setCurrentChannel(sc.nextInt());
        sc.close();

        System.out.println("current power status = " + t.currentPowerStatus());
        System.out.println("current volume = " + t.getCurrentVolume());
        System.out.println("current channel = " + t.getCurrentChannel());
        
        t.setTvPower("off");
   }
}