package TestEmail;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import com.alibaba.fastjson.JSON;


public class TestResfulEmail {

	private static String apiurl="http://edm.yunkecrm.com/yunkeemail/RequestCampaign/452590427/0613545a-eaad-11e7-9ad6-448a5b0cb034";
	private HttpClient httpClient = null;
	private HttpPost methodPost=null;
	
	public TestResfulEmail(String url) {
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
		/**
		 * 调用api
		 * @param paras 
		 * @return
		 */
//		public String post(Integer paras){
//			String status=null;
//			if(methodPost!=null&paras!=null){
//				methodPost.addHeader("Content-type","application/json; charset=utf-8");  
//				methodPost.setHeader("Accept", "application/json");  
//				methodPost.setEntity(new StringEntity(paras, Charset.forName("UTF-8")));
//				
//				try {
//					HttpResponse response = httpClient.execute(methodPost);
//					int statusCode = response.getStatusLine().getStatusCode();
//					status = EntityUtils.toString(response.getEntity());
//				} catch (ClientProtocolException e) {
//					e.printStackTrace();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//			return status;
//	}
	
	/**
	 * 测试
	 * @param args
	 */
	public static void main(String[] args) {
		//测试邮件发送
		TestResfulEmail email = new TestResfulEmail(apiurl);
		String paras = email.testBeadToJSON();
		System.err.println(email.post(paras));
		
		//测试邮件开启率
//		TestResfulEmail email = new TestResfulEmail("http://edm.yunkecrm.com/opentrackingList/452590427/0613545a-eaad-11e7-9ad6-448a5b0cb034");
//		String paras = "7277334848";
//		String str = email.post(paras);
//		System.out.println(str);
//		Map<String,Object> map=new HashMap<String,Object>();
//		map.put("data", OpenReport.class);
//		JSONObject jsonObject1=JSONObject.fromObject(str);
//		OpenReportBase stu=(OpenReportBase)JSONObject.toBean(jsonObject1, OpenReportBase.class,map);
//		
//		List<OpenReport> datas = stu.getData();
//		System.err.println(datas.size());
//		System.err.println(datas.get(0).getTime());
//		System.err.println(datas.get(0).getEmail());
		
		//测试邮件点击率
//		TestResfulEmail email = new TestResfulEmail("http://edm.yunkecrm.com/Multilinktracking/452590427/0613545a-eaad-11e7-9ad6-448a5b0cb034");
//		String paras = email.listToJson();
//		System.out.println(email.post(paras));
		
		//email report
//		TestResfulEmail email = new TestResfulEmail("http://edm.yunkecrm.com/EmailReport/452590427/0613545a-eaad-11e7-9ad6-448a5b0cb034");
//		String paras = "7248067392";
//		System.out.println(email.post(paras));
	}
	
    public String testBeadToJSON(){
    	
    	 EmailRequestBase base= new EmailRequestBase();
		 From from = new From();
		 To to=new To();
		 List<To> list=new ArrayList<To>();
		 from.setEmail("wsed");
//		 from.setReply("sdf");
//		 from.setEmail("sdf");
//		 from.setSender("sdf");
		 
		 for(int i= 0;i<100;i++){
			 to.setEmail("15216265283@163.com");
			 list.add(to);
		 }
		 base.setFrom(from);
		 base.setTo(list);
		 base.setSubject("love you");
		 base.setContent("这是一个爱你的人发给你的祝福\n[#UNSUBSCRIBE_LINK#]");
		 
        
        JSONObject jsonObject = JSONObject.fromObject(base);
        String paras = jsonObject.toString();
        System.out.println(paras);
        return paras;
    }
    
    public String listToJson(){
    	List<String> list=new ArrayList<String>();
//    	list.add("6978204480");
//    	list.add("6978204480");
    	list.add("6978204493");
    	
    	return list.toString();
    }
    
   
}
