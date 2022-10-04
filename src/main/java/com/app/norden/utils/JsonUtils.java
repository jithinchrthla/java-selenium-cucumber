package com.app.norden.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Map;

public class JsonUtils {

    static String jsonPath;
    static String fieldValue = null;

    public static String getFieldValue(String fileName, String fieldName) throws IOException {

        jsonPath = System.getProperty("user.dir") + "/src/test/resources/InputFiles/" + fileName + ".json";
        try {
            // create object mapper instance
            ObjectMapper mapper = new ObjectMapper();
            // convert JSON file to map
            Map<?, ?> map = mapper.readValue(Paths.get(jsonPath).toFile(), Map.class);
            fieldValue = map.get(fieldName).toString();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return fieldValue;
    }
}
