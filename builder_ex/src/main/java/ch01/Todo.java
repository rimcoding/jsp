package ch01;

public class Todo {

	private String content;
	private int complete;	// 1 완료 , 0 미완료
	//생성자가 10개 이상일 때 지정해서 넣어줄 때 좀더 정확하게 값을 넣을 수 있다.
	
	
	// 기본 생성자 재 정의
	private Todo() {}
	
	public static class MyBuilder{
		
		private String content;
		private int complete;
		
		public MyBuilder setContent(String content) {
			this.content = content;
			return this;
		}
		public MyBuilder setCopmplete(int complete) {
			this.complete = complete;
			return this;
		}
		
		// 핵심 !!
		public Todo bulid() {
			Todo todo = new Todo();
			// Todo 변수 content = Build 변수 content
			todo.content = content;
			todo.complete = complete;
			return todo;
		}
	}
	public static void main(String[] args) {
		
		Todo todo1 = new MyBuilder().setCopmplete(1).bulid();
		
		//Todo todo2 = new MyBuilder().setContent("잠자기") <-- 오류 bulid()메소드를 이어줘야한다;
		Todo todo3 = new MyBuilder().setCopmplete(0).setContent("청소하기").bulid();
	}
}
