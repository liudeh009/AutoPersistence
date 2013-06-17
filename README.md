 简单介绍:
     AutoPersistence是一款根据数据库表信息生成相关的java代码,xml配置文件的工具,对提高项目开发效率有非常好的帮助.可以用来生成dao层、service层及其测试类代码、ibatis、spring相关的配置文件.稍微配置一下数据库访问信息和代码存放路径就可以一键生成java代码,再稍微修改一下测试代码就可以开始测试dao,service层代码了.适用于表已经建好并且持久层框架采用ibatis的项目,目前包含jar版和Eclipse插件版两个版本.
     AutoPersistence最大的特点简单,代码生成即可测试. 可扩展性好,实现相应接口即可生成相应代码和配置文件.


采用的技术:
    通过jdbc获取数据库表的元信息,根据属性配置文件配置的代码和配置文件存放路径,采用velocity渲染已经编辑好的模版生成最终的代码和xml配置文件.

 
使用说明
   一. jar包版使用.
     1.   jar包版的使用需要加入相应的依赖包,如jdbc,velocity等包,具体见AutoPersistence.jar的pom文件.
     2.   在项目的当前目录的内路径下放置属性文件auto.properties.属性文件内容如下:
         

           driver = com.mysql.jdbc.Driver    ---数据库驱动
           url = jdbc:mysql://localhost/aliyun_kaoshi?useUnicode=true&amp;characterEncoding=utf8 
                                                                                           --数据库url
          user = root      --数据库用户名
          password = 123456     --数据库密码
          author = zhanzui.ldh    --代码作者
          charset = GBK               --生成的代码,xml文件编码
          javadir = ./src/main/java   --java代码存放路径,"."代表当前目录       
          javatest = ./src/test/java    --java测试代码存放路径
          resource = ./src/main/resources  --xml配置文件存放路径
          package = com.ldh      --包名前缀

          各位可以根据自己的项目情况适当修改上面的配置.
     3.  在main方法里面调用如下方法:
               BootStrap bootStrap = new BootStrap();
               bootStrap.init();
               bootStrap.start();
           执行以上代码就可以生成相关的代码和配置文件了.

     4.   如果想扩展现有的功能,可以实现ResourceBuilder接口和SwitchRule接口. ResourceBuilder接口的实现类主要是获取元信息,模版,生成对应的目标文件.SwitchRule接口的实现类主要实现数据表名与pojo类名,数据库字段名和pojo属性名等的转换规则.


  二. Eclipse插件版的使用
      1.将AutoPersistencePlugin_1.0.0.autopersistence加入到Eclipse的安装目标下的plugins目录下.
      2.鼠标右键点击项目名,选择 auto persistence->Setting Parameter,如下图:
      修改相关配置后,点击finish即可生成相关的代码和配置文件了.


后续优化
     1.  对oracle的全面支持.
     2. 对分库分表配置的支持.
     3. 对文件格式化的支持.

 

 备注:    

     在使用AutoPersistence-1.0.0-20130617.jar时,如果缺少依赖包,可以到AutoPersistencePlugin_1.0.0.autopersistence.jar 的lib目录中找
