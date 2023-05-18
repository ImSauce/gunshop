import java.util.Scanner;
import java.util.InputMismatchException;

public class menus 
{



    //*==========[ VARIABLES ]================================================================================================================================
    String success =      "\n         [ Transaction successful, Your %s is now in process of being delivered to your address ]\n";
    String insuffecient = "\n[ insufficient balance ]";
    String barname =      "============[ SELECT WEAPON ]====================================================================================\n";
    String barsbruh =     "=================================================================================================================";
    String stats =        "============[ %s STATS ]======================================================================================\n";
    String custom =       "============[ CUZTOMIZE YOUR %s ]=============================================================================";
    String go =           "============[ PICK WEAPON ]======================================================================================\n";
    String order =        "============[ YOUR %s ]======================================================================================\n";
    
    String buy =          "============[ PURCHASE ]=========================================================================================\n";
    String none =         "none";
    int startAmmo =       0 ;
    String camodef =      "default";
    String scopetype =    "\n[$20] scope type : ";
    String modtype =      "\n[$50] mod attachments : ";
    String ammocount =    "\n[$1 each] how much %s ammo you need : ";
    String camotype =     "\n[$10] camo type : ";

    String [] guns = {"RIFLE", "PISTOL", "SNIPER", "SHOTGUN", "SMG", "MACHINE GUN", "ROCKET LAUNCHER"};
   
    String welcome =    "                    [] Welcome to the Kivotos Gun store, %s []\n\n";
    String purchase =                        "(Enter amount of money you want to purchase )";
    String balance =                         "( You have [ $%,5.2f ]  money in your account balance )\n";
    String spent =                           "( Your total spent is [ $%,5.2f ] money )\n";
    String thanks =         "                [] Thank you for visiting the Kivotos Gun Store, %s []\n";
    String incognito =      "                            [ YOU ENABLED INCOGNITO MODE ]";
    String fencebruh =      "*****************************************************************************************************************";
    //*=======================================================================================================================================================

    

    public static void Gunstore ()
    {
        System.out.println("\t\t\t\t=============================");
        System.out.println("\t\t\t\t|                           |");
        System.out.println("\t\t\t\t|      KivotosGun Store     |");
        System.out.println("\t\t\t\t|                           |");
        System.out.println("\t\t\t\t|        [1] Enter          |");       
        System.out.println("\t\t\t\t|        [2] exit           |");
        System.out.println("\t\t\t\t|                           |");
        System.out.println("\t\t\t\t=============================");
    }


    public static void menu ()
    {

        System.out.println("==========================================[ MAIN MENU ]==========================================================");
        System.out.println("");
        System.out.println("        [1] Withdraw");
        System.out.println("        [2] Account balance");
        System.out.println("        [3] Total spending");
        System.out.println("        [4] Gun Shop");
        System.out.println("        [5] Exit");
        System.out.println("");
        System.out.println("=================================================================================================================");
    }



    public static void weapons () 
    {
        System.out.println("        [1] Rifle");
        System.out.println("        [2] Pistol");
        System.out.println("        [3] Sniper");
        System.out.println("        [4] Shotgun");
        System.out.println("        [5] SMG");
        System.out.println("        [6] Machine Gun");
        System.out.println("        [7] Rocket Launcher");
        System.out.println("");
    }

    public static void YorN ()
    {
        System.out.println("        [1] Yes");
        System.out.println("        [2] No");
        System.out.println("");
    } 




    public static double purchase1 (double monar) //withdraw money system
    {
        Scanner user=new Scanner(System.in);

        double result=0; 
        result = result + monar ;


        System.out.println("");
        System.out.println("            ( TRANSACTION SUCCESSFUL ) ");
        System.out.printf("[ %+,5.2f ] money has been added to your account\n",monar);

        return result;

    }
    
}
