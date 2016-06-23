package com.dmm.framework.dmm.main.api;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dmm.framework.dmm.common.common.persistence.Page;
import com.dmm.framework.dmm.main.modules.test.entity.UserInfo;
import com.dmm.framework.dmm.main.modules.test.service.UserInfoService;

/**
 * 用户信息接口
 * @author pzg
 * @snce 2016年5月23日
 */
@Controller
public class UserInfoController {

	
	@Autowired
	private UserInfoService userInfoService;
	
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
		UserInfo userInfo=new UserInfo();
		userInfo.setName("小明");
		userInfo.setAge(2);
		userInfoService.save(userInfo);
		userInfo.setName("小红");
		userInfoService.updateTest(userInfo);
		UserInfo ui=userInfoService.get(userInfo.getId());
		List<UserInfo> list=userInfoService.findList(new UserInfo());
		Page<UserInfo> page=userInfoService.findPage(new Page<UserInfo>(1, 2), new UserInfo());
		
	}
}
