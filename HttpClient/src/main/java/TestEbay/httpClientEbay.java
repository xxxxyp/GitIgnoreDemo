package TestEbay;




import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.DateUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.w3c.dom.Document;
	
	  
	/** 
	 * HttpClient4.3������ 
	 *  
	 * @author tech 
	 * @date 2016-03-29 
	 * 
	 */  
	public class httpClientEbay {  
	    /*private static Logger logger = LoggerFactory  
	            .getLogger(httpClientEbay.class); // ��־��¼  
*/	  
	      
	    /** 
	     * post������json���� 
	     *  
	     * @param url 
	     *            url��ַ 
	     * @param json 
	     *            ���� 
	     * @return 
	     */  
	    public void testGetUserCases()
        {
            // ��̳���÷����ӣ������޸�url��ɾ�����ո�
            String endpoint = "https://api.ebay.com/post-order/v2/inquiry/search";

            StringBuffer url = new StringBuffer(512);
            
            url.append(endpoint);
            
            //����HttpClientBuilder  
            HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();  
            
            //HttpClient  
            CloseableHttpClient closeableHttpClient = httpClientBuilder.build();
            
            // ��׼����
            List<NameValuePair> standardNameValue = new ArrayList<NameValuePair>();
            standardNameValue.add(new BasicNameValuePair("SERVICE-NAME", "ResolutionCaseManagementService"));
            standardNameValue.add(new BasicNameValuePair("OPERATION-NAME", "getUserCases"));
            standardNameValue.add(new BasicNameValuePair("SERVICE-VERSION", "1.1.0"));
            standardNameValue.add(new BasicNameValuePair("REST-PAYLOAD", ""));
            
            
            //YYYY-MM-DDTHH:MM:SS.SSSZ
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            
            // 00:00:00 - 23:59:59
            Calendar startDate = Calendar.getInstance();
            startDate.add(Calendar.DAY_OF_MONTH, -1);
            
            Calendar endDate = Calendar.getInstance();
            
            standardNameValue.add(new BasicNameValuePair("creationDateRangeFilter.fromDate", sdf.format(startDate.getTime())));
            standardNameValue.add(new BasicNameValuePair("creationDateRangeFilter.toDate", sdf.format(endDate.getTime())));
            
            standardNameValue.add(new BasicNameValuePair("paginationInput.pageNumber", "1"));
            
            // default:200
            standardNameValue.add(new BasicNameValuePair("paginationInput.entriesPerPage", "25"));
            
            try
            {
                url.append("?").append(EntityUtils.toString(new UrlEncodedFormEntity(standardNameValue, "utf-8")));
            }
            catch (Exception e1)
            {
            }
            
            HttpGet httpGet = new HttpGet(url.toString());
            
            // auth token�ŵ�header��
            httpGet.addHeader("X-EBAY-SOA-SECURITY-TOKEN", "111");
            
          /*  try {  */
                
                //ִ��get����  
                HttpResponse httpResponse = null;
				try {
					httpResponse = closeableHttpClient.execute(httpGet);
				} catch (ClientProtocolException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
                
                //��ȡ��Ӧ��Ϣʵ��  
                HttpEntity entity = httpResponse.getEntity();  
                
                //�ж���Ӧʵ���Ƿ�Ϊ��  
                if (httpResponse.getStatusLine().getStatusCode() == 200 && entity != null) {  
                   /*
                    SAXReader saxReader = new SAXReader();
                   
                    Document doc = saxReader.read(entity.getContent());
                   
                    Element root = doc.getRootElement();
                   
                    Element ack = root.element("ack");
                   
                    if(ack != null && "Success".equals(ack.getText()))
                    {
                        
                        Element cases = root.element("cases");
                        
                        List<Element> caseSummaryList = cases.elements("caseSummary");
                        
                        for (Iterator<Element> it = caseSummaryList.iterator(); it.hasNext();)
                        {
                            Element caseSummary = it.next();
                            
                            Element caseId = caseSummary.element("caseId");
                            String id = caseId.elementText("id");
                            String type = caseId.elementText("type");
                            
                            Element user = caseSummary.element("user");
                            String userId = user.elementText("userId");
                            String role = user.elementText("role");
                            
                            Element other** = caseSummary.element("other**");
                            String other**UserId = other**.elementText("userId");
                            String other**Role = other**.elementText("role");
                            
                            Element status = caseSummary.element("status");
                            
                            // http://developer.ebay.com/DevZone/resolution-case-management/CallRef/getUserCases.html#Response.cases.caseSummary.status
                            // cancelTransactionStatus EBPINRStatus EBPSNADStatus INRStatus PaypalINRStatus PaypalSNADStatus returnStatus SNADStatus UPIStatus
                            String caseSummaryStatus = status.elementText("EBPINRStatus");
                            
                            Element item = caseSummary.element("item");
                            String itemId = other**.elementText("itemId");
                            String itemTitle = other**.elementText("itemTitle");
                            String transactionId = other**.elementText("transactionId");
                            
                            String caseQuantity = caseSummary.elementText("caseQuantity");
                            
                            Element caseAmount = caseSummary.element("caseAmount");
                            String currencyId = caseAmount.attributeValue("currencyId");
                            String caseAmountText = caseAmount.getText();
                            
                            String creationDate = caseSummary.elementText("creationDate");
                            String lastModifiedDate = caseSummary.elementText("lastModifiedDate");
                            
                            
                        }
                        
                    }
                    else
                    {
                        Element errorMessage = root.element("errorMessage");
                        
                        for (Iterator<Element> it = errorMessage.elementIterator("error"); it.hasNext();) {
                            Element student = (Element) it.next();
                            Element nameEle = student.element("parameter");
                            
                            System.out.println(nameEle.getText());
                        }
                    }
                   
                   
                }  
            } catch (IOException e) {  
                e.printStackTrace();  
            }
            catch (Exception e)
            {
                e.printStackTrace();
            } finally {  
                try {  
                //�ر������ͷ���Դ  
                closeableHttpClient.close();  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  */
            }
        }
      }
