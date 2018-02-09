package testOpenRecord;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

public class JsonToBean {

	/**
	 * 测试开启率json转对象
	 * @throws Exception
	 */
	@Test
	public void test() throws Exception {

		String apiurl = "http://edm.yunkecrm.com/opentrackingList/452590427/0613545a-eaad-11e7-9ad6-448a5b0cb034";
		SendEmailUtil eutil = new SendEmailUtil(apiurl);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Integer task_id = 284041280;
		//String campaign_id = "8170277696";
		String campaign_id = "7277334848";
		// 获取同步时间
		Date start_time = sdf.parse("2018-02-02 16:02:46");
		Calendar startTime = Calendar.getInstance();
		startTime.setTime(start_time);
		String beginTime = sdf.format(startTime.getTime());// 开始时间
		startTime.add(Calendar.MINUTE, 30);
		String endTime = sdf.format(startTime.getTime());// 结束时间

		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("startTime", beginTime);
		map1.put("endTime", endTime);
		map1.put("campaignId", campaign_id);
		String jsonString = JSON.toJSONString(map1);
		String str = eutil.post(jsonString);
		
		
		OpenBean stu = JSON.parseObject(str, OpenBean.class);
		Map<String,Object> map=new HashMap<String,Object>();
		map = stu.getData();
		List<OpenRecord> list=JSON.parseArray(map.get(campaign_id).toString(),OpenRecord.class);
		if(list.size()==0||list==null){
			System.out.println("没有数据需要同步");
		}
//		System.out.println(list.get(0).getEmail());
	}
	
	
	/**
	 * 测试开启率json转对象
	 * @throws Exception
	 */
	@Test
	public void test2() throws Exception {
		
		String apiurl = "http://edm.yunkecrm.com/linktrackingList/452590427/0613545a-eaad-11e7-9ad6-448a5b0cb034";
		SendEmailUtil eutil = new SendEmailUtil(apiurl);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		List<ClickData> listdata=new ArrayList<ClickData>();
		ClickData click=null;
		
		Integer task_id = 2236480;
		//String campaign_id = "8170277696";
		String campaign_id = "8337218368";
		// 获取同步时间
		Date start_time = sdf.parse("2018-02-06 10:40:46");
		Calendar startTime = Calendar.getInstance();
		startTime.setTime(start_time);
		String beginTime = sdf.format(startTime.getTime());// 开始时间
		startTime.add(Calendar.MINUTE, 30);
		String endTime = sdf.format(startTime.getTime());// 结束时间
		
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("startTime", beginTime);
		map1.put("endTime", endTime);
		map1.put("campaignId", campaign_id);
		String jsonString = JSON.toJSONString(map1);
		String str = eutil.post(jsonString);
		
		
		ClickBean stu = JSON.parseObject(str, ClickBean.class);
		Map<String,Object> map=new HashMap<String,Object>();
		map = stu.getData();
		List<ClickRecord> list1=JSON.parseArray(map.get(campaign_id).toString(),ClickRecord.class);
		if(list1.size()==0||list1==null){
			System.out.println("没有数据需要同步");
			return;
		}
		System.out.println(list1.get(1).getDatas().get(0).getTime());
		System.out.println(list1.get(1).getDatas().get(1).getTime());
		System.out.println(list1.get(1).getDatas().get(2).getTime());
		System.out.println(list1.get(1).getDatas().get(3).getTime());
		System.out.println(list1.get(1).getDatas().get(4).getTime());
		for(int i=0;i<list1.size();i++){
			if(list1.get(i).getDatas().size()==0||list1.get(i).getDatas()==null){
				System.out.println("没有数据需要同步");
				continue;
			}
			int len=list1.get(i).getDatas().size();
			List<Datas> datas = list1.get(i).getDatas();
			System.out.println(len);
			for(int j=0;j<len;j++){
				click=new ClickData();
				click.setCompid(campaign_id);
				click.setTask_id(task_id);
				click.setEmail(list1.get(i).getDatas().get(j).getEmail());
				
				System.out.println("sdfsd"+list1.get(i).getDatas().get(j).getTime());
				click.setTime(list1.get(i).getDatas().get(j).getTime());
				
				click.setUrl(list1.get(i).getUrl());
				listdata.add(click);
			}
		}
		for(int k=0;k<listdata.size();k++){
			System.out.println(listdata.get(k).getEmail()+",时间："+listdata.get(k).getTime()+",url:"+listdata.get(k).getUrl());
		}
		System.out.println(listdata.get(0).getTime());
		System.out.println(listdata.get(1).getTime());
		System.out.println(listdata.get(2).getTime());
		System.out.println(listdata.get(3).getTime());
		System.out.println(listdata.get(4).getTime());
	}
	
	@Test
	public void test3() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date start_time = sdf.parse("2018-02-06 14:40:46");
		Calendar startTime = Calendar.getInstance();
		startTime.setTime(start_time);
		String beginTime=sdf.format(startTime.getTime());//开始时间
		startTime.add(Calendar.MINUTE, 30);
		Date end_time = startTime.getTime();
		if(end_time.getTime()> (new Date()).getTime()){
			end_time=new Date();
		}
		System.out.println(end_time);
	}
	
	
	
	
	
	
	/**
	 * 测试开启率json转对象
	 * @throws Exception
	 */
	@Test
	public void test4() throws Exception {

		String apiurl = "http://edm.yunkecrm.com/RequestEmailHistoryList/452590427/0613545a-eaad-11e7-9ad6-448a5b0cb034";
		SendEmailUtil eutil = new SendEmailUtil(apiurl);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Integer task_id = 284041280;
		//String campaign_id = "8170277696";
		String campaign_id = "8353797440";
		// 获取同步时间
		Date start_time = sdf.parse("2018-02-07 10:30:00");
		Calendar startTime = Calendar.getInstance();
		startTime.setTime(start_time);
		String beginTime = sdf.format(startTime.getTime());// 开始时间
		startTime.add(Calendar.MINUTE, 10);
		String endTime = sdf.format(startTime.getTime());// 结束时间

		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("startTime", beginTime);
		map1.put("endTime", endTime);
		map1.put("campaignId", campaign_id);
		map1.put("status", "success");
		String jsonString = JSON.toJSONString(map1);
		String str = eutil.post(jsonString);
		System.out.println(str);
		
		HistoryBean stu = JSON.parseObject(str, HistoryBean.class);
		Map<String,Object> map=new HashMap<String,Object>();
		map = stu.getData();
		List<HistoryRecord> list=JSON.parseArray(map.get(campaign_id).toString(),HistoryRecord.class);
		if(list.size()==0||list==null){
			System.out.println("没有数据需要同步");
		}
		System.out.println(list.size());
		System.out.println(list.get(0).getEmail());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
