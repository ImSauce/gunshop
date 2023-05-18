public class smgBlueprint 
{
     //THE CLASS FOR THE SMG GUN



    //VARIABLES
    String camo = "default";
    String scope = "none";
    String mods= "none";
    double ammo = 0;

    final double firePower = 3;
    final double atkSpeed = 10;
    final double bulletPenetration = 2;

    final double range = 100;
    final double cost = 2500;
    final String weight= "light";
    

    public smgBlueprint ( String camo,    String scope,   String mods,    double ammo ) //user input 
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
