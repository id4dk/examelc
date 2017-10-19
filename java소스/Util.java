package generic02;

public class Util {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.setT(t);
		return box;
	}
		
	public abstract static class Calendar{
		Calendar cal = Calendar.getInstance();
		

		public Calendar getRightNow() {
			return cal;
		}


		public void setRightNow(Calendar cal) {
			this.cal = cal;
		}


		public static Calendar getInstance() {
			// TODO Auto-generated method stub
			return null;
		}
	}
}


	
