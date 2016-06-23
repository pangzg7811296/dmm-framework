package com.dmm.framework.dmm.main.modules.test.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.dmm.framework.dmm.common.common.persistence.Page;
import com.dmm.framework.dmm.common.common.service.CrudService;
import com.dmm.framework.dmm.main.modules.test.dao.UserInfoDao;
import com.dmm.framework.dmm.main.modules.test.entity.UserInfo;

@Service
@Transactional(readOnly = true)
public class UserInfoService extends CrudService<UserInfoDao, UserInfo>{
	public UserInfo get(String id) {
		return super.get(id);
	}
	
	public List<UserInfo> findList(UserInfo userInfo) {
		return super.findList(userInfo);
	}
	
	public Page<UserInfo> findPage(Page<UserInfo> page, UserInfo userInfo) {
		return super.findPage(page, userInfo);
	}
	
	@Transactional(readOnly = false)
	public void save(UserInfo userInfo) {
		super.save(userInfo);
	}
	
	@Transactional(readOnly=false)
	public int updateTest(UserInfo userInfo) {
		return this.dao.update(userInfo);
	}
	
	@Transactional(readOnly = false)
	public int saveTest(UserInfo userInfo) {
		return this.dao.insert(userInfo);
	}
	
	@Transactional(readOnly = false)
	public void delete(UserInfo userInfo) {
		super.delete(userInfo);
	}
	
}
