public class shotgunBlueprint 
{

    //THE CLASS FOR THE SHOTGUN



    //VARIABLES
    String camo = "default";
    String scope = "none";
    String mods= "none";
    double ammo = 0;

    final double firePower = 9;
    final double atkSpeed = 3;
    final double bulletPenetration = 5;

    final double range = 50;
    final double cost = 4000;
    final String weight= "heavy";
    

    public shotgunBlueprint ( String camo,    String scope,   String mods,    double ammo ) //user input 
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
