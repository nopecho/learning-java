package svc;

import ui.MemberUi;
import vo.Member;

public class MemberDeleteService {
    public boolean deleteMember(int id) {

        boolean deleteSuccess = false;
        int index=-1;

        for(int i = 0; i< MemberUi.memberArray.length; i++) {
            if(MemberUi.memberArray[i].getId()==id) {
                index=i;
            }
        }
        if(index != -1) { //index값이 -1이 아니라면 삭제 가능한 객체를 찾음
            Member[] tempArray = MemberUi.memberArray;
            MemberUi.memberArray = new Member[MemberUi.memberArray.length-1];

            for(int i=0;i<tempArray.length;i++) {
                if(i<index) { //삭제할 객체 인덱스 전까지는 그대로 복사
                    MemberUi.memberArray[i]=tempArray[i];
                }
                else if(i>index) { //삭제할 객체 인덱스 후는 i-1번째에 복사
                    MemberUi.memberArray[i-1]=tempArray[i];
                }
            }deleteSuccess=true;
        }return deleteSuccess;
    }
}