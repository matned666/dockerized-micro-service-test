package utils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonOPS {

        public static String asJsonString(final Object obj) {
            try {
                final ObjectMapper mapper = new ObjectMapper();
                return mapper.writeValueAsString(obj);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
}
