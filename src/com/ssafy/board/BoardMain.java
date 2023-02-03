package com.ssafy.board;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BoardMain {
	public static int input = 0;
	public static BufferedReader br;
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		
		BoardMain bm = new BoardMain();
		
		bm.menu();
		
	}
	public void menu() throws NumberFormatException, IOException {
		while (true) {
			StringBuilder sb = new StringBuilder();
			sb.append("---------- 게시판 메뉴 --------\n");
			sb.append("1. 글등록\n");
			sb.append("2. 글목록(전체)\n");
			sb.append("3. 글검색(제목)\n");
			sb.append("4. 글보기\n");
			sb.append("5. 글수정\n");
			sb.append("6. 글삭제\n");
			sb.append("-------------------------------\n");
			sb.append("0. 프로그램 종료\n");
			sb.append("-------------------------------\n");
			sb.append("메뉴 선택 : ");
			System.out.println(sb);
			
			input = Integer.parseInt(br.readLine());
			if (input == 0) {
				break;
			} else if (input == 1) {
				registerArticle();
			} else if (input == 2) {
				searchListAll();
			} else if (input == 3) {
				searchlistBySubject();
			} else if (input == 4) {
				viewArticle();
			} else if (input == 5) {
				modifyArticle();
			} else if (input == 6) {
				deleteArticle();
			}
		}
	}
	
	public void registerArticle() throws IOException {
		StringBuilder sb = new StringBuilder();
		sb.append("=== 글 등록 ===\n");
		sb.append("제목 : ");
		System.out.print(sb);
		String title = br.readLine();
		sb.append("내용 : ");
		System.out.println(sb);
		String input = br.readLine();
	}
	
	public void searchListAll() {
		
	}
	
	public void searchlistBySubject() {
		
	}
	
	public void viewArticle() {
		
	}
	
	public void modifyArticle() {
		
	}
	
	public void deleteArticle() {
		
	}
}