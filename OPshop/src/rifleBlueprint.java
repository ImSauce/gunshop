public class rifleBlueprint 
{
    //THE CLASS FOR THE RIFLE GUN



    //VARIABLES
    String camo = "default";
    String scope = "none";
    String mods= "none";
    double ammo = 0;

    final double firePower = 5;
    final double atkSpeed = 7;
    final double bulletPenetration = 7;

    final double range = 200;
    final double cost = 6000;
    final String weight= "heavy";
    

    public rifleBlueprint ( String camo,    String scope,   String mods,    double ammo ) //user input 
    {
        //output
        System.out.println("camo  = "+camo);
        System.out.println("scope = " +scope);
        System.out.println("mods  = " +mods);
        System.out.println("ammo  = " + ammo);
        System.out.println("firepower  = " + firePower);
        System.out.println("attack speed = " + atkSpeed);
        System.out.println("bulletpenetration = " +bulletPenetration);
        System.out.println("range = " +range);
        System.out.println("weight = "+ weight );
        System.out.println("cost = $" + cost);
        System.out.println("");


    }
}
   


    


/* 
 
System.out.println("\n\ncamo  = "+camo);
        System.out.println("scope = " +scope);
        System.out.println("mods  = " +mods);
        System.out.println("ammo  = " + ammo);
        System.out.println("firepower  = " + firePower);
        System.out.println("attack speed = " + atkSpeed);
        System.out.println("bulletpenetration = " +bulletPenetration);
        System.out.println("range = " +range);
        System.out.println("weight = "+ weight );

*/