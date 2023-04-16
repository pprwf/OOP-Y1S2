public class Player {
    private String name;
    private String team;
    public void setName (String n) {
        name = n;
    }
    public String getName () {
        return name;
    }
    public void setTeam (String t) {
        team = t;
    }
    public String getTeam () {
        return team;
    }
    public boolean isSameTeam (Player p) {
        return team.equals(p.getTeam());
    }
}
