package com.lcf.dp.chainofresponsibility;

public class SesitiveFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		request.setRequestStr(request.getRequestStr().replace("九评共产党", "共产党")+"--SesitiveFilter");
		chain.doFilter(request, response, chain);
		response.setResponseStr(response.getResponseStr()+"--SesitiveFilter");
	}

}
