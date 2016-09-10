package com.yihecloud.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;

public class DemoMain {

	public static void main(String[] args) {
      try {
    	BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));
    	System.out.print("请输入开始时间（格式：hh:mm:ss）：");  
        String startDate = strin.readLine();
        
        System.out.print("请输入结束时间（格式：hh:mm:ss）：");  
        String endDate = strin.readLine();
        
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    int totalSec=(int)(sdf.parse("2016-09-10 "+endDate).getTime()-sdf.parse("2016-09-10 "+startDate).getTime())/1000; 
		//时针、分针、秒针的速度
		double Vh=1.0/720,Vm=1.0/60,Vs=1.0;
		int count=0;
		for(int i=0;i<totalSec;i++)
		{
		if( (int)(Vh*i)%60==(int)(Vm*i)%60 && (int)(Vh*i)%60==(int)(Vs*i)%60 )
		{
		   count++;
		   }
		}
		   System.out.println("时针、分针一天共有"+count+"次重合！");
	} catch (Exception e) {
		e.printStackTrace();
	}
  }
}
