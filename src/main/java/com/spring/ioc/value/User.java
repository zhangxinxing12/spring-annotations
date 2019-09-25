package com.spring.ioc.value;

import org.springframework.beans.factory.annotation.Value;

/**
 * @Value��ֵ
 * ������ע��
 * �Է���ע��
 * �Է����еĲ���ע��
 * ��ֵ�ķ�ʽ��1.�����ַ�   2.springEL���ʽ  3.��ȡ�����ļ�
 * @author pt -zhangxinxing
 *
 */
public class User {
    @Value("zhangsan")
	private String name;
    
	private int age;
	//@Value("${user.color}")
	private String color;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	@Value("#{25-3}")//springEL���ʽ
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getColor() {
		return color;
	}
	
	/**
	 * ��ȡproperties�ļ��е�ֵ---�������ļ��мӸ�ע��
	 * @param color
	 */
	public void setColor(@Value("${user.color}") String color) {
		this.color = color;
	}
	/*public void setColor(@Value("red") String color) {
	    this.color = color;
    }*/
	public User(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}
	
	public User() {
		super();
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", color=" + color + "]";
	}	
	
}
