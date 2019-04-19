package kr.co.jsphomme.purchaselist.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import kr.co.jsphomme.purchaselist.vo.PurchaseListVo;

@Repository
public class PurchaseListDaoImpl implements PurchaseListDao{
	
	@Autowired
	SqlSessionTemplate sqlSession;
	
	String namespace = "kr.co.jsphomme.purchaselist.";
	
	@Override
	public PurchaseListVo purchaseListInsert(PurchaseListVo purchaseListVo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PurchaseListVo> purchaseListView(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+"purchaseListView", map);
	}

	@Override
	public int purchaseListDelete(int no) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int purchaseListCount() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace+"purchaseListCount");
	}

	@Override
	public PurchaseListVo purchaseView() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace+"purchaseView");
	}

	

}
