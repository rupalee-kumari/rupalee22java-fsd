package bankdetails;
	class Bank{
		public String name;
		protected String email;
		private  String password;
		int a=10;
		//default 
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
	}

	public class Account {

		public static void main(String[] args) {
		Bank b1=new Bank();
	    b1.name= "rupalee";
		b1.email="xyz@gmail.com";
		b1.a=10;
		b1.setPassword("1234");
		System.out.println(b1.getPassword());
		System.out.println(b1.name);
		System.out.println(b1.email);
		System.out.println(b1.a);
		

		}

	}


	