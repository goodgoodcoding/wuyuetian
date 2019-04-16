## dhq-app 学能通总部管理系统

该项目主要是为学能通公司提供门店管理，设备管理，课程管理，评测管理等功能模块，方便公司的运营与发展。

### 项目结构
```
├── dhq-admin   (后台接口和逻辑)
│   ├── pom.xml
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── com.xnt.dhq
│       │   │               ├── DhqAdminApplication.java （应用入口）
│       │   │               ├── config       （配置类）
│       │   │               ├── controller  （接口）
│       │   │               ├── dao           （数据操作）
│       │   │               ├── service      （业务逻辑）
│       │   │               └── util            （工具类）
│       │   └── resources  （资源/配置文件）
│       │       ├── application.properties
│       │       ├── static
│       │       └── templates
│       └── test
│           └── java
│               └── com.xnt.dhq
│                           └── DhqAdminApplicationTests.java
├── dhq-db   （数据库操作）
│   ├── dhq-db.iml
│   ├── pom.xml
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── com.xnt.dhq
│       │   │               ├── DhqDbApplication.java
│       │   │               ├── mapper （mybatis mapper）
│       │   │               └── model  （对应实体模型类）
│       │   └── resources
│       │       └── application.properties
│       └── test
│           └── java
│               └── com.xnt.dhq
│                           └── DhqDbApplicationTests.java
├── doc
│   └── basic-learning.md
├── pom.xml
└── target
```
### 数据库文件
### 
目前我把大家的数据库表都合在了一起，放在 [doc/dhq_export.sql](doc/dhq_export.sql) ,后续大家添加了表就及时导出表更新上去

### swagger 跳过 token 认证
两种方式
1. 代码中控制在 SecurityConfig 类中自己暂时配置用来测试,将如下两行代码`去掉注释`即可(该方法只允许本地测试接口时候使用，禁止将代码提交到仓库)
```java
//.antMatchers("/**")
//=.permitAll()
```
2. 打开 Swagger 后台点击 AuthAuthorize 在 Value 出输入 token 信息进行然后
输入格式如下：
```json
		Bearer tokenValue
```
tokenVaule 如何获取：
在 /user/login 接口进行登录，复制返回的 token 值即为 tokenValue
