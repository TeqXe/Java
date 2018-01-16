package day03.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fail_Fast {
	
	private static List<Integer> list = new ArrayList<>();  
    
    /** 
     * Desk:线程one迭代list 
     * @Project:test 
     * @file:FailFastTest.java 
     * @Authro:chenssy 
     * @data:2014年7月26日 
     */  
    private static class threadOne extends Thread{  
        public void run() {  
            Iterator<Integer> iterator = list.iterator();  
            while(iterator.hasNext()){  
                int i = iterator.next();  
                System.out.println("ThreadOne 遍历:" + i);  
                try {  
                    Thread.sleep(5);  
                } catch (InterruptedException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
    }  
      
    /** 
     * Desk:当i == 3时，修改list 
     * @Project:test 
     * @file:FailFastTest.java 
     * @Authro:chenssy 
     * @data:2014年7月26日 
     */  
    private static class threadTwo extends Thread{  
        public void run(){  
            int i = 0 ;   
            while(i < 6){  
                System.out.println("ThreadTwo run：" + i);  
                if(i == 3){  
                    list.remove(i);  
                    System.out.println(list);
                }  
                i++;  
            }  
        }  
    }  
      
    public static void main(String[] args) {  
        for(int i = 0 ; i < 10;i++){  
            list.add(i);  
        }  
        new threadOne().start();  
        new threadTwo().start();  
    }  

}
