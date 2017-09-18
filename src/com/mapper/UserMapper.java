package com.mapper;
import java.util.List;
import com.model.Guan;
import com.model.Guan1;
import com.model.User;
public  interface UserMapper{
	// 添加一条用户信息
	public int save(User user);
	
	public int save1(Guan1 guan1);

	// 删除一条用户信息
	public int delete(int id);

	// 修改一条用户信息
	public int update(User user);

	// 查询全部用户信息
	public List<User> getUsers();
	
	public int getcun(Guan guan);
	
	public int getGuan(Guan guan);
}
