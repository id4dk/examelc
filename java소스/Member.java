package array;

public class Member {	//ȸ�������� �ʿ��� �����͸� ������ Ŭ���� ==>been�Ǵ� DTO �Ǵ� VO Ŭ������� ���Ѵ�.
	private String iname;             //private�� ���� get,set �� �־�����
	private String address;
	private String id;
	private String pwd;
	private String phoneNum;
	private int memLevel; 	//level�̶� �ܾ�� DB������ ������� �� �ִ�. level�̶� �ܾ ����� �տ� �� �ٿ�����.
	
	
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
