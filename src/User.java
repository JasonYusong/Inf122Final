import java.util.HashMap;

class User{
	String name;
	// int[] {wins, losses, ties}
	HashMap<String, int[]> stats;

	User(String name){
		this.name = name;
		stats = new HashMap<String, int[]>();

	}	

	void addStat(String game, int score){
		int[] g = stats.get(game);
		if(g == null){
			stats.put(game, new int[3]);
			g = stats.get(game);
		}
		switch(score){
			case -1:
				g[1]++;
				break;
			case 0:
				g[2]++;
				break;
			case 1:
				g[0]++;
				break;
			default:
				System.out.println("invalid score");
		}
	}

	// getters and setters
	String getName(){return name;}
	int[] getStats(String game){return stats.get(game);}

}
