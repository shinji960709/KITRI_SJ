package board.spring.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardMybatisController {

	@Autowired
	BoardService service;
	
	
	//board paging list (select)
	//board write (insert)
	//board detail (update, select)
	//board update (update)
	//board delete (delete)
	
/*		@RequestMapping("/boardpaginglist")
	public ModelAndView boardList() {
		ModelAndView mav= new ModelAndView();
		List<String> list = service.getAllBoard();
		mav.addObject("list", list);
		mav.setViewName("boardpaginglist");
		return mav;
	}
	*/
	
	//페이징
	@RequestMapping(value="/boardpaginglist", method=RequestMethod.GET)
	public ModelAndView boardPaging(@RequestParam("pagenum") int pagenum) {
		
		int param[]= new int[2];
		param[0]=(pagenum-1) * 5 +1;	//1 6
		param[1]=pagenum * 5;			//5 10
		
		ModelAndView mav= new ModelAndView();
		List<BoardVO> list = service.boardPaging(param);
		mav.addObject("list", list);
		mav.setViewName("boardpaginglist");
		return mav;
	}
	
	//글쓰기
	@RequestMapping(value="/boardwrite", method=RequestMethod.GET)
	public ModelAndView boardInsert() {
		ModelAndView mav= new ModelAndView();
		//mav.addObject("");
		mav.setViewName("boardwrite");
		return mav;
	}
	@RequestMapping(value="/boardwrite", method=RequestMethod.POST)
	public String insertBoardProcess(BoardVO vo) {
		service.insertBoard(vo);
		return "insertsuccess";
	}
	
	//클릭하면 게시글 자세히보기 조회수 1증가 + 수정, 삭제버튼추가
	//mapping 에서 sql update(조회수), select * from board;
	@RequestMapping(value ="/boarddetail", method=RequestMethod.GET)
	public ModelAndView boardDetail(@RequestParam("title") String title) {
		ModelAndView mav= new ModelAndView();
		List<BoardVO> list = service.getboardDetail(title);
		mav.addObject("list", list);
		System.out.println(list);
		mav.setViewName("boarddetail");
		return mav;
	}
	
	@RequestMapping(value = "/boardupdate", method = RequestMethod.GET)
	public ModelAndView boardUpdate(@RequestParam String title, @RequestParam(required = false) String result) {
		ModelAndView mav = new ModelAndView();
		BoardVO vo = service.getboardDetail(title);
		if(result!=null) {
			mav.addObject("result", "게시물 수정 실패했습니다.");
		}
		mav.addObject("detail", vo);
		mav.setViewName("boardupdate");
		return mav;
	}

	@RequestMapping(value = "/boardupdate", method = RequestMethod.POST)
	public String boardUpdate(BoardVO vo) {
		String url = "";
		int result = service.boardupdate(vo);
		if (result == 1) {
			url = "redirect:/boarddetail?title="+ vo.getNum();
		} else {
			url = "redirect:/boardupdate?title="+ vo.getNum()+"&result=fail";
		}
		return url;
	}
	
	
	
}
