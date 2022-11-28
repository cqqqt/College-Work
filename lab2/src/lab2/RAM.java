package lab2;

public class RAM extends CPU {
public String MemorySupport;
public int volume;
public int Frequency;
public RAM() {}
public String getMemorySupport() {
	return MemorySupport;
}
public void setMemorySupport(String memorySupport) {
	MemorySupport = memorySupport;
}
public int getVolume() {
	return volume;
}
public void setVolume(int volume) {
	this.volume = volume;
}
public int getFrequency() {
	return Frequency;
}
public void setFrequency(int frequency) {
	Frequency = frequency;
}
}
