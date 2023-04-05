package com.tenco.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/uploadProc")
@MultipartConfig

public class UploadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UploadController() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 파일 업로드 처리
		Part filePart = request.getPart("file"); //form - name
		System.out.println("파일확인 : " + filePart.getContentType());
		System.out.println("파일확인(바이트기반) : " + filePart.getSize());
		System.out.println("파일확인(파일 이름) : " + filePart.getSubmittedFileName());
		
		// 스트림 준비
		InputStream fileContent = filePart.getInputStream();
		// 출력 스트림 --> 내 서버 컴퓨터에 File 객체 만들어서 저장할 계획
		OutputStream outputStream = null;
		
		try {
			// 랜덤한 문자열을 여기서 생성
			UUID uuid = UUID.randomUUID();
			System.out.println("uuid : " + uuid);
			String fileName = uuid + "_" +  filePart.getSubmittedFileName();
			
			// 1단계 : 파일을 저장할 폴더를 미리 만들어 두기
			// C 드라이버에 jsp_upload 폴더 만들기 (직접 만들어 주세요)
			
			File file = new File("C:/jsp_upload/",fileName);
			
			// 파일 출력 스트림
			outputStream = new FileOutputStream(file);
			//입력 스트림에서 바이트 단위로 읽어 오면서 출력 스트림에 쓰기
			byte[] buffer = new byte[1024];
			int lenth;
			
			while(		(lenth = fileContent.read(buffer)) != -1	) {
				outputStream.write(buffer,0,lenth);
			}
			System.out.println("File upload success");
		} catch (Exception e) {
		}finally {
			fileContent.close();
			if (outputStream != null) {
				outputStream.flush();
				outputStream.close();
			}
			response.sendRedirect("/demo11");
		}
	}

}
