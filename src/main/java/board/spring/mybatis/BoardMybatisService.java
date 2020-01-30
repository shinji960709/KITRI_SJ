package board.spring.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class BoardMybatisService implements BoardService {

	@Autowired
	BoardDAO dao;
	
	
	
	public BoardDAO getDao() {
		return dao;
	}
	
	public void setDao(BoardDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public List<String> getAllBoard(){
		return dao.getAllBoard();
	}
	@Override
	public List<BoardVO> boardPaging(int[] param){
		List<BoardVO> list = dao.boardPaging(param);
		return list;
	}

	@Override
	public void insertBoard(BoardVO vo) {
		 dao.insertBoard(vo);
	}

	@Override
	public List<BoardVO> getboardDetail(String title) {
		dao.updateviewcount(title);
		List<BoardVO> list =dao.getboardDetail(title);
		return list;
	}

	@Override
	public void boardupdate(BoardVO vo) {
		// TODO Auto-generated method stub
		
	}





	


	
}
