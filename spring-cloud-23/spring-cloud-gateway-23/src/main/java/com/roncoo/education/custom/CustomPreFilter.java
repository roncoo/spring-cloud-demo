package com.roncoo.education.custom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.ReflectionUtils;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class CustomPreFilter extends ZuulFilter {

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		String token = request.getHeader("token");
		if (!"roncoo".equals(token)) {
			HttpServletResponse response = ctx.getResponse();
			try {
				PrintWriter writer = response.getWriter();
				writer.println("token is error");
				writer.close();
			} catch (IOException e) {
				ReflectionUtils.rethrowRuntimeException(e);
			}
		}

		System.out.println("请求路径为：" + request.getRequestURI());
		return null;
	}

}
