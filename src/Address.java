import java.util.*;

public class Address {
    List<InputContact> cts = new ArrayList<>();

    public void display(){
        if(cts.isEmpty()){
            System.out.println("입력된 연락처가 없습니다. 초기 화면으로 돌아갑니다." + "\n");
            return;
        }
        for(InputContact ic : cts){
            System.out.println(ic.toString());
            System.out.println("아무키를 입력하면 초기 화면으로 돌아갑니다."+"\n");
            Scanner sc = new Scanner(System.in);
            sc.nextLine();
            switch (sc.nextLine()) {
                default -> {return;}
            }
        }
    }

    public void lookup(String name){
        boolean found = false;
        if(cts.isEmpty()){
            System.out.println("입력된 연락처가 없습니다. 초기 화면으로 돌아갑니다." + "\n");
            return;
        }
        for(InputContact ic : cts){
            if (name.equals(ic.name)) {
                System.out.println(ic.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("NO NAME FOUND");
        }
    }
}