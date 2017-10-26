# CMS
课堂管理系统(B/S)

需求分析

课题：课堂管理系统CMS(B/S)

1，需求简介

教学中有很多工作，细致而繁琐，如给学生提供课件、视频等学习材料，收发作业、批改作业、分享作业，发送通知、与学生沟通等。这些工作，借助邮件、QQ、也可以，但总是有些麻烦，不太专一，让学习工作往往与个人生活相掺杂，很容易发生对作业或学习信息遗漏或遗忘问题。  
目前很多中学和高校一般使用QQ、邮件或微信进行学习上的交互，但我们希望能开发一个基于JAVA的课堂管理系统，实现各种教学功能，如考勤，提问，发布作业等实用功能。真正做到专一的为教师、学生提供便利，帮助教师提高课堂效率。

2，需求功能详细介绍

功能需求：

1、	网站首页

a、	导航栏（二级导航栏）

b、	新闻版块

c、	文章版块

d、	登录版块

e、

2、	用户管理

a、	登录管理

b、	验证码生成
c、      用户权限
d、      用户分配（学生与教师）
	
3、	课表管理
	a、	学生的课表
	b、	教师的课表
	c、	课表的查询（年-月-周-日，课程名）
	d、	
4、	成绩管理
	a、	学生查看成绩
	b、	教师录入成绩
	c、	
5、	文章发布
	a、	管理员发布新闻
	b、	管理员发布文章
	c、	
6、	个人中心
	a、	个人资料简介
	b、	个人成绩
	c、	个人课表
	d、	考试进程
7、	课程中心
	a、	精品课程
	b、	分类课程
	c、	查询课程（admin/teacher/student）
	d、	录入课程（admin/teacher）
	e、	删除课程（admin）
8、	考试发布
	a、	考试发布

        b、	考试查询

        c、	附：学校教室教学楼录入信息

9、	其他 

3，项目分析，包括各种图例分析

1.学生注册（注册信息包括照片，数据库存地址）管理员审核后学生方可登录
2.维持一个临时表，作为暂未经过审核的学生信息表
3.教师创建班级（二维码：已有学生班级，老师姓名，其余学生自己填）
4.教师端对学生增删改查，发送消息，消息保存在数据库中，为期6个月
5.学生登录以后可以查看自己信息，登录账号会发送到邮箱
6.教师端课堂发布签到二维码，二维码信息包括个人姓名班级及照片 ，可以设置失效时 间（防止代签），目的：签到点名，其次活跃课堂气氛
7.教师端课下作业发布，作业批改
8.学生端线上完成签到，或者上传高清大图（限时），查询成绩
9.教师端PPT发布，公告发布
10.论坛模块，公共论坛实时交流
针对项目需求，进行模块化设计与开发，利用SSM开源框架进行后台开发，使用MySQL数据库并与项目整合，前端使用jsp动态页面，整体使用Git做版本控制
4，项目组成员及成员github地址，维护者的github地址 

              姓名            学号       github       
               
组员： 吴玮琳   201440703189    <https://github.com/nickwilling>       

组员：  刘凯明     201440703155    <https://github.com/LiuKaiming> 

组员： 宋锐 	  201440703187   <https://github.com/Rainie1017>           
