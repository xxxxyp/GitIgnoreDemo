package TestEbayPostOrderApi;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * 取消订单详情测试
 * @author Administrator
 * 
 */
public class Cancellation {

	public static void main(String[] args) throws ClientProtocolException, IOException {
//		String url="https://api.ebay.com/post-order/v2/cancellation/search?";
//		String creation_date_range_from="2017-08-30";
//		String creation_date_range_to="2017-5-30";
//		url=url+creation_date_range_from+creation_date_range_to;
		String url="https://api.ebay.com/post-order/v2/cancellation/search?";
			   url+="creation_date_range_from=2015-05-15T00:00:01.000Z&";
			   url+="creation_date_range_to=2015-06-15T23:59:59.000Z&limit=200&";
			   url+="sort=+CANCEL_REQUEST_DATE";
		CloseableHttpClient httpClient = HttpClients.createMinimal();
		HttpGet httpGet=new HttpGet(url);
		httpGet.setHeader("Accept", "application/json");
		httpGet.setHeader("Content-Type","application/json");
		httpGet.setHeader("Authorization", "TOKEN AgAAAA**AQAAAA**aAAAAA**dbeFWQ**nY+sHZ2PrBmdj6wVnY+sEZ2PrA2dj6ACkoGkDZSFpw6dj6x9nY+seQ**AckDAA**AAMAAA**YzalybifF9xPsvV/JcvAxUafO8w77xXRNaMEX3UWLkY1rqc6JAIIfTMPgfHANADC0YltR8gpB/SUIh22fVqBVEkz/aPG1zE3fxhFcbMs1nWwpzH5yjO4o4TrWbTa5jR9wCDbi/8zESDtv6TnNtt5PFLoEgnkg/ooryDC/3JgzhpuH0+jpKtcAlHhhYLPKR4gLSS07Av8aKfI6Bt3BoYa3Lkkx6dzzbxbKM/mtiiecRnOZqc45Kq9jJrrO3mpyQjRSNUBCZluFqdN3dKSmO6yLul1FSMzPhKWQx6FFgaX5wyVJN+c/B3Zbm/fjKpRDu63oFtzJsHpHEFBqPmkGP1GIpHRcvAWlpKCabNakTGc8ngVsLQlbaM8lymmFihvFSanS3YnK+ZF9tTLJXILYU8map+cGbKpT9Uf0QXnyqPGrQ1FBZvonIxVjH/6fufWwDl6Di2kZrROOKVkUF7Yb1St7ipyjfVM8QBoGWrvld0SH1ySCmDxyUeP71Fiek/F/q2lnJOv/8+X9M+XzN8w43B6wh30G+tFsbXUgoT3jaXxub3R5/qqZA2P2uIKqADEf61eqCe++hfamH7teCFPNQjLXN8hT6AUQLk9e6AKj/i5NVRS7p/ESwd/9lu23OOOKGyWcJCgauJOXAfmcwiotWAxB4BrPXA9WCwn8M3DPno/3/D+7E9DezeyiscmWoAQvU56gNHB4JRQTOn9D8FVg3Y80B/clabqqJUsadwTEWeKuedidw6xCdsIPypZADcOKvQb");
		
		HttpResponse response = httpClient.execute(httpGet);
		HttpEntity entity = response.getEntity();
		if (response.getStatusLine().getStatusCode() == 200 && entity != null) {
			String content = EntityUtils.toString(entity,"utf-8");
			System.out.println(content.length());
			System.out.println(content);
		}
		
		if(response.getStatusLine().getStatusCode()!= 200){
			System.out.println(response.getStatusLine().getStatusCode());
			System.out.println("错误");
		}
	}
}
