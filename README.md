# JavaDemo
一个共同学习实践现代Java技术的库

## 项目架构

### 服务组件
- **user-service**: 用户服务，运行在端口 8081
- **hello-service**: 问候服务，运行在端口 8082
- **Envoy 代理**: API 网关，运行在端口 9080

### 技术栈
- Spring Boot 3.0.10
- Spring Cloud 2022.0.0
- Spring Cloud Alibaba 2022.0.0.0-RC2
- Envoy Proxy 1.29.0

## 访问方式

### 通过 Envoy 代理访问（推荐）
- **user-service**: `http://localhost:9080/user/hello`
- **hello-service**: `http://localhost:9080/hello/greeting`
- **hello-service 信息**: `http://localhost:9080/hello/info`

### 直接访问后端服务
- **user-service**: `http://localhost:8081/user/hello`
- **hello-service**: `http://localhost:8082/hello/greeting`
- **hello-service 信息**: `http://localhost:8082/hello/info`

## 运行服务

### 启动后端服务
```bash
# 启动 user-service
java -jar demo-user-service/build/libs/demo-user-service-0.0.1-SNAPSHOT.jar

# 启动 hello-service
java -jar demo-hello-service/build/libs/demo-hello-service-0.0.1-SNAPSHOT.jar
```

### 启动 Envoy 代理
```bash
# 运行 Envoy 代理
/home/plus/envoy/envoy-1.29.0-linux-x86_64 -c envoy.yaml
```

## 项目结构
- `demo-user-service`: 用户服务模块
- `demo-hello-service`: 问候服务模块
- `demo-gateway`: 网关服务模块（备用）
- `demo-common`: 公共模块
- `envoy.yaml`: Envoy 代理配置文件

## 注意事项
- 项目使用 Gradle 构建系统
- Envoy 代理作为主要的 API 网关
- 后端服务已配置为独立运行

