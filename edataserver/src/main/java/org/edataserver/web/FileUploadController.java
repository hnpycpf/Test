package org.edataserver.web;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.edataserver.util.FastDFSClient;
import org.edataserver.util.FileUitl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
			byte[] bytes = file.getBytes();
			String filename = file.getOriginalFilename();
			FastDFSClient dfsClient = new FastDFSClient("tracker.properties");
			
			String uploadFile = dfsClient.uploadFile(bytes);
			System.out.println(uploadFile);
			jb.put("success", true);
			jb.put("errorMsg", null);
			jb.put("resultData", uploadFile);
		} catch (Exception e) {
			jb.put("success", false);
			jb.put("errorMsg", null);
			e.printStackTrace();
		}
		return jb;
	}
	@RequestMapping(value = "/fastDFSDownload", method = RequestMethod.GET)
	 public void fastDFSDownload(String filePath,HttpServletResponse resp) {
	     try {
	    	 FastDFSClient dfsClient = new FastDFSClient("tracker.properties");
	    	 byte[] dowloadFile = dfsClient.dowloadFile(filePath);
	    	 String fileName = dfsClient.getFileName(filePath);
	    	 resp.setHeader("Content-disposition","attachment;filename="+fileName);
	    	 ByteArrayInputStream inputStream = new ByteArrayInputStream(dowloadFile);
	    	 IOUtils.copy(inputStream, resp.getOutputStream());
	     } catch (Exception e) {
	         e.printStackTrace();
	     }
	 }


}
