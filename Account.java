package object_class;
//은행계좌 클래스(신한은행) => 멤버변수 추가
//클래스에는 멤버변수(필드), 생성자(멤버변수를 초기화 시킨다), 메서드-클래스가 가지고 있는 기능
public class Account {
	//멤버변수(필드) (개발자가 멤버변수와 매게변수 이름을 지어줘야 한다.
			static final String BANKNAME="신한은행"; //static 붙으면 정적 멤버변수, 안붙으면 인스턴스 멤버변수
			String accountNo; //계좌번호 (계산하는게 아니라 -가 들어가는 문자이기 때문에 string를 쓴다), 인스턴스 멤버변수
			String ownerName; //예금주이름, 인스턴스 멤버변수
			int balance; //잔액, 인스턴스 멤버변수
			//메서드(기능)
			
			//생성자 (클래스를 생성과 동시에 
			public Account(String accNo, String owName, int bal) {
				accountNo=accNo;
				ownerName=owName;
				balance=bal;
			}
			
			
			/*public Account(String accountNo, String ownerName, int balance) {
			this.accountNo=accountNo;
			this.ownerName=ownerName;
			this.balance=balance //이름을 다르게 지어주기 귀찮을 경우 this를 붙여 만들어 주면 된다.
			  } */
			
			
			//생성자 (생성자를 만들지 않으면 자동으로 빈생성자가 만들어짐)
			public Account() {
				// TODO Auto-generated constructor stub
			}
			
			
			//예금한다 메서드
			void deposit(int amount) {
				balance+=amount; //void는 리턴값이 없다
			}
			
			//인출한다 메서드
			int withdraw(int amount)  throws Exception {
				if(balance < amount) {
					throw new Exception("잔액이 부족합니다.");
				}
				balance-=amount;
				return amount; 
				
				
			}
}
