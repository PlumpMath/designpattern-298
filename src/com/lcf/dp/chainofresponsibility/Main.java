package com.lcf.dp.chainofresponsibility;

public class Main {

	public static void main(String[] args) {
		String msg = "你好啊，<html>，九评共产党好啊，大家都喜欢";
		
		Request request = new Request();
		request.setRequestStr(msg);
		Response response = new Response();
		response.setResponseStr("response");
		
		FilterChain fc = new FilterChain();
		fc.addFilter(new HTMLFilter())
		.addFilter(new SesitiveFilter());
		
		fc.doFilter(request, response, fc);
		System.out.println(request.getRequestStr());
		System.out.println(response.getResponseStr());
	}

}
