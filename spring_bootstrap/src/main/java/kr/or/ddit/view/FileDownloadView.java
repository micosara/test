package kr.or.ddit.view;

import java.io.File;
import java.io.FileInputStream;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.web.servlet.View;

public class FileDownloadView implements View {

	private String contentType = MediaType.APPLICATION_OCTET_STREAM_VALUE;
	
	public void setContentType(String contentType) {
		this.contentType=contentType;
	}
	@Override
	public String getContentType() {
		return this.contentType;
	}

	@Override
	public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
	
		String savedPath = (String)model.get("savedPath");
		String fileName = (String)model.get("fileName");
		
		// 보낼 파일 설정.
		File downloadFile = new File(savedPath + File.separator + fileName);
		FileInputStream inStream = new FileInputStream(downloadFile);
		
		
	}

}





