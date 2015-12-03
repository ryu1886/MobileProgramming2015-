package Generic;


	class Generic<T> {
		private T data;
		public Generic(T data) {
			this.data = data;
		}
		public T getData() {
			return this.data;
		}
	

	public static void main(String arg[]){		
			Generic<Integer> genericInt = new Generic<Integer>(10);
			Generic<String> genericStr = new Generic<String>("Kookmin");
			
			System.out.println(genericInt.getData());
			System.out.println(genericStr.getData());
		}
}
