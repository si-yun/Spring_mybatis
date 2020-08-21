package edu.bit.ex.board1;


import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;


@Service
public class Bservice {

	@Inject
	SqlSession sqlSession; //mybatis ººº«¿”. 
	
	public List<BDto> SelectBoardList() throws Exception{
		IBDao dao = sqlSession.getMapper(IBDao.class);
		return dao.listDAO();
		
	}
	
}