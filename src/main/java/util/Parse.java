package util;

import org.json.JSONObject;

public class Parse {

    public static void parseJson(){

    JSONObject obj = new JSONObject("{\"name\": \"John\"}");

     System.out.println(obj.getString("name")); //John
    }
}
