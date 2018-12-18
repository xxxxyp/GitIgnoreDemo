package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;

public class TestHttpUrlConnection {

	private final static String WZ="http://www.baidu.com";
	
	public static void get(){
		URL url;
		try {
			url = new URL(WZ);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setConnectTimeout(5000);
			conn.connect();
			InputStream inputStream = conn.getInputStream();
			byte[] data=new byte[1024];
			StringBuffer sb = new StringBuffer();
			int length=0;
			while((length=inputStream.read(data))!=-1){
				String s=new String(data,Charset.forName("utf-8"));
				sb.append(s);
			}
			System.out.println(sb.toString());
			inputStream.close();
			conn.disconnect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void useHttpURlConnection(){  
        HttpURLConnection conn = null;  
        URL url = null;  
        String result = "";  
        try {  
            url = new java.net.URL(WZ);  
            conn = (HttpURLConnection) url.openConnection();  
            conn.setConnectTimeout(10000);  
            conn.connect();  
  
            InputStream urlStream = conn.getInputStream();  
            BufferedReader reader = new BufferedReader(new InputStreamReader(urlStream));  
            String s = "";  
            while ((s = reader.readLine()) != null) {  
                result += s;  
            }  
            System.out.println(result);  
            reader.close();  
            urlStream.close();  
            conn.disconnect();  
        } catch (MalformedURLException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        } catch(Exception e){  
            e.printStackTrace();  
        }  
    }  
	public static void main(String[] args) {
			get();
			//useHttpURlConnection();
	}
}
