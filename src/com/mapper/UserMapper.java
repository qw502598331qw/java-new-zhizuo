package com.mapper;
import java.util.List;
import com.model.Guan;
import com.model.Guan1;
import com.model.User;
public  interface UserMapper{
	// ���һ���û���Ϣ
	public int save(User user);
	
	public int save1(Guan1 guan1);

	// ɾ��һ���û���Ϣ
	public int delete(int id);

	// �޸�һ���û���Ϣ
	public int update(User user);

	// ��ѯȫ���û���Ϣ
	public List<User> getUsers();
	
	public int getcun(Guan guan);
	
	public int getGuan(Guan guan);
}
