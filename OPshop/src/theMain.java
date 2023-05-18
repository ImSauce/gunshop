import java.util.Scanner;
import java.util.InputMismatchException;
import java.math.BigDecimal;

public class theMain 
{
    public static void main(String[] args) throws Exception 
    {

        menus menu = new menus(); // used to open the methods and variables in menus class

        System.out.println("\n\n");
        //*==========[ VARIABLES ]================================================================================================================================
        int    choose        ;
        String login = ""    ;
        double money = 0     ;
        double totalspent = 0;
        //*=======================================================================================================================================================






        //======================================//
        //==========  LOGIN SYSTEM  ============//
        //======================================//




        menus.Gunstore (); //opens the start menu

        Scanner choose1=new Scanner(System.in);

        choose = choose1.nextInt();//choose either start or exit

        if (choose == 1) //Login account if user picks number 1
            {
                System.out.println("\nLogin :");
            }
        else // exits if user picks number 2
            {
                System.exit(0); 
            }

        Scanner user=new Scanner(System.in);
        login = user.nextLine();
        boolean empty = login.isEmpty();

        if (empty == true) // if user does not input a name it will automatically be called nameless user
            {
                System.out.println(menu.incognito);
                login = "nameless User";
            }
        
        System.out.println(menu.fencebruh); // the bars (============)
        System.out.printf(menu.welcome,login); // welcome greetings





        //======================================//
        //==========  MENU  SYSTEM  ============//
        //======================================//

        


        while (true) 

            {
                menus.menu (); // opens the menu panel


                try 
                {

                    int choice = user.nextInt(); 


                switch (choice) 
                {
                    case 1: // buy coins 
                    {
                    
                        System.out.println(menu.purchase);
                        String incomeStr = user.next();
                        BigDecimal income = new BigDecimal(incomeStr);
                        double inc = income.doubleValue(); // Convert BigDecimal to double
                        menus.purchase1(inc);
                        money += inc; // Update money using BigDecimal operations
                        break;
                    
                    }




                    case 2: // check money balance
                    {
                        System.out.println(menu.barsbruh);
                        System.out.printf(menu.balance,money);
                        break;
                    }




                    case 3: // check total spent 
                    {
                        System.out.println(menu.barsbruh);
                        System.out.printf(menu.spent,totalspent);
                        break;
                    }


        


                    case 4: //opens the gun shop
                    {

                        
                        double buy = money; 
                        buy = gunSmith.shop(buy); 
                        double total = money - buy;
                        totalspent += total ;
                        money = buy; 
                        break;
                        
                    }

                    

                    case 5: // exit 
                    {

                        System.out.println(menu.barsbruh+"\n");
                        System.out.printf(menu.thanks,login);
                        System.out.println("\n"+menu.barsbruh);
                        System.out.println("\n\n");
                        System.exit(0);
                        break;

                    }

                }
                

                }
                
                catch (InputMismatchException ex)
                {
                    System.out.println("\n!! Invalid input !!\n");
                    user.nextLine(); // Consume the invalid input

                }
                

                
            }
    
            


        
    }
    
}

