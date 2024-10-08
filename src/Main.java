import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name, phonenum, company, relation;
        Address ad = new Address();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.printf("1. 비지니스 연락처 추가 \n2. 개인 연락처 추가 \n3. 연락처 출력 \n4. 연락처 검색 \n5. 종료 \n메뉴를 선택해 주세요%n");
            switch(sc.nextLine()) {
                case "1":
                    System.out.println("이름 : ");
                    name = sc.nextLine();
                    System.out.println("전화번호 : ");
                    phonenum = sc.nextLine();
                    System.out.println("회사명 : ");
                    company = sc.nextLine();
                    ad.cts.add(new BusinessContact(name, phonenum, company));
                    break;
                case "2":
                    System.out.println("이름 : ");
                    name = sc.nextLine();
                    System.out.println("전화번호 : ");
                    phonenum = sc.nextLine();
                    System.out.println("관계 : ");
                    relation = sc.nextLine();
                    ad.cts.add(new PersonalContact(name, phonenum, relation));
                    break;
                case "3":
                    ad.display();
                    break;
                case "4":
                    System.out.println("검색할 이름 : ");
                    name = sc.nextLine();
                    ad.lookup(name);
                    break;
                case "5":
                    sc.close();
                    return;
                default:
                    System.out.println("다시 입력해 주세요.");
            }
        }
    }
}