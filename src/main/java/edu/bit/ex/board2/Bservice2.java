package edu.bit.ex.board2;


import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import edu.bit.ex.board1.BDto;


@Service
public class Bservice2 {

	/* interface�� �ʿ䰡 ���� sqlSession���� �����ϴ� �Լ�(selectList, selectone)�� �̿� 
	 *	���������� ���� XML�� �ʿ�, �ش� XML�� namespace�� �����ڰ� ���� 	
	 */
	
	
	@Inject
	SqlSession sqlSession; //mybatis ������. 
	
	public List<BDto> SelectBoardList() throws Exception{
		
		
		return sqlSession.selectList("board.selectBoardList");
	}
	
}