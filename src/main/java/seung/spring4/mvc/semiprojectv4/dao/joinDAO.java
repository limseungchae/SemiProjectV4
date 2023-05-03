package seung.spring4.mvc.semiprojectv4.dao;

import seung.spring4.mvc.semiprojectv4.model.Member;
import seung.spring4.mvc.semiprojectv4.model.Zipcode;

import java.util.List;

public interface joinDAO {

    List<Zipcode> selectZipcode(String dong);

    int newMember(Member m);

    int selectOneUserid(String uid);

    int selectOneMember(Member m);

    int insertMember(Member m);
}
