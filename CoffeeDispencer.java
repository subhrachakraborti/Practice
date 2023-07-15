import java.util.Scanner;
public class CoffeeDispencer
{
    double total;
    double NCoffee;
    double FilCof;
    double CCoffee;
    double BCoffee;
    double espresso;
    double price;
    CoffeeDispencer()
    {
        total = 5000.0;
        NCoffee = 120.0;
        FilCof = 200.0;
        CCoffee = 180.0;
        BCoffee = 220.0;
        espresso = 250.0;
        price = 0.0;
    }

    public void run()
    {
        double nprice = 0.0D;
        while(true)
        {
            System.out.println("No.\tCoffee\t\tSize\tPrice");
            System.out.println("1\tNormal Coffee\t120mL\t₹60");
            System.out.println("2\tFilter Coffee\t200mL\t₹70");
            System.out.println("3\tCold Coffee\t180mL\t₹100");
            System.out.println("4\tBlack Coffee\t220mL\t₹110");
            System.out.println("5\tEspresso\t250mL\t₹150");
            Scanner in = new Scanner (System.in);
            int n = in.nextInt();
            int x = 1;
            switch(n)
            {
                case 1 :
                    System.out.println("How many cups? Max : "+Math.round(Math.floor((total-1000)/NCoffee)));
                    x = in.nextInt();
                    if(x > Math.round(Math.floor((total-1000)/NCoffee)))
                        System.out.println("Not Enough Coffee In The Dispenser!");
                    else
                    {
                        total = total - x*NCoffee;
                        price = x*60;
                        break;
                    }
                case 2 :
                    if(Math.round(Math.floor((total-1000)/FilCof)) == 0)
                        System.out.println("Sorry Your Order Is Not Applicable!");
                    else
                    {   
                        System.out.println("How many cups? Max : "+Math.round(Math.floor((total-1000)/FilCof)));
                        x = in.nextInt();
                        if(x > Math.round(Math.floor((total-1000)/FilCof)))
                            System.out.println("Not Enough Coffee In The Dispenser!");
                        else
                        {
                            total = total - x*FilCof;
                            price = x*70;
                        }
                    }
                    break;
                case 3 :
                    if(Math.round(Math.floor((total-1000)/CCoffee)) == 0)
                        System.out.println("Sorry Your Order Is Not Applicable!");
                    else
                    {
                        System.out.println("How many cups? Max : "+Math.round(Math.floor((total-1000)/CCoffee)));
                        x = in.nextInt();
                        if(x > Math.round(Math.floor((total-1000)/CCoffee)))
                            System.out.println("Not Enough Coffee In The Dispenser!");
                        else
                        {
                            total = total - x*CCoffee;
                            price = 100*x;
                        }
                    }
                    break;
                case 4 :
                    if(Math.round(Math.floor((total-1000)/BCoffee)) == 0)
                        System.out.println("Sorry Your Order Is Not Applicable!");
                    else
                    {
                        System.out.println("How many cups? Max : "+Math.round(Math.floor((total-1000)/BCoffee)));
                        x = in.nextInt();
                        if(x > Math.round(Math.floor((total-1000)/BCoffee)))
                            System.out.println("Not Enough Coffee In The Dispenser!");
                        else
                        {
                            total = total - x*BCoffee;
                            price = 110*x;
                        }
                    }
                    break;
                case 5 :
                    if(Math.round(Math.floor((total-1000)/espresso)) == 0)
                        System.out.println("Sorry Your Order Is Not Applicable!");
                    else
                    {
                        System.out.println("How many cups? Max : "+Math.round(Math.floor((total-1000)/espresso)));
                        x = in.nextInt();
                        if(x > Math.round(Math.floor((total-1000)/espresso)))
                            System.out.println("Not Enough Coffee In The Dispenser!");
                        else
                        {
                            total = total - x*espresso;
                            price = x*150;
                        }
                    }
                    break;
                default :
                    System.out.println("OOPS!! Wrong Input!!");
            }
            System.out.println("Coffee Left = "+total+" ml");
            System.out.println("Net Amount = ₹"+price);
            System.out.println();
            System.out.println("You can Buy");
            System.out.println(Math.round(Math.floor((total-1000)/NCoffee)) + " Normal Coffee");
            System.out.println(Math.round(Math.floor((total-1000)/FilCof)) + " Filter Coffee");
            System.out.println(Math.round(Math.floor((total-1000)/CCoffee)) + " Cold Coffee");
            System.out.println(Math.round(Math.floor((total-1000)/BCoffee)) + " Black Coffee");
            System.out.println(Math.round(Math.floor((total-1000)/espresso)) + " Espresso");           
            nprice += price;
            if(total >= 1120)
                continue;
            else
            {
                System.out.println();
                System.out.println("\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*");
                System.out.println();
                System.out.println("\t\t*!! ⚠️REFILL ⚠️!!*");
                System.out.println("Total Amount of All Transactions = ₹"+nprice);
                System.exit(0);
            }
        }
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner (System.in);
        CoffeeDispencer ob = new CoffeeDispencer();
        System.out.println("Enter 1 to continue");
        int n = in.nextInt();
        int c = n;
        do
        {
            if(c == 1)
                ob.run();
            else
                System.out.println("Press 1 to continue!");
            c = in.nextInt();
        }while(c == 1);
    }
}
