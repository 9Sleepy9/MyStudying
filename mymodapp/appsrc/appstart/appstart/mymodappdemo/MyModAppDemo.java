package appstart.mymodappdemo;

import java.util.ServiceLoader;
import userfuncs.binaryfuncs.*;

import appfuncs.simplefuncs.SimpleMathFuncs;
import appsupport.supportfuncs.SupportFuncs;

public class MyModAppDemo {
	
	public static void main(String [] args) {

		if ( SupportFuncs.isFactor(2, 10) )
			System.out.println("2 является множителем 10");
		
		System.out.println("Наименьшим общим множителем для 35 и 105 будет " + 
							SimpleMathFuncs.lcf(35, 105));
		System.out.println("Наибольшим общим множителем для 35 и 105 будет " + 
							SimpleMathFuncs.gcf(35, 105));

		System.out.println();

		ServiceLoader<BinFuncProvider> ldr = ServiceLoader.load(BinFuncProvider.class);
		
		BinaryFunc binOp = null;
		
		for (BinFuncProvider bfp : ldr) {
			if ( bfp.get().getName().equals("absPlus") ) {
				binOp = bfp.get();
				break;
			}
		}
		
		if (binOp != null)
			System.out.println("Результат выполнения функции absPlus: " +
								binOp.func(12, -4));
		else
			System.out.println("Функция absPlus не найдена");
		
		binOp = null;
		System.out.println();
		
		for (BinFuncProvider bfp : ldr) {
			if ( bfp.get().getName().equals("absMinus") ) {
				binOp = bfp.get();
				break;
			}
		}
		
		if (binOp != null)
			System.out.println("Результат выполнения функции absMinus: " +
								binOp.func(12, -4));
		else
			System.out.println("Функция absMinus не найдена");
	}
}