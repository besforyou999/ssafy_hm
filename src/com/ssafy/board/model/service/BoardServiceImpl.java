package com.ssafy.board.model.service;

import java.util.List;

import com.ssafy.board.model.BoardDto;

public class BoardServiceImpl implements BoardService {

	private static BoardServiceImpl impl = new BoardServiceImpl();
	
	public BoardServiceImpl() { }
	
	@Override
	public void registerArticle(BoardDto boardDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BoardDto> searchBySubject(String subject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardDto viewArticle(int no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modifyArticle(BoardDto boardDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteArticle(int no) {
		// TODO Auto-generated method stub
		
	}
	
}
