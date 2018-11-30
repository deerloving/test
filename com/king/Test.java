package com.king;

import java.awt.HeadlessException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

import com.king.factory.INoodles;
import com.king.factory.SimpleNoodlesFactory;

public class Test {
	
	
	
	public static void main(String[] args) throws HeadlessException, UnsupportedEncodingException, ParseException {
		
//		collectionTest();
		
//		missBaby();
		
//		stringTest();
		
		System.out.println(System.currentTimeMillis());
		
//		INoodles noodle = SimpleNoodlesFactory.createNoodles(1);
//		
//		noodle.desc();
		
//		mapTest();
		
//		BasetypeTest.byteTest((byte)129);
		
		Map<String,Object> map = new HashMap<String,Object>();
		
		map.put("��һ��", "�߾�����Ȯ");
		map.put("�ڶ���", "���Ȯ");
		map.put("������", "�¹�����Ȯ");
		map.put("������", "��ëѰ��Ȯ");
		map.put("������", "ϲ�ֵ�����Ȯ");
		map.put("������", "��������Ѱ��Ȯ");
		map.put("������", "����Ȯ");
		map.put("�ڰ���", "������Ȯ");
		map.put("�ھ���", "�Ĵ���������Ȯ");
		map.put("��ʮ��", "���޿������»�Ȯ");
		mapView(map);
		
	}
	
	/**
	 * map����
	 * 1.hashmap�Ƿ��̰߳�ȫ�ģ�hashtable���̰߳�ȫ�ģ�����hashmapЧ�ʿ�
	 * 2.hashmap��key��value������Ϊ�գ���hashtable������Ϊ�գ�Ϊ�ջᱨ��
	 */
	public static void mapTest(){
		HashMap map = new HashMap();
		map.put(null, null);
		System.out.println(map.get(null));
		
		Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer> ();
		table.put(123, 123);
		System.out.println(table.get(123));
	}
	
	/**
	 * ����map
	 * @param map
	 */
	public static void mapView(Map<String,Object> map){
		/*
		 * ��һ�ַ�ʽ��entryset
		 */
		for(Map.Entry<String, Object> entry : map.entrySet()){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		/*
		 * �ڶ��ַ�ʽ��ʹ��keyset
		 */
//		for (String key : map.keySet()) {
//			System.out.println(key);
//			System.out.println(map.get(key));
//		}
		
		/*
		 * �����ַ�ʽ��ʹ��iterator
		 */
//		Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
//		while (iterator.hasNext()) {
//			Map.Entry<String, Object> entry = iterator.next();
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
//		}
	}
	
	/**
	 * ���������
	 */
	public static void collectionTest(){
		Collection list = new ArrayList<String>();//����һ��list����
		//��list����������
		list.add("����");
		list.add("ϲ��");
		list.add("����");
		//��ȡ��list����ĵ�����
		Iterator it = list.iterator();
		//ʹ�õ�����ѭ�����list�е�����
		while(it.hasNext()){
			Object obj = it.next();
			if(obj instanceof String){
				System.out.println(obj);
			}
		}
	}
	
	/**
	 * String����
	 */
	public static void stringTest(){
		String s;//String���͵����ã�û�г�ʼ������
	    String str = new String("hello");

	    String after_str = "hello";
	    System.out.println(str + after_str);
	}
	
	/**
	 * �뱦����ʱ�䣬��Ϊ���Ǳ��������ˡ�
	 * @throws ParseException 
	 */
	public static void missBaby() throws ParseException{
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//���ڸ�ʽ����ȷ����
		
		double lastTime = (double)sd.parse("2018-06-02 22:41:00").getTime();//�ϴθ�����������ʱ��
		
		double nowTime = (double)sd.parse(sd.format(new Date())).getTime();//���ڵ�ʱ��
		
		System.out.println("�ϴθ�����������ʱ�䣺2018-06-02 22:41:00");
		
		System.out.println("���ڵ�ʱ�䣺" + sd.format(new Date()));
		
		System.out.println("���Ѿ��У�" + (nowTime - lastTime) / 1000 / 60 / 60 / 24  + "��û�и����������ˣ��Һ��뱦��");//���:��λ��
		
		System.out.println("���Ѿ��У�" + (nowTime - lastTime) / 1000 + "��û�и����������ˣ����뱦��");//���:��λ��
		
		System.out.println("���Ѿ��У�" + (nowTime - lastTime) / 1000 + "��û�и����������ˣ����뱦��");//���:��λ��
		
		System.out.println("���Ѿ��У�" + (nowTime - lastTime) / 1000 + "��û�и����������ˣ����뱦��");//���:��λ��
		
		System.out.println(System.currentTimeMillis());
		
	}
}
