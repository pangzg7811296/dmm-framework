package com.dmm.framework.dmm.main.modules.test.dao;

import com.dmm.framework.dmm.common.common.persistence.CrudDao;
import com.dmm.framework.dmm.common.common.persistence.annotation.MyBatisDao;
import com.dmm.framework.dmm.main.modules.test.entity.UserInfo;

@MyBatisDao
public interface UserInfoDao extends CrudDao<UserInfo>{

}
