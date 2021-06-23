package files;

public class Payload {

    public static String AddPlace () {
        return "{\n" +
                "  \"location\": {\n" +
                "    \"lat\": -38.383494,\n" +
                "    \"lng\": 33.427362\n" +
                "  },\n" +
                "  \"accuracy\": 50,\n" +
                "  \"name\": \"Savoy\",\n" +
                "  \"phone_number\": \"+18472342343\",\n" +
                "  \"address\": \"7226 W Belden ave\",\n" +
                "  \"types\": [\n" +
                "    \"Bar - lounge - restaurant\",\n" +
                "    \"entertainment center\"\n" +
                "  ],\n" +
                "  \"website\": \"http://www.savoy-lounge.com\",\n" +
                "  \"language\": \"Russian-RU\"\n" +
                "}";
    }

}
