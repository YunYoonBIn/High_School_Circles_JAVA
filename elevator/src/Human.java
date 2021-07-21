
public class Human {

	// 변수 2개 만든다.
	String name;
	int weight;

	public Human() {

	}

	public Human(String name) {
		this.name = name;

	}

	public Human(int weight) {
		this.weight = weight;
	}

	public Human(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}