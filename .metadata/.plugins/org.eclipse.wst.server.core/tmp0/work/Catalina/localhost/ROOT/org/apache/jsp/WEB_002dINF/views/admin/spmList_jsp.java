/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2018-06-04 05:51:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class spmList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/views/admin/../footer.jsp", Long.valueOf(1527834887512L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1525858777292L));
    _jspx_dependants.put("jar:file:/C:/home/finalproject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/stylecode/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/views/admin/../header.jsp", Long.valueOf(1527834904937L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<script src=\"http://code.jquery.com/jquery-3.1.1.min.js\"></script>\n");
      out.write("<script src=\"../resources/bootstrap/js/bootstrap.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../resources/bootstrap/css/bootstrap.css\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\t.img-circle {\n");
      out.write(" \t\tborder-radius: 50%;\n");
      out.write(" \t\tmargin-left: 30px;\n");
      out.write("\t}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<!-- 부트스트랩  프레임워크 -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../resources/bootstrap/css/bootstrap.min.css\" />\r\n");
      out.write("<!-- CUSTOM  CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../resources/css/header.css\" />\r\n");
      out.write("<!-- FonTello  CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../resources/css/fontello.css\" />\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("<title>header</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"row\" style=\"margin-left: 5px;\">\r\n");
      out.write("\t\t<div id=\"hTitle\"><a href=\"../index.jsp\" style=\"color:black;\">The Style Code</a></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<div id=\"hLMn\" class=\"col-11\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a href=\"../index.jsp\">상품추천</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a href=\"../LoginProduct/productlist.jsp\">상품검색</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\">쇼핑몰</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a href=\"../printBoard.do\">모아보기</a></li>\r\n");
      out.write("\t\t\t</ul>\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"hRMn\" class=\"col-1\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<!-- fontello 아이콘 사용을 위한 부분  -->\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a href='/bookmark/bookmarklist'>&#xe800</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a href=\"../LoginProduct/login.jsp\">&#xe802</a></li>\t\t\t\t\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\" hidden >&#xe803</li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write(" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a href=\"#\">&#xe801</a></li>\r\n");
      out.write("\t\t\t</ul>\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- JQuery JavaScript 추가  -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"../resources/bootstrap/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<!-- Popper JavaScript 추가 -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"../resources/bootstrap/js/popper.js\"></script>\r\n");
      out.write("<!-- Bootstrap JavaScript 추가 -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"../resources/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\n");
      out.write("\t<div style=\"margin: 3% 10%;\">\n");
      out.write("\t\t<h3>관리자 페이지</h3>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\t<div>\n");
      out.write("\t\t<form action=\"admin/accept\">\n");
      out.write("\t\t<!--  버튼 -->\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t  <div class=\"row\" style=\"margin-bottom: 10px;\">\n");
      out.write("\t\t\t\t\t    <div class=\"col-sm\">\n");
      out.write("\t\t\t\t\t      <input style=\"margin-top: 15px;\" type=\"checkbox\" name=\"checkAll\" id=\"th_checkAll\" />&emsp;전체 선택\n");
      out.write("\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t  <div class=\"col-sm\">\n");
      out.write("\t\t\t\t\t      \n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t <div class=\"col-sm\" style=\"padding-left: 50%\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-outline-dark\" id=\"accept\">승인</button>\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-outline-dark\" id=\"refuse\">거절</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t </div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t<!--           쇼핑몰 리스트                      -->\n");
      out.write("\t\t<div id=\"spmList\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<!-- 부트스트랩  프레임워크 -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../resources/bootstrap/css/bootstrap.min.css\" />\r\n");
      out.write("<!-- CUSTOM  CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../resources/YJH/bootstrap/css/rcCustom.css\" />\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("<title>footer</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<footer class=\"page-footer font-small unique-color-dark pt-0\">\r\n");
      out.write("<hr class=\"deep-purple accent-6 mb-0 mt-0 d-inline-block mx-auto\" \r\n");
      out.write("\tstyle=\"width: 1600px;\">\r\n");
      out.write("<br>\r\n");
      out.write("<!--Footer Links-->\r\n");
      out.write("<div class=\"container mt-5 mb-0 text-center text-md-left\">\r\n");
      out.write("\t<div class=\"row mt-3\">\r\n");
      out.write("<!--고객센터 문의-->\r\n");
      out.write("<div class=\"col-md-1 col-lg-4 col-xl-3 mb-4 mx-auto mb-4 \">\r\n");
      out.write("\t<h6 class=\"text-uppercase font-weight-bold\">\r\n");
      out.write("\t\t<strong>고객센터 문의</strong>\r\n");
      out.write("\t</h6>\r\n");
      out.write("\t<hr class=\"deep-purple accent-2 mb-2 mt-0 d-inline-block mx-auto\"\r\n");
      out.write("\t\tstyle=\"width: 130px;\">\r\n");
      out.write("\t<p id=\"footercontents\">\r\n");
      out.write("\t\t<strong>전화문의</strong> 0000-0000<br> <strong>월-금</strong>\r\n");
      out.write("\t\t9:00-18:00<br> <strong>이메일</strong> aa@aa.com<br>\r\n");
      out.write("\t</p>\r\n");
      out.write("</div>\r\n");
      out.write("<!--/.고객센터 문의n-->\r\n");
      out.write("\r\n");
      out.write("<!--입점신청-->\r\n");
      out.write("<div class=\"col-md-2 col-lg-2 col-xl-3 mx-auto mb-4\">\r\n");
      out.write("\t<h6 class=\"text-uppercase font-weight-bold\">\r\n");
      out.write("\t\t<strong>입점신청</strong>\r\n");
      out.write("\t</h6>\r\n");
      out.write("\t<hr class=\"deep-purple accent-2 mb-2 mt-0 d-inline-block mx-auto\"\r\n");
      out.write("\t\tstyle=\"width: 100px;\">\r\n");
      out.write("\t<p id=\"footercontents\">\r\n");
      out.write("\t\t<strong>전화문의</strong> 0000-0000<br> <strong>월-금</strong>\r\n");
      out.write("\t\t9:00-18:00<br> <strong>이메일</strong> aa@aa.com<br>\r\n");
      out.write("\t</p>\r\n");
      out.write("</div>\r\n");
      out.write("<!--/.입점신청-->\r\n");
      out.write("\r\n");
      out.write("<!--광고문의-->\r\n");
      out.write("<div class=\"col-md-3 col-lg-2 col-xl-3 mx-auto mb-4\">\r\n");
      out.write("\t<h6 class=\"text-uppercase font-weight-bold\">\r\n");
      out.write("\t\t<strong>광고문의</strong>\r\n");
      out.write("\t</h6>\r\n");
      out.write("\t<hr class=\"deep-purple accent-2 mb-2 mt-0 d-inline-block mx-auto\"\r\n");
      out.write("\t\tstyle=\"width: 100px;\">\r\n");
      out.write("\t<p id=\"footercontents\">\r\n");
      out.write("\t\t<strong>전화문의</strong> 0000-0000<br> <strong>월-금</strong>\r\n");
      out.write("\t\t9:00-18:00<br> <strong>이메일</strong> aa@aa.com<br>\r\n");
      out.write("\t</p>\r\n");
      out.write("</div>\r\n");
      out.write("<!--/.광고문의-->\r\n");
      out.write("\r\n");
      out.write("<!--공지사항-->\r\n");
      out.write("<div class=\"col-md-4 col-lg-3 col-xl-3  mx-auto mb-4\">\r\n");
      out.write("\t<h6 class=\"text-uppercase font-weight-bold\">\r\n");
      out.write("\t\t<strong>공지사항</strong>\r\n");
      out.write("\t</h6>\r\n");
      out.write("\t<hr class=\"deep-purple accent-2 mb-2 mt-0 d-inline-block mx-auto\"\r\n");
      out.write("\t\tstyle=\"width: 100px;\">\r\n");
      out.write("\t<p id=\"footercontents\">\r\n");
      out.write("\t\t<strong>전화문의</strong> 0000-0000<br> <strong>월-금</strong>\r\n");
      out.write("\t\t9:00-18:00<br> <strong>이메일</strong> aa@aa.com<br>\r\n");
      out.write("\t</p>\r\n");
      out.write("</div>\r\n");
      out.write("<!--/.공지사항-->\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--/.Footer Links-->\r\n");
      out.write("\r\n");
      out.write("<!-- Copyright-->\r\n");
      out.write("<div class=\"footer-copyright py-3 text-center\" id=\"footerbottom\">\r\n");
      out.write("\t<hr class=\"deep-purple accent-6 mb-4 mt-0 d-inline-block mx-auto\"\r\n");
      out.write("\t\tstyle=\"width: 1600px;\">\r\n");
      out.write("\t<br> 이름(주) | 서울특별시 금천구 가산동 371-47 이노플렉스 1차 2층 | 대표: 롸롸 |\r\n");
      out.write("\t사업자등록번호: 000-00-00000 | 통신판매업 신고번호: 제 2018-서울금천-00000 호<br>\r\n");
      out.write("\t대표전화: 0000-0000 | Email: aa@aa.com | 개인정보보호책임자: 롸롸, 롸롸<br> ©2018\r\n");
      out.write("\tMiddle Inc. All Rights Reserved<br>\r\n");
      out.write("</div>\r\n");
      out.write("<!--/.Copyright -->\r\n");
      out.write("</footer>\r\n");
      out.write("\t\r\n");
      out.write("<!-- JQuery JavaScript 추가  -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"../resources/bootstrap/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<!-- Popper JavaScript 추가 -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"../resources/bootstrap/js/popper.js\"></script>\r\n");
      out.write("<!-- Bootstrap JavaScript 추가 -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"../resources/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\n");
      out.write("\t\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("\t\t<!-- 체크박스 전체체크/해제 하는 js -->\n");
      out.write("\t\t$(\"#th_checkAll\").on(\"click\", function(){\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t    if( $(\"#th_checkAll\").is(':checked') ){\n");
      out.write("\t\t\t      $(\"input[name=checkRow]\").prop(\"checked\", true);\n");
      out.write("\t\t\t    }else{\n");
      out.write("\t\t\t      $(\"input[name=checkRow]\").prop(\"checked\", false);\n");
      out.write("\t\t\t    };\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<!-- 템플릿 -->\n");
      out.write("<script id=\"template\" type=\"text/x-handlebars-template\">\n");
      out.write("\t{{#each .}}\n");
      out.write("\t<p class=\"list-group-item list-group-item-action list-group-item-light\" style=\"background-color: #FFFFFF;\">\n");
      out.write("\t\t\t<input type=\"checkbox\" id=\"checkRow\" name=\"checkRow\" value=\"{{spmEnrollNo}}\">\n");
      out.write("\t\t\t<img width=\"100px\" height=\"100px\" alt=\"사진이 없음\" class=\"img-circle\" src=\"{{shoppingMallVO.spmTn}}\"> \n");
      out.write("\t\t\t<span>&emsp;</span>\n");
      out.write("\t\t\t<a class=\"btn spmNm\" href={{spmURL}}><b style=\"color: black;\">{{shoppingMallVO.spmNm}}</b></a>\t\t\n");
      out.write("\t\t\t<span class=\"spmInfo\">&emsp;{{shoppingMallVO.spmClassifcn}}</span>\n");
      out.write("\t\t\t<span class=\"spmInfo\">&emsp;{{shoppingMallVO.spmInfo}}</span>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<span class=\"spmInfo\">&emsp;{{mId}}</span>\n");
      out.write("\t</p>\n");
      out.write("\t{{/each}}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("/*           쇼핑몰 리스트                  */\n");
      out.write("var template = Handlebars.compile($(\"#template\").html());\n");
      out.write("\n");
      out.write("function spmList() {\n");
      out.write("\t\n");
      out.write("\t$.getJSON(\"/admin/all\",function(data){\n");
      out.write("\t\tconsole.log(data.length);\n");
      out.write("\t\t$(\"#spmList\").html(template(data));\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("};\n");
      out.write("\n");
      out.write("spmList();\n");
      out.write("\n");
      out.write("//체크박스 속에 val를 받을 배열 선언\n");
      out.write("\n");
      out.write("\n");
      out.write("/*                 승인                                   */\n");
      out.write(" $(\"#accept\").on(\"click\", function(){\t   \n");
      out.write("\t \n");
      out.write("\t var array = [];\n");
      out.write("\t $('#checkRow:checked').each(function() { \n");
      out.write("\t\t   \n");
      out.write("\t\t   array.push($(this).val());\t    \n");
      out.write("\t\t   \n");
      out.write("\t   });\n");
      out.write("\t \talert(array);\n");
      out.write("\t   if(array.length == 0){\n");
      out.write("\t\t  alert(\"체크해주세요\");\n");
      out.write("\t   }else{\n");
      out.write("\t\t   \n");
      out.write("\t\t   $.ajax({\n");
      out.write("\t\t\t   url :'/admin/accept',\n");
      out.write("\t\t\t   type : 'post',\n");
      out.write("\t\t\t   dataType: 'json',\n");
      out.write("\t\t\t   data:{array : array},\n");
      out.write("\t\t\t   success : function(result) {\n");
      out.write("\t\t\t\t\talert(\"승인 되었습니다.\");\n");
      out.write("\t\t\t\t\tspmList();\t\n");
      out.write("\t\t\t\t\tif(result == \"SUCCESS\"){\n");
      out.write("\t\t\t\t\t\talert(\"SUCCESS\");\n");
      out.write("\t\t\t\t\t};\t\n");
      out.write("\t\t\t\t\t}\t   \n");
      out.write("\t\t   });\n");
      out.write("\t\t\talert(\"승인 되었습니다.\");\n");
      out.write("\t\t\tspmList();\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t   }\n");
      out.write("\t  \n");
      out.write("\t   \n");
      out.write(" });\n");
      out.write("\n");
      out.write(" /*                  거절                                */\n");
      out.write("  $(\"#refuse\").on(\"click\", function(){\n");
      out.write("\t  var array = [];\n");
      out.write("\t $('#checkRow:checked').each(function() { \n");
      out.write("\t\t \t\n");
      out.write("\t\t   array.push($(this).val());\t       \n");
      out.write("\t   });\n");
      out.write("\t \n");
      out.write("\t   if(array.length == 0){\n");
      out.write("\t\t  alert(\"체크해주세요\");\n");
      out.write("\t   }else{\n");
      out.write("\t\t   $.ajax({\n");
      out.write("\t\t\t   url :'/admin/accept',\n");
      out.write("\t\t\t   type : 'post',\n");
      out.write("\t\t\t   dataType: 'json',\n");
      out.write("\t\t\t   data:{array : array},\n");
      out.write("\t\t\t   success : function() {\n");
      out.write("\t\t\t\t\talert(\"승인 되었습니다.\");\n");
      out.write("\t\t\t\t\tspmList();\t\n");
      out.write("\t\t\t\t\tif(result == \"SUCCESS\"){\n");
      out.write("\t\t\t\t\t\talert(\"SUCCESS\");\n");
      out.write("\t\t\t\t\t};\t\n");
      out.write("\t\t\t\t\t}\t   \n");
      out.write("\t\t   });\n");
      out.write("\t\t\talert(\"승인 되었습니다.\");\n");
      out.write("\t\t\tspmList();\t\n");
      out.write("\t   }\n");
      out.write("\t   \n");
      out.write(" });\n");
      out.write("\n");
      out.write("/* $(\"#accept\").on(\"click\", function(){\n");
      out.write("\t\t//체크박스에 체크된 val를 받아온다.\n");
      out.write("\t   $('#checkRow:checked').each(function() { \t      \n");
      out.write("\t\t   array.push($(this).val());\t       \n");
      out.write("\t   });\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\tif(array.length == 0){\n");
      out.write("\t\t\talert(\"선택해 주세요.\");\n");
      out.write("\t\t}else{\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t)}; */\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("/* \t\t\t   $.ajax({\n");
      out.write("\t\t\t\t   type : 'post',\n");
      out.write("\t\t\t\t   url : '/admin/accept',\n");
      out.write("\t\t\t\t   data :{array : array} ,\n");
      out.write("\t\t\t\t   dataType:'json',\n");
      out.write("\t\t\t\t   traditional : true,\n");
      out.write("\t\t\t\t   success : function(result) {\n");
      out.write("\t\t\t\t\t\tif(result == \"SUCCESS\"){\n");
      out.write("\t\t\t\t\t\t\talert(\"승인 되었습니다.\");\n");
      out.write("\t\t\t\t\t\t\tspmList();\t\n");
      out.write("\t\t\t\t\t\t};\n");
      out.write("\t\t\t\t\t\tarray = new Array();\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t   }\n");
      out.write("\t\t\t   }); */\n");
      out.write("\n");
      out.write("\t\t\t   \n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\t\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- <script>\n");
      out.write(" var source = $(\"#template\").html();\n");
      out.write(" var template = Handlebars.compile(source);\n");
      out.write(" var data = 데이터;\n");
      out.write(" function getAllList() {\n");
      out.write("\t\n");
      out.write("\t $.getJSON(\"/admin/all\", function(data){\n");
      out.write("\t\t \n");
      out.write("\t\t \n");
      out.write("\t\t /* data내용을 넣은 template를  replies div 안에 넣는다. */\n");
      out.write("\t\t $(\"#replies\").html(template(data));\n");
      out.write("\t });\n");
      out.write("}\n");
      out.write("\n");
      out.write(" </script> -->\n");
      out.write("\n");
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
    // /WEB-INF/views/admin/../header.jsp(29,34) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
