package seung.spring4.mvc.semiprojectv4.service;

import seung.spring4.mvc.semiprojectv4.model.Member;

public interface JoinService {

    String findZipcode(String dong);

    boolean newMember(Member m);

    boolean checkUserid(String uid);

    boolean loginMember(Member m);
}
