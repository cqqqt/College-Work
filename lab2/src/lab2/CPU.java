package lab2;

public class CPU extends Hardware  {
public int core;
public double hrz;
public String generation;
public CPU() {}
public int getCore() {
	return core;
}
public void setCore(int core) {
	this.core = core;
}
public double getHrz() {
	return hrz;
}
public void setHrz(double hrz) {
	this.hrz = hrz;
}
public String getGeneration() {
	return generation;
}
public void setGeneration(String generation) {
	this.generation = generation;
}
}

