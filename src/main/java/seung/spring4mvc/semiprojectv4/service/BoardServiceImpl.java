package seung.spring4mvc.semiprojectv4.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import seung.spring4mvc.semiprojectv4.dao.BoardDAO;
import seung.spring4mvc.semiprojectv4.model.Board;

import java.util.List;

@Service("bdsrv")
public class BoardServiceImpl implements BoardService{

    @Autowired private BoardDAO bddao;

    @Override
    public List<Board> readBoard(int cpage) {
        int stbno = (cpage - 1) * 25;
        //System.out.println(bddao.selectBoard(stbno).size());
        return bddao.selectBoard(stbno);
    }

    @Override
    public int countBoard() {
        return bddao.countBoard();
    }
}
