/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2015-04-29 05:46:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<script src=\"js/jquery-1.8.0.js\"></script>\r\n");
      out.write("<script src=\"js/jquery-easyui-1.3.5/jquery.easyui.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<link href=\"js/jquery-easyui-1.3.5/themes/default/easyui.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"js/jquery-easyui-1.3.5/themes/icon.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script src=\"js/jquery-easyui-1.3.5/locale/easyui-lang-zh_CN.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"tb\" style=\"padding:0px;height:auto；width:100%\">    \r\n");
      out.write("    <div style=\"margin-bottom:5px\">  \r\n");
      out.write("    <table>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td>  <a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-add\" plain=\"true\">添加</a>    </td>\r\n");
      out.write("    <td>  <a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-remove\" plain=\"true\">删除</a>    </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    </table>  \r\n");
      out.write("      \r\n");
      out.write("    \r\n");
      out.write("         \r\n");
      out.write("   \r\n");
      out.write("    </div>    \r\n");
      out.write("    <div>    \r\n");
      out.write("    <table>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td> &nbsp;  车票编号：<input style=\"width:80px\"/> </td>\r\n");
      out.write("    <td> &nbsp;   出发站：<input style=\"width:80px\"/></td>\r\n");
      out.write("    <td> &nbsp;    终点站 ：<input style=\"width:80px\"/>&nbsp;&nbsp; </td>\r\n");
      out.write("    <td> <a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-search\" plain=\"false\" >Search</a>  </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("      \r\n");
      out.write("           \r\n");
      out.write("            \r\n");
      out.write("    </div>    \r\n");
      out.write("</div>    \r\n");
      out.write("<table class=\"easyui-datagrid\" style=\"height:250px\"    \r\n");
      out.write("        url=\"data/datagrid_data.json\"     \r\n");
      out.write("        title=\"车票信息\" toolbar=\"#tb\"    \r\n");
      out.write("        singleSelect=\"true\" fitColumns=\"true\">    \r\n");
      out.write("    <thead>    \r\n");
      out.write("        <tr>   \r\n");
      out.write("            <th field=\"ck\" width=\"20px\" checkbox=\"true\" width=\"20\"></th> \r\n");
      out.write("            <th field=\"itemid\" width=\"100\">车票编号</th>    \r\n");
      out.write("            <th field=\"productid\" width=\"100\">出发站</th>    \r\n");
      out.write("            <th field=\"listprice\" align=\"right\" width=\"100\">终点站</th>    \r\n");
      out.write("            <th field=\"unitcost\" align=\"right\" width=\"100\">价格</th>    \r\n");
      out.write("            <th field=\"attr1\" width=\"200\">出发时间</th>    \r\n");
      out.write("            <th field=\"status\" width=\"100\">车次</th>    \r\n");
      out.write("            <th field=\"passgenerNum\" width=\"80\">满载乘客数</th>\r\n");
      out.write("        </tr>    \r\n");
      out.write("    </thead>    \r\n");
      out.write("</table>  \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
