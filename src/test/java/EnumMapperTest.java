import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EnumMapperTest {
	
	private final ObjectMapper mapper = new ObjectMapper(); 

	@Test
	public void test() throws JsonProcessingException {
		Demo demo = new Demo();
		demo.setDemoNumber(NumberEnum.TWO);
		String json =mapper.writerWithDefaultPrettyPrinter().writeValueAsString(demo);
		System.out.println(json);
		Demo read = mapper.readValue(json, demo.getClass());
		System.out.println(read);
	}

}
