package board.spring.mybatis;

import java.util.List;

public interface BoardService {

	public List<String> getAllBoard();
	
	//게시글목록 페이징 처리
	public List<BoardVO> boardPaging(int[] param);
	
	//게시글 작성
	public void insertBoard(BoardVO vo);

	//게시클 클릭 - 자세히 보기, 조회수+1
	public List<BoardVO> getboardDetail(String title);

	public int boardupdate(BoardVO vo);


	

	
	
	
	//게시글 수정
	
	//게시글 삭제
	
}
