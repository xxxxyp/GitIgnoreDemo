package testOpenRecord;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONObject;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;


public class SendEmailUtil {

//	private static String apiurl="http://edm.yunkecrm.com/yunkeemail/RequestCampaign/452590427/0613545a-eaad-11e7-9ad6-448a5b0cb034";
	private static String apiurl=null;
	private HttpClient httpClient = null;
	private HttpPost methodPost=null;
	
	public SendEmailUtil(String url) {
		if(url!=null){
			this.apiurl=url;
		}
		if(apiurl!=null){
			httpClient = new DefaultHttpClient();
			methodPost=new HttpPost(apiurl);
		}
	}
	
	/**
	 * 调用api
	 * @param paras 
	 * @return
	 */
	public String post(String paras){
		String status=null;
		if(methodPost!=null&paras!=null&&!"".equals(paras.trim())){
			methodPost.addHeader("Content-type","application/json; charset=utf-8");  
			methodPost.setHeader("Accept", "application/json");  
			methodPost.setEntity(new StringEntity(paras, Charset.forName("UTF-8")));
			
			try {
				HttpResponse response = httpClient.execute(methodPost);
				int statusCode = response.getStatusLine().getStatusCode();
				status = EntityUtils.toString(response.getEntity());
			} catch (ClientProtocolException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return status;
	}
	
	
	
}
