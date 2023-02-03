package com.ssafy.board.model.dao;

import java.util.List;

import com.ssafy.board.model.BoardDto;

public class BoardDaoImpl implements BoardDao {
	
	private static BoardDaoImpl impl = new BoardDaoImpl();
	
	public static BoardDaoImpl getBoardDao() {
		return impl;
	}
	
	private BoardDaoImpl() { }

	@Override
	public void registerArticle(BoardDto boardDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BoardDto> searchListAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardDto> searchListBySubject(String subject) {
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
