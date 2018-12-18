package TestPaypal;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.Map.Entry;
import java.util.StringTokenizer;

import javax.net.ssl.HttpsURLConnection;

import org.junit.Test;

import pojo.SearchTtansactionInfo;

public class SearchTransaction {

	/*@Test
	public void getEmailFromPaypal(String endtime) throws Exception {

		// 设置日期
		Calendar time = Calendar.getInstance();
		time.setTime(new Date());
		// time.add(Calendar.WEEK_OF_MONTH, -1);
		time.add(Calendar.YEAR, -2);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.'Z'");
		TimeZone utc = TimeZone.getTimeZone("UTC");
		sdf.setTimeZone(utc);

		String startdate = sdf.format(time.getTime());
		// String subject=paypalAccount;

		String url = "https://api-3t.paypal.com/nvp";
		String user = "paypal_api1.yunkecrm.com";
		String pwd = "LXKNJAD47Q37ESJ6";
		String signature = "AFcWxV21C7fd0v3bYYYRCpSSRl31ABSi0Dhu-1Ei-GsFMkVtKB4-6bw0";
		String subject = "xiezhie@me.com";
		String version = "109.0";
		String method = "TransactionSearch";
		// String startdate="2016-09-19T00:00:00Z";

		String agent = "Mozilla/5.0";

		
		 * https://api-3t.paypal.com/nvp? USER=paypal_api1.yunkecrm.com&
		 * PWD=LXKNJAD47Q37ESJ6&
		 * SIGNATURE=AFcWxV21C7fd0v3bYYYRCpSSRl31ABSi0Dhu-1Ei-GsFMkVtKB4-6bw0&
		 * SUBJECT=xiezhie@me.com& VERSION=109.0& METHOD=TransactionSearch&
		 * STARTDATE
		 * =2017-09-19T00:00:00Z&ENDDATE=2017-10-20T00:00:00Z&TRANSACTIONCLASS
		 * =All
		 

		StringBuilder respText = new StringBuilder("");
		HashMap nvp = null;

		StringBuilder encodedData = new StringBuilder("METHOD=").append(method)
				.append("&VERSION=").append(version).append("&PWD=")
				.append(pwd).append("&USER=").append(user)
				.append("&SIGNATURE=").append(signature).append("&SUBJECT=")
				.append(subject).append("&STARTDATE=").append(startdate);

		if (endtime != null || !endtime.equals("")) {
			encodedData.append("&ENDDATE=" + endtime);
		}

		// System.out.println(encodedData.toString());

		URL postURL = new URL(url);
		HttpsURLConnection conn = (HttpsURLConnection) postURL.openConnection();
		conn.setDoInput(true);
		conn.setDoOutput(true);

		conn.setRequestProperty("Content-Type",
				"application/x-www-form-urlencoded");// 窗体数据被编码为名称/值对
		conn.setRequestProperty("User-Agent", agent);
		conn.setRequestProperty("Content-Length",
				String.valueOf(encodedData.length()));
		conn.setRequestMethod("GET");

		// get the output stream to POST to.
		DataOutputStream output = new DataOutputStream(conn.getOutputStream());
		output.writeBytes(encodedData.toString());
		output.flush();
		output.close();

		int rc = conn.getResponseCode();

		// System.out.println(rc);

		if (rc != -1) {
			BufferedReader is = new BufferedReader(new InputStreamReader(
					conn.getInputStream()));
			String line = null;
			while (((line = is.readLine()) != null)) {
				respText.append(line);
			}

			// System.out.println("返回respText");
			// System.out.println(respText.toString());

			nvp = deformatNVP(respText.toString());

			String ACK = (String) nvp.get("ACK");
			System.out.println(ACK);
			if (ACK.equals("Failure") || ACK.endsWith("FailureWithWarning")) {
				System.out.println("对不起，没有这条数据.");
				conn.disconnect();
				return;
			}

			// 转为实体类方法
			handlerEntry(nvp);

			
			 * Iterator iter = nvp.entrySet().iterator(); while(iter.hasNext()){
			 * Entry entry = (Entry) iter.next();
			 * System.out.println("key:"+entry
			 * .getKey()+",value:"+entry.getValue()); }
			 
		}
		conn.disconnect();
	}*/

	/**
	 * paypal返回的数据转为实体类
	 * 
	 * @throws Exception
	 */
	public static void handlerEntry(HashMap nvp) throws Exception {

		// 转对象
		List<SearchTtansactionInfo> searchTransactionList = new ArrayList();

		System.out.println(322);
		for (int i = 0; i < 100; i++) {
			SearchTtansactionInfo searchTtansactionInfo =new SearchTtansactionInfo();
			
			searchTtansactionInfo.setTransaction_id(nvp.get("L_TRANSACTIONID"+i).toString());
			searchTtansactionInfo.setPaypal_account("wujieye1023@163.com");
			if(nvp.get("L_AMT"+i)!=null){
				searchTtansactionInfo.setAmt(Double.parseDouble(nvp.get("L_AMT"+i).toString()));
			}
			if(nvp.get("L_TYPE"+i)!=null){
				searchTtansactionInfo.setType(nvp.get("L_TYPE"+i).toString());
			}
			if(nvp.get("L_NAME"+i)!=null){
				searchTtansactionInfo.setName(nvp.get("L_NAME"+i).toString());
			}
			if(nvp.get("L_TIMEZONE"+i)!=null){
				searchTtansactionInfo.setTimezone(nvp.get("L_TIMEZONE"+i).toString());
			}
			if(nvp.get("L_EMAIL"+i)!=null){
				searchTtansactionInfo.setEmail(nvp.get("L_EMAIL"+i).toString());
			}
			if(nvp.get("L_CURRENCYCODE"+i)!=null){
				searchTtansactionInfo.setCurrency(nvp.get("L_CURRENCYCODE"+i).toString());
			}
			
			searchTransactionList.add(searchTtansactionInfo);
		}
		System.out.println(5423);
		System.out.println("获取到"+searchTransactionList.size()+"条数据");
		
		
		
		
		
		/*// 判断数据数量是否大于100
		System.out.println("判断数据是否大于100");
		String endtime = (String) nvp.get("L_TIMESTAMP99");
		// 如果大于100，回调方法
		if (endtime != null || !endtime.equals("")) {
			System.out.println("数据超过100条");
			System.out.println(endtime);
			// 重新调用api获取数据
			getEmailFromPaypal(endtime);
		}*/
	}

	/**
	 * 解码，格式化
	 * @param pPayload
	 * @return
	 */
	public HashMap deformatNVP(String pPayload) {
		HashMap nvp = new HashMap();
		StringTokenizer stTok = new StringTokenizer(pPayload, "&");
		while (stTok.hasMoreTokens()) {
			StringTokenizer stInternalTokenizer = new StringTokenizer(
					stTok.nextToken(), "=");
			if (stInternalTokenizer.countTokens() == 2) {
				String key;
				try {
					key = URLDecoder.decode(stInternalTokenizer.nextToken(),
							"UTF-8");
					String value;
					value = URLDecoder.decode(stInternalTokenizer.nextToken(),
							"UTF-8");
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


	
	
	
	
	
	
	
	
	
	
	/*public static void main(String[] args) {
		try {
			getEmailFromPaypal();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//方法的重构，不带参数 
	@Test
 	public void getEmailFromPaypal() throws Exception {

		System.out.println("begin");
		// 设置日期
		Calendar time = Calendar.getInstance();
		time.setTime(new Date());
		// time.add(Calendar.WEEK_OF_MONTH, -1);
		time.add(Calendar.YEAR, -3);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.'Z'");
		TimeZone utc = TimeZone.getTimeZone("UTC");
		sdf.setTimeZone(utc);

		String startdate = sdf.format(time.getTime());
		// String subject=paypalAccount;
		System.out.println(startdate);
		
		String url = "https://api-3t.paypal.com/nvp";
		String user = "paypal_api1.yunkecrm.com";
		String pwd = "LXKNJAD47Q37ESJ6";
		String signature = "AFcWxV21C7fd0v3bYYYRCpSSRl31ABSi0Dhu-1Ei-GsFMkVtKB4-6bw0";
		String subject = "xiezhie@me.com";
		String version = "109.0";
		String method = "TransactionSearch";
		// String startdate="2016-09-19T00:00:00Z";
		String endtime="2015-01-10'T'00:00:00.'Z'";
		String agent = "Mozilla/5.0";
		
		/*
		 * https://api-3t.paypal.com/nvp? USER=paypal_api1.yunkecrm.com&
		 * PWD=LXKNJAD47Q37ESJ6&
		 * SIGNATURE=AFcWxV21C7fd0v3bYYYRCpSSRl31ABSi0Dhu-1Ei-GsFMkVtKB4-6bw0&
		 * SUBJECT=xiezhie@me.com& VERSION=109.0& METHOD=TransactionSearch&
		 * STARTDATE
		 * =2017-09-19T00:00:00Z&ENDDATE=2017-10-20T00:00:00Z&TRANSACTIONCLASS
		 * =All
		 */

		StringBuilder respText = new StringBuilder("");
		HashMap nvp = null;

		StringBuilder encodedData = new StringBuilder("METHOD=").append(method)
				.append("&VERSION=").append(version).append("&PWD=")
				.append(pwd).append("&USER=").append(user)
				.append("&SIGNATURE=").append(signature).append("&SUBJECT=")
				.append(subject).append("&STARTDATE=").append(startdate)
				.append("&ENDDATE=" + endtime);
		// System.out.println(encodedData.toString());

		URL postURL = new URL(url);
		HttpsURLConnection conn = (HttpsURLConnection) postURL.openConnection();
		System.out.println(1);
		conn.setDoInput(true);
		conn.setDoOutput(true);

		conn.setRequestProperty("Content-Type",
				"application/x-www-form-urlencoded");// 窗体数据被编码为名称/值对
		conn.setRequestProperty("User-Agent", agent);
		conn.setRequestProperty("Content-Length",
				String.valueOf(encodedData.length()));
		conn.setRequestMethod("GET");

		// get the output stream to POST to.
		DataOutputStream output = new DataOutputStream(conn.getOutputStream());
		output.writeBytes(encodedData.toString());
		output.flush();
		output.close();
		System.out.println(2);
		int rc = conn.getResponseCode();

		System.out.println(rc);

		if (rc != -1) {
			BufferedReader is = new BufferedReader(new InputStreamReader(
					conn.getInputStream()));
			String line = null;
			while (((line = is.readLine()) != null)) {
				respText.append(line);
			}

			// System.out.println("返回respText");
			// System.out.println(respText.toString());

			nvp = deformatNVP(respText.toString());
			System.out.println(nvp.size());
			String ACK = (String) nvp.get("ACK");
			System.out.println(ACK);
			if (ACK.equals("Failure") || ACK.endsWith("FailureWithWarning")) {
				System.out.println("对不起，没有这条数据.");
				conn.disconnect();
				return;
			}

			// 转为实体类方法
			/*System.out.println("handlerEntry");
			handlerEntry(nvp);
			System.out.println("over");*/
			
			 Iterator iter = nvp.entrySet().iterator();
			 while(iter.hasNext()){
				 Entry entry = (Entry) iter.next();
				 System.out.println("key:"+entry.getKey()+",value:"+entry.getValue()); 
			 }
		}
		conn.disconnect();
	}

}
