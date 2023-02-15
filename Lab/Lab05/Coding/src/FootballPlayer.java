public class FootballPlayer extends Player {
    private int playerNumber;
    private String position;
    public void setPlayerNumber (int n) {
        playerNumber = n;
    }
    public int getPlayerNumber () {
        return playerNumber;
    }
    public void setPosition (String p) {
        position = p;
    }
    public String getPosition () {
        return position;
    }
    public boolean isSamePosition (FootballPlayer  p) {
        return ((p.getPosition().equals(this.getPosition()))& (p.getTeam().equals(this.getTeam())));
    }
}
