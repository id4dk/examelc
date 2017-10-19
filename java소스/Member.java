package array;

public class Member {	//회원관리에 필요한 데이터를 정의한 클래스 ==>been또는 DTO 또는 VO 클래스라고 말한다.
	private String iname;             //private를 쓸땐 get,set 꼭 넣어주자
	private String address;
	private String id;
	private String pwd;
	private String phoneNum;
	private int memLevel; 	//level이란 단어는 DB에서의 예약어일 수 있다. level이란 단어를 쓸대는 앞에 뭐 붙여주자.
	
	
	public Member(String iname, String address, String id, String pwd, String phoneNum, int memLevel) {
		super();
		this.iname = iname;
		this.address = address;
		this.id = id;
		this.pwd = pwd;
		this.phoneNum = phoneNum;
		this.memLevel = memLevel;
		
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public int getMemLevel() {
		return memLevel;
	}

	public void setMemLevel(int memLevel) {
		this.memLevel = memLevel;
	}

	
	
}
