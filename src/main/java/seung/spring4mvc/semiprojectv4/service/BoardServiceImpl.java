package seung.spring4mvc.semiprojectv4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import seung.spring4mvc.semiprojectv4.dao.BoardDAO;
import seung.spring4mvc.semiprojectv4.model.Board;

import java.util.List;

@Service("bdsrv")
public class BoardServiceImpl implements BordeService{

    @Autowired private BoardDAO bddao;

    @Override
    public List<Board> readBoard() {
        return bddao.selectBoard();
    }
}
