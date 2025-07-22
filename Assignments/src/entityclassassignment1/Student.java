package entityclassassignment1;

public class Student {

		private int regno;
		private String name;
		private String Address;
		public int getRegno() {
			return regno;
		}
		public void setRegno(int regno) {
			this.regno = regno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		@Override
		public String toString() {
			return "Student regno=" + regno + ", name=" + name + ", Address=" + Address;
		}
		

}
