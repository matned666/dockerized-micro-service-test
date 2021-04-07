package eu.mrndesign.matned;

public class JsonOps {

    private int numberOfFieldsAdded;
    private StringBuilder json;

    public JsonOps() {
        numberOfFieldsAdded = 0;
        json = new StringBuilder();
    }

    public String getJson() {
        json.append("}");
        return json.toString();
    }

    public JsonOps add(String fieldName, String fieldData){
        if (json.length() == 0) json.append("{");
        if (numberOfFieldsAdded > 0) json.append(",");
        json.append("\"").append(fieldName).append("\"").append("=");
        json.append("\"").append(fieldData).append("\"");
        return this;
    }

}
