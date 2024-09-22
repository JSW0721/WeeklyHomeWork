import java.util.*;

public class BusinessContact extends InputContact{
    String company;

    public BusinessContact(String name, String phonenum, String company) {
        super(name, phonenum);
        this.company = company;
    }

    @Override
    public String toString(){
        return "\n" + "이름 : " + name + "\n" + "연락처 : " + phonenum + "\n" + "회사 : " + company;
    }
}
