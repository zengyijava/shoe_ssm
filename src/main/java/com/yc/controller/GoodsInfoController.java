package com.yc.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.yc.biz.IGoodsInfoBiz;
import com.yc.po.GoodsInfo;

@RequestMapping("/goods")
@Controller
public class GoodsInfoController {
  @Autowired
  private IGoodsInfoBiz  biz;
	
	@RequestMapping("/upload")
	@ResponseBody
	public Map<String, Object> upload(@RequestParam("pic")MultipartFile  pic,HttpServletRequest request){
		Map<String, Object>  map =new HashMap<String,Object>();
		if(!pic.isEmpty()){
			String path =request.getServletContext().getRealPath("");
			//System.out.println(path);
			String temp="pic";
			String filePath =new Date().getTime()+"_"+pic.getOriginalFilename();
			File file = new File( new File(path),"../"+temp+"/"+filePath); // webApps    pic 
			try {
				pic.transferTo(file);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			map.put("fileName", pic.getOriginalFilename());
			map.put("upload", 1);
			map.put("url", "../../../pic/"+filePath);
		}
		return map;
	}
	
	@RequestMapping("/addGood")
	@ResponseBody
	public  int addGood(@RequestParam("pic")MultipartFile[] pics,HttpServletRequest request,GoodsInfo gf){
		String savePath="pics";
		if(null!=pics && pics.length>0 &&!pics[0].isEmpty()){
			//System.out.println("-----------------------");
			String basePath =request.getServletContext().getRealPath("");
			//文件上传后存储的路径配置 web.xml文件中 
			String temp =request.getServletContext().getInitParameter("uploadPath");
			if(temp!=null){
				savePath =temp;
			}
			String picStr="";
			File dest =null;
			String path="";
			try {
				for(MultipartFile f:pics){
					path=savePath+"/"+new Date().getTime()+"_"+f.getOriginalFilename();//避免文件名相同  
					dest =new File(new File(basePath).getParentFile(),path);
					//将图片保存到服务器中 
					f.transferTo(dest);
					picStr+=path+";";
					System.out.println(picStr);
				}
				//循环完成将路径存储到gf 
				gf.setPics(picStr);
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//System.out.println(gf);
		//调用biz 
		return biz.add(gf);
	}

	
@RequestMapping("/finds")
@ResponseBody	
public Map<String,Object> finds() {
		return biz.finds();
		
	}

@RequestMapping("/findByGno")
@ResponseBody
public GoodsInfo finByGno(int gno) {
	
	return biz.findByGno(gno);
}

//分页查询
@RequestMapping("/findByPage")
@ResponseBody
public List<GoodsInfo> findByPage(Integer tno,int page,int rows){
	return biz.findByType(tno, page, rows);
}

@RequestMapping("/pageTotal")
@ResponseBody
public Integer findByPage(Integer tno){
	return biz.pageTotal(tno);
}



}
