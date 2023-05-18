public class sniperBlueprint 
{

      //THE CLASS FOR THE SNIPER GUN



    //VARIABLES
    String camo = "default";
    String scope = "none";
    String mods= "none";
    double ammo = 0;

    final double firePower = 10;
    final double atkSpeed = 2;
    final double bulletPenetration = 9;

    final double range = 10000;
    final double cost = 90000;
    final String weight= "heavy";
    

    public sniperBlueprint ( String camo,    String scope,   String mods,    double ammo ) //user input 
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
