package edu.bit.ex.board3;


import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import edu.bit.ex.board1.BDto;


@Service
public class Bservice3 {


	
	@Inject
	BoardMapper3 boardMapper3;
	
	public List<BDto> SelectBoardList() throws Exception{
		
		
		return boardMapper3.selectList();
	}
	
}