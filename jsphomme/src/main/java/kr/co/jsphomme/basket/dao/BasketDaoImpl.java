package kr.co.jsphomme.basket.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.jsphomme.basket.vo.BasketVo;
import kr.co.jsphomme.purchaselist.vo.PurchaseListVo;

@Repository
public class BasketDaoImpl implements BasketDao {

	@Autowired
	SqlSessionTemplate sqlSession;

	String namespace = "kr.co.jsphomme.basket.";

	@Override
	public int basketInsert(BasketVo basketVo) {
		// TODO Auto-generated method stub
		return sqlSession.insert(namespace + "basketInsert", basketVo);
	}

	@Override
	public List<BasketVo> basketListView(Map<String, Object> map) {
		// TODO Auto-generated method stub

		return sqlSession.selectList(namespace + "basketListView", map);
	}

	@Override
	public BasketVo basketOneDeteilView() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int basketUpdate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int basketDelete(int basketNo) {
		// TODO Auto-generated method stub

		return sqlSession.delete(namespace + "basketDelete", basketNo);
	}

	@Override
	public int basketSelectTotalCount() {
		// TODO Auto-generated method stub

		return sqlSession.selectOne(namespace + "basketSelectTotalCount");
	}

	@Override
	public void basketDeleteAll(int memberNo) {
		// TODO Auto-generated method stub

		sqlSession.delete(namespace + "basketDeleteAll", memberNo);
	}

	@Override
	public PurchaseListVo basketBuy(int basketNo) {
		// TODO Auto-generated method stub
		
		return sqlSession.selectOne(namespace + "basketBuy", basketNo);
	}

	@Override
	public void updateQuantity(int basketNoArr, int shoppingBasketQuantity) {
		// TODO Auto-generated method stub
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("basketNo", basketNoArr);
		map.put("shoppingBasketQuantity", shoppingBasketQuantity);
		
		sqlSession.update(namespace + "updateQuantity", map);
	}

}
