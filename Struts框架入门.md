# Struts2框架入门

<font color="blue" size="6">写在开头：</font>

```绪论：
	传统的MVC开发模式中，处理业务层用到的是Servlet技术，但是Servlet存在一些问题，做表单传递参数时，会导致大量的数据参数冗余，不能自动类型转换；页面跳转时，路径被写死在类文件中，不利于后续维护。我们为每一个功能开发一个Servlet控制器，会导致Servlet控制器过多，也不利于维护。所以我们引入了Struts2框架的学习。
	对于框架而言，它属于软件开发中的半成品，主要解决一些软件开发中的一些通用问题，提高开发效率。
```



# 一、认识Struts2框架

- 它是 **Apache**公司提供的，典型的 **MVC**框架。

- `Struts`提供了一个 `Action控制器` 替换原有的 `Servlet控制器`，也是基于 **MVC**的软件开发模式。

- `Struts`通过官网下载之后可以得到其目录结构如下：

  | struts目录结构                                               |
  | ------------------------------------------------------------ |
  | ![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201020190604.png) |

  | **apps** | Struts2提供的应用实例 |                 |
  | -------- | --------------------- | --------------- |
  | **docs** | **Java doc注释**      | **常用API接口** |
  | **lib**  | **Struts2核心库**     | **三方依赖库**  |
  | **src**  | **Struts2中的源代码** |                 |
  
  

# 二、Struts2开发流程与Servlet开发流程对比

- 在这里首先将开发流程进行一次对比，有助于我们快速上手开发。
- `Struts`框架方便了很多，在做逻辑跳转的时候，可以选择直接配置 `Struts.xml`

|                                                              |
| ------------------------------------------------------------ |
| ![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201021142850.png) |



# 三、Struts2环境的搭建

## 3.0、项目目录结构一览：

| 【包含相关包-代码源文件-jar包】                              |
| ------------------------------------------------------------ |
| ![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201021174350.png) |



## 3.1、创建项目



- | ！！！图中用到的几个核心jar包在下边会给大家链接！！！        |
  | ------------------------------------------------------------ |
  | ![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201021173642.png) |

- 项目新建完成之后，将我们的`jar`包导入到一个新建的`lib`文件夹下，如图：

|                                                              |
| ------------------------------------------------------------ |
| ![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201021174002.png) |



## 3.2、引入 `Struts2`核心依赖



| 我们先导入以下这些Struts核心依赖：                           |
| ------------------------------------------------------------ |
| ![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201021144942.png) |

### **3.3.1、核心类库链接：**

链接：https://pan.baidu.com/s/1-lO7Hs0F0A98juUQ0Xa2RQ 
提取码：aavp 

## 3.3、预先配置 `Web.xml`



- ```xml
  配置Struts2的核心Filter用来拦截客户端的所有请求，将这些请求交给Struts2
  ```

因为以前 `Web.xml`是用来配置Servlet的，所有请求是交给对应 `Servlet`控制器来处理的，现在要改变这种处理方式了。

```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
         version="4.0">
    <filter>
        <filter-name>Struts_day1</filter-name>
        <filter-class>
            org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter
        </filter-class>
    </filter>
    <filter-mapping>
        <filter-name>Struts_day1</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
</web-app>

```

## 3.4、开发 `Action`类

开发 `Action`类，首先新建一个包：`com.linghu.action` 新建 `TestAction`类，这相当于一个控制器，当客户端发送请求的时候，我们的控制器会向后台象征性的打印一句“**Hello Struts~~**”，接下来我们就新建两个视图，分别是：**HelloWorld.jsp** 和 **index.jsp**两个页面。

```java
package com.linghu.action;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class TestAction implements Action {
    public String execute() throws Exception{
        System.out.println("Hello Struts~~");
        return "OK";
    }

    @Override
    public Object getValue(String s) {
        return null;
    }

    @Override
    public void putValue(String s, Object o) {

    }

    @Override
    public void setEnabled(boolean b) {

    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener) {

    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener propertyChangeListener) {

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}

```

## 3.5、两个页面代码：**HelloWorld.jsp** 和 **index.jsp**两个页面

**HelloWorld.jsp**：

```jsp
<%--
  Created by IntelliJ IDEA.
  User: 编程小哥令狐
  Date: 2020/10/21
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <h1>HelloWorld</h1>
</div>
</body>
</html>

```

**index.jsp**:

```jsp
<%--
  Created by IntelliJ IDEA.
  User: 编程小哥令狐
  Date: 2020/10/21
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>
    <a href="HelloWorld.jsp">点击前往测试页面</a>
  </h1>
  </body>
</html>

```

## 3.6、配置Struts.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>

<!DOCTYPE struts PUBLIC
        "-//Apache Software Foundation//DTD Struts Configuration 2.5//EN"
        "http://struts.apache.org/dtds/struts-2.5.dtd">

<struts>
    <!-- struts2是基于package管理每一个action配置
        package用来管理众多的action配置
        name:包名，随便起
        extends：继承  默认写成Struts-default
    -->
    <package name="day1" extends="struts-default">
        <!--管理TestAction
            action：作用：用来配置项目中的一个个action
                name：当前action访问的路径
                class：当前管理action的全类名
        -->
        <action name="test" class="com.linghu.action.TestAction">
            <result name="OK">index.jsp</result>
        </action>
    </package>
</struts>


```

## 3.7、访问

| 访问界面如下                                                 |
| ------------------------------------------------------------ |
| ![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201021173118.png) |

| 执行结果如下：                                               |
| ------------------------------------------------------------ |
| ![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201021173233.png) |

# 四、Struts2如何获取request和response对象

-  `Struts2`可以通过 **工具类**`ServletActionContext`获取 `request`对象，从而实现搜集数据的功能。
- 通过**工具类**`ServletActionContext`获取 `request`对象之后，我们提交的数据被保存在了这个对象里了，我们 用`requset.getParameter()`方法获取对象 `request`中保存的参数，将它存在新变量`username`和`password`中

## 4.1、实例--登录跳转开发

过程略~

我的项目原码分享：

https://github.com/JackieLing/StrutsLogin.git

![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201022165059.png)

# 五、Struts2同包跳转问题

- 所谓同包跳转就是指在一个 **包package**中跳转。

## 5.1、Action--->jsp

`forward`:默认配置就是`forward`跳转就是基于原页面进行跳转，你会发现网址没有发生改变，还是你开始访问的那个网址。【定向跳转】

`redirect`:【相当于重定向】

`<result name="ok||error" type="redirect">login.jsp</result>`

![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201022191916.png)

## 5.2、Action--->Action

`forward`：`<result name="ok||error" type="chain">a【要跳转的Action标签name的属性名】</result>`

`redirect`：`<result name="ok||error" type="redictAction">a【要跳转的Action标签的name属性名】</result>`

```java
<?xml version="1.0" encoding="UTF-8"?>

<!DOCTYPE struts PUBLIC
        "-//Apache Software Foundation//DTD Struts Configuration 2.5//EN"
        "http://struts.apache.org/dtds/struts-2.5.dtd">

<struts>
    <!-- struts2是基于package管理每一个action配置
        package用来管理众多的action配置
        name:包名，随便起
        extends：继承  默认写成Struts-default
    -->
    <package name="day1" extends="struts-default">
        <!--管理TestAction
            action：作用：用来配置项目中的一个个action
                name：当前action访问的路径
                class：当前管理action的全类名
        -->
        <action name="test" class="com.linghu.action.TestAction">
            <result name="OK">index.jsp</result>
        </action>
    </package>

    <package name="day2" extends="struts-default">
        <!--Action与页面jsp之间的跳转-->
        <action name="login" class="com.linghu.action.LoginActionTest">
            <result name="OK" type="redirect">OK.jsp</result>
            <result name="error" type="redirect">login.jsp</result>
        </action>
        <!--类与类Action之间的跳转-->
        <action name="a" class="com.linghu.action.AAction">
            <result name="OK" type="chain">b</result>
        </action>
        <action name="b" class="com.linghu.action.BAction">
            <result name="OK" type="redirectAction">a</result>
        </action>
    </package>
</struts>

```

# 六、namespace命名空间的使用

- 定义：**它是struts.xml配置中package标签中的一个属性**
- 作用：**Struts2将同一个模块一组action放在同一个包中，将不同模块action放在不同包中**

- 一旦 `package`包中加入了`namespace`在访问包中`action`路径时必须先加入`namespace`的路径。

![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201023082521.png)

访问路径：

- `http://localhost:8080/user/test`
- `http://localhost:8080/student/test`

[ps]：以后写项目必须加上 `namespace`。

# 七、Struts2中的跨包跳转

- 因为前面引入了 **命名空间**的概念，所以很多`action`会被分包处理，那么这个时候想要跳转就会出现 **跨包跳转**的现象。

```java
<package name="day1" extends="struts-default" name="/user">
        <action name="test" class="com.linghu.action.TestAction">
            
            namespace之间的跳转跨越
            <result name="OK" type="chain|redirectAction">
            	<param name="namespace">/student</param>
            	<param name="actionName">/findAll</param>
            </result>
            
        </action>
    </package>
    <package name="day2" extends="struts-default" name="/student">
        <!--Action与页面jsp之间的跳转-->
        <action name="findAll" class="com.linghu.action.LoginActionTest">
            <result name="OK" type="redirect">OK.jsp</result>
            <result name="error" type="redirect">login.jsp</result>
        </action>
            
        <!--类与类Action之间的跳转-->
        <action name="a" class="com.linghu.action.AAction">
            <result name="OK" type="chain">b</result>
        </action>
        <action name="b" class="com.linghu.action.BAction">
            <result name="OK" type="redirectAction">a</result>
        </action>
    </package>
```

# 八、Struts2框架前期总结整理

![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201023092335.JPG)

![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201023181350.png)

![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201023181753.png)

![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201023182103.png)

# 九、Struts2中的标准开发方式

- 在原有的 `Struts2`开发中，我们写的类是继承的 `Action`来写的，所以默认的处理方法为`execute（）`，现在我们可以重新继承一个新类`ActionSupport`类，并自定义处理方法。

![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201023184134.png)

如何在配置文件里边配置访问调用方法的图示：

![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201023185913.png)

这里们用一个项目来说明这种新的开发方式：

首先 看项目结构：

![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201023195221.png)

**UserAction**:

```java
package com.linghu.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
    //登录
    public String login(){
        //1、搜集数据
        //2、调用登录业务对象
        System.out.println("用户登录方法~~~~");
        //3、流程跳转
        return "OK";
    }

    //注册
    public String register(){
        //1、搜集数据
        //2、调用注册业务对象
        System.out.println("用户注册方法~~~~");
        //3、流程跳转
        return "OK";
    }
}

```

**Struts.xml**:

```xml
<?xml version="1.0" encoding="UTF-8"?>

<!DOCTYPE struts PUBLIC
        "-//Apache Software Foundation//DTD Struts Configuration 2.5//EN"
        "http://struts.apache.org/dtds/struts-2.5.dtd">

<struts>
    <package name="user" extends="struts-default" namespace="/user">
        <!--登录action-->
        <action name="login" class="com.linghu.action.UserAction" method="login">
            <result name="OK" type="redirect">/index.jsp</result>
        </action>

        <!--注册action-->
        <action name="register" class="com.linghu.action.UserAction" method="register">
            <result name="OK" type="redirect">/index.jsp</result>
        </action>
    </package>
</struts>

```

**访问前**：

- 记得要带上自己的`namespace`属性名/`action`属性名

![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201023195532.png)

**跳转后**：

![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201023195714.png)

# 十、Struts2中成员变量之参数的接收(零散和对象)

- 首先回顾一下成员变量的接收方式：
  1.  `request.getParameter("key");`
  2. **对现有request收集参数进行封装**，推荐使用 **成员变量收集参数**。

## 10.1、成员变量收集参数的使用好处

- 自动完成数据类型转换
- 减少代码冗余

## 10.2、使用方法

![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201025182746.png)

## 10.3、使用Struts2成员变量接收零散型参数

![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201025183657.png)

## 10.4、使用Struts2成员变量接收对象类型的参数

![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201025184842.png)

## 10.5、Action获取表单提交的数据

- 在web阶段，我们是将表单数据提交到`Servlet`里面，在Servlet里面使用`request`对象里的方法`getParameter`来获取提交数据

![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201025195750.png)

# 十一、OGNL

- 这个类似于 **Servlet**里的 `EL`表达式。

![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201025201241.png)

# 十二、值栈

其实这种机制认识一下即可。你依然可以选用 `request`域对象进行存储。

- ![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201025213227.png)

- `Servlet`和 `Action`的区别：

![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201026084403.png)

## 12.1、栈对象存储位置

- ![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201026085028.png)

## 12.2、获取值栈对象

- ![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201026085529.png)

## 12.3、值栈内部结构

- （1）第一部分：`root`，它的结构是 `List` 集合

   

  （2）第二部分：`context`，它的结构是 `Map` 集合

## 12.4、向值栈存放数据的方式

- ![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201026085529.png)

# 十三、文件上传

- **用户将本地文件上传到服务器的过程**

## 13.1、如何上传文件

1. 提供一个选择按钮

```html
<input type="file">
```

2.在页面中准备一个`form`表单，将文件的入口放在这个表单内，在表单中设计一个提交按钮

3.表单提交方式必须为`post`

```java
package com.linghu.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.*;

/*
* 测试文件的Action
*
* */
public class FileAction extends ActionSupport {
    private File aaa;
    public String upload() throws IOException {
        /*
        * 1.搜集数据
        * 2.处理业务
        * 3.流程跳转
        * */
        FileInputStream fileInputStream = new FileInputStream(aaa);
        //根据Upload文件夹的相对路径获取绝对路径
        String realPath = ServletActionContext.getServletContext().getRealPath("/upload");
        //获取文件输出流
        FileOutputStream fileOutputStream = new FileOutputStream(new File(realPath + "1.jpg"));
        //文件拷贝
        byte [] b=new byte[1024];
        int lenth=0;
        while (true){
            lenth=fileInputStream.read(b);
            if (lenth==-1) break;
            fileOutputStream.write(b,0,lenth);
        }
        //关流
        fileInputStream.close();
        fileOutputStream.close();

        return "OK";
    }

    public File getAaa() {
        return aaa;
    }
}

```

# 十四、文件的下载

- **将服务器文件下载到本地计算机**

### 14.1如何实现文件下载

- ![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201026142642.png)

![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201026143314.png)

![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201026143408.png)

# 十五、拦截器

## 15.1定义

- ![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201026144346.png)

## 15.2作用

- ![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201026144432.png)

## 15.3拦截器特点

- ![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201026144506.png)

## 15.4开发拦截器

- ![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201026193640.png)

![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201026193639.png)

![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201026194113.png)

## 15.5拦截器栈

- ![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201026195715.png)
- 

![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20201026195758.png)