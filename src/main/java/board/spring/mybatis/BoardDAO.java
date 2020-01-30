package board.spring.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BoardDAO {

	@Autowired
	SqlSession session;
	
	public void setSession(SqlSession session) {
		this.session = session;
	}
	
	public List<String> getAllBoard(){
		 List<String> list = session.selectList("board.getallboard");
		 return list;
	}
	
	public List<BoardVO> boardPaging(int[] param){
		List<BoardVO> list=  session.selectList("board.boardpaging", param);
		return list;
	}

	public void insertBoard(BoardVO vo) {
		 session.insert("board.insertboard", vo);
	}

	public List<BoardVO> getboardDetail(String title) {
		List<BoardVO> list = session.selectList("board.boarddetail", title);
		return list;
	}
	public void updateviewcount(String title) {
		session.update("board.updateviewcount", title);
	}
	


	
}
