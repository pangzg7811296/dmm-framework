package com.dmm.framework.dmm.main.api;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 基础信息
 * @author pzg
 * @snce 2016年5月23日
 */
@Controller
public class UserInfoController {

	
	/**
	 * 注册接口
	 * @param request
	 * @param loginName
	 * @param password
	 * @param smscode
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="${open}/user/register/v1")
	public  void register(HttpServletRequest request,String loginName, String password, String smscode,String marketCode,
			String identity,String sex,String school,String degree,String specialty,String entranceYear) {
		
	}
}
