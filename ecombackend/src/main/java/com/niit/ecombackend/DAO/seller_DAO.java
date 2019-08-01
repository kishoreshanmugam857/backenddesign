package com.niit.ecombackend.DAO;

import java.util.List;


import com.niit.ecombackend.model.seller;

public interface seller_DAO {
	boolean addseller(seller c);
	 boolean updateseller(seller c);
	 boolean deleteseller(seller c);
	 seller selectOneseller(String sell_id);
	 List<seller> selectAll();
}
