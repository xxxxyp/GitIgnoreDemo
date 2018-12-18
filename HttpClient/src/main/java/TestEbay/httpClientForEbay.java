package TestEbay;

import java.io.IOException;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.map.ObjectMapper;

import entity.inquirysummary.InquaryList;

public class httpClientForEbay {
	public static void main(String[] args) {
		//jacksonת����
		ObjectMapper mapper = new ObjectMapper();
		//�̶���ȡapi��ַ
		String url="https://api.ebay.com/post-order/v2/inquiry/search?";
//		String url="https://api.ebay.com/post-order/v2/cancellation/search?";
		//��һ��������һ��httpclient����
		CloseableHttpClient httpClient = HttpClients.createDefault();
		//�ڶ�����ͨ��httpget���÷����������
		HttpGet httpGet = new HttpGet(url);
		httpGet.setHeader("Accept","application/json");
		httpGet.setHeader("Content-Type","application/json");
		httpGet.setHeader("Authorization", "TOKEN AgAAAA**AQAAAA**aAAAAA**mb0iWQ**nY+sHZ2PrBmdj6wVnY+sEZ2PrA2dj6ACkoGkDZSFpw6dj6x9nY+seQ**P78DAA**AAMAAA**yJ9RapZlieuv8EB5rI40tTxKOevP2SF74M6BXr6ssLw2yL5v1oImqB9B3tCIEyZJPGmID0b8UaCXIjh5AfLQyjS1RcLICV4W5Y2fbRwp3wAO4197VWdLdBPU3p9+BhZMMA9YtcKp186IR54+yCw3l2un995ZoqGcvOafVGH1iN5Mfw+CubFhQ2wYx30jeKGlAgP7B3bw2YZeO0/bATDoOd3ZwZlhS40LP+UNsu562gKSZinrBQ9lqpL2AayKp4G1YIC3Qqs3Ast5kgiCgemCir6N7OiFeWVT/I0/P9Id3kYjOZCwE8QWZhUZS6i0OYtdDwbbIIM5Waj0WRta1E9MIkYSi1ZGT+l/AZT9TrtYZ5xNq1EWI74pUgg+CJ5xcWWBHXeinEsM9hKmA5w/1cKptT823hABe2DazeA4QfYelnHJm0YXDwKr1FHjJ+tu5UA59Gk/lrYpUVDGb4RGLNc1Dy5umHtje6PUPKPoqa9CkF31Kgqw16hMgLO8U5mp1no55Unilh242ja9qRD8Wt4VF+3kuUdTIdNUDd4FyFZEmuJqpON0LkpzwHGY5k8tDqcHK7tlCcFzZ9Ym2CmLs3XCPGlmUojLzcaraagcKhTUi6KOJG8ACkt9rox6/+dfyDMy99cWxGe1GgPloaNIdplrqAKV7VxHx0PBRzqtvYAN9DC5oBanJ8hEuCouK9SrMdJWV035GR+idqruAnGinc8gCcecvWO93gOKeloosmG07ssE3eNy+dg1Htd7KmCcmBwq");
		HttpPost method = new HttpPost(url);
		HttpParams para=null;
		try {
			//����ִ�У���ȡ���Է���������response
			HttpResponse httpResponse = httpClient.execute(httpGet);
			//�õ���������ʵ��������httpentity
			HttpEntity entity = httpResponse.getEntity();
			
			Header[] headers = httpResponse.getAllHeaders(); 
			InquaryList contentMap=null;
			if (httpResponse.getStatusLine().getStatusCode() == 200 && entity != null) {
				String content = EntityUtils.toString(entity,"utf-8");
				//��json���ת����ʵ����
				System.out.println(content);
				contentMap=mapper.readValue(content, InquaryList.class);
//				System.out.println(contentMap.toString());
//				System.out.println(contentMap.getTotalNumberOfInquiries());
			}
			/*for(int i=0;i<headers.length;i++){
				System.out.println(headers[i].getName() + ":  " + headers[i].getValue()); 
			}*/
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
