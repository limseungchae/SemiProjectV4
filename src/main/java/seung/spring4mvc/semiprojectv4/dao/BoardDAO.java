package seung.spring4mvc.semiprojectv4.dao;

import seung.spring4mvc.semiprojectv4.model.Board;

import java.util.List;

public interface BoardDAO {
    List<Board> selectBoard();
}
