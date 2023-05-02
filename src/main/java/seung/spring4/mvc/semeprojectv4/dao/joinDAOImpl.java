package seung.spring4.mvc.semeprojectv4.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import seung.spring4.mvc.semeprojectv4.model.Member;
import seung.spring4.mvc.semeprojectv4.model.Zipcode;

import java.util.List;

@Repository("joindao")
public class joinDAOImpl implements joinDAO {

    @Autowired private SqlSession sqlSession;


    @Override
    public List<Zipcode> selectZipcode(String dong) {
        return sqlSession.selectList("join.findZipcode", dong);
    }

    @Override
    public int newMember(Member m) {
        return 0;
    }

    @Override
    public int selectOneUserid(String uid) {
        return sqlSession.selectOne("join.selectOneUid", uid);
    }

    @Override
    public int selectOneMember(Member m) {
        return 0;
    }
}
