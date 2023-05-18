public class rocketBlueprint 
{

    //THE CLASS FOR THE MACHINE GUN



    //VARIABLES
    String camo = "default";
    String scope = "none";
    String mods= "none";
    double ammo = 0;

    final double firePower = 20;
    final double atkSpeed = 1;
    final double bulletPenetration = 2;

    final double range = 9000;
    final double cost = 200000;
    final String weight= "very heavy";
    

    public rocketBlueprint ( String camo,    String scope,   String mods,    double ammo ) //user input 
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
