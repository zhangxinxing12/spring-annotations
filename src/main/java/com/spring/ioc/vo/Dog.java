package com.spring.ioc.vo;

public class Dog {
    private int age=5;
    private String color;
    
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public Dog(int age, String color) {
		super();
		this.age = age;
		this.color = color;
		System.out.println("dog�вι��챻����");
	}
    
	public Dog() {
		super();
		System.out.println("dog�޲ι��챻����");
	}
	/**
	 * toStringֻ����������µ����˲Ż�����������
	 */
	@Override
	public String toString() {
		return "Dog [age=" + age + ", color=" + color + "]";
	}
	
}
