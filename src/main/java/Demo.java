import com.fasterxml.jackson.annotation.JsonProperty;

public class Demo {
	
	@JsonProperty("myNumber")
	private NumberEnum demoNumber;

	public NumberEnum getDemoNumber() {
		return demoNumber;
	}

	public void setDemoNumber(NumberEnum demoNumber) {
		this.demoNumber = demoNumber;
	}

	@Override
	public String toString() {
		return "Demo [demoNumber=" + demoNumber + "]";
	}
	
	

}
