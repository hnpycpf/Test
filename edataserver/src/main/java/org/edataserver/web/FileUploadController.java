package org.edataserver.web;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.edataserver.util.FileUitl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;


@Controller
@RequestMapping("/file")
public class FileUploadController {

	@PostMapping("/upload")
	@ResponseBody
	public JSONObject upload(@RequestParam MultipartFile file, HttpServletRequest res) throws IOException {
		JSONObject jb = new JSONObject();
		try {
			String realPath = res.getServletContext().getRealPath("/files/");
			byte[] bytes = file.getBytes();
			String filename = file.getOriginalFilename();
			FileUitl.upload(bytes, realPath, filename);
			jb.put("success", true);
			jb.put("errorMsg", null);
		} catch (Exception e) {
			jb.put("success", false);
			jb.put("errorMsg", null);
			e.printStackTrace();
		}
		return jb;
	}

}
