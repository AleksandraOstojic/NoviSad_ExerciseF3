
// Before you commit and push write your student ID and finish time here.
// Finish time:
// Student ID:

public class PlanetExplorer {
	
	private int x,y; //coordinates of a grid
	private int obs_x, obs_y; //coordinates of obstacles
	private int pos_x, pos_y; //  explorer position
	private String direction="N";
	private String obstacles;
	
	
	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use: For a 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  
		 
	 */
		this.pos_x=0;
		this.pos_y=0;
		this.x=x;
		this.y=y;
		this.obstacles=obstacles;
		
		String[] splited = obstacles.split("(|\\,|\\)");
		this.obs_x = Integer.parseInt(splited[0]);
		this.obs_y = Integer.parseInt(splited[1]);
		
		
		
	}
	

	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		switch(command){
		
		case "f":
			if(this.direction == "N")
			{
				if(obs_y==pos_y)
					return "("+pos_x+","+pos_y+","+direction+")"+"("+obs_x+","+obs_y+")";
				else
				{
					this.pos_y++;
					return "("+pos_x+","+pos_y+","+direction+")"+"("+obs_x+","+obs_y+")";
				}
			}
		
		}
		
		return null;
	}
	
}
