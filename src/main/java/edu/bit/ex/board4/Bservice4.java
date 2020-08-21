package edu.bit.ex.board4;


import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import edu.bit.ex.board1.BDto;


@Service
public class Bservice4 {


	
	@Inject
	BoardMapper4 boardMapper4;
	
	public List<BDto> SelectBoardList() throws Exception{
		
		
		return boardMapper4.selectList();
	}
	
}