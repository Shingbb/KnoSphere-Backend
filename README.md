<p align="center">
  <img src="/src/main/resources/static/images/KnoSphere_logo2.png" width="200" alt="KnoSphere Logo" />
</p>

[//]: # (<h1 align="center">KnoSphere</h1>)

<p align="center">
  <strong>AI 驱动的企业知识中枢系统</strong><br/>
  <em>融合大模型、知识图谱与语义搜索，实现智能知识发现与分析</em>
</p>

<p align="center">
  <a href="http://localhost:8080/doc.html"><img src="https://img.shields.io/badge/Knife4j-3.5-green?logo=swagger" alt="Knife4j UI" /></a>
  <a href="https://jdk.java.net/21/"><img src="https://img.shields.io/badge/Java-21+-blue.svg?logo=openjdk" alt="Java 21" /></a>
  <a href="#"><img src="https://img.shields.io/badge/Spring%20Boot-3.5-brightgreen?logo=spring" alt="Spring Boot 3.5" /></a>
  <a href="#"><img src="https://img.shields.io/badge/license-Apache--2.0-lightgrey.svg" alt="License: Apache-2.0" /></a>
</p>


> 👨‍💻 作者：[**shing**](https://github.com/Shingbb)  
> 🧠 项目定位：打造适配企业场景的智能知识平台，连接 AI 与结构化知识，实现智能问答、洞察分析和知识资产管理。

---
## 📦 项目仓库

- ⚙️ 后端仓库：[**KnoSphere-Backend**](https://github.com/Shingbb/KnoSphere-Backend)  
  企业级 AI 知识管理系统的后端服务，基于 Spring Boot + 向量数据库 + 大模型。

- 🌐 前端仓库：[**KnoSphere-Frontend**](https://github.com/Shingbb/KnoSphere-Frontend)  
  交互界面与管理平台，支持知识上传、问答、权限管理等功能。

--- 

## ✨ 核心功能

### 1. 智能知识处理

- **多模型AI集成**：同时支持阿里云百练/灵积、Ollama本地模型和MCP控制台模型
- **结构化输出**：通过JSON Schema生成规范化输出
- **会话记忆持久化**：使用Kryo实现长期对话记忆保存

### 2. 知识存储与检索

- **向量知识库**：基于PGVector实现语义化存储与检索
- **混合搜索**：结合SQL查询与向量相似度搜索
- **知识图谱构建**：自动建立知识节点间的关联关系

### 3. 多格式文档处理

- **文档解析**：支持Markdown/HTML/PDF格式的内容提取
- **内容生成**：自动生成结构化报告和格式化文档
- **多模态输出**：生成JSON数据、PDF文档等多种输出形式

### 4. 企业级知识管理

- **知识抽取流水线**：从网页、文档等多源数据中提取知识
- **智能知识聚合**：AI驱动的知识去重与关联分析
- **权限管理体系**：基于角色的知识访问控制（开发中）

## 🛠 技术选型
项目以 Java 21 + Spring Boot 3.5 为基础，围绕 Spring AI 开发框架实战 构建，集成多种主流 AI 客户端与工具库，助力构建企业级智能知识系统。

### 🔧 核心能力概览
⭐️ Spring AI + LangChain4j：AI 应用快速构建基础

⭐️ RAG 知识库：支持检索增强生成（Retrieval-Augmented Generation）

⭐️ PGVector 向量数据库：语义向量存储与检索

⭐️ Tool Calling 工具调用：支持基于函数的多步推理

⭐️ MCP 模型上下文协议：多模型集成与上下文管理

⭐️ ReAct Agent 智能体构建：支持 Reasoning + Acting 智能流程

⭐️ Serverless 计算服务：灵活的部署与扩展能力

⭐️ 大模型平台接入：支持百炼（DashScope）、Ollama 本地模型等

### 🔌 第三方服务与工具集成
🔍 SearchAPI / Pexels API 等内容检索接口

📦 Kryo 高性能数据序列化

🌐 Jsoup 网页内容抓取

📄 iText PDF 生成与处理

📘 Knife4j 3.5 接口文档生成（OpenAPI 3）

RAG 核心特性实战：

![RAG 核心特性实战](https://pic.yupi.icu/1/1745224085267-57afea3b-2de9-44a0-8f53-49e338c0e6b9.png)

项目架构设计图：

![AI 智能体架构图](https://pic.yupi.icu/1/AI%E6%99%BA%E8%83%BD%E4%BD%93%E6%9E%B6%E6%9E%84%E5%9B%BE.png)

### 🛠️ 技术组件明细

| 类别             | 技术栈与工具                                                                 |
|------------------|------------------------------------------------------------------------------|
| **核心框架**     | Java 21, Spring Boot 3.5, Spring AI 1.0.0-M7                                 |
| **AI 引擎**       | DashScope SDK（百炼）、LangChain4j、Ollama、MCP 协议支持                      |
| **智能体 Agent** | ReAct Agent、Tool Calling 工具函数框架                                       |
| **知识库/向量存储** | PGVector、Spring AI Vector Store、RAG 架构支持                              |
| **文档与网页处理** | Jsoup、Markdown Reader、iTextPDF 7.2.5（AGPL）                              |
| **数据序列化**   | Kryo 5.6.2、JSON Schema Generator                                             |
| **工具库**       | Hutool、Lombok、Knife4j 3.5（OpenAPI 3 接口文档）                             |
| **数据库**       | MySQL 8.0（结构化数据存储）                                                   |

---

## 🚀 快速开始

### 🔧 前置要求

1. 安装 [Java 21+](https://jdk.java.net/21/)
2. 安装 [Node.js 18+](https://nodejs.org/)
3. 安装 [Docker](https://www.docker.com/)（用于运行 Ollama 模型，可选）
4. 安装并配置 MySQL 数据库（建议版本 8.0 及以上）
5. 配置好环境变量（如 API Key、数据库连接、模型路径等）

---

### 🖥️ 后端启动步骤

```bash
# 克隆项目
git clone https://github.com/Shingbb/KnoSphere.git
cd KnoSphere

# 使用 Maven 构建并启动项目
./mvnw spring-boot:run
````

* ✅ 默认访问地址：[http://localhost:8080](http://localhost:8080)
* ✅ 接口文档地址：[http://localhost:8080/doc.html](http://localhost:8080/doc.html)

---

### 💻 前端启动步骤

```bash
# 克隆前端仓库
git clone https://github.com/Shingbb/KnoSphere-Frontend.git
cd KnoSphere-Frontend

# 安装依赖
npm install

# 启动开发服务器
npm run dev
```

* 默认访问地址：[http://localhost:5173](http://localhost:5173)

> 💡 *建议开发时配置 `vite.config.ts` 支持本地后端跨域代理*

---

### ⚙️ 环境配置说明（后端）

请在后端项目根目录下新建 `.env` 或配置 `application.yml` 文件，示例如下：

```yml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/knosphere?useSSL=false&serverTimezone=UTC
    username: your_username
    password: your_password

vector:
  store:
    pgvector:
      enabled: true

dashscope:
  api-key: your_dashscope_api_key

ollama:
  model: llama3
```

---

### ✅ 启动验证清单

* [x] 启动后端服务（Spring Boot）
* [x] 启动前端服务（Vite + Vue/React）
* [x] 能访问接口文档页 `/doc.html`
* [x] 本地模型成功运行（Docker + Ollama，非必需）
* [x] 成功上传文档并触发知识抽取流程

---

📢 *如遇问题或需要帮助，欢迎提交 [Issues](https://github.com/Shingbb/KnoSphere/issues) 或参与项目贡献！*



