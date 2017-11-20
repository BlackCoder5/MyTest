package sxf.demo.dubbo.imp;

import sxf.demo.dubbo.api.MoneyDubbo;

public class MoneyDubboImp implements MoneyDubbo{

	@Override
	public String getMoney() {
		return "恭喜你获得1000万！";
	}

}
