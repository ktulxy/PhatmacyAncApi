package util;

import org.json.JSONObject;

public class Parse {

    public static Object parseJson(Object resp){

    Object obj = String.valueOf(new JSONObject(resp));

    System.out.println(obj);
     //System.out.println(obj.getString("name")); //John
        return obj;
    }
}
