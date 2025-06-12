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

---

> 👨‍💻 作者：[**shing**](https://github.com/Shingbb)  
> 🧠 项目定位：打造适配企业场景的智能知识平台，连接 AI 与结构化知识，实现智能问答、洞察分析和知识资产管理。

---
## 📦 项目仓库

- ⚙️ 后端仓库：[**KnoSphere-Backend**](https://github.com/Shingbb/KnoSphere)  
  企业级 AI 知识管理系统的后端服务，基于 Spring Boot + 向量数据库 + 大模型。

- 🌐 前端仓库：[**KnoSphere-Frontend**](https://github.com/Shingbb/KnoSphere-Frontend)  
  交互界面与管理平台，支持知识上传、问答、权限管理等功能。

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

## 🛠️ 技术栈

| 类别        | 技术组件                                                   |
|-----------|--------------------------------------------------------|
| **核心框架**  | Spring Boot 3.5, Spring AI 1.0.0-M7                    |
| **AI引擎**  | DashScope SDK, LangChain4J, Ollama                     |
| **向量存储**  | PGVector, Spring AI Vector Store                       |
| **文档处理**  | iTextPDF 7.2.5 (AGPL), jsoup, Markdown Document Reader |
| **数据序列化** | Kryo 5.6.2, JSON Schema Generator                      |
| **工具库**   | Hutool, Lombok, Knife4j 3.5 (基于OpenAPI 3)              |
| **数据库**   | MySQL 8.0                                              |

## 🚀 快速开始

### 前置要求

1. Java 21+
2. Docker（可选，用于运行 Ollama 模型）