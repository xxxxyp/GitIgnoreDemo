package TestPaypal;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.StringTokenizer;

import javax.net.ssl.HttpsURLConnection;

import org.junit.Test;



public class GetTransactionDetails {

	
	public static void main(String[] args) {
		
		try {
			String emailFromPaypal = getEmailFromPaypal();
			System.out.println(emailFromPaypal);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public static String getEmailFromPaypal() throws Exception{
		String url="https://api-3t.paypal.com/nvp";
		String user="paypal_api1.yunkecrm.com";
		String pwd="LXKNJAD47Q37ESJ6";
		String signature="AFcWxV21C7fd0v3bYYYRCpSSRl31ABSi0Dhu-1Ei-GsFMkVtKB4-6bw0";
		String subject="xiezhie@163.com";
		String version="109.0";
		String method="GetTransactionDetails";
		//String transactionid="5GL51632EB240943G";
		String transactionid="8PD40726NM335084M";
		
		String agent = "Mozilla/5.0";
		
		StringBuilder respText=new StringBuilder("");
		HashMap nvp=null;
		
		StringBuilder encodedData = new StringBuilder("METHOD=")
		.append(method)
		.append("&VERSION=")
		.append(version)
		.append("&PWD=")
		.append(pwd)
		.append("&USER=")
		.append(user)
		.append("&SIGNATURE=")
		.append(signature)
		.append("&SUBJECT=")
		.append(subject)
		.append("&TRANSACTIONID=")
		.append(transactionid);
		
		//System.out.println(encodedData.toString());
		
		 URL postURL = new URL(url);
         HttpsURLConnection conn = (HttpsURLConnection) postURL.openConnection();
         conn.setDoInput(true);
         conn.setDoOutput(true);

         conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");// 窗体数据被编码为名称/值对
         conn.setRequestProperty("User-Agent", agent);
         conn.setRequestProperty("Content-Length", String.valueOf(encodedData.length()));
         conn.setRequestMethod("GET");

         // get the output stream to POST to.
         DataOutputStream output = new DataOutputStream(conn.getOutputStream());
         output.writeBytes(encodedData.toString());
         output.flush();
         output.close();

         int rc = conn.getResponseCode();
         
        // System.out.println(rc);
         
         if (rc != -1) {
             BufferedReader is = new BufferedReader(new InputStreamReader(conn.getInputStream()));
             String line = null;
             while (((line = is.readLine()) != null)) {
                 respText.append(line);
             }
             
//             System.out.println("返回respText");
//             System.out.println(respText.toString());
             
             nvp = deformatNVP(respText.toString());
             
             String ACK=(String) nvp.get("ACK");
             System.out.println(ACK);
             if(ACK.equals("Failure")){
            	 System.out.println("对不起，没有这条数据.");
            	 conn.disconnect();
            	 return null;
             }
             System.out.println( nvp.get("EMAIL"));
             return (String) nvp.get("EMAIL");
             /*Iterator iter = nvp.entrySet().iterator();
             while(iter.hasNext()){
            	 Entry entry = (Entry) iter.next();
            	 System.out.println("key:"+entry.getKey()+",value:"+entry.getValue());
             }*/
         }
         conn.disconnect();
         return null;
	}
	public static HashMap deformatNVP(String pPayload) {
		HashMap nvp = new HashMap();
	    StringTokenizer stTok = new StringTokenizer(pPayload, "&");
	    while (stTok.hasMoreTokens()) {
	        StringTokenizer stInternalTokenizer = new StringTokenizer(stTok.nextToken(), "=");
	        if (stInternalTokenizer.countTokens() == 2) {
	            String key;
	            try {
	                key = URLDecoder.decode(stInternalTokenizer.nextToken(), "UTF-8");
	                String value;
	                value = URLDecoder.decode(stInternalTokenizer.nextToken(), "UTF-8");
	                nvp.put(key.toUpperCase(), value);
	            } catch (UnsupportedEncodingException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	               // Util4Logger.LOG_CHARGEERROR.info(e,e);
	            }
	        }
	    }
	    return nvp;
	}
}
