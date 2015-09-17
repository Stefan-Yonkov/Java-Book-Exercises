package lesson_11Classes;

public class Display {
	
	private int width;
	private int length;
	private int size;
	private int colours;
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLenght() {
		return length;
	}
	public void setLenght(int lenght) {
		this.length = lenght;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int width, int lenght) {
		this.size = width * lenght;
	}
	public int getColours() {
		return colours;
	}
	public void setColours(int colours) {
		this.colours = colours;
	}

	
}
