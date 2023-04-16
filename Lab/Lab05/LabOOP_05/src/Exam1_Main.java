public class Exam1_Main {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.setName("Bank");
        p1.setTeam("Gate OR");
        
        Player p2 = new Player();
        p2.setName("Khim");
        p2.setTeam("Gate OR");
        
        if(p1.isSameTeam(p2))
            System.out.println(p1.getName() + " is a same team with " + p2.getName());
        else
            System.out.println(p1.getName() + " is not a same team with " + p2.getName());
        
        System.out.println("");
        
        Player p3 = new Player();
        p3.setName("Bank");
        p3.setTeam("Gate OR");

        Player p4 = new Player();
        p4.setName("Khim");
        p4.setTeam("Gate AND");

        if (p3.isSameTeam(p4))
            System.out.println(p3.getName() + " is a same team with " + p4.getName());
        else
            System.out.println(p3.getName() + " is not a same team with " + p4.getName());
    
        System.out.println("");
        
        /* error
        Player p5 = new Player();
        p5.setName("Bank");
        p5.setTeam("Gate OR");
        System.out.println(p5.name);
        */
  }
}
