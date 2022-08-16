package Assignment.one.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Assignment.one.model.Discount;

public class DiscountMaster {
	
	private static List<Discount> discountList = new ArrayList<>();
	private static Map<Integer,Integer> baseFare = new HashMap<>();

	
	public static List<Discount> getDiscountMaster(){
		
		discountList.add(new Discount(101, 1, 5,0));
		discountList.add(new Discount(102, 1, 5,0));
		discountList.add(new Discount(103, 1, 5,0));
		discountList.add(new Discount(101, 5, 10,15));
		discountList.add(new Discount(103, 5, 10,15));
		discountList.add(new Discount(101, 10, 16,20));
		discountList.add(new Discount(103, 10, 16,20));
		discountList.add(new Discount(102, 5, 10,10));
		discountList.add(new Discount(102, 10, 16,15));
		
		return discountList;
	}

	public static Map<Integer,Integer> getBaseFare(){
		baseFare.put(101, 120);
		baseFare.put(102, 170);
		baseFare.put(103, 150);
		return baseFare;
	}
}
