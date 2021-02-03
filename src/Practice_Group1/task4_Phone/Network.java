package Practice_Group1.task4_Phone;

import java.util.stream.IntStream;

public class Network {
    private String name;
    private long[] phoneList = new long[100];
    private int codeNet;

    public Network() {

    }

    public String searchAndCall(long destinationNumber){
        String message = "";
        for (long l : phoneList) {
            if (l == destinationNumber) {
                message = "Bzzzzzzz: is called  " + destinationNumber;
                break;
            } else {
                message = "Invalid number.";
            }
        }
        return message;
    }

    public void registerNumber(long number){
        IntStream.range(0, phoneList.length).filter(i -> phoneList[i] == 0).findFirst().ifPresent(i -> phoneList[i] = number);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public long[] getPhoneList() {
        return phoneList;
    }
    public void setPhoneList(long[] phoneList) {
        this.phoneList = phoneList;
    }



    public int getCodeNet() {
        return codeNet;
    }
    public void setCodeNet(int codeNet) {
        this.codeNet = codeNet;
    }


}