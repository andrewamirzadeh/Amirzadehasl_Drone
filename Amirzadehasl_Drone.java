public class Amirzadehasl_Drone {
	
	private int x_pos, y_pos, z_pos, orientation = 0;
	
	public Amirzadehasl_Drone() {
		x_pos = 0;
		y_pos = 0;
		z_pos = 0;
		orientation = 0;
	}

	public int getX_pos() {
		return x_pos;
	}

	public void setX_pos(int x_pos) {
		this.x_pos = x_pos;
	}

	public int getY_pos() {
		return y_pos;
	}

	public void setY_pos(int y_pos) {
		this.y_pos = y_pos;
	}

	public int getZ_pos() {
		return z_pos;
	}

	public void setZ_pos(int z_pos) {
		this.z_pos = z_pos;
	}

	public int getOrientation() {
		return orientation;
	}

	public void setOrientation(int orientation) {
		this.orientation = orientation;
	}

	public void moveUp() {
		z_pos++;
		System.out.println("You have moved up.");
	}

	public void moveDown() {
		if (z_pos == 0) {
			z_pos = 0;
		}
		else {
			z_pos--;
		}
		
		System.out.println("You have moved down.");
		
	}

	public void moveForward() {
		if(orientation == 0) {
			x_pos++;
		}
		else if(orientation == 1) {
			y_pos++;
		}
		else if(orientation == 2) {
			x_pos--;
		}
		else if(orientation == 3) {
			y_pos--;
		}
		System.out.println("You have moved forward.");
		
	}

	public void moveBackward() {
		if(orientation == 0) {
			x_pos--;
		}
		else if(orientation == 1) {
			y_pos--;
		}
		else if(orientation == 2) {
			x_pos++;
		}
		else if(orientation == 3) {
			y_pos++;
		}
		System.out.println("You have moved backward.");
		
	}

	public void turnLeft() {
		if(orientation == 0) {
			orientation = 3;
		}
		else if(orientation == 1) {
			orientation = 0;
		}
		else if(orientation == 2) {
			orientation = 1;
		}
		else if(orientation == 3) {
			orientation = 2;
		}
		System.out.println("You have turned left.");
		
	}

	public void turnRight() {
		if(orientation == 0) {
			orientation = 1;
		}
		else if(orientation == 1) {
			orientation = 2;
		}
		else if(orientation == 2) {
			orientation = 3;
		}
		else if(orientation == 3) {
			orientation = 0;
		}
		System.out.println("You have turned right.");
		
	}
	public String orientationConverter(int orientation) {
		String newOrientation = "";
		switch(orientation) {
		case 0: newOrientation = "North"; break;
		case 1: newOrientation = "East"; break;
		case 2: newOrientation = "South"; break;
		case 3: newOrientation = "West"; break;
		}
		
		return newOrientation;
		}
	
	@Override
    public String toString() {

        // returns a string representation of Drone's position

        return "Student_Drone (x= " + x_pos + ", y= " + y_pos + ", z= " + z_pos + " orientation = " + orientationConverter(orientation) + ")";

    }

}
