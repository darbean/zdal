package com.alipay.zdal.common.sqljep.function;


/**
 * AND�ڵ�
 * ��ʵ�ʵ�SQL�У�ʵ����������
 * [Comparative]              [comparative]
 * 			\                  /
 * 			  \				  /
 *             [ComparativeAnd]
 *             
 * ���������Ľڵ����
 * 
 * @author shenxun
 *
 */
public class ComparativeAND extends ComparativeBaseList{
	
	public ComparativeAND(int function, Comparable<?> value) {
		super(function, value);
	}
	
	public ComparativeAND(){
	}
	
	public ComparativeAND(Comparative item){
		super(item);
	}
	


	@Override
	protected String getRelation() {
		return " and ";
	}

}