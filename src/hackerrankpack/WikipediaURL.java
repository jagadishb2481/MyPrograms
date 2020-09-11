package hackerrankpack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.JsonParser;
/*
Find the frequency of the 


*/public class WikipediaURL {
	
	static int getTopicCount(String topic) {
		
		String strurl = "https://en.wikipedia.org/w/api.php?action=parse&section=0&prop=text&format=json&page="+topic;
		int count=0;
		try {
			
			URL url = new URL(strurl);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String str ="";
			StringBuilder builder = new StringBuilder();
			while((str=br.readLine())!=null) {
				builder=builder.append(str);
			}
			br.close();
			con.disconnect();
			String res = new String(builder);
			JsonParser parser = new JsonParser();
			String text = parser.parse(res).getAsJsonObject().get("parse").getAsJsonObject().get("text").getAsJsonObject().toString(); 
			
			int fromIndex=0;
			while(fromIndex!=-1) {
				fromIndex=text.indexOf(topic, fromIndex);
				if(fromIndex!=-1) {
					count++;
					fromIndex+=topic.length();
				}
			}
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return count;
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println(getTopicCount("pizza"));

	}

}
