import java.util.Scanner;
import java.math.BigDecimal;
import java.util.InputMismatchException;

public class gunSmith 
{

    public static double shop (double monar)  //money enters

        {

        //======================================//
        //==========  GUN SECTIONS  ============//
        //======================================//



            menus menu = new menus(); // used to open the methods and variables in menus class

        

            double coins = 0;
            coins = coins + monar; // move money into a new variable


            Scanner user = new Scanner (System.in);

            System.out.println(menu.barname);
            menu.weapons(); // opens the list of available items
            System.out.println(menu.barsbruh);



            try 
            
            {

                int select = user.nextInt();



                //======================================//
                //==========  GUN CHOOSING    ==========//
                //======================================//
    
    
    
    
                switch(select) // when user picks an item this will run
                {
    
                    case 1:
                    {
    
                        System.out.printf(menu.stats,menu.guns[0]); // rifle stats 
                        
                        rifleBlueprint stat = new rifleBlueprint(menu.camodef,menu.none,menu.none,menu.startAmmo); //output the default rifle stats
                        
                        
                        System.out.println(menu.go); // pick weapon ??
                        menu.YorN(); // yes or no
                        System.out.println(menu.barsbruh);
                        int choose = user.nextInt();
    
    
    
                        //======================================//
                        //==========  GUN PURCHASING  ==========//
                        //======================================//
    
    
    
                        
                        switch(choose) // if user clicks yes 
                        {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
                            //RIFLES
    
                            case 1:
                            System.out.printf(menu.custom,menu.guns[0]); // takes the value of the 0 in the string array from menu class 
                            Scanner user3 = new Scanner(System.in);
    
                            //Customize
                            System.out.println("");
                            //camo type
                            System.out.print(menu.camotype);
                            String camo = user3.nextLine();
                            //scope type
                            System.out.print(menu.scopetype);
                            String scope = user3.nextLine();
                            //modifications
                            System.out.print(menu.modtype);
                            String mods = user3.nextLine();
                            //ammo count
                            System.out.printf(menu.ammocount, menu.guns[0]);
                            System.out.println("");
                            String Sammo = user.next();
                            
                            try {
                                //if user inputs numbers that exceeds the maximum of double
                                BigDecimal Bigammo = new BigDecimal(Sammo);
                                double ammo = Bigammo.doubleValue();

                                     
                                
                            //cost of cosmetics/mods
                            int camobuy = 10;
                            int scopebuy = 20;
                            int modbuy = 50;
    
                            //if user dont put any cosmetics
                            boolean emptyCamo = camo.isEmpty();
                            boolean emptyScope = scope.isEmpty();
                            boolean emptyMod = mods.isEmpty();
    
                            //if true, the cosmetics cost will be 0 and the cosmetics will stay on default
                            if (emptyCamo == true )
                            {
                                camobuy = 0;
                                camo = "default";
    
                            }
                            if (emptyScope == true )
                            {
                                scopebuy = 0;
                                scope = "none";
                            }
                            if ( emptyMod == true )
                            {
                                modbuy = 0;
                                mods = "none";
                            }
    
                            //calculate total
                            double prices = camobuy + scopebuy + modbuy + ammo;
                            double weapon = stat.cost + prices;
                            //output
                            System.out.println(menu.barsbruh);
                            System.out.printf("Total cost [ $%,5.2f ]\n",weapon);
                            System.out.println(menu.buy); // purchase??
                            menu.YorN();// yes or no
                            System.out.println(menu.barsbruh);
                            int selecta = user.nextInt();
                            
                            
    
    
                            switch (selecta) //if user clicks yes 
                            {
                                case 1:
                                {
                                    if (coins >= weapon) // if user has enough money to buy
                                    {
    
                                        System.out.printf(menu.order,menu.guns[0]);
                                        rifleBlueprint freshRifle = new rifleBlueprint(camo, scope,mods, ammo);
                                        System.out.printf(menu.success,menu.guns[0]);
                                        System.out.printf("\n      [ -$%,5.2f ]\n",weapon);
                                        
                                        coins=coins - weapon;               
                                        break;
                                    }  
            
                                    else if (coins < weapon ) // if user is pooor
                                    {
                                        System.out.println(menu.barsbruh);
                                        System.out.println(menu.insuffecient);
                                        break;
                                    }    
    
                                    
                                }
                                
                            }
                               
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid input. Please enter a valid numeric value for ammo count.");
                            }

                            
    
                       
                            break;
                        }
                        
                    }break;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////         COPY PASTE          ////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
                    //PISTOL
    
                    case 2:
                    {
    
                        System.out.printf(menu.stats,menu.guns[1]); // pistol stats 
                        
                        pistolBlueprint stat = new pistolBlueprint(menu.camodef,menu.none,menu.none,menu.startAmmo); //output the default PISTOL stats
                        
                        
                        System.out.println(menu.go); // pick this weapon ??
                        menu.YorN(); // yes or no
                        System.out.println(menu.barsbruh);
                        int choose = user.nextInt();
    
    
    
                        //======================================//
                        //==========  GUN PURCHASING  ==========//
                        //======================================//
    
    
    
                        
                        switch(choose) // if user clicks yes 
                        {
                            case 1:
                            System.out.printf(menu.custom,menu.guns[1]); // takes the value of the 0 in the string array from menu class 
                            Scanner user3 = new Scanner(System.in);
    
                            //Customize
                            System.out.println("");
                            //camo type
                            System.out.print(menu.camotype);
                            String camo = user3.nextLine();
                            //scope type
                            System.out.print(menu.scopetype);
                            String scope = user3.nextLine();
                            //modifications
                            System.out.print(menu.modtype);
                            String mods = user3.nextLine();
                            //ammo count
                            System.out.printf(menu.ammocount, menu.guns[1]);
                            System.out.println("");
                            String Sammo = user.next();
                            
                            try {
                                //if user inputs numbers that exceeds the maximum of double
                                BigDecimal Bigammo = new BigDecimal(Sammo);
                                double ammo = Bigammo.doubleValue();

                                     
                                
                            //cost of cosmetics/mods
                            int camobuy = 10;
                            int scopebuy = 20;
                            int modbuy = 50;
    
                            //if user dont put any cosmetics
                            boolean emptyCamo = camo.isEmpty();
                            boolean emptyScope = scope.isEmpty();
                            boolean emptyMod = mods.isEmpty();
    
                            //if true, the cosmetics cost will be 0 and the cosmetics will stay on default
                            if (emptyCamo == true )
                            {
                                camobuy = 0;
                                camo = "default";
    
                            }
                            if (emptyScope == true )
                            {
                                scopebuy = 0;
                                scope = "none";
                            }
                            if ( emptyMod == true )
                            {
                                modbuy = 0;
                                mods = "none";
                            }
    
                            //calculate total
                            double prices = camobuy + scopebuy + modbuy + ammo;
                            double weapon = stat.cost + prices;
                            //output
                            System.out.println(menu.barsbruh);
                            System.out.printf("Total cost [ $%,5.2f ]\n",weapon);
                            System.out.println(menu.buy); // purchase??
                            menu.YorN();// yes or no
                            System.out.println(menu.barsbruh);
                            int selecta = user.nextInt();
                            
                            
    
    
                            switch (selecta) //if user clicks yes 
                            {
                                case 1:
                                {
                                    if (coins >= weapon) // if user has enough money to buy
                                    {
    
                                        System.out.printf(menu.order,menu.guns[1]);
                                        pistolBlueprint freshpistol = new pistolBlueprint(camo, scope,mods, ammo);
                                        System.out.printf(menu.success,menu.guns[1]);
                                        System.out.printf("\n      [ -$%,5.2f ]\n",weapon);
                                        
                                        coins=coins - weapon;               
                                        break;
                                    }  
            
                                    else if (coins < weapon ) // if user is pooor
                                    {
                                        System.out.println(menu.barsbruh);
                                        System.out.println(menu.insuffecient);
                                        break;
                                    }    
    
                                    
                                }
                                
                            }
                               
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid input. Please enter a valid numeric value for ammo count.");
                            }

                            break;
                        }
                        
                    }break;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////         COPY PASTE          ////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
                    //sniper
                    case 3:
                    {
    
                        System.out.printf(menu.stats,menu.guns[2]); // sniper stats 
                        
                        sniperBlueprint stat = new sniperBlueprint(menu.camodef,menu.none,menu.none,menu.startAmmo); //output the default sniper stats
                        
                        
                        System.out.println(menu.go); // pick this weapon ??
                        menu.YorN(); // yes or no
                        System.out.println(menu.barsbruh);
                        int choose = user.nextInt();
    
    
    
                        //======================================//
                        //==========  GUN PURCHASING  ==========//
                        //======================================//
    
    
    
                        
                        switch(choose) // if user clicks yes 
                        {
                            case 1:
                            System.out.printf(menu.custom,menu.guns[2]); // takes the value of the 0 in the string array from menu class 
                            Scanner user3 = new Scanner(System.in);
    
                            //Customize
                            System.out.println("");
                            //camo type
                            System.out.print(menu.camotype);
                            String camo = user3.nextLine();
                            //scope type
                            System.out.print(menu.scopetype);
                            String scope = user3.nextLine();
                            //modifications
                            System.out.print(menu.modtype);
                            String mods = user3.nextLine();
                            //ammo count
                            System.out.printf(menu.ammocount, menu.guns[2]);
                            System.out.println("");
                            String Sammo = user.next();
                            
                            try {
                                //if user inputs numbers that exceeds the maximum of double
                                BigDecimal Bigammo = new BigDecimal(Sammo);
                                double ammo = Bigammo.doubleValue();

                                     
                                
                            //cost of cosmetics/mods
                            int camobuy = 10;
                            int scopebuy = 20;
                            int modbuy = 50;
    
                            //if user dont put any cosmetics
                            boolean emptyCamo = camo.isEmpty();
                            boolean emptyScope = scope.isEmpty();
                            boolean emptyMod = mods.isEmpty();
    
                            //if true, the cosmetics cost will be 0 and the cosmetics will stay on default
                            if (emptyCamo == true )
                            {
                                camobuy = 0;
                                camo = "default";
    
                            }
                            if (emptyScope == true )
                            {
                                scopebuy = 0;
                                scope = "none";
                            }
                            if ( emptyMod == true )
                            {
                                modbuy = 0;
                                mods = "none";
                            }
    
                            //calculate total
                            double prices = camobuy + scopebuy + modbuy + ammo;
                            double weapon = stat.cost + prices;
                            //output
                            System.out.println(menu.barsbruh);
                            System.out.printf("Total cost [ $%,5.2f ]\n",weapon);
                            System.out.println(menu.buy); // purchase??
                            menu.YorN();// yes or no
                            System.out.println(menu.barsbruh);
                            int selecta = user.nextInt();
                            
                            
    
    
                            switch (selecta) //if user clicks yes 
                            {
                                case 1:
                                {
                                    if (coins >= weapon) // if user has enough money to buy
                                    {
    
                                        System.out.printf(menu.order,menu.guns[2]);
                                        sniperBlueprint freshsniper = new sniperBlueprint(camo, scope,mods, ammo);
                                        System.out.printf(menu.success,menu.guns[2]);
                                        System.out.printf("\n      [ -$%,5.2f ]\n",weapon);
                                        
                                        coins=coins - weapon;               
                                        break;
                                    }  
            
                                    else if (coins < weapon ) // if user is pooor
                                    {
                                        System.out.println(menu.barsbruh);
                                        System.out.println(menu.insuffecient);
                                        break;
                                    }    
    
                                    
                                }
                                
                            }
                               
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid input. Please enter a valid numeric value for ammo count.");
                            }



                            break;
                        }
                        
                    }break;
    
                    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////         COPY PASTE          ////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       
                    //shotgun
                    case 4:
                    {
    
                        System.out.printf(menu.stats,menu.guns[3]); // shotgun stats 
                        
                        shotgunBlueprint stat = new shotgunBlueprint(menu.camodef,menu.none,menu.none,menu.startAmmo); //output the default shotgun stats
                        
                        
                        System.out.println(menu.go); // pick this weapon ??
                        menu.YorN(); // yes or no
                        System.out.println(menu.barsbruh);
                        int choose = user.nextInt();
    
    
    
                        //======================================//
                        //==========  GUN PURCHASING  ==========//
                        //======================================//
    
    
    
                        
                        switch(choose) // if user clicks yes 
                        {
                            case 1:
                            System.out.printf(menu.custom,menu.guns[3]); // takes the value of the 0 in the string array from menu class 
                            Scanner user3 = new Scanner(System.in);
    
                            //Customize
                            System.out.println("");
                            //camo type
                            System.out.print(menu.camotype);
                            String camo = user3.nextLine();
                            //scope type
                            System.out.print(menu.scopetype);
                            String scope = user3.nextLine();
                            //modifications
                            System.out.print(menu.modtype);
                            String mods = user3.nextLine();
                            //ammo count
                            System.out.printf(menu.ammocount, menu.guns[3]);
                            System.out.println("");
                            String Sammo = user.next();
                            
                            try {
                                //if user inputs numbers that exceeds the maximum of double
                                BigDecimal Bigammo = new BigDecimal(Sammo);
                                double ammo = Bigammo.doubleValue();

                                     
                                
                            //cost of cosmetics/mods
                            int camobuy = 10;
                            int scopebuy = 20;
                            int modbuy = 50;
    
                            //if user dont put any cosmetics
                            boolean emptyCamo = camo.isEmpty();
                            boolean emptyScope = scope.isEmpty();
                            boolean emptyMod = mods.isEmpty();
    
                            //if true, the cosmetics cost will be 0 and the cosmetics will stay on default
                            if (emptyCamo == true )
                            {
                                camobuy = 0;
                                camo = "default";
    
                            }
                            if (emptyScope == true )
                            {
                                scopebuy = 0;
                                scope = "none";
                            }
                            if ( emptyMod == true )
                            {
                                modbuy = 0;
                                mods = "none";
                            }
    
                            //calculate total
                            double prices = camobuy + scopebuy + modbuy + ammo;
                            double weapon = stat.cost + prices;
                            //output
                            System.out.println(menu.barsbruh);
                            System.out.printf("Total cost [ $%,5.2f ]\n",weapon);
                            System.out.println(menu.buy); // purchase??
                            menu.YorN();// yes or no
                            System.out.println(menu.barsbruh);
                            int selecta = user.nextInt();
                            
                            
    
    
                            switch (selecta) //if user clicks yes 
                            {
                                case 1:
                                {
                                    if (coins >= weapon) // if user has enough money to buy
                                    {
    
                                        System.out.printf(menu.order,menu.guns[3]);
                                        shotgunBlueprint freshshotgun = new shotgunBlueprint(camo, scope,mods, ammo);
                                        System.out.printf(menu.success,menu.guns[3]);
                                        System.out.printf("\n      [ -$%,5.2f ]\n",weapon);
                                        
                                        coins=coins - weapon;               
                                        break;
                                    }  
            
                                    else if (coins < weapon ) // if user is pooor
                                    {
                                        System.out.println(menu.barsbruh);
                                        System.out.println(menu.insuffecient);
                                        break;
                                    }    
    
                                    
                                }
                                
                            }
                               
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid input. Please enter a valid numeric value for ammo count.");
                            }



                            break;
                        }
                        
                    }break;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////         COPY PASTE          ////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    
                     //smg
                     case 5:
                     {
     
                         System.out.printf(menu.stats,menu.guns[4]); // smg stats 
                         
                         smgBlueprint stat = new smgBlueprint(menu.camodef,menu.none,menu.none,menu.startAmmo); //output the default smg stats
                         
                         
                         System.out.println(menu.go); // pick this weapon ??
                         menu.YorN(); // yes or no
                         System.out.println(menu.barsbruh);
                         int choose = user.nextInt();
     
     
     
                         //======================================//
                         //==========  GUN PURCHASING  ==========//
                         //======================================//
     
     
     
                         
                         switch(choose) // if user clicks yes 
                         {
                             case 1:
                             System.out.printf(menu.custom,menu.guns[4]); // takes the value of the 0 in the string array from menu class 
                             Scanner user3 = new Scanner(System.in);
     
                            //Customize
                            System.out.println("");
                            //camo type
                            System.out.print(menu.camotype);
                            String camo = user3.nextLine();
                            //scope type
                            System.out.print(menu.scopetype);
                            String scope = user3.nextLine();
                            //modifications
                            System.out.print(menu.modtype);
                            String mods = user3.nextLine();
                            //ammo count
                            System.out.printf(menu.ammocount, menu.guns[4]);
                            System.out.println("");
                            String Sammo = user.next();
                            
                            try {
                                //if user inputs numbers that exceeds the maximum of double
                                BigDecimal Bigammo = new BigDecimal(Sammo);
                                double ammo = Bigammo.doubleValue();

                                     
                                
                            //cost of cosmetics/mods
                            int camobuy = 10;
                            int scopebuy = 20;
                            int modbuy = 50;
    
                            //if user dont put any cosmetics
                            boolean emptyCamo = camo.isEmpty();
                            boolean emptyScope = scope.isEmpty();
                            boolean emptyMod = mods.isEmpty();
    
                            //if true, the cosmetics cost will be 0 and the cosmetics will stay on default
                            if (emptyCamo == true )
                            {
                                camobuy = 0;
                                camo = "default";
    
                            }
                            if (emptyScope == true )
                            {
                                scopebuy = 0;
                                scope = "none";
                            }
                            if ( emptyMod == true )
                            {
                                modbuy = 0;
                                mods = "none";
                            }
    
                            //calculate total
                            double prices = camobuy + scopebuy + modbuy + ammo;
                            double weapon = stat.cost + prices;
                            //output
                            System.out.println(menu.barsbruh);
                            System.out.printf("Total cost [ $%,5.2f ]\n",weapon);
                            System.out.println(menu.buy); // purchase??
                            menu.YorN();// yes or no
                            System.out.println(menu.barsbruh);
                            int selecta = user.nextInt();
                            
                            
    
    
                            switch (selecta) //if user clicks yes 
                            {
                                case 1:
                                {
                                    if (coins >= weapon) // if user has enough money to buy
                                    {
    
                                        System.out.printf(menu.order,menu.guns[4]);
                                        smgBlueprint freshsmg = new smgBlueprint(camo, scope,mods, ammo);
                                        System.out.printf(menu.success,menu.guns[4]);
                                        System.out.printf("\n      [ -$%,5.2f ]\n",weapon);
                                        
                                        coins=coins - weapon;               
                                        break;
                                    }  
            
                                    else if (coins < weapon ) // if user is pooor
                                    {
                                        System.out.println(menu.barsbruh);
                                        System.out.println(menu.insuffecient);
                                        break;
                                    }    
    
                                    
                                }
                                
                            }
                               
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid input. Please enter a valid numeric value for ammo count.");
                            }



                             break;
                         }
                         
                     }break;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////         COPY PASTE          ////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
                     //machinegun
                     case 6:
                     {
     
                         System.out.printf(menu.stats,menu.guns[5]); // machinegun stats 
                         
                         machinegunBlueprint stat = new machinegunBlueprint(menu.camodef,menu.none,menu.none,menu.startAmmo); //output the default machinegun stats
                         
                         
                         System.out.println(menu.go); // pick this weapon ??
                         menu.YorN(); // yes or no
                         System.out.println(menu.barsbruh);
                         int choose = user.nextInt();
     
     
     
                         //======================================//
                         //==========  GUN PURCHASING  ==========//
                         //======================================//
     
     
     
                         
                         switch(choose) // if user clicks yes 
                         {
                             case 1:
                             System.out.printf(menu.custom,menu.guns[5]); // takes the value of the 0 in the string array from menu class 
                             Scanner user3 = new Scanner(System.in);
     
                            //Customize
                            System.out.println("");
                            //camo type
                            System.out.print(menu.camotype);
                            String camo = user3.nextLine();
                            //scope type
                            System.out.print(menu.scopetype);
                            String scope = user3.nextLine();
                            //modifications
                            System.out.print(menu.modtype);
                            String mods = user3.nextLine();
                            //ammo count
                            System.out.printf(menu.ammocount, menu.guns[5]);
                            System.out.println("");
                            String Sammo = user.next();
                            
                            try {
                                //if user inputs numbers that exceeds the maximum of double
                                BigDecimal Bigammo = new BigDecimal(Sammo);
                                double ammo = Bigammo.doubleValue();

                                     
                                
                            //cost of cosmetics/mods
                            int camobuy = 10;
                            int scopebuy = 20;
                            int modbuy = 50;
    
                            //if user dont put any cosmetics
                            boolean emptyCamo = camo.isEmpty();
                            boolean emptyScope = scope.isEmpty();
                            boolean emptyMod = mods.isEmpty();
    
                            //if true, the cosmetics cost will be 0 and the cosmetics will stay on default
                            if (emptyCamo == true )
                            {
                                camobuy = 0;
                                camo = "default";
    
                            }
                            if (emptyScope == true )
                            {
                                scopebuy = 0;
                                scope = "none";
                            }
                            if ( emptyMod == true )
                            {
                                modbuy = 0;
                                mods = "none";
                            }
    
                            //calculate total
                            double prices = camobuy + scopebuy + modbuy + ammo;
                            double weapon = stat.cost + prices;
                            //output
                            System.out.println(menu.barsbruh);
                            System.out.printf("Total cost [ $%,5.2f ]\n",weapon);
                            System.out.println(menu.buy); // purchase??
                            menu.YorN();// yes or no
                            System.out.println(menu.barsbruh);
                            int selecta = user.nextInt();
                            
                            
    
    
                            switch (selecta) //if user clicks yes 
                            {
                                case 1:
                                {
                                    if (coins >= weapon) // if user has enough money to buy
                                    {
    
                                        System.out.printf(menu.order,menu.guns[5]);
                                        machinegunBlueprint freshmachinegun = new machinegunBlueprint(camo, scope,mods, ammo);
                                        System.out.printf(menu.success,menu.guns[5]);
                                        System.out.printf("\n      [ -$%,5.2f ]\n",weapon);
                                        
                                        coins=coins - weapon;               
                                        break;
                                    }  
            
                                    else if (coins < weapon ) // if user is pooor
                                    {
                                        System.out.println(menu.barsbruh);
                                        System.out.println(menu.insuffecient);
                                        break;
                                    }    
    
                                    
                                }
                                
                            }
                               
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid input. Please enter a valid numeric value for ammo count.");
                            }

                             break;
                         }
                         
                     }break;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////         COPY PASTE          ////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
                      //rocket launcher
                      case 7:
                      {
      
                          System.out.printf(menu.stats,menu.guns[6]); // rocket launcher stats 
                          
                          rocketBlueprint stat = new rocketBlueprint(menu.camodef,menu.none,menu.none,menu.startAmmo); //output the default rocket launcher stats
                          
                          
                          System.out.println(menu.go); // pick this weapon ??
                          menu.YorN(); // yes or no
                          System.out.println(menu.barsbruh);
                          int choose = user.nextInt();
      
      
      
                          //======================================//
                          //==========  GUN PURCHASING  ==========//
                          //======================================//
      
      
      
                          
                          switch(choose) // if user clicks yes 
                          {
                              case 1:
                              System.out.printf(menu.custom,menu.guns[6]); // takes the value of the 0 in the string array from menu class 
                              Scanner user3 = new Scanner(System.in);
      
                             //Customize
                             System.out.println("");
                             //camo type
                             System.out.print(menu.camotype);
                             String camo = user3.nextLine();
                             //scope type
                             System.out.print(menu.scopetype);
                             String scope = user3.nextLine();
                             //modifications
                             System.out.print(menu.modtype);
                             String mods = user3.nextLine();
                             //ammo count
                             System.out.printf(menu.ammocount, menu.guns[6]);
                             System.out.println("");
                             String Sammo = user.next();
                            
                             try {
                                 //if user inputs numbers that exceeds the maximum of double
                                 BigDecimal Bigammo = new BigDecimal(Sammo);
                                 double ammo = Bigammo.doubleValue();
 
                                      
                                 
                             //cost of cosmetics/mods
                             int camobuy = 10;
                             int scopebuy = 20;
                             int modbuy = 50;
     
                             //if user dont put any cosmetics
                             boolean emptyCamo = camo.isEmpty();
                             boolean emptyScope = scope.isEmpty();
                             boolean emptyMod = mods.isEmpty();
     
                             //if true, the cosmetics cost will be 0 and the cosmetics will stay on default
                             if (emptyCamo == true )
                             {
                                 camobuy = 0;
                                 camo = "default";
     
                             }
                             if (emptyScope == true )
                             {
                                 scopebuy = 0;
                                 scope = "none";
                             }
                             if ( emptyMod == true )
                             {
                                 modbuy = 0;
                                 mods = "none";
                             }
     
                             //calculate total
                             double prices = camobuy + scopebuy + modbuy + ammo;
                             double weapon = stat.cost + prices;
                             //output
                             System.out.println(menu.barsbruh);
                             System.out.printf("Total cost [ $%,5.2f ]\n",weapon);
                             System.out.println(menu.buy); // purchase??
                             menu.YorN();// yes or no
                             System.out.println(menu.barsbruh);
                             int selecta = user.nextInt();
                             
                             
     
     
                             switch (selecta) //if user clicks yes 
                             {
                                 case 1:
                                 {
                                     if (coins >= weapon) // if user has enough money to buy
                                     {
     
                                         System.out.printf(menu.order,menu.guns[6]);
                                         rocketBlueprint freshrocket = new rocketBlueprint(camo, scope,mods, ammo);
                                         System.out.printf(menu.success,menu.guns[6]);
                                         System.out.printf("\n      [ -$%,5.2f ]\n",weapon);
                                         
                                         coins=coins - weapon;               
                                         break;
                                     }  
             
                                     else if (coins < weapon ) // if user is pooor
                                     {
                                         System.out.println(menu.barsbruh);
                                         System.out.println(menu.insuffecient);
                                         break;
                                     }    
     
                                     
                                 }
                                 
                             }
                                
                             } catch (NumberFormatException ex) {
                                 System.out.println("Invalid input. Please enter a valid numeric value for ammo count.");
                             }
 



                              break;
                          }
                          
                      }break;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
                } 


            }


            catch (InputMismatchException ex)
            {
                System.out.println("\n!! Invalid input !!\n");
                user.nextLine(); // Consume the invalid input

            }
                     

            return coins; // return and update the money variable in the main class
        }



    
}
