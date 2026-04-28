# Spring Boot 3.0 简单 Web 脚手架

这是一个用于快速起步的 **Spring Boot 3.x + Maven** Web 项目模板，适合学习、演示和二次开发。

## 技术栈
- Java 17
- Spring Boot 3.2.5（兼容 Spring Boot 3.x 生态）
- Spring Web（RESTful API）
- Maven
- JUnit 5 + MockMvc

## 项目结构
```text
springboot3-web-scaffold
├── docs
│   └── 项目规格说明.md
├── src
│   ├── main
│   │   ├── java/com/example/demo
│   │   │   ├── DemoApplication.java
│   │   │   └── controller/HelloController.java
│   │   └── resources/application.yml
│   └── test
│       └── java/com/example/demo/controller/HelloControllerTest.java
└── pom.xml
```

## 快速启动
```bash
cd springboot3-web-scaffold
mvn spring-boot:run
```

启动后访问：
- `GET http://localhost:8080/api/hello`
- `GET http://localhost:8080/api/health`

## 打包与运行
```bash
mvn clean package
java -jar target/springboot3-web-scaffold-0.0.1-SNAPSHOT.jar
```

## 接口示例
### 1) Hello 接口
`GET /api/hello`

响应示例：
```json
{
  "message": "Hello Spring Boot 3",
  "version": "v1"
}
```

### 2) 健康检查接口
`GET /api/health`

响应示例：
```json
{
  "status": "UP",
  "service": "springboot3-web-scaffold",
  "timestamp": "2026-04-28T12:00:00Z"
}
```
