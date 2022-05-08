package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;

@JsonTest
class BeerDtoTest extends BaseTest {
    @Test
    void testSerializedDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();
        String jsonString = objectMapper.writeValueAsString(beerDto);
        System.out.println(jsonString);
    }

    @Test
    void testDeserialize() throws IOException {
        String json = "{\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":123123123123,\"price\":\"12.99\",\"createdDate\":\"2022-05-08T11:30:21+0300\",\"lastUpdatedDate\":\"2022-05-08T11:30:21.028467+03:00\",\"myLocalDate\":\"20220508\",\"beerId\":\"feb42598-815e-46d2-a2c7-dc695b974a62\"}";
        BeerDto dto = objectMapper.readValue(json, BeerDto.class);
        System.out.println(dto);
    }
}