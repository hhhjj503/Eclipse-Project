package com.mine.mylib.exam;

public class exam {
	private int kor;
	private int eng;
	private int math;
	
	public int total() {
		return kor + eng + math;
	}
	
	public float avg() {
		return total()/3.0f;
	}
	
	public exam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public exam(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	@Override
	public String toString() {
		return "exam [kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	
	
}
