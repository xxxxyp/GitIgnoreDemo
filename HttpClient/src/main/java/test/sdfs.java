package test;

import java.util.UUID;

import org.junit.Test;

import TestEmail.EmailRequestBase;

public class sdfs {

	public static void main(String[] args) {
	
		for(int i=0;i<10;i++){
			String upperCase = UUID.randomUUID().toString().replace("-", "").toUpperCase();
			System.out.println(upperCase);
		}
	}
	
	@Test
	public void test2(){
		
		int i=1000;
		System.out.println(i/200+1);
		
	}
	@Test
	public void test3(){
		
		int i=100;
		int count=i/20;
		int temp = 0;
		System.err.println(count);
//		if(i%20!=0){
//			count=i/20+1;
//		}else{
//			count =i/20;
//		}
		for(int j=0;j<count;j++){
			for(int k=j*20;k<(j+1)*20;k++){
				System.out.println(k);
				temp=k;
				
			}
			if(j==(count-1)){
				for(int d=temp+1;d<100;d++){
					System.err.println(d);
				}
			}
		}
	}
	
	@Test
	public void test4(){
		EmailRequestBase base=new EmailRequestBase();
		base.setReferId(null);
		base.setSubject("sfsd");
		System.out.println(base.toString());
	}
}
