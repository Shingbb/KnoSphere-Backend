# KnoSphere AI知识管理中枢系统

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

| 类别           | 技术组件                                                  |
|----------------|-------------------------------------------------------|
| **核心框架**   | Spring Boot 3.5, Spring AI 1.0.0-M7                   |
| **AI引擎**     | DashScope SDK, LangChain4J, Ollama                    |
| **向量存储**   | PGVector, Spring AI Vector Store                      |
| **文档处理**   | iTextPDF 7.2.5 (AGPL), jsoup, Markdown Document Reader |
| **数据序列化** | Kryo 5.6.2, JSON Schema Generator                     |
| **工具库**     | Hutool, Lombok, Knife4j (OpenAPI 3)                   |
| **数据库**     | MySQL 8.0                                             |

## 🚀 快速开始

### 前置要求
1. Java 21+
2. PostgreSQL 14+ (启用Vector扩展)
3. Docker (可选，用于运行Ollama模型)

### 安装步骤
```bash
# 克隆项目
git clone https://github.com/your-repo/KnoSphere-Backend.git
```

### 访问API文档
```
http://localhost:8080/doc.html
```
