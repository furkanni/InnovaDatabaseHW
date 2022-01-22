package com.innova.databaseHomework.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@InterceptorInterface
@Interceptor
public class InterceptorMethod {
	
	@AroundInvoke
	public Object aroundInvoke(InvocationContext context) throws Exception {
		
		System.out.println("önceki durumum " + context.getMethod().getName() + " " + context.getClass());
		

		boolean isLogin = false;
		Object isContinue = null;
		if (isLogin) {
			System.out.println("Please Select First!!!");
			return null;
		} else {
			try {
				isContinue = context.proceed();
				System.out.println(" Selection Completed. ");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return isContinue;
	}
	
}
