package edu.bit.ex.board2;


import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import edu.bit.ex.board1.BDto;


@Service
public class Bservice2 {

	/* interface는 필요가 없고 sqlSession에서 제공하는 함수(selectList, selectone)을 이용 
	 *	쿼리구현을 위한 XML이 필요, 해당 XML의 namespace는 개발자가 정함 	
	 */
	
	
	@Inject
	SqlSession sqlSession; //mybatis 세션임. 
	
	public List<BDto> SelectBoardList() throws Exception{
		
		
		return sqlSession.selectList("board.selectBoardList");
	}
	
}