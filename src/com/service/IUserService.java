package com.service;

import java.util.List;
import com.model.Guan;
import com.model.Guan1;
import com.model.User;

public interface IUserService {
	// 添加一条用户信息
	public boolean add(User user);
	
	public boolean add1(Guan1 guan1);

	// 删除一条用户信息
	public boolean delete(int id);

	// 修改一条用户信息
	public boolean update(User user);

	// 查询全部用户信息
	public List<User> queryAll();
	/*public int checkGuan(Guan guan);*/
	public int cun(Guan guan);
}
