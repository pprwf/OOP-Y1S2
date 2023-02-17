public class Exam2_Main {
    public static void main(String[] args) {
        FootballPlayer p1 = new FootballPlayer();
        p1.setName("Harry");
        p1.setTeam("Gryffindor");
        p1.setPlayerNumber(1);
        p1.setPosition("keeper");

        FootballPlayer p2 = new FootballPlayer();
        p2.setName("Jame");
        p2.setTeam("Gryffindor");
        p2.setPlayerNumber(1);
        p2.setPosition("keeper");
        
        System.out.println("We are same position : " + p1.isSamePosition(p2));
        System.out.println("We are same team : "+ p1.isSameTeam(p2));
        
        System.out.println("");
        
        FootballPlayer p3 = new FootballPlayer();
        p3.setName("Harry");
        p3.setTeam("Gryffindor");
        p3.setPlayerNumber(1);
        p3.setPosition("keeper");

        FootballPlayer p4 = new FootballPlayer();
        p4.setName("Jame");
        p4.setTeam("Gryffindor");
        p4.setPlayerNumber(1);
        p4.setPosition("fullback");

        System.out.println("We are same position : " + p3.isSamePosition(p4));
        System.out.println("We are same team : "+ p3.isSameTeam(p4)); 
    }
}
