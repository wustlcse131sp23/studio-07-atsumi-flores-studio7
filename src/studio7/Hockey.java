package studio7;

import java.util.Random;

public class Hockey {

	public class HockeyPlayer {
	    
	    private String name;
	    private int jerseyNumber;
	    private String handedness;
	    private int goals;
	    private int assists;
	    private int points;
	    private int gamesPlayed;
	    
	    public HockeyPlayer(String name, int jerseyNumber, String handedness) {
	        this.name = name;
	        this.jerseyNumber = jerseyNumber;
	        this.handedness = handedness;
	        this.goals = 0;
	        this.assists = 0;
	        this.points = 0;
	        this.gamesPlayed = 0;
	    }
	    
	    public void recordStats(int goals, int assists) {
	        this.goals += goals;
	        this.assists += assists;
	        this.points += goals + assists;
	        this.gamesPlayed++;
	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	    public int getJerseyNumber() {
	        return jerseyNumber;
	    }
	    
	    public String getHandedness() {
	        return handedness;
	    }
	    
	    public int getGoals() {
	        return goals;
	    }
	    
	    public int getAssists() {
	        return assists;
	    }
	    
	    public int getPoints() {
	        return points;
	    }
	    
	    public int getGamesPlayed() {
	        return gamesPlayed;
	    }
	    
	    @Override
	    public String toString() {
	        return "Name: " + name + "\n" +
	               "Jersey Number: " + jerseyNumber + "\n" +
	               "Handedness: " + handedness + "\n" +
	               "Goals: " + goals + "\n" +
	               "Assists: " + assists + "\n" +
	               "Points: " + points + "\n" +
	               "Games Played: " + gamesPlayed;
	    }
	}
	  
	
	
	}




