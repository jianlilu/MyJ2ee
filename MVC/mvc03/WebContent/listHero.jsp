<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<script src="http://how2j.cn/study/js/jquery/2.0.0/jquery.min.js"></script>
<link href="http://how2j.cn/study/css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
<script src="http://how2j.cn/study/js/bootstrap/3.3.6/bootstrap.min.js"></script>
     
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<script>
$(function(){
    $("a").addClass("btn btn-primary btn-sm");
     
});
 
</script> 
<table style="width:500px; margin:44px auto" class="table table-striped table-bordered table-hover  table-condensed" align='center' border='1' cellspacing='0'>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>hp</th>
        <th>damage</th>
        <th>edit</th>
        <th>delete</th>
    </tr>
    <c:forEach items="${heros}" var="hero" varStatus="st">
        <tr>
            <td>${hero.id}</td>
            <td>${hero.name}</td>
            <td>${hero.hp}</td>
            <td>${hero.damage}</td>
            <td><a href="eidtHero?id=${hero.id}">编辑</a></td>
            <td><a href="deleteHero?id=${hero.id}">删除</a></td>
        </tr>
    </c:forEach>
 
</table>
        <nav>
          <ul class="pager">
 
            <a href="?start=0">首  页</a>
            <a href="?start=${pre}">上一页</a>
            <a href="?start=${next}">下一页</a>
            <a href="?start=${last}">末  页</a>
          </ul>            
        </nav>