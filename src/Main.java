// package src;
// import org.json.JSONObject;
// import org.json.JSONArray;
import java.util.ArrayList;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class Main {

    public static void main(String[] args) throws Exception{
        // System.out.println("Hello World"); 

        Object jParser = new JSONParser().parse(new FileReader("response.json"));

        JSONObject matchDto = (JSONObject) jParser;

        // System.out.println(matchDto.get("metadata")); 
        
        JSONObject matchInfo = (JSONObject) matchDto.get("info");

        // System.out.println(matchInfo.get("participants")); 
        
        JSONArray partcipants = (JSONArray) matchInfo.get("participants"); 
        
        // Object[] me = partcipants.toArray(); 
        ArrayList<JSONObject> playerData = new ArrayList<JSONObject>();

        // JSONObject playerData[] = (JSONObject[]) partcipants.toArray();
        //  = new JSONObject()[10];

        for(int i = 0; i < partcipants.size(); i++){
            // System.out.println(playerData[i].get("summonerName"));
            // playerData[i
            playerData.add((JSONObject)partcipants.get(i));
        }

        for(int i = 0; i < partcipants.size(); i++){
            // System.out.println(playerData.get(i).);
            // playerData.add(partcipants.get(i));
            System.out.println(playerData.get(i).get("summonerName"));
        }
        // "summonerName"
        
    }
}