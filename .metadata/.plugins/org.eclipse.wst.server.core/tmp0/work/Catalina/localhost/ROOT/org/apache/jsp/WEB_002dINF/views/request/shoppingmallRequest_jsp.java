/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2018-06-04 06:36:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.request;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.Authentication;

public final class shoppingmallRequest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/WEB-INF/views/request/../header.jsp", Long.valueOf(1528093497933L));
    _jspx_dependants.put("/WEB-INF/views/request/../footer.jsp", Long.valueOf(1528075099953L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1527057140326L));
    _jspx_dependants.put("jar:file:/C:/Users/user/kosta_finalProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/stylecode/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-security-taglibs-3.2.3.RELEASE.jar", Long.valueOf(1527209648206L));
    _jspx_dependants.put("jar:file:/C:/Users/user/kosta_finalProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/stylecode/WEB-INF/lib/spring-security-taglibs-3.2.3.RELEASE.jar!/META-INF/security.tld", Long.valueOf(1395715282000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.springframework.security.core.context.SecurityContextHolder");
    _jspx_imports_classes.add("org.springframework.security.core.Authentication");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"../resources/YJH/bootstrap/css/bootstrap.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"../resources/YJH/bootstrap/css/bootstrap.min.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<!-- 부트스트랩  프레임워크 -->\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"../resources/YJH/bootstrap/css/bootstrap.min.css\" />\n");
      out.write("<!-- CUSTOM  CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"../resources/YJH/bootstrap/css/header.css\" />\n");
      out.write("<!-- FonTello  CSS -->\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"../resources/YJH/bootstrap/css/fontello.css\" />\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<meta name=\"viewport\"\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("<title>header</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"wrapper\" style=\"background-color: #D3CBBD;\">\n");
      out.write("\t\t<div class=\"container\" style=\"padding: 50px;\">\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div id=\"hTitle\">\n");
      out.write("\t\t\t\t\t<a href=\"../index.jsp\" style=\"color: black;\">Middle Project</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div id=\"hLMn\" class=\"col-11\" style=\"padding: 0px\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"../index.jsp\">상품추천</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a\n");
      out.write("\t\t\t\t\t\t\thref=\"../LoginProduct/productlist.jsp\">상품검색</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\">쇼핑몰</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"../printBoard.do\">모아보기</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div id=\"hRMn\" class=\"col-1\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<!-- fontello 아이콘 사용을 위한 부분  -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"../bookmark/bookmarklist.do\">&#xe800</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"../LoginProduct/login.jsp\">&#xe802</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\" hidden>&#xe803</li>\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"#\">&#xe801</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- JQuery JavaScript 추가  -->\n");
      out.write("\t<script type=\"text/javascript\"\n");
      out.write("\t\tsrc=\"../resources/YJH/bootstrap/js/jquery-3.3.1.min.js\"></script>\n");
      out.write("\t<!-- Popper JavaScript 추가 -->\n");
      out.write("\t<script type=\"text/javascript\"\n");
      out.write("\t\tsrc=\"../resources/YJH/bootstrap/js/popper.js\"></script>\n");
      out.write("\t<!-- Bootstrap JavaScript 추가 -->\n");
      out.write("\t<script type=\"text/javascript\"\n");
      out.write("\t\tsrc=\"../resources/YJH/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("<!-- JQuery JavaScript 추가  -->\n");
      out.write("<script type=\"text/javascript\" src=\"../resources/YJH/bootstrap/js/jquery-3.3.1.min.js\"></script>\n");
      out.write("<!-- Bootstrap JavaScript 추가 -->\n");
      out.write("<script type=\"text/javascript\" src=\"../resources/YJH/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<form class=\"form-horizontal\" id='requestForm' role=\"form\" method=\"post\" style=\"margin: 30px 60px;\">\n");
      out.write("\t\t<div class=\"form-group\" id=\"user-info\"><strong>계정 정보 입력</strong><br><br>\n");
      out.write("\t\t\t<label for=\"emailInput\" class=\"col-sm-2 control-label\">이메일</label>\n");
      out.write("\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("      \t\t\t\t<input type=\"text\" class=\"form-control\" name=\"mId\" id=\"emailInput\">\n");
      out.write("    \t\t\t</div>\n");
      out.write("\t\t\t<label for=\"passwdInput\" class=\"col-sm-2 control-label\">비밀번호</label>\n");
      out.write("\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("      \t\t\t\t<input type=\"text\" class=\"form-control\" name=\"mPasswd\" id=\"passwdInput\">\n");
      out.write("    \t\t\t</div>\n");
      out.write("\t\t</div><br>\n");
      out.write("\t\n");
      out.write("\t\t<div class=\"form-group\" id=\"shop-info\"><strong>쇼핑몰 정보 입력</strong><br><br>\n");
      out.write("\t\t\t<label for=\"spmNmInput\" class=\"col-sm-2 control-label\">쇼핑몰 명</label>\n");
      out.write("\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("      \t\t\t\t<input type=\"text\" class=\"form-control\" name=\"spmNm\" id=\"spmNmInput\">\n");
      out.write("    \t\t\t</div>\n");
      out.write("\t\t\t<label for=\"spmURLInput\" class=\"col-sm-2 control-label\">사이트URL</label>\n");
      out.write("\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("      \t\t\t\t<input type=\"text\" class=\"form-control\" name=\"spmURL\" id=\"spmURLInput\">\n");
      out.write("    \t\t\t</div>\n");
      out.write("\t\t\t<label for=\"spmInfoInput\" class=\"col-sm-2 control-label\">쇼핑몰 소개</label>\n");
      out.write("\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("      \t\t\t\t<input type=\"text\" class=\"form-control\" name=\"spmInfo\" id=\"spmInfoInput\">\n");
      out.write("    \t\t\t</div>\n");
      out.write("    \t\t<label class=\"col-sm-2 control-label\">쇼핑몰 분류지정</label>\n");
      out.write("    \t\t\t<div class=\"col-sm-6\">\n");
      out.write("    \t\t\t\t<select name=\"spmClassifcn\">\n");
      out.write("\t\t\t\t\t\t<option value=\"의류\">의류</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"액세서리\">액세서리</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"신발\">신발</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"가방\">가방</option>\n");
      out.write("\t\t\t\t\t</select>\n");
      out.write("    \t\t\t</div>\n");
      out.write("    \t\t<label class=\"col-sm-2 control-label\">쇼핑몰 나이대 지정</label>\n");
      out.write("    \t\t\t<div class=\"col-sm-4\">\n");
      out.write("    \t\t\t\t<select name=\"spmAges\">\n");
      out.write("\t\t\t\t\t\t<option value=\"10대\">10대</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"20대\">20대</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"30대\">30대</option>\n");
      out.write("\t\t\t\t\t</select>\n");
      out.write("    \t\t\t</div>\n");
      out.write("\t\t\t<label for=\"spmTnInput\" class=\"col-sm-2 control-label\">쇼핑몰 썸네일 URL</label>\n");
      out.write("\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("      \t\t\t\t<input type=\"text\" class=\"form-control\" name=\"spmTn\" id=\"spmTnInput\">\n");
      out.write("    \t\t\t</div>\t\t\t\n");
      out.write("    \t</div><br>\n");
      out.write("    \t\n");
      out.write("\t\t<div class=\"form-group\" id=\"shopmanager-info\"><strong>쇼핑몰 담당자 정보 입력</strong><br><br>\n");
      out.write("\t\t\t<label for=\"spmMNmInput\" class=\"col-sm-2 control-label\">이름</label>\n");
      out.write("\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("      \t\t\t\t<input type=\"text\" class=\"form-control\" name=\"mName\" id=\"spmMNmInput\">\n");
      out.write("    \t\t\t</div>\n");
      out.write("\t\t\t<label for=\"spmMPhoneInput\" class=\"col-sm-2 control-label\">휴대폰</label>\n");
      out.write("\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("      \t\t\t\t<input type=\"text\" class=\"form-control\" name=\"mPhone\" id=\"spmMPhoneInput\">\n");
      out.write("    \t\t\t</div>\n");
      out.write("    \t\t<label for=\"spmMCallInput\" class=\"col-sm-2 control-label\">유선전화</label>\n");
      out.write("\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("      \t\t\t\t<input type=\"text\" class=\"form-control\" name=\"mCall\" id=\"spmMCallInput\">\n");
      out.write("    \t\t\t</div>\n");
      out.write("\t\t</div><br>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t<button type=\"submit\" class=\"btn btn-primary\">신청하기</button>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("$(\"#requestForm\").submit(function(event){\n");
      out.write("\tevent.preventDefault();\n");
      out.write("\t\n");
      out.write("\tvar that = $(this);\n");
      out.write("\n");
      out.write("\tthat.get(0).submit();\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<!-- 부트스트랩  프레임워크 -->\n");
      out.write("<link rel=\"stylesheet\" href=\"../resources/YJH/bootstrap/css/bootstrap.min.css\" />\n");
      out.write("<!-- CUSTOM  CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"../resources/YJH/bootstrap/css/rcCustom.css\" />\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("<title>footer</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<footer class=\"page-footer font-small unique-color-dark pt-0\">\n");
      out.write("<hr class=\"deep-purple accent-6 mb-0 mt-0 d-inline-block mx-auto\" \n");
      out.write("\tstyle=\"width: 1600px;\">\n");
      out.write("<br>\n");
      out.write("<!--Footer Links-->\n");
      out.write("<div class=\"container mt-5 mb-0 text-center text-md-left\">\n");
      out.write("\t<div class=\"row mt-3\">\n");
      out.write("<!--고객센터 문의-->\n");
      out.write("<div class=\"col-md-1 col-lg-4 col-xl-3 mb-4 mx-auto mb-4 \">\n");
      out.write("\t<h6 class=\"text-uppercase font-weight-bold\">\n");
      out.write("\t\t<strong>고객센터 문의</strong>\n");
      out.write("\t</h6>\n");
      out.write("\t<hr class=\"deep-purple accent-2 mb-2 mt-0 d-inline-block mx-auto\"\n");
      out.write("\t\tstyle=\"width: 130px;\">\n");
      out.write("\t<p id=\"footercontents\">\n");
      out.write("\t\t<strong>전화문의</strong> 0000-0000<br> <strong>월-금</strong>\n");
      out.write("\t\t9:00-18:00<br> <strong>이메일</strong> aa@aa.com<br>\n");
      out.write("\t</p>\n");
      out.write("</div>\n");
      out.write("<!--/.고객센터 문의n-->\n");
      out.write("\n");
      out.write("<!--입점신청-->\n");
      out.write("<div class=\"col-md-2 col-lg-2 col-xl-3 mx-auto mb-4\">\n");
      out.write("\t<h6 class=\"text-uppercase font-weight-bold\">\n");
      out.write("\t\t<strong>입점신청</strong>\n");
      out.write("\t</h6>\n");
      out.write("\t<hr class=\"deep-purple accent-2 mb-2 mt-0 d-inline-block mx-auto\"\n");
      out.write("\t\tstyle=\"width: 100px;\">\n");
      out.write("\t<p id=\"footercontents\">\n");
      out.write("\t\t<strong>전화문의</strong> 0000-0000<br> <strong>월-금</strong>\n");
      out.write("\t\t9:00-18:00<br> <strong>이메일</strong> aa@aa.com<br>\n");
      out.write("\t</p>\n");
      out.write("</div>\n");
      out.write("<!--/.입점신청-->\n");
      out.write("\n");
      out.write("<!--광고문의-->\n");
      out.write("<div class=\"col-md-3 col-lg-2 col-xl-3 mx-auto mb-4\">\n");
      out.write("\t<h6 class=\"text-uppercase font-weight-bold\">\n");
      out.write("\t\t<strong>광고문의</strong>\n");
      out.write("\t</h6>\n");
      out.write("\t<hr class=\"deep-purple accent-2 mb-2 mt-0 d-inline-block mx-auto\"\n");
      out.write("\t\tstyle=\"width: 100px;\">\n");
      out.write("\t<p id=\"footercontents\">\n");
      out.write("\t\t<strong>전화문의</strong> 0000-0000<br> <strong>월-금</strong>\n");
      out.write("\t\t9:00-18:00<br> <strong>이메일</strong> aa@aa.com<br>\n");
      out.write("\t</p>\n");
      out.write("</div>\n");
      out.write("<!--/.광고문의-->\n");
      out.write("\n");
      out.write("<!--공지사항-->\n");
      out.write("<div class=\"col-md-4 col-lg-3 col-xl-3  mx-auto mb-4\">\n");
      out.write("\t<h6 class=\"text-uppercase font-weight-bold\">\n");
      out.write("\t\t<strong>공지사항</strong>\n");
      out.write("\t</h6>\n");
      out.write("\t<hr class=\"deep-purple accent-2 mb-2 mt-0 d-inline-block mx-auto\"\n");
      out.write("\t\tstyle=\"width: 100px;\">\n");
      out.write("\t<p id=\"footercontents\">\n");
      out.write("\t\t<strong>전화문의</strong> 0000-0000<br> <strong>월-금</strong>\n");
      out.write("\t\t9:00-18:00<br> <strong>이메일</strong> aa@aa.com<br>\n");
      out.write("\t</p>\n");
      out.write("</div>\n");
      out.write("<!--/.공지사항-->\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!--/.Footer Links-->\n");
      out.write("\n");
      out.write("<!-- Copyright-->\n");
      out.write("<div class=\"footer-copyright py-3 text-center\" id=\"footerbottom\">\n");
      out.write("\t<hr class=\"deep-purple accent-6 mb-4 mt-0 d-inline-block mx-auto\"\n");
      out.write("\t\tstyle=\"width: 1600px;\">\n");
      out.write("\t<br> 이름(주) | 서울특별시 금천구 가산동 371-47 이노플렉스 1차 2층 | 대표: 롸롸 |\n");
      out.write("\t사업자등록번호: 000-00-00000 | 통신판매업 신고번호: 제 2018-서울금천-00000 호<br>\n");
      out.write("\t대표전화: 0000-0000 | Email: aa@aa.com | 개인정보보호책임자: 롸롸, 롸롸<br> ©2018\n");
      out.write("\tMiddle Inc. All Rights Reserved<br>\n");
      out.write("</div>\n");
      out.write("<!--/.Copyright -->\n");
      out.write("</footer>\n");
      out.write("\t\n");
      out.write("<!-- JQuery JavaScript 추가  -->\n");
      out.write("<script type=\"text/javascript\" src=\"../resources/YJH/bootstrap/js/jquery-3.3.1.min.js\"></script>\n");
      out.write("<!-- Popper JavaScript 추가 -->\n");
      out.write("<script type=\"text/javascript\" src=\"../resources/YJH/bootstrap/js/popper.js\"></script>\n");
      out.write("<!-- Bootstrap JavaScript 추가 -->\n");
      out.write("<script type=\"text/javascript\" src=\"../resources/YJH/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/views/request/../header.jsp(42,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/shoppingmall/ShoppingMall");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }
}
