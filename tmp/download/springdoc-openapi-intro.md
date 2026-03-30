<!DOCTYPE html><html lang="zh-hans"><head><script>(l=location)[p='protocol'][5]||(l[p]='https')</script><meta name="referrer" content="no-referrer"><script async src="https://pagead2.googlesyndication.com/pagead/js/adsbygoogle.js?client=ca-pub-8543159550507237" crossorigin="anonymous"></script>

<script>window.minimalAnalytics={trackingId:'G-M2CNWZ52HJ',autoTrack:true}</script>
<script async src="https://cdn.jsdelivr.net.cn/npm/@minimal-analytics/ga4/dist/index.js"></script>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta name="generator" content="Asciidoctor 2.0.15" />
<meta name="author" content="OpenAPI 3 Library for spring-boot By Badr NASS LAHSEN" />
<title>OpenAPI 3 Spring Boot 库</title>
<meta name="author" content="OpenAPI 3 Library for spring-boot By Badr NASS LAHSEN" />
<title>OpenAPI 3 Spring Boot 库</title>
<link rel="canonical" href="https://springdoc.springframework.org.cn/" />
<meta name="author" content="Library for OpenAPI 3 with spring-boot By Badr NASS LAHSEN" />
<title>springdoc-openapi v2.8.5</title>
<link rel="stylesheet" href="css/site.css" />
<style>
    #header #revnumber {
        display: none
    }
</style>

<!-- Google tag (gtag.js) -->
<script async="" src="https://#/gtag/js?id=G-1GEGWXWNH4"></script>
<script>
    window.dataLayer = window.dataLayer || [];
    function gtag(){dataLayer.push(arguments);}
    gtag('js', new Date());

    gtag('config', 'G-1GEGWXWNH4');
</script>
<script src="js/setup.js"></script><script defer="" src="js/site.js"></script>

</head>
<body class="book toc2 toc-left"><div id="banner-container" class="container" role="banner">
  <div id="banner" class="contained" role="banner">
    <div id="switch-theme">
      <input type="checkbox" id="switch-theme-checkbox" />
      <label for="switch-theme-checkbox">深色主题</label>
    </div>
  </div>
</div>
<div id="tocbar-container" class="container" role="navigation">
  <div id="tocbar" class="contained" role="navigation">
    <button id="toggle-toc"></button>
  </div>
</div>
<div id="main-container" class="container">
  <div id="main" class="contained">
    <div id="doc" class="doc">
<div id="header">
<h1>springdoc-openapi v2.8.5</h1>
<div id="toc" class="toc2">
<div id="toctitle">目录</div>
<ul class="sectlevel1">
<li><a href="#Introduction">1. 简介</a></li>
<li><a href="#getting-started">2. 快速入门</a></li>
<li><a href="#modules">3. Springdoc-openapi 模块</a>
<ul class="sectlevel2">
<li><a href="#general-overview">3.1. 概述</a></li>
<li><a href="#spring-webmvc-support">3.2. Spring WebMvc 支持</a></li>
<li><a href="#spring-webflux-support">3.3. Spring WebFlux 支持</a></li>
<li><a href="#spring-hateoas-support">3.4. Spring Hateoas 支持</a></li>
<li><a href="#spring-data-rest-support">3.5. Spring Data Rest 支持</a></li>
<li><a href="#spring-security-support">3.6. Spring Security 支持</a></li>
<li><a href="#actuator-support">3.7. Actuator 支持</a></li>
<li><a href="#spring-cloud-function-web-support">3.8. Spring Cloud Function Web 支持</a></li>
<li><a href="#kotlin-support">3.9. Kotlin 支持</a></li>
<li><a href="#groovy-support">3.10. Groovy 支持</a></li>
<li><a href="#javadoc-support">3.11. Javadoc 支持</a></li>
</ul>
</li>
<li><a href="#features">4. Springdoc-openapi 功能特性</a>
<ul class="sectlevel2">
<li><a href="#adding-api-information-and-security-documentation">4.1. 添加 API 信息和安全文档</a></li>
<li><a href="#error-handling-for-rest-using-controlleradvice">4.2. 使用 @ControllerAdvice 处理 REST 错误</a></li>
<li><a href="#disabling-the-springdoc-openapi-endpoints">4.3. 禁用 <code>springdoc-openapi</code> 端点</a></li>
<li><a href="#disabling-the-swagger-ui">4.4. 禁用 swagger-ui</a></li>
<li><a href="#swagger-ui-configuration">4.5. Swagger-ui 配置</a></li>
<li><a href="#selecting-the-rest-controllers-to-include-in-the-documentation">4.6. 选择要包含在文档中的 Rest Controller</a></li>
<li><a href="#spring-webfluxwebmvc-fn-with-functional-endpoints">4.7. 具有函数式端点的 Spring-webflux/WebMvc.fn</a></li>
<li><a href="#integration-with-wildfly">4.8. 与 WildFly 集成</a></li>
</ul>
</li>
<li><a href="#properties">5. Springdoc-openapi 属性</a>
<ul class="sectlevel2">
<li><a href="#springdoc-openapi-core-properties">5.1. springdoc-openapi 核心属性</a></li>
<li><a href="#swagger-ui-properties">5.2. swagger-ui 属性</a></li>
</ul>
</li>
<li><a href="#plugins">6. Springdoc-openapi 插件</a>
<ul class="sectlevel2">
<li><a href="#maven-plugin">6.1. Maven 插件</a></li>
<li><a href="#gradle-plugin">6.2. Gradle 插件</a></li>
</ul>
</li>
<li><a href="#demos">7. Springdoc-openapi 演示</a>
<ul class="sectlevel2">
<li><a href="#springdoc-applications-demos">7.1. springdoc 应用程序演示</a></li>
<li><a href="#source-code-of-the-demo-applications">7.2. 演示应用程序的源代码</a></li>
</ul>
</li>
<li><a href="#migrating-from-springdoc-v1">8. 从 springdoc-openapi v1 迁移</a></li>
<li><a href="#migrating-from-springfox">9. 从 SpringFox 迁移</a></li>
<li><a href="#other-resources">10. 其他资源</a>
<ul class="sectlevel2">
<li><a href="#additional-resources-to-get-started">10.1. 入门的其他资源</a></li>
<li><a href="#dependencies-repository">10.2. 依赖仓库</a></li>
</ul>
</li>
<li><a href="#sponsor">11. 赞助商</a>
<ul class="sectlevel2">
<li><a href="#benefits-of-being-a-bronze-sponsor">11.1. 成为铜牌赞助商的益处</a></li>
<li><a href="#benefits-of-being-a-silver-sponsor">11.2. 成为银牌赞助商的益处</a></li>
<li><a href="#benefits-of-being-a-gold-sponsor">11.3. 成为金牌赞助商的益处</a></li>
</ul>
</li>
<li><a href="#thanks">12. 特别鸣谢</a></li>
<li><a href="#faq">13. 常见问题解答</a>
<ul class="sectlevel2">
<li><a href="#how-can-i-define-multiple-openapi-definitions-in-one-spring-boot-project">13.1. 如何在一个 Spring Boot 项目中定义多个 OpenAPI 定义？</a></li>
<li><a href="#how-can-i-configure-swagger-ui">13.2. 如何配置 Swagger UI？</a></li>
<li><a href="#how-can-i-filter-the-resources-documented-in-the-output-specification-by-the-provided-group">13.3. 如何按提供的组过滤输出规范中记录的资源？</a></li>
<li><a href="#how-can-i-disableenable-swagger-ui-generation-based-on-env-variable">13.4. 如何基于环境变量禁用/启用 Swagger UI 生成？</a></li>
<li><a href="#how-can-i-control-the-default-expansion-setting-for-the-operations-and-tags-in-the-swagger-ui">13.5. 如何控制 Swagger UI 中操作和标签的默认展开设置？</a></li>
<li><a href="#how-can-i-change-the-layout-of-the-swagger-ui">13.6. 如何更改 <code>swagger-ui</code> 的布局？</a></li>
<li><a href="#how-can-i-sort-endpoints-alphabetically">13.7. 如何按字母顺序对端点进行排序？</a></li>
<li><a href="#how-can-i-disable-the-try-it-out-button">13.8. 如何禁用“试用”按钮？</a></li>
<li><a href="#how-can-i-add-reusable-enums">13.9. 如何添加可重用的枚举？</a></li>
<li><a href="#how-can-i-apply-enumasref-true-to-all-enums">13.10. 如何将 <code>enumAsRef = true</code> 应用于所有枚举？</a></li>
<li><a href="#how-can-i-explicitly-set-which-paths-to-filter">13.11. 如何显式设置要过滤的路径？</a></li>
<li><a href="#how-can-i-explicitly-set-which-packages-to-scan">13.12. 如何显式设置要扫描的包？</a></li>
<li><a href="#how-can-i-set-swagger-properties-programmatically">13.13. 如何以编程方式设置 Swagger 属性？</a></li>
<li><a href="#how-can-i-ignore-some-field-of-model">13.14. 如何忽略模型的某些字段？</a></li>
<li><a href="#how-can-i-ignore-authenticationprincipal-parameter-from-spring-security">13.15. 如何从 spring-security 中忽略 <code>@AuthenticationPrincipal</code> 参数？</a></li>
<li><a href="#is-there-a-gradle-plugin-available">13.16. 是否有可用的 Gradle 插件？</a></li>
<li><a href="#how-can-i-hide-a-parameter-from-the-documentation">13.17. 如何从文档中隐藏参数？</a></li>
<li><a href="#is-parameters-annotation-supported">13.18. 是否支持 <code>@Parameters</code> 注解？</a></li>
<li><a href="#does-springdoc-openapi-support-jersey">13.19. <code>springdoc-openapi</code> 是否支持 Jersey？</a></li>
<li><a href="#can-springdoc-openapi-generate-api-only-for-restcontroller">13.20. <code>springdoc-openapi</code> 是否可以仅为 <code>@RestController</code> 生成 API？</a></li>
<li><a href="#are-the-following-validation-annotations-supported-notempty-notblank-positiveorzero-negativeorzero">13.21. 是否支持以下验证注解：<code>@NotEmpty</code> <code>@NotBlank</code> <code>@PositiveOrZero</code> <code>@NegativeOrZero</code>？</a></li>
<li><a href="#how-can-i-map-pageable-spring-data-commons-object-to-correct-url-parameter-in-swagger-ui">13.22. 如何在 Swagger UI 中将 <code>Pageable</code> (spring-data-commons) 对象映射到正确的 URL 参数？</a></li>
<li><a href="#how-can-i-generate-enums-in-the-generated-description">13.23. 如何在生成的描述中生成枚举？</a></li>
<li><a href="#how-can-i-deploy-springdoc-openapi-starter-webmvc-ui-behind-a-reverse-proxy">13.24. 如何在反向代理后面部署 <code>springdoc-openapi-starter-webmvc-ui</code>？</a></li>
<li><a href="#is-jsonview-annotations-in-spring-mvc-apis-supported">13.25. Spring MVC API 中是否支持 <code>@JsonView</code> 注解？</a></li>
<li><a href="#adding-springdoc-openapi-starter-webmvc-ui-dependency-breaks-my-publicindex-html-welcome-page">13.26. 添加 <code>springdoc-openapi-starter-webmvc-ui</code> 依赖项会破坏我的 <code>public/index.html</code> 欢迎页面</a></li>
<li><a href="#how-can-i-test-the-swagger-ui">13.27. 如何测试 Swagger UI？</a></li>
<li><a href="#how-can-i-customise-the-openapi-object">13.28. 如何自定义 OpenAPI 对象？</a></li>
<li><a href="#how-can-i-return-an-empty-content-as-response">13.29. 如何返回空内容作为响应？</a></li>
<li><a href="#how-are-endpoints-with-multiple-consuming-media-types-supported">13.30. 如何支持具有多种消费媒体类型的端点？</a></li>
<li><a href="#how-can-i-get-yaml-and-json-openapi-in-compile-time">13.31. 如何在编译时获取 yaml 和 json (OpenAPI)？</a></li>
<li><a href="#what-are-the-ignored-types-in-the-documentation">13.32. 文档中忽略的类型有哪些？</a></li>
<li><a href="#how-can-i-disable-ignored-types">13.33. 如何禁用忽略的类型</a></li>
<li><a href="#how-do-i-add-authorization-header-in-requests">13.34. 如何在请求中添加授权标头？</a></li>
<li><a href="#differentiation-to-springfox-project">13.35. 与 Springfox 项目的区别</a></li>
<li><a href="#how-do-i-migrate-to-openapi-3-with-springdoc-openapi">13.36. 如何使用 springdoc-openapi 迁移到 OpenAPI 3</a></li>
<li><a href="#how-can-i-set-a-global-header">13.37. 如何设置全局标头？</a></li>
<li><a href="#are-callbacks-supported">13.38. 是否支持回调？</a></li>
<li><a href="#how-can-i-define-securityscheme">13.39. 如何定义 SecurityScheme？</a></li>
<li><a href="#how-can-i-hide-an-operation-or-a-controller-from-documentation">13.40. 如何从文档中隐藏操作或控制器？</a></li>
<li><a href="#how-to-configure-global-security-schemes">13.41. 如何配置全局安全方案？</a></li>
<li><a href="#can-i-use-spring-property-with-swagger-annotations">13.42. 我可以在 swagger 注解中使用 spring 属性吗？</a></li>
<li><a href="#how-is-server-url-generated">13.43. 服务器 URL 如何生成？</a></li>
<li><a href="#how-can-i-disable-springdoc-openapi-cache">13.44. 如何禁用 springdoc-openapi 缓存？</a></li>
<li><a href="#how-can-i-expose-the-mvc-api-docs-endpoints-without-using-the-swagger-ui">13.45. 如何在不使用 <code>swagger-ui</code> 的情况下公开 mvc api-docs 端点？</a></li>
<li><a href="#how-can-i-disable-springdoc-openapi-endpoints">13.46. 如何禁用 <code>springdoc-openapi</code> 端点？</a></li>
<li><a href="#how-can-i-hide-schema-of-the-the-response">13.47. 如何隐藏响应的 Schema？</a></li>
<li><a href="#what-is-the-url-of-the-swagger-ui-when-i-set-a-different-context-path">13.48. 当我设置不同的 context-path 时，<code>swagger-ui</code> 的 URL 是什么？</a></li>
<li><a href="#can-i-customize-openapi-object-programmatically">13.49. 我可以以编程方式自定义 OpenAPI 对象吗？</a></li>
<li><a href="#where-can-i-find-the-source-code-of-the-demo-applications">13.50. 我在哪里可以找到演示应用程序的源代码？</a></li>
<li><a href="#does-this-library-supports-annotations-from-interfaces">13.51. 该库是否支持来自接口的注解？</a></li>
<li><a href="#what-is-the-list-of-the-excluded-parameter-types">13.52. 排除的参数类型列表是什么？</a></li>
<li><a href="#is-file-upload-supported">13.53. 是否支持文件上传？</a></li>
<li><a href="#can-i-use-parameter-inside-operation-annotation">13.54. 我可以在 <code>@Operation</code> 注解内部使用 <code>@Parameter</code> 吗？</a></li>
<li><a href="#why-my-parameter-is-marked-as-required">13.55. 为什么我的参数被标记为必需？</a></li>
<li><a href="#how-are-overloaded-methods-with-the-same-endpoints-but-with-different-parameters">13.56. 具有相同端点但参数不同的重载方法如何处理</a></li>
<li><a href="#what-is-a-proper-way-to-set-up-swagger-ui-to-use-provided-spec-yml">13.57. 设置 Swagger UI 以使用提供的 spec.yml 的正确方法是什么？</a></li>
<li><a href="#is-there-a-way-to-send-authorization-header-through-the-parameter-tag">13.58. 是否可以通过 @Parameter 标签发送授权标头？</a></li>
<li><a href="#my-rest-controller-using-controller-annotation-is-ignored">13.59. 我使用 @Controller 注解的 Rest Controller 被忽略了？</a></li>
<li><a href="#how-can-i-define-groups-using-application-yml">13.60. 如何使用 application.yml 定义组？</a></li>
<li><a href="#how-can-i-extract-fields-from-parameter-object">13.61. 如何从参数对象中提取字段？</a></li>
<li><a href="#how-can-i-use-the-last-springdoc-openapi-snapshot">13.62. 如何使用最新的 <code>springdoc-openapi</code> SNAPSHOT？</a></li>
<li><a href="#how-can-i-use-enable-springdoc-openapi-monetaryamount-support">13.63. 如何启用 <code>springdoc-openapi</code> MonetaryAmount 支持？</a></li>
<li><a href="#how-can-i-aggregate-external-endpoints-exposing-openapi-3-spec-inside-one-single-application">13.64. 如何在一个应用程序中聚合外部端点（公开 OPENAPI 3 规范）？</a></li>
<li><a href="#how-can-use-custom-jsonyml-file-instead-of-generated-one">13.65. 如何使用自定义 json/yml 文件而不是生成的？</a></li>
<li><a href="#how-can-i-enable-csrf-support">13.66. 如何启用 CSRF 支持？</a></li>
<li><a href="#how-can-i-disable-the-default-swagger-petstore-url">13.67. 如何禁用默认的 swagger petstore URL？</a></li>
<li><a href="#is-pageabledefault-supported-to-enhance-the-openapi-3-docuementation">13.68. 是否支持 @PageableDefault 以增强 OpenAPI 3 文档？</a></li>
<li><a href="#how-can-i-make-spring-security-login-endpoint-visible">13.69. 如何使 spring security login-endpoint 可见？</a></li>
<li><a href="#how-can-i-show-schema-definitions-even-the-schema-is-not-referenced">13.70. 如何显示模式定义，即使该模式未被引用？</a></li>
<li><a href="#how-to-override-deprecated">13.71. 如何覆盖 @Deprecated？</a></li>
<li><a href="#how-can-i-display-a-method-that-returns-modelandview">13.72. 如何显示返回 ModelAndView 的方法？</a></li>
<li><a href="#how-can-i-have-pretty-printed-output-of-the-openapi-specification">13.73. 如何获得 OpenApi 规范的格式化输出？</a></li>
<li><a href="#how-can-i-define-different-schemas-for-the-same-class">13.74. 如何为同一个类定义不同的模式？</a></li>
<li><a href="#how-can-i-define-different-description-for-a-class-attribute-depending-on-usage">13.75. 如何根据用法为类属性定义不同的描述？</a></li>
<li><a href="#customizing-swagger-static-resources">13.76. 自定义 swagger 静态资源</a></li>
<li><a href="#is-graalvm-supported">13.77. 是否支持 GraalVM？</a></li>
<li><a href="#how-to-integrate-open-api-3-with-spring-project-not-spring-boot">13.78. 如何将 Open API 3 与 Spring 项目（而非 Spring Boot）集成？</a></li>
<li><a href="#what-is-the-compatibility-matrix-of-springdoc-openapi-with-spring-boot">13.79. <code>springdoc-openapi</code> 与 <code>spring-boot</code> 的兼容性矩阵是什么？</a></li>
<li><a href="#why-am-i-getting-an-error-swagger-ui-unable-to-render-definition-when-overriding-the-default-spring-registered-httpmessageconverter">13.80. 为什么当我覆盖默认的 spring 注册的 <code>HttpMessageConverter</code> 时，会收到错误：<code>Swagger UI unable to render definition</code>？</a></li>
<li><a href="#some-parameters-are-not-generated-in-the-resulting-openapi-spec">13.81. 某些参数未在生成的 OpenAPI 规范中生成。</a></li>
</ul>
</li>
</ul>
</div>
</div>
<div id="content">
<div id="preamble">
<div class="sectionbody">
<div class="admonitionblock important">
<table>
<tbody><tr>
<td class="icon">
<i class="fa icon-important" title="Important"></i>
</td>
<td class="content">
<code>springdoc-openapi v1.8.0</code> 是支持 Spring Boot 2.x 和 1.x 的最新开源版本。<br />现在为需要 2023 年以后支持的组织提供对 <a href="https://springdoc.springframework.org.cn/v1"><strong>springdoc-openapi v1</strong></a> 项目的扩展支持。<br />有关更多详细信息，请随时联系：<a href="mailto:sales@springdoc.org">sales@springdoc.org</a></td>
</tr>
</tbody></table>
</div>
<div class="paragraph">
<p><code>springdoc-openapi</code> 在 <a href="https://opencollective.com/springdoc" target="_blank" rel="noopener">Open Collective</a> 上。如果您 ❤️ 这个项目，请考虑成为<a href="https://github.com/sponsors/springdoc" target="_blank" rel="noopener">赞助商</a>。</p>
</div>
<div class="paragraph">
<p>本项目由以下机构赞助</p>
</div>
        <p style="text-align: center;">
          <a href="https://opensource.mercedes-benz.com/" target="_blank"> <img src="img/mercedes-benz.png" height="10%" width="10%"> </a>&nbsp;&nbsp; <a href="https://www.dm-jobs.com/dmTECH/?locale=de_DE&amp;wt_mc=.display.github.sponsoring.logo" target="_blank"> <img src="img/dmTECH_Logo.jpg" height="10%" width="10%"> </a> <a href="https://www.contrastsecurity.com/" target="_blank"> <img src="img/contrastsecurity.svg" height="10%" width="30%"> </a> <a href="https://www.lvm.de/" target="_blank"> <img src="img/LVM_Versicherung_2010_logo.svg.png" height="10%" width="25%"> </a> <a href="https://gdnext.com/" target="_blank"> <img src="img/gdnext.png" height="10%" width="10%"> </a></p>
</div>
</div>
<div class="sect1">
<h2 id="Introduction"><a class="anchor" href="#Introduction"></a>1. 简介</h2>
<div class="sectionbody">
<div class="paragraph">
<p><code>springdoc-openapi</code> java 库有助于自动化使用 spring boot 项目生成 API 文档。 <code>springdoc-openapi</code> 通过在运行时检查应用程序，根据 spring 配置、类结构和各种注解来推断 API 语义。</p>
</div>
<div class="paragraph">
<p>自动生成 JSON/YAML 和 HTML 格式的 API 文档。可以使用 swagger-api 注解通过注释完成此文档。</p>
</div>
<div class="paragraph">
<p>此库支持</p>
</div>
<div class="ulist">
<ul>
<li>
<p>OpenAPI 3</p>
</li>
<li>
<p>Spring-boot v3（Java 17 &amp; Jakarta EE 9）</p>
</li>
<li>
<p>JSR-303，专门用于 @NotNull、@Min、@Max 和 @Size。</p>
</li>
<li>
<p>Swagger-ui</p>
</li>
<li>
<p>OAuth 2</p>
</li>
<li>
<p>GraalVM native images</p>
</li>
</ul>
</div>
<div class="paragraph">
<p>以下视频介绍了该库</p>
</div>
<div class="imageblock">
<div class="content">
<a class="image" href="https://youtu.be/ondlnm5ZoFM?t=9" target="_blank" rel="noopener"><img src="img/spring-io-24.png" alt="spring.io conference"></a>
</div>
</div>
<div class="paragraph">
<p>这是一个基于社区的项目，不由 Spring Framework Contributors (Pivotal) 维护。</p>
</div>
</div>
</div>
<div class="sect1">
<h2 id="getting-started"><a class="anchor" href="#getting-started"></a>2. 快速入门</h2>
<div class="sectionbody">
<div class="paragraph">
<p>为了实现 spring-boot 和 swagger-ui 之间的集成，请将该库添加到项目依赖项列表中（无需其他配置）</p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-xml" data-lang="xml">   &lt;dependency&gt;
      &lt;groupId&gt;org.springdoc&lt;/groupId&gt;
      &lt;artifactId&gt;springdoc-openapi-starter-webmvc-ui&lt;/artifactId&gt;
      &lt;version&gt;2.8.5&lt;/version&gt;
   &lt;/dependency&gt;</code></pre>
</div>
</div>
<div class="paragraph">
<p>这将自动将 swagger-ui 部署到 spring-boot 应用程序</p>
</div>
<div class="ulist">
<ul>
<li>
<p>文档将以 HTML 格式提供，使用官方的 <a href="https://github.com/swagger-api/swagger-ui.git" target="_blank" rel="noopener">swagger-ui jars</a></p>
</li>
<li>
<p>然后可以在 <code>http://server:port/context-path/swagger-ui.html</code> 访问 Swagger UI 页面，并且可以在以下 url 获取 json 格式的 OpenAPI 描述：<code>http://server:port/context-path/v3/api-docs</code></p>
<div class="ulist">
<ul>
<li>
<p>server：服务器名称或 IP</p>
</li>
<li>
<p>port：服务器端口</p>
</li>
<li>
<p>context-path：应用程序的上下文路径</p>
</li>
</ul>
</div>
</li>
<li>
<p>文档也可以 yaml 格式提供，路径如下：/v3/api-docs.yaml</p>
</li>
</ul>
</div>
<div class="admonitionblock tip">
<table>
<tbody><tr>
<td class="icon">
<i class="fa icon-tip" title="Tip"></i>
</td>
<td class="content">对于 HTML 格式的 swagger 文档的自定义路径，请在 spring-boot 配置文件中添加自定义 springdoc 属性：。</td>
</tr>
</tbody></table>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-properties" data-lang="properties"># swagger-ui custom path
springdoc.swagger-ui.path=/swagger-ui.html</code></pre>
</div>
</div>
<script async="" src="https://#/pagead/js/adsbygoogle.js?client=ca-pub-8127371937306964" crossorigin="anonymous"></script>
<ins class="adsbygoogle" style="display:block; text-align:center;" data-ad-layout="in-article" data-ad-format="fluid" data-ad-client="ca-pub-8127371937306964" data-ad-slot="6163211104"></ins>
<script>
     (adsbygoogle = window.adsbygoogle || []).push({});
</script>
</div>
</div>
<div class="sect1">
<h2 id="modules"><a class="anchor" href="#modules"></a>3. Springdoc-openapi 模块</h2>
<div class="sectionbody">
<div class="sect2">
<h3 id="general-overview"><a class="anchor" href="#general-overview"></a>3.1. 概述</h3>
<div class="imageblock">
<div class="content">
<img src="img/common.png" alt="Architecture">
</div>
</div>
</div>
<div class="sect2">
<h3 id="spring-webmvc-support"><a class="anchor" href="#spring-webmvc-support"></a>3.2. Spring WebMvc 支持</h3>
<div class="ulist">
<ul>
<li>
<p>文档将通过以下 url 以 json 格式提供：<code>http://server:port/context-path/v3/api-docs</code></p>
<div class="ulist">
<ul>
<li>
<p>server：服务器名称或 IP</p>
</li>
<li>
<p>port：服务器端口</p>
</li>
<li>
<p>context-path：应用程序的上下文路径</p>
</li>
</ul>
</div>
</li>
<li>
<p>文档也可以 yaml 格式提供，路径如下：/v3/api-docs.yaml</p>
</li>
<li>
<p>将该库添加到项目依赖项列表中。（无需其他配置）</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-xml" data-lang="xml">   &lt;dependency&gt;
      &lt;groupId&gt;org.springdoc&lt;/groupId&gt;
      &lt;artifactId&gt;springdoc-openapi-starter-webmvc-api&lt;/artifactId&gt;
      &lt;version&gt;2.8.5&lt;/version&gt;
   &lt;/dependency&gt;</code></pre>
</div>
</div>
<div class="admonitionblock note">
<table>
<tbody><tr>
<td class="icon">
<i class="fa icon-note" title="Note"></i>
</td>
<td class="content">如果您想生成 OpenAPI 描述而不使用 swagger-ui，则此依赖项是相关的。</td>
</tr>
</tbody></table>
</div>
<div class="admonitionblock tip">
<table>
<tbody><tr>
<td class="icon">
<i class="fa icon-tip" title="Tip"></i>
</td>
<td class="content">对于 Json 格式的 OpenAPI 文档的自定义路径，请在 spring-boot 配置文件中添加自定义 springdoc 属性</td>
</tr>
</tbody></table>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-properties" data-lang="properties"># /api-docs endpoint custom path
springdoc.api-docs.path=/api-docs</code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="spring-webflux-support"><a class="anchor" href="#spring-webflux-support"></a>3.3. Spring WebFlux 支持</h3>
<div class="ulist">
<ul>
<li>
<p>文档也可以 yaml 格式提供，路径如下：/v3/api-docs.yaml</p>
</li>
<li>
<p>将该库添加到项目依赖项列表中（无需其他配置）</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-xml" data-lang="xml">   &lt;dependency&gt;
      &lt;groupId&gt;org.springdoc&lt;/groupId&gt;
      &lt;artifactId&gt;springdoc-openapi-starter-webflux-api&lt;/artifactId&gt;
      &lt;version&gt;2.8.5&lt;/version&gt;
   &lt;/dependency&gt;</code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="spring-hateoas-support"><a class="anchor" href="#spring-hateoas-support"></a>3.4. Spring Hateoas 支持</h3>
<div class="paragraph">
<p>使用依赖项 springdoc-openapi-hateoas 可以获得对 Spring Hateoas 的支持。</p>
</div>
<div class="paragraph">
<p>使用 <code>spring-boot-starter-hateoas</code> 的项目应使用</p>
</div>
<div class="ulist">
<ul>
<li>
<p><code>springdoc-openapi-starter-webmvc-api</code> 如果他们只需要访问 OpenAPI 端点</p>
</li>
<li>
<p>或 <code>springdoc-openapi-starter-webmvc-ui</code>，如果他们还需要访问 swagger-ui</p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="spring-data-rest-support"><a class="anchor" href="#spring-data-rest-support"></a>3.5. Spring Data Rest 支持</h3>
<div class="paragraph">
<p><code>springdoc-openapi</code> 项目支持 <code>spring-boot-starter-data-rest</code> 类型，例如：<code>@RepositoryRestResource</code> 和 <code>QuerydslPredicate</code> 注解。</p>
</div>
<div class="paragraph">
<p>使用 <code>spring-boot-starter-data-rest</code> 的项目应使用</p>
</div>
<div class="ulist">
<ul>
<li>
<p><code>springdoc-openapi-starter-webmvc-api</code> 如果他们只需要访问 OpenAPI 端点</p>
</li>
<li>
<p>或 <code>springdoc-openapi-starter-webmvc-ui</code>，如果他们还需要访问 swagger-ui</p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="spring-security-support"><a class="anchor" href="#spring-security-support"></a>3.6. Spring Security 支持</h3>
<div class="paragraph">
<p><code>springdoc-openapi</code> 帮助忽略 REST Controller 上使用的 @AuthenticationPrincipal 类型。</p>
</div>
<div class="paragraph">
<p><code>springdoc-openapi</code> 还支持公开 <code>spring-security-oauth2-authorization-server</code> 的 Oauth2 端点。</p>
</div>
<div class="paragraph">
<p>使用 <code>spring-boot-starter-security</code> 或 <code>spring-security-oauth2-authorization-server</code> 的项目应使用</p>
</div>
<div class="ulist">
<ul>
<li>
<p><code>springdoc-openapi-starter-webmvc-api</code> 如果他们依赖于 <code>spring-boot-starter-web</code> 并且他们只需要访问 OpenAPI 端点。</p>
</li>
<li>
<p>或 <code>springdoc-openapi-starter-webmvc-ui</code>，如果他们依赖于 <code>spring-boot-starter-web</code> 并且他们还需要访问 swagger-ui。</p>
</li>
<li>
<p>或 <code>springdoc-openapi-starter-webflux-api</code> 如果他们依赖于 <code>spring-boot-starter-webflux</code> 并且他们只需要访问 OpenAPI 端点。</p>
</li>
<li>
<p>或 <code>springdoc-openapi-starter-webflux-ui</code>，如果他们依赖于 <code>spring-boot-starter-webflux</code> 并且他们还需要访问 swagger-ui。</p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="actuator-support"><a class="anchor" href="#actuator-support"></a>3.7. Actuator 支持</h3>
<div class="ulist">
<ul>
<li>
<p>为了显示 <code>spring-boot-actuator</code> 端点，只需添加以下属性</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-properties" data-lang="properties">springdoc.show-actuator=true</code></pre>
</div>
</div>
<div class="paragraph">
<p>从 <code>1.5.1</code> 版本开始，可以在 <strong>actuator 端口</strong>上公开 <strong>swagger-ui</strong> 和 <strong>openapi</strong> 端点。</p>
</div>
<div class="admonitionblock note">
<table>
<tbody><tr>
<td class="icon">
<i class="fa icon-note" title="Note"></i>
</td>
<td class="content">actuator 管理端口必须与应用程序端口不同。</td>
</tr>
</tbody></table>
</div>
<div class="paragraph">
<p>要在管理端口上公开 swagger-ui，您应该设置</p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-properties" data-lang="properties">springdoc.use-management-port=true
# This property enables the openapi and swagger-ui endpoints to be exposed beneath the actuator base path.
management.endpoints.web.exposure.include=openapi, swagger-ui</code></pre>
</div>
</div>
<div class="paragraph">
<p>启用后，您还应该能够看到以下位置下的 springdoc-openapi 端点：（主机和端口取决于您的设置）- <code>http://serverName:managementPort/actuator</code></p>
</div>
<div class="paragraph">
<p>例如，如果您有以下设置</p>
</div>
<div class="paragraph">
<p>将提供两个端点</p>
</div>
<div class="olist arabic">
<ol class="arabic">
<li>
<p>包含 OpenAPI 定义的 REST API</p>
<div class="ulist">
<ul>
<li>
<p><code>http://serverName:managementPort/actuator/openapi</code></p>
</li>
</ul>
</div>
</li>
<li>
<p>一个路由到 swagger-ui 的端点</p>
<div class="ulist">
<ul>
<li>
<p><code>http://serverName:managementPort/actuator/swagger-ui</code></p>
</li>
</ul>
</div>
</li>
</ol>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-properties" data-lang="properties">management.server.port=9090</code></pre>
</div>
</div>
<div class="paragraph">
<p>对于示例，您还应该能够看到 springdoc-openapi 端点</p>
</div>
<div class="ulist">
<ul>
<li>
<p><code>http://serverName:9090/actuator</code></p>
</li>
<li>
<p><code>http://serverName:9090/actuator/swagger-ui</code></p>
</li>
<li>
<p><code>http://serverName:9090/actuator/openapi</code></p>
</li>
</ul>
</div>
<div class="paragraph">
<p>当 <code>springdoc.use-management-port=true</code> 时，所有路径 <code>springdoc-openapi</code> 属性均不适用。</p>
</div>
<div class="admonitionblock tip">
<table>
<tbody><tr>
<td class="icon">
<i class="fa icon-tip" title="Tip"></i>
</td>
<td class="content">如果您想从部署在 actuator 基本路径下的 swagger-ui 访问应用程序端点，并使用与应用程序不同的端口，则应在应用程序级别启用 <code>endpoints</code> 的 <code>CORS</code>。</td>
</tr>
</tbody></table>
</div>
<div class="paragraph">
<p>此外，还可以将此属性与现有属性结合使用，以在 swagger-ui 中显示 actuator 端点。</p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-properties" data-lang="properties">springdoc.show-actuator=true</code></pre>
</div>
</div>
<div class="paragraph">
<p>启用后：- 默认情况下将为 actuator 端点添加专用组。- 如果未为应用程序定义组，则将添加默认组。</p>
</div>
<div class="paragraph">
<p>然后可以通过 actuator 端口访问 swagger-ui</p>
</div>
<div class="ulist">
<ul>
<li>
<p><code>http://serverName:managementPort/actuator/swagger-ui</code></p>
</li>
</ul>
</div>
<div class="paragraph">
<p>如果管理端口与应用程序端口不同，并且未定义 <code>springdoc.use-management-port</code>，但将 <code>springdoc.show-actuator</code> 设置为 true</p>
</div>
<div class="ulist">
<ul>
<li>
<p>然后可以通过应用程序端口访问 swagger-ui。 例如：<code>http://serverName:applicationPort/swagger-ui.html</code></p>
</li>
<li>
<p>默认情况下，将为 actuator 端点添加专用组。</p>
</li>
<li>
<p>如果未为应用程序定义组，则将添加默认组。</p>
</li>
</ul>
</div>
<div class="admonitionblock tip">
<table>
<tbody><tr>
<td class="icon">
<i class="fa icon-tip" title="Tip"></i>
</td>
<td class="content">如果您想在此情况下（与应用程序不同的端口）访问 actuator 端点，则应为 actuator 端点启用 <code>CORS</code>。</td>
</tr>
</tbody></table>
</div>
<div class="paragraph">
<p>注意：目前无法自定义 actuator 基本路径下这些新端点的命名。</p>
</div>
</div>
<div class="sect2">
<h3 id="spring-cloud-function-web-support"><a class="anchor" href="#spring-cloud-function-web-support"></a>3.8. Spring Cloud Function Web 支持</h3>
<div class="paragraph">
<p><code>spring-cloud-function-web</code> 自动将 Java Function 公开为 REST 端点。 * 自版本 <code>v1.6.3</code> 以来，已添加对函数式端点的支持。</p>
</div>
<div class="ulist">
<ul>
<li>
<p>这些启动器将显示 <code>spring-cloud-function-web</code> 端点的 OpenAPI 描述。</p>
<div class="ulist">
<ul>
<li>
<p>如果您正在使用 <code>spring-web</code>，只需添加 <code>springdoc-openapi-starter-webmvc-ui</code> 依赖项。</p>
</li>
<li>
<p>如果您正在使用 <code>spring-webflux</code>，只需添加 <code>springdoc-openapi-starter-webflux-ui</code> 依赖项。</p>
</li>
</ul>
</div>
</li>
</ul>
</div>
<div class="paragraph">
<p>输出的自定义可以通过 <code>OpenApiCustomizer</code> 以编程方式实现，也可以使用注解：<code>@RouterOperations</code> 和 <code>@RouterOperation</code>。 对于注解用法，您有：* <code>@RouterOperation</code>：如果自定义与单个 REST API 相关，则可以单独使用。 使用 <code>@RouterOperation</code> 时，不必填写路径</p>
</div>
<div class="ulist">
<ul>
<li>
<p><code>@RouterOperation</code>，包含 <code>@Operation</code> 注解。 如果声明了 beanMethod 属性，则 <code>@Operation</code> 注解也可以放置在 bean 方法级别。</p>
</li>
</ul>
</div>
<div class="admonitionblock important">
<table>
<tbody><tr>
<td class="icon">
<i class="fa icon-important" title="Important"></i>
</td>
<td class="content">不要忘记设置 <strong>operationId</strong>，这是<strong>强制性</strong>的。</td>
</tr>
</tbody></table>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">@Bean
@RouterOperation(operation = @Operation(description = "Say hello", operationId = "hello", tags = "persons",
        responses = @ApiResponse(responseCode = "200", content = @Content(schema = @Schema(implementation = PersonDTO.class)))))
public Supplier&lt;PersonDTO&gt; helloSupplier() {
    return () -&gt; new PersonDTO();
}
</code></pre>
</div>
</div>
<div class="ulist">
<ul>
<li>
<p><code>@RouterOperations</code>：此注解应用于描述 <code>spring-cloud-function-web</code> 公开的多个 REST API。 使用 <code>RouterOperations</code> 时，必须填写 method 属性。</p>
</li>
<li>
<p>一个 <code>@RouterOperations</code>，包含多个 <code>@RouterOperation</code>。</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">@Bean
@RouterOperations({
        @RouterOperation(method = RequestMethod.GET, operation = @Operation(description = "Say hello GET", operationId = "lowercaseGET", tags = "persons")),
        @RouterOperation(method = RequestMethod.POST, operation = @Operation(description = "Say hello POST", operationId = "lowercasePOST", tags = "positions"))
})
public Function&lt;Flux&lt;String&gt;, Flux&lt;String&gt;&gt; lowercase() {
    return flux -&gt; flux.map(value -&gt; value.toLowerCase());
}
</code></pre>
</div>
</div>
<div class="paragraph">
<p>一些代码示例在演示的 GITHUB 上可用</p>
</div>
<div class="ulist">
<ul>
<li>
<p><a href="https://github.com/springdoc/springdoc-openapi-demos/tree/master/demo-spring-cloud-function" target="_blank" rel="noopener">带有 Spring Cloud Function Web 的示例应用程序</a></p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="kotlin-support"><a class="anchor" href="#kotlin-support"></a>3.9. Kotlin 支持</h3>
<div class="paragraph">
<p><code>springdoc-openapi</code> 支持 Kotlin 类型。</p>
</div>
<div class="paragraph">
<p>使用 <code>Kotlin</code> 的项目应使用</p>
</div>
<div class="ulist">
<ul>
<li>
<p><code>springdoc-openapi-starter-webmvc-api</code> 如果他们依赖于 <code>spring-boot-starter-web</code> 并且他们只需要访问 OpenAPI 端点。</p>
</li>
<li>
<p>或 <code>springdoc-openapi-starter-webmvc-ui</code>，如果他们依赖于 <code>spring-boot-starter-web</code> 并且他们还需要访问 swagger-ui。</p>
</li>
<li>
<p>或 <code>springdoc-openapi-starter-webflux-api</code> 如果他们依赖于 <code>spring-boot-starter-webflux</code> 并且他们只需要访问 OpenAPI 端点。</p>
</li>
<li>
<p>或 <code>springdoc-openapi-starter-webflux-ui</code>，如果他们依赖于 <code>spring-boot-starter-webflux</code> 并且他们还需要访问 swagger-ui。</p>
</li>
</ul>
</div>
<div class="admonitionblock note">
<table>
<tbody><tr>
<td class="icon">
<i class="fa icon-note" title="Note"></i>
</td>
<td class="content">此外，您的项目还应添加 <code>jackson-module-kotlin</code> 以完全支持 <code>Kotlin</code> 类型</td>
</tr>
</tbody></table>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-xml" data-lang="xml">    &lt;dependency&gt;
        &lt;groupId&gt;com.fasterxml.jackson.module&lt;/groupId&gt;
        &lt;artifactId&gt;jackson-module-kotlin&lt;/artifactId&gt;
    &lt;/dependency&gt;</code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="groovy-support"><a class="anchor" href="#groovy-support"></a>3.10. Groovy 支持</h3>
<div class="paragraph">
<p>使用 <code>Groovy</code> 的项目应使用</p>
</div>
<div class="ulist">
<ul>
<li>
<p><code>springdoc-openapi-starter-webmvc-api</code> 如果他们依赖于 <code>spring-boot-starter-web</code> 并且他们只需要访问 OpenAPI 端点。</p>
</li>
<li>
<p>或 <code>springdoc-openapi-starter-webmvc-ui</code>，如果他们依赖于 <code>spring-boot-starter-web</code> 并且他们还需要访问 swagger-ui。</p>
</li>
<li>
<p>或 <code>springdoc-openapi-starter-webflux-api</code> 如果他们依赖于 <code>spring-boot-starter-webflux</code> 并且他们只需要访问 OpenAPI 端点。</p>
</li>
<li>
<p>或 <code>springdoc-openapi-starter-webflux-ui</code>，如果他们依赖于 <code>spring-boot-starter-webflux</code> 并且他们还需要访问 swagger-ui。</p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="javadoc-support"><a class="anchor" href="#javadoc-support"></a>3.11. Javadoc 支持</h3>
<div class="paragraph">
<p><code>springdoc-openapi</code> 可以内省 <code>Javadoc</code> 注解和注释</p>
</div>
<div class="ulist">
<ul>
<li>
<p>方法的 javadoc 注释：解析为 <code>@Operation</code> 描述</p>
</li>
<li>
<p><code>@return </code>：解析为 <code>@Operation</code> 响应描述</p>
</li>
<li>
<p>属性的 javadoc 注释：解析为此字段的“@Schema”描述。</p>
</li>
</ul>
</div>
<div class="paragraph">
<p>需要 <code>Javadoc</code> 支持的项目应使用</p>
</div>
<div class="ulist">
<ul>
<li>
<p><code>springdoc-openapi-starter-webmvc-api</code> 如果他们依赖于 <code>spring-boot-starter-web</code> 并且他们只需要访问 OpenAPI 端点。</p>
</li>
<li>
<p>或 <code>springdoc-openapi-starter-webmvc-ui</code>，如果他们依赖于 <code>spring-boot-starter-web</code> 并且他们还需要访问 swagger-ui。</p>
</li>
<li>
<p>或 <code>springdoc-openapi-starter-webflux-api</code> 如果他们依赖于 <code>spring-boot-starter-webflux</code> 并且他们只需要访问 OpenAPI 端点。</p>
</li>
<li>
<p>或 <code>springdoc-openapi-starter-webflux-ui</code>，如果他们依赖于 <code>spring-boot-starter-webflux</code> 并且他们还需要访问 swagger-ui。</p>
</li>
</ul>
</div>
<div class="admonitionblock note">
<table>
<tbody><tr>
<td class="icon">
<i class="fa icon-note" title="Note"></i>
</td>
<td class="content">此外，您的项目应添加 <a href="https://github.com/dnault/therapi-runtime-javadoc"><code>therapi-runtime-javadoc</code></a> 以在运行时读取 Javadoc 注释。 确保您同时添加它及其注解处理器到您的项目依赖项中。 否则，Javadoc 支持将静默失败。</td>
</tr>
</tbody></table>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-xml" data-lang="xml">    &lt;!--Annotation processor --&gt;
    &lt;build&gt;
        &lt;plugins&gt;
            &lt;plugin&gt;
                &lt;groupId&gt;org.apache.maven.plugins&lt;/groupId&gt;
                &lt;artifactId&gt;maven-compiler-plugin&lt;/artifactId&gt;
                &lt;configuration&gt;
                    &lt;annotationProcessorPaths&gt;
                        &lt;path&gt;
                            &lt;groupId&gt;com.github.therapi&lt;/groupId&gt;
                            &lt;artifactId&gt;therapi-runtime-javadoc-scribe&lt;/artifactId&gt;
                            &lt;version&gt;0.15.0&lt;/version&gt;
                        &lt;/path&gt;
                    &lt;/annotationProcessorPaths&gt;
                &lt;/configuration&gt;
            &lt;/plugin&gt;
        &lt;/plugins&gt;
    &lt;/build&gt;

    &lt;!-- Runtime library --&gt;
    &lt;dependency&gt;
        &lt;groupId&gt;com.github.therapi&lt;/groupId&gt;
        &lt;artifactId&gt;therapi-runtime-javadoc&lt;/artifactId&gt;
        &lt;version&gt;0.15.0&lt;/version&gt;
    &lt;/dependency&gt;</code></pre>
</div>
</div>
<div class="admonitionblock tip">
<table>
<tbody><tr>
<td class="icon">
<i class="fa icon-tip" title="Tip"></i>
</td>
<td class="content">如果 swagger-annotation 描述和 javadoc 注释都存在。 将使用 swagger-annotation 描述的值。</td>
</tr>
</tbody></table>
</div>
</div>
</div>
</div>
<div class="sect1">
<h2 id="features"><a class="anchor" href="#features"></a>4. Springdoc-openapi 功能特性</h2>
<div class="sectionbody">
<div class="sect2">
<h3 id="adding-api-information-and-security-documentation"><a class="anchor" href="#adding-api-information-and-security-documentation"></a>4.1. 添加 API 信息和安全文档</h3>
<div class="paragraph">
<p>该库使用 spring-boot 应用程序自动配置的包来扫描 spring bean 中的以下注解：OpenAPIDefinition 和 Info。 这些注解声明 API 信息：标题、版本、许可证、安全性、服务器、标签、安全性和 externalDocs。 为了更好地生成文档的性能，请在 spring 管理的 bean 中声明 @OpenAPIDefinition 和 @SecurityScheme 注解。</p>
</div>
</div>
<div class="sect2">
<h3 id="error-handling-for-rest-using-controlleradvice"><a class="anchor" href="#error-handling-for-rest-using-controlleradvice"></a>4.2. 使用 @ControllerAdvice 处理 REST 错误</h3>
<div class="paragraph">
<p>要自动生成文档，请确保所有方法都使用注解 @ResponseStatus 声明 HTTP 代码响应</p>
</div>
</div>
<div class="sect2">
<h3 id="disabling-the-springdoc-openapi-endpoints"><a class="anchor" href="#disabling-the-springdoc-openapi-endpoints"></a>4.3. 禁用 <code>springdoc-openapi</code> 端点</h3>
<div class="paragraph">
<p>为了禁用 <code>springdoc-openapi</code> 端点（默认情况下为 /v3/api-docs），请使用以下属性</p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-properties" data-lang="properties"># Disabling the /v3/api-docs endpoint
springdoc.api-docs.enabled=false</code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="disabling-the-swagger-ui"><a class="anchor" href="#disabling-the-swagger-ui"></a>4.4. 禁用 swagger-ui</h3>
<div class="paragraph">
<p>为了禁用 swagger-ui，请使用以下属性</p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-properties" data-lang="properties"># Disabling the swagger-ui
springdoc.swagger-ui.enabled=false</code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="swagger-ui-configuration"><a class="anchor" href="#swagger-ui-configuration"></a>4.5. Swagger-ui 配置</h3>
<div class="paragraph">
<p>该库支持 swagger-ui 官方属性</p>
</div>
<div class="ulist">
<ul>
<li>
<p><a href="https://swagger.org.cn/docs/open-source-tools/swagger-ui/usage/configuration/" target="_blank" rel="noopener">https://swagger.org.cn/docs/open-source-tools/swagger-ui/usage/configuration/</a></p>
</li>
</ul>
</div>
<div class="paragraph">
<p>您需要将 swagger-ui 属性声明为 spring-boot 属性。 所有这些属性都应使用以下前缀声明：<strong>springdoc.swagger-ui</strong></p>
</div>
</div>
<div class="sect2">
<h3 id="selecting-the-rest-controllers-to-include-in-the-documentation"><a class="anchor" href="#selecting-the-rest-controllers-to-include-in-the-documentation"></a>4.6. 选择要包含在文档中的 Rest Controller</h3>
<div class="paragraph">
<p>除了来自 swagger-annotations 的 @Hidden 注解之外，还可以使用包或路径配置来限制生成的 OpenAPI 描述。</p>
</div>
<div class="paragraph">
<p>对于要包含的包列表，请使用以下属性</p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-properties" data-lang="properties"># Packages to include
springdoc.packagesToScan=com.package1, com.package2</code></pre>
</div>
</div>
<div class="paragraph">
<p>对于要包含的路径列表，请使用以下属性</p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-properties" data-lang="properties"># Paths to include
springdoc.pathsToMatch=/v1, /api/balance/**</code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="spring-webfluxwebmvc-fn-with-functional-endpoints"><a class="anchor" href="#spring-webfluxwebmvc-fn-with-functional-endpoints"></a>4.7. 具有函数式端点的 Spring-webflux/WebMvc.fn</h3>
<div class="paragraph">
<p>自 v1.5.0 版本以来，由于 spring-framework 中的此增强功能：<a href="https://github.com/spring-projects/spring-framework/issues/25938">#25938</a>，引入了函数式 DSL。</p>
</div>
<div class="paragraph">
<p>它是 <code>@RouterOperations</code> 注解的替代函数式 API。</p>
</div>
<div class="paragraph">
<p>这是一个示例 DSL，用于为 webflux/WebMvc.fn REST 端点生成 OpenAPI 描述</p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">@Bean
RouterFunction&lt;?&gt; routes() {
    return route().GET("/foo", HANDLER_FUNCTION, ops -&gt; ops
            .operationId("hello")
            .parameter(parameterBuilder().name("key1").description("My key1 description"))
            .parameter(parameterBuilder().name("key2").description("My key2 description"))
            .response(responseBuilder().responseCode("200").description("This is normal response description"))
            .response(responseBuilder().responseCode("404").description("This is another response description"))
    ).build();
}
</code></pre>
</div>
</div>
<div class="paragraph">
<p>这是某些示例代码的链接</p>
</div>
<div class="ulist">
<ul>
<li>
<p><a href="https://github.com/springdoc/springdoc-openapi/blob/master/springdoc-openapi-starter-webflux-api/src/test/java/test/org/springdoc/api/app90/HelloRouter.java">HelloRouter</a></p>
</li>
<li>
<p><a href="https://github.com/springdoc/springdoc-openapi/blob/master/springdoc-openapi-starter-webflux-api/src/test/java/test/org/springdoc/api/app90/quotes/QuotesRouter.java">QuotesRouter</a></p>
</li>
<li>
<p><a href="https://github.com/springdoc/springdoc-openapi/blob/master/springdoc-openapi-starter-webflux-api/src/test/java/test/org/springdoc/api/app90/book/BookRouter.java">BookRouter</a></p>
</li>
<li>
<p><a href="https://github.com/springdoc/springdoc-openapi/blob/master/springdoc-openapi-starter-webflux-api/src/test/java/test/org/springdoc/api/app90/employee/EmployeeRouter.java">EmployeeRouter</a></p>
</li>
<li>
<p><a href="https://github.com/springdoc/springdoc-openapi/blob/master/springdoc-openapi-starter-webflux-api/src/test/java/test/org/springdoc/api/app90/position/PositionRouter.java">PositionRouter</a></p>
</li>
</ul>
</div>
<div class="paragraph">
<p>以及使用函数式端点 DSL 的演示代码</p>
</div>
<div class="ulist">
<ul>
<li>
<p><a href="https://github.com/springdoc/springdoc-openapi-demos/tree/master/demo-spring-boot-3-webflux-functional">使用函数式 DSL 的示例 webflux 应用程序</a></p>
</li>
</ul>
</div>
<div class="paragraph">
<p>自 <code>v1.3.8</code> 版本以来，已添加对函数式端点的支持。 为此目的添加了两个主要注解：<code>@RouterOperations</code> 和 <code>@RouterOperation</code>。</p>
</div>
<div class="paragraph">
<p>只有带有 <code>@RouterOperations</code> 和 <code>@RouterOperation</code> 的 REST API 才能在 swagger-ui 上显示。</p>
</div>
<div class="ulist">
<ul>
<li>
<p><code>@RouterOperation</code>：如果 Router bean 包含与 REST API 相关的单个路由，则可以单独使用它。 使用 @RouterOperation 时，不必填写路径</p>
</li>
<li>
<p><code>@RouterOperation</code>，可以直接引用 spring Bean（beanClass 属性）和底层方法（beanMethod 属性）：Springdoc-openapi 然后将检查此方法和此方法级别的 swagger 注解。</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">@Bean
@RouterOperation(beanClass = EmployeeService.class, beanMethod = "findAllEmployees")
RouterFunction&lt;ServerResponse&gt; getAllEmployeesRoute() {
   return route(GET("/employees").and(accept(MediaType.APPLICATION_JSON)),
         req -&gt; ok().body(
               employeeService().findAllEmployees(), Employee.class));
}
</code></pre>
</div>
</div>
<div class="ulist">
<ul>
<li>
<p><code>@RouterOperation</code>，包含 <code>@Operation</code> 注解。 如果声明了 beanMethod 属性，则 <code>@Operation</code> 注解也可以放置在 bean 方法级别。</p>
</li>
</ul>
</div>
<div class="admonitionblock important">
<table>
<tbody><tr>
<td class="icon">
<i class="fa icon-important" title="Important"></i>
</td>
<td class="content">不要忘记设置 <strong>operationId</strong>，这是<strong>强制性</strong>的。</td>
</tr>
</tbody></table>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">@Bean
@RouterOperation(operation = @Operation(operationId = "findEmployeeById", summary = "Find purchase order by ID", tags = { "MyEmployee" },
      parameters = { @Parameter(in = ParameterIn.PATH, name = "id", description = "Employee Id") },
      responses = { @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = Employee.class))),
            @ApiResponse(responseCode = "400", description = "Invalid Employee ID supplied"),
            @ApiResponse(responseCode = "404", description = "Employee not found") }))
RouterFunction&lt;ServerResponse&gt; getEmployeeByIdRoute() {
   return route(GET("/employees/{id}"),
         req -&gt; ok().body(
               employeeRepository().findEmployeeById(req.pathVariable("id")), Employee.class));
}
</code></pre>
</div>
</div>
<div class="ulist">
<ul>
<li>
<p><code>@RouterOperations</code>：如果 Router bean 包含多个路由，则应使用此注解。 使用 RouterOperations 时，必须填写 path 属性。</p>
</li>
<li>
<p>一个 <code>@RouterOperations</code>，包含多个 <code>@RouterOperation</code>。</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">@RouterOperations({ @RouterOperation(path = "/getAllPersons", beanClass = PersonService.class, beanMethod = "getAll"),
      @RouterOperation(path = "/getPerson/{id}", beanClass = PersonService.class, beanMethod = "getById"),
      @RouterOperation(path = "/createPerson", beanClass = PersonService.class, beanMethod = "save"),
      @RouterOperation(path = "/deletePerson/{id}", beanClass = PersonService.class, beanMethod = "delete") })
@Bean
public RouterFunction&lt;ServerResponse&gt; personRoute(PersonHandler handler) {
   return RouterFunctions
         .route(GET("/getAllPersons").and(accept(MediaType.APPLICATION_JSON)), handler::findAll)
         .andRoute(GET("/getPerson/{id}").and(accept(MediaType.APPLICATION_STREAM_JSON)), handler::findById)
         .andRoute(POST("/createPerson").and(accept(MediaType.APPLICATION_JSON)), handler::save)
         .andRoute(DELETE("/deletePerson/{id}").and(accept(MediaType.APPLICATION_JSON)), handler::delete);
}
</code></pre>
</div>
</div>
<div class="paragraph">
<p>使用 @RouterOperation 填充的所有文档都可以通过路由器函数数据完成。 为此，<code>@RouterOperation</code> 字段必须有助于唯一标识相关路由。 <code>springdoc-openpi</code> 使用以下条件扫描与 <code>@RouterOperation</code> 注解相关的唯一路由</p>
</div>
<div class="ulist">
<ul>
<li>
<p>按路径</p>
</li>
<li>
<p>按路径和 RequestMethod</p>
</li>
<li>
<p>按路径和 produces</p>
</li>
<li>
<p>按路径和 consumes</p>
</li>
<li>
<p>按路径和 RequestMethod 和 produces</p>
</li>
<li>
<p>按路径和 RequestMethod 和 consumes</p>
</li>
<li>
<p>按路径和 produces 和 consumes</p>
</li>
<li>
<p>按路径和 RequestMethod 和 produces 和 consumes</p>
</li>
</ul>
</div>
<div class="paragraph">
<p>一些代码示例在演示的 GITHUB 上可用</p>
</div>
<div class="ulist">
<ul>
<li>
<p><a href="https://github.com/springdoc/springdoc-openapi-demos/tree/master/demo-spring-boot-3-webflux-functional" target="_blank" rel="noopener">带有函数式端点文档的示例应用程序</a></p>
</li>
</ul>
</div>
<div class="paragraph">
<p>以及一些项目测试：（从 app69 到 app75）</p>
</div>
<div class="ulist">
<ul>
<li>
<p><a href="https://github.com/springdoc/springdoc-openapi/tree/master/springdoc-openapi-starter-webflux-api/src/test/java/test/org/springdoc/api" target="_blank" rel="noopener">带有函数式端点文档的示例代码</a></p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="integration-with-wildfly"><a class="anchor" href="#integration-with-wildfly"></a>4.8. 与 WildFly 集成</h3>
<div class="ulist">
<ul>
<li>
<p>对于 WildFly 用户，您需要添加以下依赖项以使 swagger-ui 工作</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-xml" data-lang="xml">   &lt;dependency&gt;
     &lt;groupId&gt;org.webjars&lt;/groupId&gt;
     &lt;artifactId&gt;webjars-locator-jboss-vfs&lt;/artifactId&gt;
     &lt;version&gt;0.1.0&lt;/version&gt;
   &lt;/dependency&gt;</code></pre>
</div>
</div>
<script async="" src="https://#/pagead/js/adsbygoogle.js?client=ca-pub-8127371937306964" crossorigin="anonymous"></script>
<ins class="adsbygoogle" style="display:block; text-align:center;" data-ad-layout="in-article" data-ad-format="fluid" data-ad-client="ca-pub-8127371937306964" data-ad-slot="6163211104"></ins>
<script>
     (adsbygoogle = window.adsbygoogle || []).push({});
</script>
</div>
</div>
</div>
<div class="sect1">
<h2 id="properties"><a class="anchor" href="#properties"></a>5. Springdoc-openapi 属性</h2>
<div class="sectionbody">
<div class="paragraph">
<p><code>springdoc-openapi</code> 依赖于标准 <a href="https://docs.springframework.org.cn/spring-boot/reference/features/external-config.html" target="_blank" rel="noopener">spring 配置属性</a> (yml 或 properties)，使用标准文件位置。</p>
</div>
<div class="sect2">
<h3 id="springdoc-openapi-core-properties"><a class="anchor" href="#springdoc-openapi-core-properties"></a>5.1. springdoc-openapi 核心属性</h3>
<table id="core-properties" class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 33.3333%;" />
<col style="width: 33.3333%;" />
<col style="width: 33.3334%;" />
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">参数名称</th>
<th class="tableblock halign-left valign-top">默认值</th>
<th class="tableblock halign-left valign-top">描述</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.api-docs.path</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>/v3/api-docs</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code>，用于 Json 格式的 OpenAPI 文档的自定义路径。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.api-docs.enabled</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>true</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。 用于禁用 springdoc-openapi 端点（默认情况下为 /v3/api-docs）。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.packages-to-scan</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>*</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String 列表</code>。 要扫描的包列表（逗号分隔）</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.paths-to-match</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>/*</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String 列表</code>。 要匹配的路径列表（逗号分隔）</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.produces-to-match</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>/*</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String 列表</code>。 要匹配的 produces 媒体类型列表（逗号分隔）</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.headers-to-match</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>/*</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String 列表</code>。 要匹配的标头列表（逗号分隔）</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.consumes-to-match</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>/*</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String 列表</code>。 要匹配的 consumes 媒体类型列表（逗号分隔）</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.paths-to-exclude</p></td>
<td class="tableblock halign-left valign-top"></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String 列表</code>。 要排除的路径列表（逗号分隔）</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.packages-to-exclude</p></td>
<td class="tableblock halign-left valign-top"></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String 列表</code>。 要排除的包列表（逗号分隔）</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.default-consumes-media-type</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>application/json</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code>。 默认 consumes 媒体类型。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.default-produces-media-type</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code><strong>/</strong></code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code>。 默认 produces 媒体类型。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.cache.disabled</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>false</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。 用于禁用 springdoc-openapi 计算的 OpenAPI 缓存。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.show-actuator</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>false</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。 用于显示 actuator 端点。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.auto-tag-classes</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>true</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。 用于禁用 springdoc-openapi 自动标记。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.model-and-view-allowed</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>false</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。 允许 OpenAPI 描述中显示带有 ModelAndView 返回的 RestController。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.override-with-generic-response</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>true</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。 为 true 时，自动将 @ControllerAdvice 响应添加到所有生成的响应。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.group-configs[0].group</p></td>
<td class="tableblock halign-left valign-top"></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code>。 组名称</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.group-configs[0].display-name</p></td>
<td class="tableblock halign-left valign-top"></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code>。 组的显示名称。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.group-configs[0].packages-to-scan</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>*</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String 列表</code>。 要扫描组的包列表（逗号分隔）</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.group-configs[0].paths-to-match</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>/*</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String 列表</code>。 要匹配组的路径列表（逗号分隔）</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.group-configs[0].paths-to-exclude</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">``</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String 列表</code>。 要排除组的路径列表（逗号分隔）</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.group-configs[0].packages-to-exclude</p></td>
<td class="tableblock halign-left valign-top"></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String 列表</code>。 要排除组的包列表（逗号分隔）</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.group-configs[0].produces-to-match</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>/*</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String 列表</code>。 要匹配的 produces 媒体类型列表（逗号分隔）</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.group-configs[0].consumes-to-match</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>/*</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String 列表</code>。 要匹配的 consumes 媒体类型列表（逗号分隔）</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.group-configs[0].headers-to-match</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>/*</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String 列表</code>。 要匹配的标头列表（逗号分隔）</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.webjars.prefix</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>/webjars</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code>。 用于更改 spring-webflux 的 swagger-ui URL 中可见的 webjars 前缀。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.api-docs.resolve-schema-properties</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>false</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。 用于在 @Schema 上启用属性解析器（名称、标题和描述）。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.remove-broken-reference-definitions</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>true</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。 用于禁用删除损坏的引用定义。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.writer-with-default-pretty-printer</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>false</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。 用于启用 OpenApi 规范的格式化打印。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.model-converters.deprecating-converter.enabled</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>true</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。 用于禁用弃用模型转换器。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.model-converters.polymorphic-converter.enabled</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>true</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。 用于禁用多态模型转换器。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.model-converters.pageable-converter.enabled</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>true</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。 用于禁用 pageable 模型转换器。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.model-converters.sort-converter.enabled</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>true</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。 用于禁用 Sort 转换器。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.use-fqn</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>false</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。 用于启用完全限定名称。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.show-login-endpoint</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>false</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。 用于使 spring security login-endpoint 可见。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.pre-loading-locales</p></td>
<td class="tableblock halign-left valign-top"></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String 列表</code>。 在应用程序启动时加载 OpenAPI 的区域设置列表（逗号分隔）。 如果未指定，它将预加载默认区域设置。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.writer-with-order-by-keys</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>false</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。 启用确定性/字母顺序排序。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.use-management-port</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>false</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。 用于在 actuator 管理端口上公开 swagger-ui。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.disable-i18n</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>false</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。 用于禁用使用 i18n 的自动翻译。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.show-spring-cloud-functions</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>true</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。 用于显示 spring-cloud-function web 端点。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.enable-groovy</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>true</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。 用于启用 Groovy 支持。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.enable-spring-security</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>true</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。 用于启用 spring-security 支持。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.enable-kotlin</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>true</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。 用于启用 Kotlin 支持。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.enable-hateoas</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>true</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。 用于启用 spring-hateoas 支持。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.enable-data-rest</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>true</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。启用 spring-data-rest 支持。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.api-docs.version</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>openapi_3_1</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code>。选择 <code>OpenAPI 3.0</code> 或 <code>OpenAPI 3.1</code> (使用值 <code>OPENAPI_3_1</code>)。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.default-flat-param-object</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>false</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。默认扁平化参数。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.default-support-form-data</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>false</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。当指定 api 接受表单数据时，默认将参数设置为表单数据。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.nullable-request-parameter-enabled</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>true</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。默认启用 Kotlin 中可为空请求参数的支持。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.show-oauth2-endpoints</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>false</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。使 spring security oauth2 端点可见。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.api-docs.resolve-extensions-properties</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>false</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。启用 spring 属性解析器对 <code>@ExtensionProperty</code> 的支持。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.enable-default-api-docs</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>true</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。启用默认 OpenAPI 端点 <code>/v3/api-docs</code>。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.trim-kotlin-indent</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>false</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。解析 Kotlin 中的 <code>@Operation</code> 注解时调整缩进。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.allowed-locales</p></td>
<td class="tableblock halign-left valign-top"></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>List of Strings</code>。OpenAPI 允许的语言环境列表（逗号分隔，例如 <code>US,fr-CA</code>）。</p></td>
</tr>
</tbody>
</table>
</div>
<div class="sect2">
<h3 id="swagger-ui-properties"><a class="anchor" href="#swagger-ui-properties"></a>5.2. swagger-ui 属性</h3>
<div class="ulist">
<ul>
<li>
<p><code>springdoc-openapi</code> 上提供了 swagger-ui 属性的支持。请参阅 <a href="https://swagger.org.cn/docs/open-source-tools/swagger-ui/usage/configuration/" target="_blank" rel="noopener">官方文档</a>。</p>
</li>
<li>
<p>您可以在文档中使用与 Spring Boot 属性相同的 swagger-ui 属性。</p>
</li>
</ul>
</div>
<div class="admonitionblock note">
<table>
<tbody><tr>
<td class="icon">
<i class="fa icon-note" title="Note"></i>
</td>
<td class="content">所有这些属性都应使用以下前缀声明：<code>springdoc.swagger-ui</code></td>
</tr>
</tbody></table>
</div>
<table id="ui-properties" class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 33.3333%;" />
<col style="width: 33.3333%;" />
<col style="width: 33.3334%;" />
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">参数名称</th>
<th class="tableblock halign-left valign-top">默认值</th>
<th class="tableblock halign-left valign-top">描述</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.path</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>/swagger-ui.html</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code>，用于 swagger-ui HTML 文档的自定义路径。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.enabled</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>true</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。禁用 swagger-ui 端点（默认情况下为 /swagger-ui.html）。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.configUrl</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>/v3/api-docs/swagger-config</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code>。用于从外部获取配置文档的 URL。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.layout</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>BaseLayout</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code>。通过插件系统可用的组件名称，用作 Swagger UI 的顶级布局。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.validatorUrl</p></td>
<td class="tableblock halign-left valign-top"></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">默认情况下，Swagger UI 不会验证规范。您可以使用此参数设置验证器 URL，例如针对 swagger.io 的在线验证器。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.tryItOutEnabled</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>false</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。控制是否默认启用“Try it out”部分。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.filter</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>false</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean OR String</code>。如果设置，则启用过滤。顶部栏将显示一个编辑框，您可以使用该编辑框来过滤显示的已标记操作。可以是 Boolean 类型以启用或禁用，也可以是字符串类型，在这种情况下，将使用该字符串作为过滤器表达式启用过滤。过滤区分大小写，匹配标签内任何位置的过滤器表达式。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.operationsSorter</p></td>
<td class="tableblock halign-left valign-top"></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Function=(a ⇒ a)</code>。对每个 API 的操作列表应用排序。可以是 'alpha'（按路径字母数字排序）、'method'（按 HTTP 方法排序）或函数（有关排序函数的工作方式，请参阅 Array.prototype.sort()）。默认值是服务器返回的顺序，保持不变。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.tagsSorter</p></td>
<td class="tableblock halign-left valign-top"></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Function=(a ⇒ a)</code>。对每个 API 的标签列表应用排序。可以是 'alpha'（按路径字母数字排序）或函数 <a href="https://mdn.org.cn/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/sort" target="_blank" rel="noopener">请参阅 Array.prototype.sort()</a> 以了解如何编写排序函数）。每次传递都会将两个标签名称字符串传递给排序器。默认值是 Swagger UI 确定的顺序。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.oauth2RedirectUrl</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>/swagger-ui/oauth2-redirect.html</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code>。OAuth 重定向 URL。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.displayOperationId</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>false</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。控制操作列表中 operationId 的显示。默认值为 <code>false</code>。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.displayRequestDuration</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>false</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。控制“Try it out”请求的请求持续时间（以毫秒为单位）的显示。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.deepLinking</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>false</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。如果设置为 <code>true</code>，则为标签和操作启用深度链接。有关更多信息，请参阅 [深度链接文档](<a href="https://swagger.org.cn/docs/open-source-tools/swagger-ui/usage/deep-linking" class="bare">swagger.io/docs/open-source-tools/swagger-ui/usage/deep-linking</a>)。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.defaultModelsExpandDepth</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>1</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Number</code>。模型的默认展开深度（设置为 -1 完全隐藏模型）。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.defaultModelExpandDepth</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>1</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Number</code>。模型示例部分中模型的默认展开深度。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.defaultModelRendering</p></td>
<td class="tableblock halign-left valign-top"></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String=["example"*, "model"]</code>。控制首次呈现 API 时模型的显示方式。（用户始终可以通过单击“Model”和“Example Value”链接来切换给定模型的呈现方式。）</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.docExpansion</p></td>
<td class="tableblock halign-left valign-top"></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String=["list"*, "full", "none"]</code>。控制操作和标签的默认展开设置。可以是 'list'（仅展开标签）、'full'（展开标签和操作）或 'none'（不展开任何内容）。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.maxDisplayedTags</p></td>
<td class="tableblock halign-left valign-top"></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Number</code>。如果设置，则将显示的已标记操作数限制为最多这么多。默认值是显示所有操作。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.showExtensions</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>false</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。控制操作、参数和 Schema 的供应商扩展 (<code>x-</code>) 字段和值的显示。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.url</p></td>
<td class="tableblock halign-left valign-top"></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code>。要配置自定义 OpenAPI 文件的路径。如果使用 <code>urls</code>，则将被忽略。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.showCommonExtensions</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>false</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。控制参数的扩展 (<code>pattern</code>, <code>maxLength</code>, <code>minLength</code>, <code>maximum</code>, <code>minimum</code>) 字段和值的显示。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.supportedSubmitMethods</p></td>
<td class="tableblock halign-left valign-top"></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Array=[get, put, post, delete, options, head, patch, trace]</code>。启用了“Try it out”功能的 HTTP 方法列表。空数组禁用所有操作的“Try it out”。这不会从显示中过滤掉操作。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.queryConfigEnabled</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>false</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。自 <code>v1.6.0</code> 起禁用。此参数启用（旧版）通过 URL 搜索参数覆盖配置参数。<a href="https://github.com/swagger-api/swagger-ui/security/advisories/GHSA-qrmm-w75w-3wpx" target="_blank" rel="noopener">请在启用此功能之前查看安全建议</a>。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.oauth. additionalQueryStringParams</p></td>
<td class="tableblock halign-left valign-top"></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code>。添加到 authorizationUrl 和 tokenUrl 的其他查询参数。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.disable-swagger-default-url</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>false</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。禁用 swagger-ui 默认 petstore url。（自 v1.4.1 起可用）。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.urls[0].url</p></td>
<td class="tableblock halign-left valign-top"></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>URL</code>。swagger 组的 url，由 Topbar 插件使用。URLs 在此数组中的所有项中必须是唯一的，因为它们用作标识符。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.urls[0].name</p></td>
<td class="tableblock halign-left valign-top"></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code>。swagger 组的名称，由 Topbar 插件使用。Names 在此数组中的所有项中必须是唯一的，因为它们用作标识符。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.urlsPrimaryName</p></td>
<td class="tableblock halign-left valign-top"></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code>。Swagger UI 加载时将显示的 swagger 组的名称。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.oauth.clientId</p></td>
<td class="tableblock halign-left valign-top"></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code>。默认 clientId。必须是字符串。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.oauth.clientSecret</p></td>
<td class="tableblock halign-left valign-top"></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code>。默认 clientSecret。永远不要在您的生产环境中使用此参数。它会暴露关键的安全信息。此功能仅适用于开发/测试环境。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.oauth.realm</p></td>
<td class="tableblock halign-left valign-top"></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code>。realm 查询参数（对于 OAuth 1）添加到 authorizationUrl 和 tokenUrl。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.oauth.appName</p></td>
<td class="tableblock halign-left valign-top"></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code>。OAuth 应用程序名称，显示在授权弹出窗口中。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.oauth.scopeSeparator</p></td>
<td class="tableblock halign-left valign-top"></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code>。用于传递作用域的 OAuth 作用域分隔符，在调用之前进行编码，默认值为空格（编码值 %20）。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.csrf.enabled</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>false</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。启用 CSRF 支持</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.csrf.use-local-storage</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>false</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。从本地存储获取 CSRF 令牌。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.csrf.use-session-storage</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>false</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。从会话存储获取 CSRF 令牌。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.csrf.cookie-name</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>XSRF-TOKEN</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code>。可选 CSRF，用于设置 CSRF cookie 名称。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.csrf.header-name</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>X-XSRF-TOKEN</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code>。可选 CSRF，用于设置 CSRF 标头名称。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.syntaxHighlight.activated</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>true</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。是否应激活语法高亮。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.syntaxHighlight.theme</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>agate</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code>。<code>String=["agate"*, "arta", "monokai", "nord", "obsidian", "tomorrow-night"]</code>。<a href="https://highlightjs.org/static/demo/" target="_blank" rel="noopener">Highlight.js</a> 语法着色主题，用于使用。（仅提供这 6 种样式。）</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.oauth. useBasicAuthentication WithAccessCodeGrant</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>false</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。仅针对 accessCode 流激活。在对 tokenUrl 的 authorization_code 请求期间，使用 HTTP 基本身份验证方案传递客户端密码（带有 Basic base64encode(client_id + client_secret) 的 Authorization 标头）。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.oauth. usePkceWithAuthorization CodeGrant</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>false</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。仅适用于 authorizatonCode 流。代码交换的证明密钥为 OAuth 公共客户端带来了增强的安全性。</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.persistAuthorization</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>false</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。如果设置为 true，则会持久化授权数据，并且在浏览器关闭/刷新时不会丢失</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">springdoc.swagger-ui.use-root-path</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>false</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code>。如果设置为 true，则可以直接从应用程序根路径访问 swagger-ui。</p></td>
</tr>
</tbody>
</table>
<script async="" src="https://#/pagead/js/adsbygoogle.js?client=ca-pub-8127371937306964" crossorigin="anonymous"></script>
<ins class="adsbygoogle" style="display:block; text-align:center;" data-ad-layout="in-article" data-ad-format="fluid" data-ad-client="ca-pub-8127371937306964" data-ad-slot="6163211104"></ins>
<script>
     (adsbygoogle = window.adsbygoogle || []).push({});
</script>
</div>
</div>
</div>
<div class="sect1">
<h2 id="plugins"><a class="anchor" href="#plugins"></a>6. Springdoc-openapi 插件</h2>
<div class="sectionbody">
<div class="sect2">
<h3 id="maven-plugin"><a class="anchor" href="#maven-plugin"></a>6.1. Maven 插件</h3>
<div class="paragraph">
<p><code>springdoc-openapi-maven-plugin</code> 的目的是在构建时生成 json 和 yaml OpenAPI 描述。该插件在 integration-tests 阶段工作，并生成 OpenAPI 描述。该插件与 spring-boot-maven 插件协同工作。</p>
</div>
<div class="paragraph">
<p>您可以在集成测试阶段使用 maven 命令对其进行测试</p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-bash" data-lang="bash">mvn verify</code></pre>
</div>
</div>
<div class="paragraph">
<p>为了使用此功能，您需要在 pom.xml 的 plugins 部分添加插件声明</p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-xml" data-lang="xml">&lt;plugin&gt;
    &lt;groupId&gt;org.springframework.boot&lt;/groupId&gt;
    &lt;artifactId&gt;spring-boot-maven-plugin&lt;/artifactId&gt;
    &lt;version&gt;${spring-boot-maven-plugin.version}&lt;/version&gt;
    &lt;configuration&gt;
        &lt;jvmArguments&gt;-Dspring.application.admin.enabled=true&lt;/jvmArguments&gt;
    &lt;/configuration&gt;
    &lt;executions&gt;
        &lt;execution&gt;
            &lt;goals&gt;
                &lt;goal&gt;start&lt;/goal&gt;
                &lt;goal&gt;stop&lt;/goal&gt;
            &lt;/goals&gt;
        &lt;/execution&gt;
    &lt;/executions&gt;
&lt;/plugin&gt;
&lt;plugin&gt;
    &lt;groupId&gt;org.springdoc&lt;/groupId&gt;
    &lt;artifactId&gt;springdoc-openapi-maven-plugin&lt;/artifactId&gt;
    &lt;version&gt;1.4&lt;/version&gt;
    &lt;executions&gt;
        &lt;execution&gt;
            &lt;id&gt;integration-test&lt;/id&gt;
            &lt;goals&gt;
                &lt;goal&gt;generate&lt;/goal&gt;
            &lt;/goals&gt;
        &lt;/execution&gt;
    &lt;/executions&gt;
&lt;/plugin&gt;</code></pre>
</div>
</div>
<div class="paragraph">
<p>有关 springdoc-openapi-maven-plugin 的更多自定义设置，您可以查阅插件文档</p>
</div>
<div class="ulist">
<ul>
<li>
<p><a href="https://github.com/springdoc/springdoc-openapi-maven-plugin" target="_blank" rel="noopener">https://github.com/springdoc/springdoc-openapi-maven-plugin</a></p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="gradle-plugin"><a class="anchor" href="#gradle-plugin"></a>6.2. Gradle 插件</h3>
<div class="paragraph">
<p>此插件允许您从 Gradle 构建为 Spring Boot 应用程序生成 OpenAPI 3 规范。</p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-groovy" data-lang="groovy">plugins {
      id("org.springframework.boot") version "3.1.2"
      id("org.springdoc.openapi-gradle-plugin") version "1.9.0"
}
</code></pre>
</div>
</div>
<div class="paragraph">
<p>当您将此插件及其运行时依赖插件添加到构建文件时，该插件会创建以下任务</p>
</div>
<div class="ulist">
<ul>
<li>
<p>forkedSpringBootRun</p>
</li>
<li>
<p>generateOpenApiDocs</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-bash" data-lang="bash">gradle clean generateOpenApiDocs</code></pre>
</div>
</div>
<div class="paragraph">
<p>有关 <code>springdoc-openapi-gradle-plugin</code> 的更多自定义配置，您可以查阅插件文档</p>
</div>
<div class="ulist">
<ul>
<li>
<p><a href="https://github.com/springdoc/springdoc-openapi-gradle-plugin" target="_blank" rel="noopener">https://github.com/springdoc/springdoc-openapi-gradle-plugin</a></p>
</li>
</ul>
</div>
</div>
</div>
</div>
<div class="sect1">
<h2 id="demos"><a class="anchor" href="#demos"></a>7. Springdoc-openapi 演示</h2>
<div class="sectionbody">
<div class="sect2">
<h3 id="springdoc-applications-demos"><a class="anchor" href="#springdoc-applications-demos"></a>7.1. springdoc 应用程序演示</h3>
<div class="ulist">
<ul>
<li>
<p><a href="https://demos.springdoc.org/demo-spring-boot-3-webmvc" target="_blank" rel="noopener">Spring Boot 3 Web MVC 与 OpenAPI 3 演示</a></p>
</li>
<li>
<p><a href="https://demos.springdoc.org/demo-spring-boot-3-webflux-functional/swagger-ui.html" target="_blank" rel="noopener">Spring Boot 3 WebFlux 与函数式端点 OpenAPI 3 演示</a></p>
</li>
<li>
<p><a href="https://demos.springdoc.org/demo-spring-hateoas" target="_blank" rel="noopener">Spring Boot 3 和 Spring Hateoas 与 OpenAPI 3 演示</a></p>
</li>
<li>
<p><a href="https://demos.springdoc.org/spring-cloud-function-webmvc" target="_blank" rel="noopener">Spring Boot 3 和 Spring Cloud Function Web MVC 演示</a></p>
</li>
<li>
<p><a href="https://demos.springdoc.org/spring-cloud-function-webflux/swagger-ui.html" target="_blank" rel="noopener">Spring Boot 3 和 Spring Cloud Function WebFlux 演示</a></p>
</li>
<li>
<p><a href="https://demos.springdoc.org/demo-microservices/swagger-ui.html" target="_blank" rel="noopener">Spring Boot 3 和 Spring Cloud Gateway 演示</a></p>
</li>
</ul>
</div>
<div class="imageblock">
<div class="content">
<img src="img/pets.png" alt="pets.png">
</div>
</div>
</div>
<div class="sect2">
<h3 id="source-code-of-the-demo-applications"><a class="anchor" href="#source-code-of-the-demo-applications"></a>7.2. 演示应用程序的源代码</h3>
<div class="ulist">
<ul>
<li>
<p><a href="https://github.com/springdoc/springdoc-openapi-demos/tree/master" target="_blank" rel="noopener">https://github.com/springdoc/springdoc-openapi-demos/tree/master</a></p>
</li>
</ul>
</div>
<script async="" src="https://#/pagead/js/adsbygoogle.js?client=ca-pub-8127371937306964" crossorigin="anonymous"></script>
<ins class="adsbygoogle" style="display:block; text-align:center;" data-ad-layout="in-article" data-ad-format="fluid" data-ad-client="ca-pub-8127371937306964" data-ad-slot="6163211104"></ins>
<script>
     (adsbygoogle = window.adsbygoogle || []).push({});
</script>
</div>
</div>
</div>
<div class="sect1">
<h2 id="migrating-from-springdoc-v1"><a class="anchor" href="#migrating-from-springdoc-v1"></a>8. 从 springdoc-openapi v1 迁移</h2>
<div class="sectionbody">
<div class="paragraph">
<p>所有模块都已重命名。<code>springdoc-openapi-starter-common</code> 集成了许多 spring 模块支持，以最大限度地隐藏复杂性。它允许开箱即用地支持 <code>Actuator</code> / <code>Spring Cloud Function</code> / <code>Spring Data Rest</code>/ <code>Spring Native</code>/ <code>Spring Hateoas</code> / <code>Spring Securtiy</code> / <code>Kotlin</code>/ <code>Javadoc</code>。</p>
</div>
<div class="paragraph">
<p>下表描述了主要模块的更改</p>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 33.3333%;" />
<col style="width: 33.3333%;" />
<col style="width: 33.3334%;" />
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">springdoc-openapi-v1</th>
<th class="tableblock halign-left valign-top">springdoc-openapi-v2</th>
<th class="tableblock halign-left valign-top">描述</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>springdoc-openapi-common</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>springdoc-openapi-starter-common</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">包括基础 <code>springdoc-openapi</code> 功能</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>springdoc-openapi-data-rest</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>springdoc-openapi-starter-common</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">用于 Spring Data Rest 支持</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>springdoc-openapi-groovy</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>springdoc-openapi-starter-common</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">用于 Groovy 支持</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>springdoc-openapi-hateoas</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>springdoc-openapi-starter-common</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">用于 Spring Hateoas 支持</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>springdoc-openapi-javadoc</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>springdoc-openapi-starter-common</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">用于 Javadoc 支持</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>springdoc-openapi-kotlin</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>springdoc-openapi-starter-common</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">用于 Kotlin 支持</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>springdoc-openapi-security</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>springdoc-openapi-starter-common</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">用于 Spring Security 支持</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>springdoc-openapi-webmvc-core</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>springdoc-openapi-starter-webmvc-api</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">用于 Spring WebMvc 支持</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>springdoc-openapi-webflux-core</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>springdoc-openapi-starter-webflux-api</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">用于 Spring WebFlux 支持</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>springdoc-openapi-ui</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>springdoc-openapi-starter-webmvc-ui</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">用于在 Spring WebMvc 上下文中使用 Swagger-UI</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>springdoc-openapi-webflux-ui</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>springdoc-openapi-starter-webflux-ui</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">用于在 Spring WebFlux 上下文中使用 Swagger-UI</p></td>
</tr>
</tbody>
</table>
<div class="admonitionblock important">
<table>
<tbody><tr>
<td class="icon">
<i class="fa icon-important" title="Important"></i>
</td>
<td class="content">类/注解更改</td>
</tr>
</tbody></table>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 50%;" />
<col style="width: 50%;" />
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">springdoc-openapi-v1</th>
<th class="tableblock halign-left valign-top">springdoc-openapi-v2</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>org.springdoc.core.SpringDocUtils</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>org.springdoc.core.utils.SpringDocUtils</code></p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>org.springdoc.api.annotations.ParameterObject</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>org.springdoc.core.annotations.ParameterObject</code></p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>org.springdoc.core.GroupedOpenApi</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>org.springdoc.core.models.GroupedOpenApi</code></p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>org.springdoc.core.customizers.OpenApiCustomiser</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>org.springdoc.core.customizers.OpenApiCustomizer</code></p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>org.springdoc.core.Constants</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>org.springdoc.core.utils.Constants</code></p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>org.springdoc.core.SwaggerUiConfigParameters</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>org.springdoc.core.properties.SwaggerUiConfigParameters</code></p></td>
</tr>
</tbody>
</table>
<div class="admonitionblock tip">
<table>
<tbody><tr>
<td class="icon">
<i class="fa icon-tip" title="Tip"></i>
</td>
<td class="content">迁移提示</td>
</tr>
</tbody></table>
</div>
<div class="paragraph">
<p>以下模块不再需要，可以删除</p>
</div>
<div class="ulist">
<ul>
<li>
<p><code>springdoc-openapi-javadoc</code></p>
</li>
<li>
<p><code>springdoc-openapi-kotlin</code></p>
</li>
<li>
<p><code>springdoc-openapi-data-rest</code></p>
</li>
<li>
<p><code>springdoc-openapi-security</code></p>
</li>
<li>
<p><code>springdoc-openapi-webmvc-core</code></p>
</li>
<li>
<p><code>springdoc-openapi-webflux-core</code></p>
</li>
<li>
<p><code>springdoc-openapi-hateoas</code></p>
</li>
<li>
<p><code>springdoc-openapi-groovy</code></p>
</li>
</ul>
</div>
<div class="paragraph">
<p>此外</p>
</div>
<div class="ulist">
<ul>
<li>
<p>将 <code>springdoc-openapi-ui</code> 替换为 <code>springdoc-openapi-starter-webmvc-ui</code></p>
</li>
<li>
<p>将 <code>springdoc-openapi-webflux-ui</code> 替换为 <code>springdoc-openapi-starter-webflux-ui</code></p>
</li>
</ul>
</div>
</div>
</div>
<div class="sect1">
<h2 id="migrating-from-springfox"><a class="anchor" href="#migrating-from-springfox"></a>9. 从 SpringFox 迁移</h2>
<div class="sectionbody">
<div class="ulist">
<ul>
<li>
<p>删除 springfox 和 swagger 2 依赖项。改为添加 <code>springdoc-openapi-starter-webmvc-ui</code> 依赖项。</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-xml" data-lang="xml">   &lt;dependency&gt;
      &lt;groupId&gt;org.springdoc&lt;/groupId&gt;
      &lt;artifactId&gt;springdoc-openapi-starter-webmvc-ui&lt;/artifactId&gt;
      &lt;version&gt;2.8.5&lt;/version&gt;
   &lt;/dependency&gt;</code></pre>
</div>
</div>
<div class="ulist">
<ul>
<li>
<p>将 swagger 2 注解替换为 swagger 3 注解（它已包含在 <code>springdoc-openapi-starter-webmvc-ui</code> 依赖项中）。swagger 3 注解的包是 <code>io.swagger.v3.oas.annotations</code>。</p>
<div class="ulist">
<ul>
<li>
<p><code>@Api</code> → <code>@Tag</code></p>
</li>
<li>
<p><code>@ApiIgnore</code> → <code>@Parameter(hidden = true)</code> 或 <code>@Operation(hidden = true)</code> 或 <code>@Hidden</code></p>
</li>
<li>
<p><code>@ApiImplicitParam</code> → <code>@Parameter</code></p>
</li>
<li>
<p><code>@ApiImplicitParams</code> → <code>@Parameters</code></p>
</li>
<li>
<p><code>@ApiModel</code> → <code>@Schema</code></p>
</li>
<li>
<p><code>@ApiModelProperty(allowEmptyValue = true)</code> → <code>@Schema(nullable = true)</code></p>
</li>
<li>
<p><code>@ApiModelProperty</code> → <code>@Schema</code></p>
</li>
<li>
<p><code>@ApiOperation(value = "foo", notes = "bar")</code> → <code>@Operation(summary = "foo", description = "bar")</code></p>
</li>
<li>
<p><code>@ApiParam</code> → <code>@Parameter</code></p>
</li>
<li>
<p><code>@ApiResponse(code = 404, message = "foo")</code> → <code>@ApiResponse(responseCode = "404", description = "foo")</code></p>
</li>
</ul>
</div>
</li>
<li>
<p>此步骤是可选的：仅当您有<strong>多个</strong> <code>Docket</code> bean 时，才将它们替换为 <code>GroupedOpenApi</code> bean。</p>
</li>
</ul>
</div>
<div class="paragraph">
<p>之前</p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">  @Bean
  public Docket publicApi() {
      return new Docket(DocumentationType.SWAGGER_2)
              .select()
              .apis(RequestHandlerSelectors.basePackage("org.github.springshop.web.public"))
              .paths(PathSelectors.regex("/public.*"))
              .build()
              .groupName("springshop-public")
              .apiInfo(apiInfo());
  }

  @Bean
  public Docket adminApi() {
      return new Docket(DocumentationType.SWAGGER_2)
              .select()
              .apis(RequestHandlerSelectors.basePackage("org.github.springshop.web.admin"))
              .paths(PathSelectors.regex("/admin.*"))
              .apis(RequestHandlerSelectors.withMethodAnnotation(Admin.class))
              .build()
              .groupName("springshop-admin")
              .apiInfo(apiInfo());
  }
</code></pre>
</div>
</div>
<div class="paragraph">
<p>现在</p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">  @Bean
  public GroupedOpenApi publicApi() {
      return GroupedOpenApi.builder()
              .group("springshop-public")
              .pathsToMatch("/public/**")
              .build();
  }
  @Bean
  public GroupedOpenApi adminApi() {
      return GroupedOpenApi.builder()
              .group("springshop-admin")
              .pathsToMatch("/admin/**")
              .addOpenApiMethodFilter(method -&gt; method.isAnnotationPresent(Admin.class))
              .build();
  }
</code></pre>
</div>
</div>
<div class="paragraph">
<p>如果您只有<strong>一个</strong> <code>Docket</code> — 删除它，并在您的 <code>application.properties</code> 中添加属性</p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-properties" data-lang="properties">springdoc.packagesToScan=package1, package2
springdoc.pathsToMatch=/v1, /api/balance/**</code></pre>
</div>
</div>
<div class="ulist">
<ul>
<li>
<p>添加 <code>OpenAPI</code> 类型的 bean。请参见示例</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">  @Bean
  public OpenAPI springShopOpenAPI() {
      return new OpenAPI()
              .info(new Info().title("SpringShop API")
              .description("Spring shop sample application")
              .version("v0.0.1")
              .license(new License().name("Apache 2.0").url("https://springdoc.springframework.org.cn")))
              .externalDocs(new ExternalDocumentation()
              .description("SpringShop Wiki Documentation")
              .url("https://springshop.wiki.github.org/docs"));
  }
</code></pre>
</div>
</div>
<div class="ulist">
<ul>
<li>
<p>如果 swagger-ui 通过代理提供服务</p>
<div class="ulist">
<ul>
<li>
<p><a href="index.html#how-can-i-deploy-springdoc-openapi-starter-webmvc-ui-behind-a-reverse-proxy">how-can-i-deploy-springdoc-openapi-starter-webmvc-ui-behind-a-reverse-proxy</a></p>
</li>
</ul>
</div>
</li>
<li>
<p>自定义 Swagger UI</p>
<div class="ulist">
<ul>
<li>
<p><a href="index.html#how-can-i-configure-swagger-ui">how-can-i-configure-swagger-ui</a></p>
</li>
</ul>
</div>
</li>
<li>
<p>从文档中隐藏操作或控制器</p>
<div class="ulist">
<ul>
<li>
<p><a href="index.html#how-can-i-hide-an-operation-or-a-controller-from-documentation">how-can-i-hide-an-operation-or-a-controller-from-documentation</a></p>
</li>
</ul>
</div>
</li>
</ul>
</div>
</div>
</div>
<div class="sect1">
<h2 id="other-resources"><a class="anchor" href="#other-resources"></a>10. 其他资源</h2>
<div class="sectionbody">
<div class="sect2">
<h3 id="additional-resources-to-get-started"><a class="anchor" href="#additional-resources-to-get-started"></a>10.1. 入门的其他资源</h3>
<div class="ulist">
<ul>
<li>
<p><a href="https://github.com/springdoc/springdoc-openapi" target="_blank" rel="noopener">在 GitHub 上查看项目</a> <span class="image"><a class="image" href="https://github.com/springdoc/springdoc-openapi"><img src="img/github-logo.png" alt="github logo"></a></span></p>
</li>
<li>
<p><a href="https://prezi.com/view/r4DP4TCmYUJk1eaqjKG4/" target="_blank" rel="noopener">Springdoc-openapi 演示文稿</a></p>
</li>
<li>
<p><a href="https://baeldung.cn/spring-rest-openapi-documentation" target="_blank" rel="noopener">Baeldung</a></p>
</li>
<li>
<p><a href="https://dzone.com/articles/openapi-3-documentation-with-spring-boot" target="_blank" rel="noopener">DZone Part1</a></p>
</li>
<li>
<p><a href="https://dzone.com/articles/doing-more-with-springdoc-openapi" target="_blank" rel="noopener">DZone Part2</a></p>
</li>
<li>
<p><a href="https://dzone.com/articles/extending-swagger-and-spring-doc-open-api" target="_blank" rel="noopener">扩展 Swagger 和 Spring Doc Open API</a></p>
</li>
<li>
<p><a href="https://piotrminkowski.com/2020/02/20/microservices-api-documentation-with-springdoc-openapi/" target="_blank" rel="noopener">Piotrminkowski Blog</a></p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="dependencies-repository"><a class="anchor" href="#dependencies-repository"></a>10.2. 依赖仓库</h3>
<div class="paragraph">
<p><code>springdoc-openapi</code> 库托管在 maven central 仓库中。可以在以下位置查看和访问工件</p>
</div>
<div class="paragraph">
<p>发布版本</p>
</div>
<div class="ulist">
<ul>
<li>
<p><a href="https://s01.oss.sonatype.org/content/groups/public/org/springdoc/" target="_blank" rel="noopener">https://s01.oss.sonatype.org/content/groups/public/org/springdoc/</a></p>
</li>
</ul>
</div>
<div class="paragraph">
<p>快照版本</p>
</div>
<div class="ulist">
<ul>
<li>
<p><a href="https://s01.oss.sonatype.org/content/repositories/snapshots/org/springdoc/" target="_blank" rel="noopener">https://s01.oss.sonatype.org/content/repositories/snapshots/org/springdoc/</a></p>
</li>
</ul>
</div>
</div>
</div>
</div>
<div class="sect1">
<h2 id="sponsor"><a class="anchor" href="#sponsor"></a>11. 赞助</h2>
<div class="sectionbody">
<div class="paragraph">
<p><code>springdoc-openapi</code> 在 <a href="https://opencollective.com/springdoc" target="_blank" rel="noopener">Open Collective</a> 上。</p>
</div>
<div class="paragraph">
<p>如果您 ❤️ 这个项目，请考虑成为 <a href="https://github.com/sponsors/springdoc" target="_blank" rel="noopener">赞助商</a>。</p>
</div>
<div class="paragraph">
<p>这笔钱用于支付项目费用，您的捐款将帮助项目成功生存和发展。</p>
</div>
<div class="paragraph">
<p>感谢我们的青铜赞助商！</p>
</div>
        <p style="text-align: center;">
          <a href="https://opensource.mercedes-benz.com/" target="_blank"> <img src="img/mercedes-benz.png" height="10%" width="10%"> </a>&nbsp;&nbsp; <a href="https://www.dm-jobs.com/dmTECH/?locale=de_DE&amp;wt_mc=.display.github.sponsoring.logo" target="_blank"> <img src="img/dmTECH_Logo.jpg" height="10%" width="10%"> </a> <a href="https://www.contrastsecurity.com/" target="_blank"> <img src="img/contrastsecurity.svg" height="10%" width="30%"> </a> <a href="https://www.lvm.de/" target="_blank"> <img src="img/LVM_Versicherung_2010_logo.svg.png" height="10%" width="25%"> </a> <a href="https://gdnext.com/" target="_blank"> <img src="img/gdnext.png" height="10%" width="10%"> </a></p>
<div class="sect2">
<h3 id="benefits-of-being-a-bronze-sponsor"><a class="anchor" href="#benefits-of-being-a-bronze-sponsor"></a>11.1. 成为青铜赞助商的好处</h3>
<div class="paragraph">
<p>青铜赞助商每月向项目捐赠 50 美元，并获得以下好处</p>
</div>
<div class="ulist">
<ul>
<li>
<p>您将收到赞助商徽章 🎖！在 <a href="https://springdoc.springframework.org.cn" class="bare">springdoc.org</a> 的首页的 <code>welcome</code> 页面上可见（2022 年 5 月的浏览量约为 55,000 次/月）。</p>
</li>
<li>
<p>来自“springdoc 团队”的“谢谢”推文。</p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="benefits-of-being-a-silver-sponsor"><a class="anchor" href="#benefits-of-being-a-silver-sponsor"></a>11.2. 成为白银赞助商的好处</h3>
<div class="paragraph">
<p>白银赞助商每月向项目捐赠 100 美元，并获得以下好处</p>
</div>
<div class="ulist">
<ul>
<li>
<p>与青铜赞助商相同的好处（在主页上可见，以及感谢推文）。</p>
</li>
<li>
<p>每月可以获得 2 个 <code>issues</code> 的支持，不可转让。</p>
</li>
<li>
<p>如果 issues 在月底之前未创建，则会丢失</p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="benefits-of-being-a-gold-sponsor"><a class="anchor" href="#benefits-of-being-a-gold-sponsor"></a>11.3. 成为黄金赞助商的好处</h3>
<div class="paragraph">
<p>黄金赞助商每月向项目捐赠 500 美元，并获得以下好处</p>
</div>
<div class="ulist">
<ul>
<li>
<p>与白银赞助商相同的好处（在主页上可见，以及感谢推文）。</p>
</li>
<li>
<p>每月可以获得 10 个 <code>issues</code> 的支持，不可转让。</p>
</li>
<li>
<p>公司徽标显示在所有 <a href="https://springdoc.springframework.org.cn" class="bare">springdoc.org</a> 页面页脚上</p>
</li>
<li>
<p>如果 issues 在月底之前未创建，则剩余的 issues 将丢失。</p>
</li>
</ul>
</div>
</div>
</div>
</div>
<div class="sect1">
<h2 id="thanks"><a class="anchor" href="#thanks"></a>12. 特别感谢</h2>
<div class="sectionbody">
<div class="ulist">
<ul>
<li>
<p>感谢 <a href="https://springframework.org.cn/team" target="_blank" rel="noopener">Spring 团队</a> 分享所有关于 Spring 项目的相关资源。</p>
</li>
<li>
<p>非常感谢 <a href="https://www.jetbrains.com/?from=springdoc-openapi" target="_blank" rel="noopener">JetBrains</a> 对 springdoc-openapi 项目的支持。</p>
</li>
</ul>
</div>
<div class="imageblock">
<div class="content">
<img src="img/jetbrains.svg" alt="JetBrains">
</div>
</div>
</div>
</div>
<div class="sect1">
<h2 id="faq"><a class="anchor" href="#faq"></a>13. 常见问题解答</h2>
<div class="sectionbody">
<div class="sect2">
<h3 id="how-can-i-define-multiple-openapi-definitions-in-one-spring-boot-project"><a class="anchor" href="#how-can-i-define-multiple-openapi-definitions-in-one-spring-boot-project"></a>13.1. 如何在一个 Spring Boot 项目中定义多个 OpenAPI 定义？</h3>
<div class="paragraph">
<p>您可以根据 API 路径和要扫描的包的组合来定义自己的 API 组。每个组都应具有唯一的 <code>groupName</code>。此组的 OpenAPI 描述默认情况下将在以下位置可用</p>
</div>
<div class="ulist">
<ul>
<li>
<p><code>http://server:port/context-path/v3/api-docs/groupName</code></p>
</li>
</ul>
</div>
<div class="paragraph">
<p>要启用对多个 OpenAPI 定义的支持，需要定义 <code>GroupedOpenApi</code> 类型的 bean。</p>
</div>
<div class="paragraph">
<p>对于以下组定义（基于包路径），OpenAPI 描述 URL 将为：/v3/api-docs/<strong>stores</strong></p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">@Bean
public GroupedOpenApi storeOpenApi() {
   String paths[] = {"/store/**"};
   return GroupedOpenApi.builder().group("stores").pathsToMatch(paths)
         .build();
}
</code></pre>
</div>
</div>
<div class="paragraph">
<p>对于以下组定义（基于包名称），OpenAPI 描述 URL 将为：/v3/api-docs/<strong>users</strong></p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">@Bean
public GroupedOpenApi userOpenApi() {
   String packagesToscan[] = {"test.org.springdoc.api.app68.api.user"};
   return GroupedOpenApi.builder().group("users").packagesToScan(packagesToscan)
         .build();
}
</code></pre>
</div>
</div>
<div class="paragraph">
<p>对于以下组定义（基于路径），OpenAPI 描述 URL 将为：/v3/api-docs/<strong>pets</strong></p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">@Bean
public GroupedOpenApi petOpenApi() {
   String paths[] = {"/pet/**"};
   return GroupedOpenApi.builder().group("pets").pathsToMatch(paths)
         .build();
}
</code></pre>
</div>
</div>
<div class="paragraph">
<p>对于以下组定义（基于包名称和路径），OpenAPI 描述 URL 将为：/v3/api-docs/<strong>groups</strong></p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">@Bean
public GroupedOpenApi groupOpenApi() {
   String paths[] = {"/v1/**"};
   String packagesToscan[] = {"test.org.springdoc.api.app68.api.user", "test.org.springdoc.api.app68.api.store"};
   return GroupedOpenApi.builder().group("groups").pathsToMatch(paths).packagesToScan(packagesToscan)
         .build();
}
</code></pre>
</div>
</div>
<div class="paragraph">
<p>有关使用详情，您可以查看以下示例测试</p>
</div>
<div class="ulist">
<ul>
<li>
<p><a href="https://github.com/springdoc/springdoc-openapi/tree/main/springdoc-openapi-tests/springdoc-openapi-actuator-webmvc-tests/src/test/java/test/org/springdoc/api/app68" target="_blank" rel="noopener">https://github.com/springdoc/springdoc-openapi/tree/main/springdoc-openapi-tests/springdoc-openapi-actuator-webmvc-tests/src/test/java/test/org/springdoc/api/app68</a></p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-configure-swagger-ui"><a class="anchor" href="#how-can-i-configure-swagger-ui"></a>13.2. 如何配置 Swagger UI？</h3>
<div class="ulist">
<ul>
<li>
<p><code>springdoc-openapi</code> 上提供了 swagger 官方属性的支持。请参阅 <a href="https://swagger.org.cn/docs/open-source-tools/swagger-ui/usage/configuration/" target="_blank" rel="noopener">官方文档</a>。</p>
</li>
<li>
<p>您可以在文档中使用与 swagger 属性相同的 Spring Boot 属性。</p>
</li>
</ul>
</div>
<div class="admonitionblock note">
<table>
<tbody><tr>
<td class="icon">
<i class="fa icon-note" title="Note"></i>
</td>
<td class="content">所有这些属性都应使用以下前缀声明：<code>springdoc.swagger-ui</code></td>
</tr>
</tbody></table>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-filter-the-resources-documented-in-the-output-specification-by-the-provided-group"><a class="anchor" href="#how-can-i-filter-the-resources-documented-in-the-output-specification-by-the-provided-group"></a>13.3. 如何通过提供的组过滤输出规范中记录的资源？</h3>
<div class="ulist">
<ul>
<li>
<p>您可以使用标准的 <code>swagger-ui</code> 属性过滤器。</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre>springdoc.swagger-ui.filter=group-a</pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-disableenable-swagger-ui-generation-based-on-env-variable"><a class="anchor" href="#how-can-i-disableenable-swagger-ui-generation-based-on-env-variable"></a>13.4. 如何基于环境变量禁用/启用 Swagger UI 生成？</h3>
<div class="ulist">
<ul>
<li>
<p>此属性可帮助您仅禁用 UI。</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre>springdoc.swagger-ui.enabled=false</pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-control-the-default-expansion-setting-for-the-operations-and-tags-in-the-swagger-ui"><a class="anchor" href="#how-can-i-control-the-default-expansion-setting-for-the-operations-and-tags-in-the-swagger-ui"></a>13.5. 如何在 Swagger UI 中控制操作和标签的默认展开设置？</h3>
<div class="ulist">
<ul>
<li>
<p>您可以在 application.yml 中设置此属性，例如</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre>springdoc.swagger-ui.doc-expansion= none</pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-change-the-layout-of-the-swagger-ui"><a class="anchor" href="#how-can-i-change-the-layout-of-the-swagger-ui"></a>13.6. 如何更改 <code>swagger-ui</code> 的布局？</h3>
<div class="ulist">
<ul>
<li>
<p>对于布局选项，您可以使用 swagger-ui 配置选项。例如</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre>springdoc.swagger-ui.layout=BaseLayout</pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-sort-endpoints-alphabetically"><a class="anchor" href="#how-can-i-sort-endpoints-alphabetically"></a>13.7. 如何按字母顺序对端点进行排序？</h3>
<div class="ulist">
<ul>
<li>
<p>您可以使用以下 <code>springdoc-openapi</code> 属性</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre>#For sorting endpoints alphabetically
springdoc.swagger-ui.operationsSorter=alpha
#For sorting tags alphabetically
springdoc.swagger-ui.tagsSorter=alpha</pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-disable-the-try-it-out-button"><a class="anchor" href="#how-can-i-disable-the-try-it-out-button"></a>13.8. 如何禁用 try it out 按钮？</h3>
<div class="ulist">
<ul>
<li>
<p>您必须设置以下属性</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre>springdoc.swagger-ui.supportedSubmitMethods=get, put, post, delete, options, head, patch, trace</pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-add-reusable-enums"><a class="anchor" href="#how-can-i-add-reusable-enums"></a>13.9. 如何添加可重用枚举？</h3>
<div class="ulist">
<ul>
<li>
<p>您应该在枚举上添加 <code>@Schema(enumAsRef = true)</code>。</p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-apply-enumasref-true-to-all-enums"><a class="anchor" href="#how-can-i-apply-enumasref-true-to-all-enums"></a>13.10. 如何将 <code>enumAsRef = true</code> 应用于所有枚举？</h3>
<div class="ulist">
<ul>
<li>
<p>声明以下属性</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre>static {
    io.swagger.v3.core.jackson.ModelResolver.enumsAsRef = true;
}</pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-explicitly-set-which-paths-to-filter"><a class="anchor" href="#how-can-i-explicitly-set-which-paths-to-filter"></a>13.11. 如何显式设置要过滤的路径？</h3>
<div class="ulist">
<ul>
<li>
<p>您可以使用以下属性设置要包含的路径列表</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre>springdoc.pathsToMatch=/v1, /api/balance/**</pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-explicitly-set-which-packages-to-scan"><a class="anchor" href="#how-can-i-explicitly-set-which-packages-to-scan"></a>13.12. 如何显式设置要扫描的包？</h3>
<div class="ulist">
<ul>
<li>
<p>您可以使用以下属性设置要包含的包列表</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre>springdoc.packagesToScan=package1, package2</pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-set-swagger-properties-programmatically"><a class="anchor" href="#how-can-i-set-swagger-properties-programmatically"></a>13.13. 如何以编程方式设置 Swagger 属性？</h3>
<div class="paragraph">
<p>可以通过创建如下所示的 <code>swaggerUiConfig</code> bean 来设置这些属性</p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-kotlin" data-lang="kotlin">@Bean
@Primary
fun swaggerUiConfig(config: SwaggerUiConfigProperties): SwaggerUiConfigProperties {
    config.showCommonExtensions = true
    config.queryConfigEnabled = true
    return config
}
</code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-ignore-some-field-of-model"><a class="anchor" href="#how-can-i-ignore-some-field-of-model"></a>13.14. 如何忽略模型的某些字段？</h3>
<div class="ulist">
<ul>
<li>
<p>您可以在要隐藏的字段顶部使用以下注解</p>
</li>
<li>
<p><code>@Schema(hidden = true)</code></p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-ignore-authenticationprincipal-parameter-from-spring-security"><a class="anchor" href="#how-can-i-ignore-authenticationprincipal-parameter-from-spring-security"></a>13.15. 如何忽略来自 spring-security 的 <code>@AuthenticationPrincipal</code> 参数？</h3>
<div class="ulist">
<ul>
<li>
<p>一个解决方案是使用：<code>@Parameter(hidden = true)</code></p>
</li>
<li>
<p>使用 <code>spring-boot-starter-security</code> 或 <code>spring-security-oauth2-authorization-server</code> 的项目应使用</p>
<div class="ulist">
<ul>
<li>
<p><code>springdoc-openapi-starter-webmvc-api</code> 如果他们依赖于 <code>spring-boot-starter-web</code> 并且他们只需要访问 OpenAPI 端点。</p>
</li>
<li>
<p>或 <code>springdoc-openapi-starter-webmvc-ui</code>，如果他们依赖于 <code>spring-boot-starter-web</code> 并且他们还需要访问 swagger-ui。</p>
</li>
<li>
<p>或 <code>springdoc-openapi-starter-webflux-api</code> 如果他们依赖于 <code>spring-boot-starter-webflux</code> 并且他们只需要访问 OpenAPI 端点。</p>
</li>
<li>
<p>或 <code>springdoc-openapi-starter-webflux-ui</code>，如果他们依赖于 <code>spring-boot-starter-webflux</code> 并且他们还需要访问 swagger-ui。</p>
</li>
</ul>
</div>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="is-there-a-gradle-plugin-available"><a class="anchor" href="#is-there-a-gradle-plugin-available"></a>13.16. 是否有可用的 Gradle 插件？</h3>
<div class="ulist">
<ul>
<li>
<p>是的。更多详细信息可在 <a href="https://springdoc.springframework.org.cn/#gradle-plugin">gradle 插件</a> 部分中找到。</p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-hide-a-parameter-from-the-documentation"><a class="anchor" href="#how-can-i-hide-a-parameter-from-the-documentation"></a>13.17. 如何从文档中隐藏参数？</h3>
<div class="ulist">
<ul>
<li>
<p>您可以使用 <code>@Parameter(hidden = true)</code></p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="is-parameters-annotation-supported"><a class="anchor" href="#is-parameters-annotation-supported"></a>13.18. 是否支持 <code>@Parameters</code> 注解？</h3>
<div class="ulist">
<ul>
<li>
<p>是的</p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="does-springdoc-openapi-support-jersey"><a class="anchor" href="#does-springdoc-openapi-support-jersey"></a>13.19. <code>springdoc-openapi</code> 是否支持 Jersey？</h3>
<div class="ulist">
<ul>
<li>
<p>如果您正在使用 JAX-RS 并且以 Jersey 作为实现（例如 <code>@Path</code>），我们不支持它。</p>
</li>
<li>
<p>我们仅支持使用 Spring 管理的 bean（例如 <code>@RestController</code>）公开 Rest 端点。</p>
</li>
<li>
<p>您可以查看 swagger-jaxrs2 项目</p>
<div class="ulist">
<ul>
<li>
<p><a href="https://github.com/swagger-api/swagger-samples/tree/2.0/java/java-jersey2-minimal" target="_blank" rel="noopener">https://github.com/swagger-api/swagger-samples/tree/2.0/java/java-jersey2-minimal</a></p>
</li>
</ul>
</div>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="can-springdoc-openapi-generate-api-only-for-restcontroller"><a class="anchor" href="#can-springdoc-openapi-generate-api-only-for-restcontroller"></a>13.20. <code>springdoc-openapi</code> 是否可以仅为 <code>@RestController</code> 生成 API？</h3>
<div class="ulist">
<ul>
<li>
<p><code>@RestController</code> 相当于类型级别的 <code>@Controller</code> + <code>@RequestMapping</code>。</p>
</li>
<li>
<p>对于某些旧版应用程序，我们仍然需要支持两者。</p>
</li>
<li>
<p>如果您需要隐藏类型级别的 <code>@Controller</code>，在这种情况下，您可以在控制器级别使用：<code>@Hidden</code>。</p>
</li>
<li>
<p>请注意，此注解也可用于从生成的文档中隐藏某些方法。</p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="are-the-following-validation-annotations-supported-notempty-notblank-positiveorzero-negativeorzero"><a class="anchor" href="#are-the-following-validation-annotations-supported-notempty-notblank-positiveorzero-negativeorzero"></a>13.21. 是否支持以下验证注解：<code>@NotEmpty</code> <code>@NotBlank</code> <code>@PositiveOrZero</code> <code>@NegativeOrZero</code>？</h3>
<div class="ulist">
<ul>
<li>
<p>是的</p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-map-pageable-spring-data-commons-object-to-correct-url-parameter-in-swagger-ui"><a class="anchor" href="#how-can-i-map-pageable-spring-data-commons-object-to-correct-url-parameter-in-swagger-ui"></a>13.22. 如何将 <code>Pageable</code> (spring-data-commons) 对象映射到 Swagger UI 中的正确 URL 参数？</h3>
<div class="paragraph">
<p>自 <code>springdoc-openapi v1.6.0</code> 起，开箱即用地支持 spring-data-commons 的 Pageable。为此，您必须将 <code>@ParameterObject</code> 注解与 <code>Pageable</code> 类型结合使用。</p>
</div>
<div class="paragraph">
<p>在 <code>springdoc-openapi v1.6.0</code> 之前</p>
</div>
<div class="ulist">
<ul>
<li>
<p>对于 HTTP <code>GET</code> 方法，您也可以使用 <code>@ParameterObject</code> 代替 <code>@PageableAsQueryParam</code>。</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">static {
    getConfig().replaceParameterObjectWithClass(org.springframework.data.domain.Pageable.class, Pageable.class)
            .replaceParameterObjectWithClass(org.springframework.data.domain.PageRequest.class, Pageable.class);
}
</code></pre>
</div>
</div>
<div class="ulist">
<ul>
<li>
<p>另一种解决方案是手动配置 Pageable</p>
<div class="ulist">
<ul>
<li>
<p>您将必须显式声明 Pageable 字段作为查询参数的映射，并在您的 pageable 参数上添加 <code>@Parameter(hidden = true) Pageable pageable</code>。</p>
</li>
<li>
<p>您还应该在方法级别声明 <code>springdoc-openapi</code> 提供的注解 <code>@PageableAsQueryParam</code>，或者如果需要定义自定义描述、defaultValue 等，则声明您自己的注解。</p>
</li>
</ul>
</div>
</li>
</ul>
</div>
<div class="paragraph">
<p>如果您想禁用对 spring Pageable Type 的支持，可以使用</p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-properties" data-lang="properties">springdoc.model-converters.pageable-converter.enabled=false</code></pre>
</div>
</div>
<div class="admonitionblock note">
<table>
<tbody><tr>
<td class="icon">
<i class="fa icon-note" title="Note"></i>
</td>
<td class="content">属性 <code>springdoc.model-converters.pageable-converter.enabled</code> 仅自 v1.5.11+ 起可用</td>
</tr>
</tbody></table>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-generate-enums-in-the-generated-description"><a class="anchor" href="#how-can-i-generate-enums-in-the-generated-description"></a>13.23. 如何在生成的描述中生成枚举？</h3>
<div class="ulist">
<ul>
<li>
<p>您可以向 <code>@Parameter</code> 添加属性 <code>allowableValues</code>。例如</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">@GetMapping("/example")
public Object example(@Parameter(name ="json", schema = @Schema(description = "var 1",type = "string", allowableValues = {"1", "2"}))
String json) {
   return null;
}
</code></pre>
</div>
</div>
<div class="ulist">
<ul>
<li>
<p>或者您可以覆盖枚举上的 <code>toString</code></p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">@Override
@JsonValue
public String toString() {
   return String.valueOf(action);
}
</code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-deploy-springdoc-openapi-starter-webmvc-ui-behind-a-reverse-proxy"><a class="anchor" href="#how-can-i-deploy-springdoc-openapi-starter-webmvc-ui-behind-a-reverse-proxy"></a>13.24. 如何在反向代理后面部署 <code>springdoc-openapi-starter-webmvc-ui</code>？</h3>
<div class="ulist">
<ul>
<li>
<p>如果您的应用程序在代理、负载均衡器或云中运行，则请求信息（例如主机、端口、方案…​）可能会在途中更改。您的应用程序可能在 <code>10.10.10.10:8080</code> 上运行，但 HTTP 客户端应该只看到 <code>example.org</code>。</p>
</li>
<li>
<p><a href="https://tools.ietf.org/html/rfc7239" target="_blank" rel="noopener">RFC7239 "Forwarded Headers"</a> 定义了 Forwarded HTTP 标头；代理可以使用此标头来提供有关原始请求的信息。您可以配置应用程序以读取这些标头，并在创建链接并将其发送给 HTTP 302 响应、JSON 文档或 HTML 页面中的客户端时自动使用该信息。还有非标准标头，例如 <code>X-Forwarded-Host</code>、<code>X-Forwarded-Port</code>、<code>X-Forwarded-Proto</code>、<code>X-Forwarded-Ssl</code> 和 <code>X-Forwarded-Prefix</code>。</p>
</li>
<li>
<p>如果代理添加了常用的 <code>X-Forwarded-For</code> 和 <code>X-Forwarded-Proto headers</code>，则将 server.forward-headers-strategy 设置为 NATIVE 就足以支持这些标头。使用此选项，Web 服务器本身原生支持此功能；您可以查看其特定文档以了解特定行为。</p>
</li>
<li>
<p>您需要确保在反向代理配置中设置了以下标头：<code>X-Forwarded-Prefix</code></p>
</li>
<li>
<p>例如，使用 Apache 2，配置</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre>RequestHeader set X-Forwarded-Prefix "/custom-path"</pre>
</div>
</div>
<div class="ulist">
<ul>
<li>
<p>然后，在您的 Spring Boot 应用程序中，确保您的应用程序处理此标头：<code>X-Forwarded-For</code>。有两种方法可以实现此目的</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre>server.use-forward-headers=true</pre>
</div>
</div>
<div class="ulist">
<ul>
<li>
<p>如果这还不够，Spring Framework 提供了 <code>ForwardedHeaderFilter</code>。您可以通过将 server.forward-headers-strategy 设置为 FRAMEWORK 在您的应用程序中将其注册为 Servlet 过滤器。</p>
</li>
<li>
<p>自 Spring Boot 2.2 起，这是处理反向代理标头的新属性</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-properties" data-lang="properties">server.forward-headers-strategy=framework</code></pre>
</div>
</div>
<div class="ulist">
<ul>
<li>
<p>您可以将以下 bean 添加到您的应用程序</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">@Bean
ForwardedHeaderFilter forwardedHeaderFilter() {
   return new ForwardedHeaderFilter();
}
</code></pre>
</div>
</div>
<div class="ulist">
<ul>
<li>
<p>如果您需要手动调整 Swagger UI 中显示的 URL，请实现 <code>ServerBaseUrlCustomizer</code> 接口。例如，这可能是删除端口号所必需的。</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">@Bean
public class CustomServerBaseUrlCustomizer implements ServerBaseUrlCustomizer {
    @Override
    public String customize(String serverBaseUrl) {
        try {
            URL url = new URL(serverBaseUrl);
            if (url.getHost().contains(".com")) {
                serverBaseUrl = new URL(url.getProtocol(),url.getHost(),url.getFile()).toString();
            }
        } catch (MalformedURLException ex) {
            // nothing we can do
        }

        return serverBaseUrl;
    }
}
</code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="is-jsonview-annotations-in-spring-mvc-apis-supported"><a class="anchor" href="#is-jsonview-annotations-in-spring-mvc-apis-supported"></a>13.25. Spring MVC API 中是否支持 <code>@JsonView</code> 注解？</h3>
<div class="ulist">
<ul>
<li>
<p>是的</p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="adding-springdoc-openapi-starter-webmvc-ui-dependency-breaks-my-publicindex-html-welcome-page"><a class="anchor" href="#adding-springdoc-openapi-starter-webmvc-ui-dependency-breaks-my-publicindex-html-welcome-page"></a>13.26. 添加 <code>springdoc-openapi-starter-webmvc-ui</code> 依赖项破坏了我的 <code>public/index.html</code> 欢迎页面</h3>
<div class="ulist">
<ul>
<li>
<p>如果您已经在根目录下有静态内容，并且不希望它被 <code>springdoc-openapi-starter-webmvc-ui</code> 配置覆盖，您可以只定义 <code>swagger-ui</code> 的自定义配置，以便不覆盖上下文根目录中文件的配置</p>
</li>
<li>
<p>例如使用</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre>springdoc.swagger-ui.path= /swagger-ui/api-docs.html</pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-test-the-swagger-ui"><a class="anchor" href="#how-can-i-test-the-swagger-ui"></a>13.27. 如何测试 Swagger UI？</h3>
<div class="ulist">
<ul>
<li>
<p>您可以查看 UI 的此示例测试</p>
<div class="ulist">
<ul>
<li>
<p><a href="https://github.com/springdoc/springdoc-openapi/blob/main/springdoc-openapi-starter-webmvc-ui/src/test/java/test/org/springdoc/ui/app1/SpringDocApp1Test.java" target="_blank" rel="noopener">https://github.com/springdoc/springdoc-openapi/blob/main/springdoc-openapi-starter-webmvc-ui/src/test/java/test/org/springdoc/ui/app1/SpringDocApp1Test.java</a></p>
</li>
</ul>
</div>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-customise-the-openapi-object"><a class="anchor" href="#how-can-i-customise-the-openapi-object"></a>13.28. 如何自定义 OpenAPI 对象？</h3>
<div class="ulist">
<ul>
<li>
<p>您可以编写自己的 <code>OpenApiCustomizer</code> 实现。</p>
</li>
<li>
<p>示例可在</p>
<div class="ulist">
<ul>
<li>
<p><a href="https://github.com/springdoc/springdoc-openapi/blob/main/springdoc-openapi-starter-webflux-api/src/test/java/test/org/springdoc/api/app39/SpringDocTestApp.java" target="_blank" rel="noopener">https://github.com/springdoc/springdoc-openapi/blob/main/springdoc-openapi-starter-webflux-api/src/test/java/test/org/springdoc/api/app39/SpringDocTestApp.java</a></p>
</li>
</ul>
</div>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">@Bean
public OpenApiCustomizer consumerTypeHeaderOpenAPICustomizer() {
return openApi -&gt; openApi.getPaths().values().stream().flatMap(pathItem -&gt; pathItem.readOperations().stream())
    .forEach(operation -&gt; operation.addParametersItem(new HeaderParameter().$ref("#/components/parameters/myConsumerTypeHeader")));
}
</code></pre>
</div>
</div>
<div class="admonitionblock note">
<table>
<tbody><tr>
<td class="icon">
<i class="fa icon-note" title="Note"></i>
</td>
<td class="content">此 bean <code>OpenApiCustomizer</code> 将仅应用于默认 OpenAPI。</td>
</tr>
</tbody></table>
</div>
<div class="paragraph">
<p>如果您需要将 <code>OpenApiCustomizer</code> 也应用于 <code>GroupedOpenApi</code>，请改用 <code>GlobalOpenApiCustomizer</code>。</p>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-return-an-empty-content-as-response"><a class="anchor" href="#how-can-i-return-an-empty-content-as-response"></a>13.29. 如何返回空内容作为响应？</h3>
<div class="ulist">
<ul>
<li>
<p>可以使用以下语法之一将空内容作为响应处理</p>
</li>
<li>
<p><code>content = @Content</code></p>
</li>
<li>
<p><code>content = @Content(schema = @Schema(hidden = true))</code></p>
</li>
<li>
<p>例如</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">@Operation(summary = "Get thing", responses = {
      @ApiResponse(description = "Successful Operation", responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
      @ApiResponse(responseCode = "404", description = "Not found", content = @Content),
      @ApiResponse(responseCode = "401", description = "Authentication Failure", content = @Content(schema = @Schema(hidden = true))) })
@RequestMapping(path = "/testme", method = RequestMethod.GET)
ResponseEntity&lt;String&gt; testme() {
   return ResponseEntity.ok("Hello");
}
</code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="how-are-endpoints-with-multiple-consuming-media-types-supported"><a class="anchor" href="#how-are-endpoints-with-multiple-consuming-media-types-supported"></a>13.30. 如何支持具有多种消费媒体类型的端点？</h3>
<div class="ulist">
<ul>
<li>
<p>同一类上具有相同 HTTP 方法和路径的重载方法将仅生成一个 OpenAPI 操作。</p>
</li>
<li>
<p>此外，建议在其中一个重载方法级别使用 <code>@Operation</code>。否则，如果在同一重载方法中多次声明，则可能会被覆盖。</p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-get-yaml-and-json-openapi-in-compile-time"><a class="anchor" href="#how-can-i-get-yaml-and-json-openapi-in-compile-time"></a>13.31. 如何在编译时获取 yaml 和 json (OpenAPI)？</h3>
<div class="ulist">
<ul>
<li>
<p>您可以使用 <code>springdoc-openapi-maven-plugin</code> 实现此功能</p>
<div class="ulist">
<ul>
<li>
<p><a href="https://github.com/springdoc/springdoc-openapi-maven-plugin.git" target="_blank" rel="noopener">https://github.com/springdoc/springdoc-openapi-maven-plugin.git</a></p>
</li>
</ul>
</div>
</li>
<li>
<p>您可以自定义输出目录 (属性 outputDir)：默认值是：${project.build.directory}</p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="what-are-the-ignored-types-in-the-documentation"><a class="anchor" href="#what-are-the-ignored-types-in-the-documentation"></a>13.32. 文档中忽略的类型有哪些？</h3>
<div class="ulist">
<ul>
<li>
<p><code>Principal</code>、<code>Locale</code>、<code>HttpServletRequest</code> 和 <code>HttpServletResponse</code> 以及 Spring MVC 支持的其他可注入参数均被排除在外。</p>
</li>
<li>
<p>完整文档请参阅此处</p>
<div class="ulist">
<ul>
<li>
<p><a href="https://docs.springframework.org.cn/spring/docs/5.1.x/spring-framework-reference/web.html#mvc-ann-arguments" target="_blank" rel="noopener">https://docs.springframework.org.cn/spring/docs/5.1.x/spring-framework-reference/web.html#mvc-ann-arguments</a></p>
</li>
</ul>
</div>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-disable-ignored-types"><a class="anchor" href="#how-can-i-disable-ignored-types"></a>13.33. 如何禁用忽略的类型</h3>
<div class="paragraph">
<p>如果您不想忽略类型 <code>Principal</code>、<code>Locale</code>、<code>HttpServletRequest</code> 和其他类型，</p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">SpringDocUtils.getConfig().removeRequestWrapperToIgnore(HttpServletRequest.class)
</code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="how-do-i-add-authorization-header-in-requests"><a class="anchor" href="#how-do-i-add-authorization-header-in-requests"></a>13.34. 如何在请求中添加授权标头？</h3>
<div class="ulist">
<ul>
<li>
<p>您应该将 <code>@SecurityRequirement</code> 标签添加到受保护的 API。</p>
</li>
<li>
<p>例如</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre>@Operation(security = { @SecurityRequirement(name = "bearer-key") })</pre>
</div>
</div>
<div class="ulist">
<ul>
<li>
<p>以及安全定义示例</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">@Bean
 public OpenAPI customOpenAPI() {
   return new OpenAPI()
          .components(new Components()
          .addSecuritySchemes("bearer-key",
          new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("bearer").bearerFormat("JWT")));
}
</code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="differentiation-to-springfox-project"><a class="anchor" href="#differentiation-to-springfox-project"></a>13.35. 与 Springfox 项目的区别</h3>
<div class="ulist">
<ul>
<li>
<p>OAS 3 于 2017 年 7 月发布，而 <code>springfox</code> 并没有发布版本来支持 OAS 3。<code>springfox</code> 目前仅涵盖 swagger 2 与 Spring Boot 的集成。最新的发布日期是 2018 年 6 月。因此，就维护而言，最近非常缺乏支持。</p>
</li>
<li>
<p>我们决定向前迈进，并与社区分享我们已经在内部项目中使用的库。</p>
</li>
<li>
<p>与 <code>springfox</code> 最大的区别在于，我们集成了 <code>springfox</code> 未涵盖的新功能</p>
</li>
<li>
<p>Spring Boot 和 OpenAPI 3 标准之间的集成。</p>
</li>
<li>
<p>我们仅依赖于 <code>swagger-annotations</code> 和 <code>swagger-ui</code> 官方库。</p>
</li>
<li>
<p>我们支持 Spring 5 上的新功能，例如带有注解和函数式风格的 <code>spring-webflux</code>。</p>
</li>
<li>
<p>我们尽最大努力回答所有问题并解决所有问题或增强请求</p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="how-do-i-migrate-to-openapi-3-with-springdoc-openapi"><a class="anchor" href="#how-do-i-migrate-to-openapi-3-with-springdoc-openapi"></a>13.36. 如何使用 springdoc-openapi 迁移到 OpenAPI 3</h3>
<div class="ulist">
<ul>
<li>
<p><code>springdoc-openapi</code> 和 <code>springfox</code> 之间没有关系。如果您想迁移到 OpenAPI 3</p>
</li>
<li>
<p>删除所有 springfox 的依赖项和相关代码</p>
</li>
<li>
<p>添加 <code>springdoc-openapi-starter-webmvc-ui</code> 依赖项</p>
</li>
<li>
<p>如果您不想从根路径提供 UI，或者与现有配置存在冲突，您可以更改以下属性</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre>springdoc.swagger-ui.path=/you-path/swagger-ui.html</pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-set-a-global-header"><a class="anchor" href="#how-can-i-set-a-global-header"></a>13.37. 如何设置全局标头？</h3>
<div class="ulist">
<ul>
<li>
<p>您可能具有带有标准 OpenAPI 描述的全局参数。</p>
</li>
<li>
<p>如果您需要定义全局显示（在每个组中），无论组是否满足 GroupedOpenApi 上指定的条件，您都可以使用 OpenAPI Bean。</p>
</li>
<li>
<p>您可以在全局组件部分的 parameters 下定义公共参数，并通过 <code>$ref</code> 在其他地方引用它们。您还可以定义全局标头参数。</p>
</li>
<li>
<p>为此，您可以覆盖 OpenAPI Bean，并在组件级别设置全局标头或参数定义。</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">@Bean
public OpenAPI customOpenAPI(@Value("${springdoc.version}") String appVersion) {
 return new OpenAPI()
        .components(new Components().addSecuritySchemes("basicScheme", new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("basic"))
        .addParameters("myHeader1", new Parameter().in("header").schema(new StringSchema()).name("myHeader1")).addHeaders("myHeader2", new Header().description("myHeader2 header").schema(new StringSchema())))
        .info(new Info()
        .title("Petstore API")
        .version(appVersion)
        .description("This is a sample server Petstore server. You can find out more about Swagger at [https://swagger.org.cn](https://swagger.org.cn) or on [irc.freenode.net, #swagger](https://swagger.org.cn/irc/). For this sample, you can use the api key `special-key` to test the authorization filters.")
        .termsOfService("https://swagger.org.cn/terms/")
        .license(new License().name("Apache 2.0").url("https://springdoc.springframework.org.cn")));
}
</code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="are-callbacks-supported"><a class="anchor" href="#are-callbacks-supported"></a>13.38. 是否支持回调？</h3>
<div class="ulist">
<ul>
<li>
<p>是的</p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-define-securityscheme"><a class="anchor" href="#how-can-i-define-securityscheme"></a>13.39. 如何定义 SecurityScheme？</h3>
<div class="ulist">
<ul>
<li>
<p>您可以使用：<code>@SecurityScheme</code> 注解。</p>
</li>
<li>
<p>或者您可以通过覆盖 OpenAPI Bean 以编程方式定义它</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java"> @Bean
 public OpenAPI customOpenAPI(@Value("${springdoc.version}") String appVersion) {
  return new OpenAPI()
   .components(new Components().addSecuritySchemes("basicScheme",
   new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("basic")))
   info(new Info().title("SpringShop API").version(appVersion)
   .license(new License().name("Apache 2.0").url("https://springdoc.springframework.org.cn")));
 }
</code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-hide-an-operation-or-a-controller-from-documentation"><a class="anchor" href="#how-can-i-hide-an-operation-or-a-controller-from-documentation"></a>13.40. 如何从文档中隐藏操作或控制器？</h3>
<div class="ulist">
<ul>
<li>
<p>您可以在 <code>@RestController</code>、<code>@RestControllerAdvice</code> 和方法级别使用 <code>@io.swagger.v3.oas.annotations.Hidden</code> 注解</p>
</li>
<li>
<p>从 <code>@ControllerAdvice</code> 异常处理程序构建通用（错误）响应时，会考虑异常处理程序方法上的 <code>@Hidden</code> 注解。</p>
</li>
<li>
<p>或使用：<code>@Operation(hidden = true)</code></p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="how-to-configure-global-security-schemes"><a class="anchor" href="#how-to-configure-global-security-schemes"></a>13.41. 如何配置全局安全方案？</h3>
<div class="ulist">
<ul>
<li>
<p>对于全局 SecurityScheme，您可以将其添加到您自己的 OpenAPI 定义中</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">@Bean
public OpenAPI customOpenAPI() {
    return new OpenAPI().components(new Components()
    .addSecuritySchemes("basicScheme", new SecurityScheme()
    .type(SecurityScheme.Type.HTTP).scheme("basic"))).info(new Info().title("Custom API")
    .version("100")).addTagsItem(new Tag().name("mytag"));
}
</code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="can-i-use-spring-property-with-swagger-annotations"><a class="anchor" href="#can-i-use-spring-property-with-swagger-annotations"></a>13.42. 我可以在 swagger 注解中使用 spring 属性吗？</h3>
<div class="ulist">
<ul>
<li>
<p>对 <code>@Info</code> 的 spring 属性解析器支持：<code>title</code> * <code>description</code> * <code>version</code> * <code>termsOfService</code></p>
</li>
<li>
<p>对 <code>@Info.license</code> 的 spring 属性解析器支持：<code>name</code> * <code>url</code></p>
</li>
<li>
<p>对 <code>@Info.contact</code> 的 spring 属性解析器支持：<code>name</code> * <code>email</code> * <code>url</code></p>
</li>
<li>
<p>对 <code>@Operation</code> 的 spring 属性解析器支持：<code>description</code> * <code>summary</code></p>
</li>
<li>
<p>对 <code>@Parameter</code> 的 spring 属性解析器支持：<code>description</code> * <code>name</code></p>
</li>
<li>
<p>对 <code>@ApiResponse</code> 的 spring 属性解析器支持：<code>description</code></p>
</li>
<li>
<p>也可以为 <code>@OAuthFlow</code> 声明安全 URL：<code>openIdConnectUrl</code> * <code>authorizationUrl</code> * <code>refreshUrl</code> * <code>tokenUrl</code></p>
</li>
<li>
<p>通过将 <code>springdoc.api-docs.resolve-schema-properties</code> 设置为 <code>true</code>，对 <code>@Schema</code> 的 spring 属性解析器支持：<code>name</code> * <code>title</code> * <code>description</code></p>
</li>
<li>
<p>通过将 <code>springdoc.api-docs.resolve-extensions-properties</code> 设置为 <code>true</code>，对 <code>@ExtensionProperty</code> 的 spring 属性解析器支持</p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="how-is-server-url-generated"><a class="anchor" href="#how-is-server-url-generated"></a>13.43. 服务器 URL 是如何生成的？</h3>
<div class="ulist">
<ul>
<li>
<p>如果文档不存在，则自动生成服务器 URL 可能很有用。</p>
</li>
<li>
<p>如果存在服务器注解，则将改用它们。</p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-disable-springdoc-openapi-cache"><a class="anchor" href="#how-can-i-disable-springdoc-openapi-cache"></a>13.44. 如何禁用 springdoc-openapi 缓存？</h3>
<div class="ulist">
<ul>
<li>
<p>默认情况下，OpenAPI 描述计算一次，然后被缓存。</p>
</li>
<li>
<p>有时，同一个 swagger-ui 在内部和外部代理后面提供服务。一些用户希望在每次 http 请求时计算服务器 URL。</p>
</li>
<li>
<p>为了禁用 springdoc 缓存，您将必须设置以下属性</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre>springdoc.cache.disabled= true</pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-expose-the-mvc-api-docs-endpoints-without-using-the-swagger-ui"><a class="anchor" href="#how-can-i-expose-the-mvc-api-docs-endpoints-without-using-the-swagger-ui"></a>13.45. 如何在不使用 <code>swagger-ui</code> 的情况下公开 mvc api-docs 端点？</h3>
<div class="ulist">
<ul>
<li>
<p>您应该仅使用 <code>springdoc-openapi-core</code> 依赖项</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-xml" data-lang="xml">&lt;dependency&gt;
  &lt;groupId&gt;org.springdoc&lt;/groupId&gt;
  &lt;artifactId&gt;springdoc-openapi-starter-webmvc-api&lt;/artifactId&gt;
  &lt;version&gt;latest.version&lt;/version&gt;
&lt;/dependency&gt;</code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-disable-springdoc-openapi-endpoints"><a class="anchor" href="#how-can-i-disable-springdoc-openapi-endpoints"></a>13.46. 如何禁用 <code>springdoc-openapi</code> 端点？</h3>
<div class="ulist">
<ul>
<li>
<p>使用以下属性</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre>springdoc.api-docs.enabled=false</pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-hide-schema-of-the-the-response"><a class="anchor" href="#how-can-i-hide-schema-of-the-the-response"></a>13.47. 如何隐藏响应的 Schema？</h3>
<div class="ulist">
<ul>
<li>
<p>要使用 <code>@Schema</code> 注解隐藏响应元素，请在操作级别执行以下操作</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre>@Operation(responses = @ApiResponse(responseCode = "200", content = @Content(schema = @Schema(hidden = true))))</pre>
</div>
</div>
<div class="ulist">
<ul>
<li>
<p>或直接在 <code>@ApiResponses</code> 级别</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre>@ApiResponses(value = {@ApiResponse(responseCode = "200", content = @Content(schema = @Schema(hidden = true))) })
OR
@ApiResponse(responseCode = "404", description = "Not found", content = @Content)</pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="what-is-the-url-of-the-swagger-ui-when-i-set-a-different-context-path"><a class="anchor" href="#what-is-the-url-of-the-swagger-ui-when-i-set-a-different-context-path"></a>13.48. 当我设置不同的上下文路径时，<code>swagger-ui</code> 的 URL 是什么？</h3>
<div class="ulist">
<ul>
<li>
<p>如果您使用不同的上下文路径</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre>server.servlet.context-path= /foo</pre>
</div>
</div>
<div class="ulist">
<ul>
<li>
<p><code>swagger-ui</code> 将在以下 URL 上可用</p>
<div class="ulist">
<ul>
<li>
<p><code>http://server:port/foo/swagger-ui.html</code></p>
</li>
</ul>
</div>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="can-i-customize-openapi-object-programmatically"><a class="anchor" href="#can-i-customize-openapi-object-programmatically"></a>13.49. 我可以以编程方式自定义 OpenAPI 对象吗？</h3>
<div class="ulist">
<ul>
<li>
<p>您可以定义自己的 OpenAPI Bean：如果您需要定义全局显示（在每个组中），无论组是否满足 GroupedOpenApi 上指定的条件，您都可以使用 OpenAPI Bean。</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">@Bean
public OpenAPI customOpenAPI(@Value("${springdoc.version}") String appVersion) {
   return new OpenAPI()
    .components(new Components().addSecuritySchemes("basicScheme",
            new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("basic")))
    .info(new Info().title("SpringShop API").version(appVersion)
            .license(new License().name("Apache 2.0").url("https://springdoc.springframework.org.cn")));
}
</code></pre>
</div>
</div>
<div class="ulist">
<ul>
<li>
<p>如果您需要在特定组中显示定义，并遵守 GroupedOpenApi 上指定的条件，您可以将 OpenApiCustomizer 添加到您的 GroupedOpenApi 定义中。</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">GroupedOpenApi.builder().group("users").pathsToMatch(paths).packagesToScan(packagedToMatch).addOpenApiCustomizer(customerGlobalHeaderOpenApiCustomizer())
                .build()

@Bean
public OpenApiCustomizer customerGlobalHeaderOpenApiCustomizer() {
   return openApi -&gt; openApi.path("/foo",
   new PathItem().get(new Operation().operationId("foo").responses(new ApiResponses()
   .addApiResponse("default",new ApiResponse().description("")
   .content(new Content().addMediaType("fatz", new MediaType()))))));
}
</code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="where-can-i-find-the-source-code-of-the-demo-applications"><a class="anchor" href="#where-can-i-find-the-source-code-of-the-demo-applications"></a>13.50. 在哪里可以找到演示应用程序的源代码？</h3>
<div class="ulist">
<ul>
<li>
<p>应用程序的源代码可在以下 GitHub 存储库中找到</p>
<div class="ulist">
<ul>
<li>
<p><a href="https://github.com/springdoc/springdoc-openapi-demos" target="_blank" rel="noopener">https://github.com/springdoc/springdoc-openapi-demos</a></p>
</li>
</ul>
</div>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="does-this-library-supports-annotations-from-interfaces"><a class="anchor" href="#does-this-library-supports-annotations-from-interfaces"></a>13.51. 此库是否支持来自接口的注解？</h3>
<div class="ulist">
<ul>
<li>
<p>是的</p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="what-is-the-list-of-the-excluded-parameter-types"><a class="anchor" href="#what-is-the-list-of-the-excluded-parameter-types"></a>13.52. 排除的参数类型列表是什么？</h3>
<div class="ulist">
<ul>
<li>
<p><a href="https://docs.springframework.org.cn/spring/docs/5.1.x/spring-framework-reference/web.html#mvc-ann-arguments" target="_blank" rel="noopener">https://docs.springframework.org.cn/spring/docs/5.1.x/spring-framework-reference/web.html#mvc-ann-arguments</a>.</p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="is-file-upload-supported"><a class="anchor" href="#is-file-upload-supported"></a>13.53. 是否支持文件上传？</h3>
<div class="ulist">
<ul>
<li>
<p>该库支持主要文件类型：<code>MultipartFile</code>、<code>@RequestPart</code>、<code>FilePart</code></p>
</li>
<li>
<p>您可以按如下方式上传文件</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java"><span class="fold-block hide-when-folded">import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Encoding;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

</span><span class="fold-block">@PostMapping(value = "/upload", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
public ResponseEntity&lt;?&gt; upload(@Parameter(description = "file") final MultipartFile file) {
    return null;
}

@PostMapping(value = "/uploadFileWithQuery", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
public ResponseEntity&lt;?&gt; uploadFileWithQuery(@Parameter(description = "file") @RequestPart("file") final MultipartFile file,
        @Parameter(description = "An extra query parameter") @RequestParam String name) {
    return null;
}

@PostMapping(value = "/uploadFileWithJson", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE}, produces = {
        MediaType.APPLICATION_JSON_VALUE})
public ResponseEntity&lt;?&gt; uploadFileWithJson(
        @RequestBody(content = @Content(encoding = @Encoding(name = "jsonRequest", contentType = MediaType.APPLICATION_JSON_VALUE)))
        @Parameter(description = "An extra JSON payload sent with file") @RequestPart("jsonRequest") final JsonRequest jsonRequest,
        @RequestPart("file") final MultipartFile file) {
    return null;
}
</span></code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="can-i-use-parameter-inside-operation-annotation"><a class="anchor" href="#can-i-use-parameter-inside-operation-annotation"></a>13.54. 我可以在 <code>@Operation</code> 注解内部使用 <code>@Parameter</code> 吗？</h3>
<div class="ulist">
<ul>
<li>
<p>是的，支持</p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="why-my-parameter-is-marked-as-required"><a class="anchor" href="#why-my-parameter-is-marked-as-required"></a>13.55. 为什么我的参数被标记为必需？</h3>
<div class="ulist">
<ul>
<li>
<p>任何 <code>@GetMapping</code> 参数都被标记为必需，即使缺少 <code>@RequestParam</code>。</p>
</li>
<li>
<p>如果您需要不同的行为，可以添加 <code>@Parameter(required=false)</code> 注解。</p>
</li>
<li>
<p>指定了 <code>defaultValue</code> 的查询参数被标记为必需。</p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="how-are-overloaded-methods-with-the-same-endpoints-but-with-different-parameters"><a class="anchor" href="#how-are-overloaded-methods-with-the-same-endpoints-but-with-different-parameters"></a>13.56. 具有相同端点但参数不同的重载方法如何处理</h3>
<div class="ulist">
<ul>
<li>
<p><code>springdoc-openapi</code> 将这些方法呈现为单个端点。它检测重载的端点，并生成 parameters.schema.oneOf。</p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="what-is-a-proper-way-to-set-up-swagger-ui-to-use-provided-spec-yml"><a class="anchor" href="#what-is-a-proper-way-to-set-up-swagger-ui-to-use-provided-spec-yml"></a>13.57. 设置 Swagger UI 以使用提供的 spec.yml 的正确方法是什么？</h3>
<div class="ulist">
<ul>
<li>
<p>使用此属性，所有 <code>springdoc-openapi</code> 自动配置 bean 都将被禁用</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre>springdoc.api-docs.enabled=false</pre>
</div>
</div>
<div class="ulist">
<ul>
<li>
<p>然后通过添加此 Bean 启用最小 Bean 配置</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">@Bean
SpringDocConfiguration springDocConfiguration(){
   return new SpringDocConfiguration();
}

@Bean
SpringDocConfigProperties springDocConfigProperties() {
   return new SpringDocConfigProperties();
}

@Bean
ObjectMapperProvider objectMapperProvider(SpringDocConfigProperties springDocConfigProperties){
    return new ObjectMapperProvider(springDocConfigProperties);
}
</code></pre>
</div>
</div>
<div class="ulist">
<ul>
<li>
<p>然后配置自定义 UI yaml 文件的路径。</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre>springdoc.swagger-ui.url=/api-docs.yaml</pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="is-there-a-way-to-send-authorization-header-through-the-parameter-tag"><a class="anchor" href="#is-there-a-way-to-send-authorization-header-through-the-parameter-tag"></a>13.58. 是否可以通过 @Parameter 标签发送授权标头？</h3>
<div class="ulist">
<ul>
<li>
<p>OpenAPI 3 规范不允许显式添加 Authorization 标头。<code>注意：不允许使用名为 Accept、Content-Type 和 Authorization 的标头参数。要描述这些标头</code></p>
</li>
<li>
<p>有关更多信息，您可以阅读</p>
<div class="ulist">
<ul>
<li>
<p><a href="https://swagger.org.cn/docs/specification/describing-parameters/#header-parameters" target="_blank" rel="noopener">https://swagger.org.cn/docs/specification/describing-parameters/#header-parameters</a></p>
</li>
</ul>
</div>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="my-rest-controller-using-controller-annotation-is-ignored"><a class="anchor" href="#my-rest-controller-using-controller-annotation-is-ignored"></a>13.59. 我的 Rest Controller 使用 @Controller 注解被忽略了？</h3>
<div class="ulist">
<ul>
<li>
<p>如果您的 <code>@Controller</code> 没有注解 <code>@ResponseBody</code>，这是默认行为</p>
</li>
<li>
<p>您可以将您的控制器更改为 <code>@RestControllers</code>。或者添加 <code>@ResponseBody</code> + <code>@Controller</code>。</p>
</li>
<li>
<p>如果不可能，您可以配置 springdoc 以使用 SpringDocUtils 扫描您的其他控制器。例如</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">static {
   SpringDocUtils.getConfig().addRestControllers(HelloController.class);
}
</code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-define-groups-using-application-yml"><a class="anchor" href="#how-can-i-define-groups-using-application-yml"></a>13.60. 如何使用 application.yml 定义组？</h3>
<div class="ulist">
<ul>
<li>
<p>您可以使用 spring-boot 配置文件动态加载组。</p>
</li>
<li>
<p>请注意，对于此用法，您不必声明 <strong>GroupedOpenApi</strong> Bean。</p>
</li>
<li>
<p>您需要在前缀 <strong>springdoc.group-configs</strong> 下声明以下属性。</p>
</li>
<li>
<p>例如</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre>springdoc.group-configs[0].group=users
springdoc.group-configs[0].paths-to-match=/user/**
springdoc.group-configs[0].packages-to-scan=test.org.springdoc.api</pre>
</div>
</div>
<div class="ulist">
<ul>
<li>
<p>此前缀下的属性列表可在此处找到</p>
<div class="ulist">
<ul>
<li>
<p><a href="index.html#properties">springdoc-openapi-properties</a></p>
</li>
</ul>
</div>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-extract-fields-from-parameter-object"><a class="anchor" href="#how-can-i-extract-fields-from-parameter-object"></a>13.61. 如何从参数对象中提取字段？</h3>
<div class="ulist">
<ul>
<li>
<p>您可以使用 springdoc 注解 @ParameterObject。</p>
</li>
<li>
<p>使用 @ParameterObject 注解请求参数将有助于将参数的每个字段添加为单独的请求参数。</p>
</li>
<li>
<p>这与 Spring MVC 请求参数映射到 POJO 对象兼容。</p>
</li>
<li>
<p>此注解不支持嵌套参数对象。</p>
</li>
<li>
<p>POJO 对象必须包含带有强制前缀 <code>get</code> 的字段的 getter。否则，swagger 文档将不会显示带注解的实体的字段。</p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-use-the-last-springdoc-openapi-snapshot"><a class="anchor" href="#how-can-i-use-the-last-springdoc-openapi-snapshot"></a>13.62. 如何使用最新的 <code>springdoc-openapi</code> SNAPSHOT？</h3>
<div class="ulist">
<ul>
<li>
<p>仅出于测试目的，您可以临时使用最新的 <code>springdoc-openapi</code> SNAPSHOT 进行测试</p>
</li>
<li>
<p>为了实现这一点，您可以在您的 pom.xml 或您的 settings.xml 上添加以下部分</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-xml" data-lang="xml">     &lt;repositories&gt;
       &lt;repository&gt;
         &lt;id&gt;snapshots-repo&lt;/id&gt;
         &lt;url&gt;https://s01.oss.sonatype.org/content/repositories/snapshots&lt;/url&gt;
         &lt;releases&gt;&lt;enabled&gt;false&lt;/enabled&gt;&lt;/releases&gt;
         &lt;snapshots&gt;&lt;enabled&gt;true&lt;/enabled&gt;&lt;/snapshots&gt;
       &lt;/repository&gt;
     &lt;/repositories&gt;</code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-use-enable-springdoc-openapi-monetaryamount-support"><a class="anchor" href="#how-can-i-use-enable-springdoc-openapi-monetaryamount-support"></a>13.63. 如何启用 <code>springdoc-openapi</code> MonetaryAmount 支持？</h3>
<div class="ulist">
<ul>
<li>
<p>如果应用程序想要启用 <code>springdoc-openapi</code> 支持，它会声明</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">SpringDocUtils.getConfig().replaceWithClass(MonetaryAmount.class, org.springdoc.core.converters.models.MonetaryAmount.class);
</code></pre>
</div>
</div>
<div class="ulist">
<ul>
<li>
<p>另一种解决方案，不使用 springdoc-openapi MonetaryAmount，将是</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">SpringDocUtils.getConfig().replaceWithSchema(MonetaryAmount.class, new ObjectSchema()
            .addProperties("amount", new NumberSchema()).example(99.96)
            .addProperties("currency", new StringSchema().example("USD")));
</code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-aggregate-external-endpoints-exposing-openapi-3-spec-inside-one-single-application"><a class="anchor" href="#how-can-i-aggregate-external-endpoints-exposing-openapi-3-spec-inside-one-single-application"></a>13.64. 如何在一个应用程序中聚合外部端点（公开 OPENAPI 3 规范）？</h3>
<div class="paragraph">
<p>属性 <code>springdoc.swagger-ui.urls.*</code> 适用于配置外部 (/v3/api-docs url)。例如，如果您想在一个应用程序中聚合其他服务的所有端点。重要提示：不要忘记也需要启用 CORS。</p>
</div>
</div>
<div class="sect2">
<h3 id="how-can-use-custom-jsonyml-file-instead-of-generated-one"><a class="anchor" href="#how-can-use-custom-jsonyml-file-instead-of-generated-one"></a>13.65. 如何使用自定义 json/yml 文件而不是生成的？</h3>
<div class="paragraph">
<p>如果您的文件 open-api.json 包含 OpenAPI 3 格式的 OpenAPI 文档。然后只需声明：文件名可以是您想要的任何名称，只要您的声明是符合规范的 yaml 或 json OpenAPI Spec。</p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-properties" data-lang="properties">   springdoc.swagger-ui.url=/open-api.json</code></pre>
</div>
</div>
<div class="paragraph">
<p>然后文件 open-api.json 应位于：src/main/resources/static 无需其他配置。</p>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-enable-csrf-support"><a class="anchor" href="#how-can-i-enable-csrf-support"></a>13.66. 如何启用 CSRF 支持？</h3>
<div class="paragraph">
<p>如果您使用的是标准标头。（例如，使用 spring-security 标头）如果需要 CSRF Token，swagger-ui 会在每次 HTTP REQUEST 期间自动发送新的 XSRF-TOKEN。</p>
</div>
<div class="paragraph">
<p>如果您的 XSRF-TOKEN 不是基于标准的，您可以使用 requestInterceptor 通过 spring 资源转换器以编程方式手动捕获并将最新的 xsrf 令牌附加到请求</p>
</div>
<div class="ulist">
<ul>
<li>
<p><a href="https://github.com/swagger-api/swagger-ui/blob/master/docs/usage/configuration.md#requestinterceptor" target="_blank" rel="noopener">https://github.com/swagger-api/swagger-ui/blob/main/docs/usage/configuration.md#requestinterceptor</a></p>
</li>
</ul>
</div>
<div class="paragraph">
<p>从 springdoc-openapi 的 v1.4.4 版本开始，添加了一个新属性以在使用标准标头名称时启用 CSRF 支持</p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-properties" data-lang="properties">springdoc.swagger-ui.csrf.enabled=true</code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-disable-the-default-swagger-petstore-url"><a class="anchor" href="#how-can-i-disable-the-default-swagger-petstore-url"></a>13.67. 如何禁用默认的 swagger petstore URL？</h3>
<div class="paragraph">
<p>您可以使用以下属性</p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-properties" data-lang="properties">springdoc.swagger-ui.disable-swagger-default-url=true</code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="is-pageabledefault-supported-to-enhance-the-openapi-3-docuementation"><a class="anchor" href="#is-pageabledefault-supported-to-enhance-the-openapi-3-docuementation"></a>13.68. 是否支持 @PageableDefault 以增强 OpenAPI 3 文档？</h3>
<div class="paragraph">
<p>是的，您可以将其与 <code>@ParameterObject</code> 注解结合使用。此外，spring-boot <code>spring.data.web.<strong></strong></code><strong> 和 <code>spring.data.rest.default.</code></strong> 属性自 v1.4.5 起受支持</p>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-make-spring-security-login-endpoint-visible"><a class="anchor" href="#how-can-i-make-spring-security-login-endpoint-visible"></a>13.69. 如何使 spring security login-endpoint 可见？</h3>
<div class="paragraph">
<p>您可以使用以下属性</p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-properties" data-lang="properties">springdoc.show-login-endpoint=true</code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-show-schema-definitions-even-the-schema-is-not-referenced"><a class="anchor" href="#how-can-i-show-schema-definitions-even-the-schema-is-not-referenced"></a>13.70. 如何显示 schema 定义，即使 schema 未被引用？</h3>
<div class="paragraph">
<p>您可以使用以下属性</p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-properties" data-lang="properties">springdoc.remove-broken-reference-definitions=false</code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="how-to-override-deprecated"><a class="anchor" href="#how-to-override-deprecated"></a>13.71. 如何覆盖 @Deprecated？</h3>
<div class="paragraph">
<p><code>springdoc-openapi</code> 的全部理念是使您的文档尽可能接近代码，并尽量减少代码更改。如果代码包含 <code>@Deprecated</code>，<code>sprindoc-openapi</code> 也会将其 schema 视为已弃用。如果您想在 swagger 上将字段声明为未弃用，即使 java 代码中的字段包含 <code>@Depreacted</code>，您可以使用自 v1.4.3 版本以来可用的以下属性</p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-properties" data-lang="properties">springdoc.model-converters.deprecating-converter.enabled=false</code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-display-a-method-that-returns-modelandview"><a class="anchor" href="#how-can-i-display-a-method-that-returns-modelandview"></a>13.72. 如何显示返回 ModelAndView 的方法？</h3>
<div class="paragraph">
<p>您可以使用以下属性</p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-properties" data-lang="properties">springdoc.model-and-view-allowed=true</code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-have-pretty-printed-output-of-the-openapi-specification"><a class="anchor" href="#how-can-i-have-pretty-printed-output-of-the-openapi-specification"></a>13.73. 如何获得 OpenApi 规范的格式化输出？</h3>
<div class="paragraph">
<p>您可以使用以下属性</p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-properties" data-lang="properties">springdoc.writer-with-default-pretty-printer=true</code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-define-different-schemas-for-the-same-class"><a class="anchor" href="#how-can-i-define-different-schemas-for-the-same-class"></a>13.74. 如何为同一个类定义不同的 schema？</h3>
<div class="paragraph">
<p>复杂对象始终解析为对组件中定义的 schema 的引用。例如，让我们考虑一个带有 <code>workAddress</code> 和 <code>homeAddress</code> 属性（类型为 <code>Address</code>）的 <code>Instance</code> 类</p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">public class PersonDTO {

    @JsonProperty
    private String email;

    @JsonProperty
    private String firstName;

    @JsonProperty
    private String lastName;

    @Schema(ref = "WorkAddressSchema")
    @JsonProperty
    private Address workAddress;

    @Schema(ref = "HomeAddressSchema")
    @JsonProperty
    private Address homeAddress;

}

public class Address {

    @JsonProperty
    private String addressName;

}
</code></pre>
</div>
</div>
<div class="paragraph">
<p>如果您想为此类定义两个不同的 schema，您可以设置 2 个不同的 schema，如下所示</p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">@Bean
public OpenAPI customOpenAPI() {
return new OpenAPI().components(new Components()
.addSchemas("WorkAddressSchema", getSchemaWithDifferentDescription(Address.class, "work Address" ))
.addSchemas("HomeAddressSchema", getSchemaWithDifferentDescription(Address.class, "home Address" )));
}

private Schema getSchemaWithDifferentDescription(Class className, String description){
ResolvedSchema resolvedSchema = ModelConverters.getInstance()
.resolveAsResolvedSchema(
new AnnotatedType(className).resolveAsRef(false));
return resolvedSchema.schema.description(description);
}
</code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="how-can-i-define-different-description-for-a-class-attribute-depending-on-usage"><a class="anchor" href="#how-can-i-define-different-description-for-a-class-attribute-depending-on-usage"></a>13.75. 如何根据用法为类属性定义不同的描述？</h3>
<div class="paragraph">
<p>例如，让我们考虑一个带有 <code>email</code> 属性的 <code>Instance</code> 类</p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">public class PersonDTO {

    @JsonProperty
    private String email;

    @JsonProperty
    private String firstName;

    @JsonProperty
    private String lastName;


}
</code></pre>
</div>
</div>
<div class="paragraph">
<p>如果您想为 <code>email</code> 定义两个不同的描述，您可以设置 2 个不同的 schema，如下所示</p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">@Bean
public OpenAPI customOpenAPI() {
return new OpenAPI().components(new Components()
.addSchemas("PersonDTO1", getFieldSchemaWithDifferentDescription(PersonDTO.class, "work email" ))
.addSchemas("PersonDTO2", getFieldSchemaWithDifferentDescription(PersonDTO.class, "home email" )));
}

private Schema getFieldSchemaWithDifferentDescription(Class className, String description){
    ResolvedSchema resolvedSchema = ModelConverters.getInstance()
            .resolveAsResolvedSchema(
                    new AnnotatedType(className).resolveAsRef(false));
    return resolvedSchema.schema.addProperties("email", new StringSchema().description(description));
}
</code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="customizing-swagger-static-resources"><a class="anchor" href="#customizing-swagger-static-resources"></a>13.76. 自定义 swagger 静态资源</h3>
<div class="paragraph">
<p>您可以自定义位于 <code>META-INF/resources/webjars/swagger-ui/{swagger.version}/</code> 中的 swagger 文档静态资源。资源列表包括</p>
</div>
<div class="ulist">
<ul>
<li>
<p><code>index.html</code></p>
</li>
<li>
<p><code>swagger-ui-bundle.js</code></p>
</li>
<li>
<p><code>swagger-ui.css</code></p>
</li>
<li>
<p><code>swagger-ui-standalone-preset.js</code></p>
</li>
<li>
<p><code>swagger-ui.css.map</code></p>
</li>
<li>
<p><code>swagger-ui-bundle.js.map</code></p>
</li>
<li>
<p><code>swagger-ui-standalone-preset.js.map</code></p>
</li>
<li>
<p><code>favicon-32x32.png</code></p>
</li>
</ul>
</div>
<div class="paragraph">
<p>为此，您需要扩展 <code>SwaggerIndexPageTransformer</code> 的实现</p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">public class SwaggerCodeBlockTransformer
       extends SwaggerIndexPageTransformer {
  // &lt; constructor &gt;
  @Override
  public Resource transform(HttpServletRequest request,
                            Resource resource,
                            ResourceTransformerChain transformer)
                            throws IOException {
      if (resource.toString().contains("swagger-ui.css")) {
          final InputStream is = resource.getInputStream();
          final InputStreamReader isr = new InputStreamReader(is);
          try (BufferedReader br = new BufferedReader(isr)) {
              final String css = br.lines().collect(Collectors.joining());
              final byte[] transformedContent = css.replace("old", "new").getBytes();
              return  new TransformedResource(resource, transformedContent);
          } // AutoCloseable br &gt; isr &gt; is
      }
      return super.transform(request, resource, transformer);
  }

}
</code></pre>
</div>
</div>
<div class="paragraph">
<p>接下来，将转换器 <code>@Bean</code> 添加到您的 <code>@Configuration</code></p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">@Configuration
public class OpenApiConfig {
    @Bean
    public SwaggerIndexTransformer swaggerIndexTransformer(
            SwaggerUiConfigProperties a,
            SwaggerUiOAuthProperties b,
            SwaggerUiConfigParameters c,
            SwaggerWelcomeCommon d) {
        return new SwaggerCodeBlockTransformer(a, b, c, d);
    }
}
</code></pre>
</div>
</div>
<div class="paragraph">
<p>示例说明</p>
</div>
<div class="imageblock">
<div class="content">
<img src="img/static_content_transformation.png" alt="Illustrative example">
</div>
</div>
</div>
<div class="sect2">
<h3 id="is-graalvm-supported"><a class="anchor" href="#is-graalvm-supported"></a>13.77. 是否支持 GraalVM？</h3>
<div class="paragraph">
<p>spring-boot 3 中添加了本机支持。如果您有时间，请在下一个版本之前毫不犹豫地进行测试。</p>
</div>
<div class="paragraph">
<p>对于 OpenAPI REST 端点，您只需使用 spring <code>native</code> profile 构建您的应用程序。</p>
</div>
<div class="paragraph">
<p>如果您将 <code>@OpenAPIDefinition</code> 或 <code>@SecurityScheme</code> 赋予没有实现的类，则当您以本机方式编译时，该类将消失。为避免这种情况，请为该类提供 <code>@Configuration</code>。</p>
</div>
<div class="listingblock">
<div class="content">
<pre>@Configuration
@OpenAPIDefinition(info = @Info(title = "My App", description = "description"))
public class OpenAPIConfig {
}</pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="how-to-integrate-open-api-3-with-spring-project-not-spring-boot"><a class="anchor" href="#how-to-integrate-open-api-3-with-spring-project-not-spring-boot"></a>13.78. 如何将 Open API 3 与 Spring 项目（非 Spring Boot）集成？</h3>
<div class="paragraph">
<p>当您的应用程序使用 spring 而不使用 (spring-boot) 时，您需要添加 spring-boot 本机提供的 bean 和自动配置。</p>
</div>
<div class="paragraph">
<p>例如，假设您想在 spring-mvc 应用程序中加载 swagger-ui</p>
</div>
<div class="ulist">
<ul>
<li>
<p>您主要需要添加 springdoc-openapi 模块</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-xml" data-lang="xml">&lt;dependency&gt;
   &lt;groupId&gt;org.springdoc&lt;/groupId&gt;
   &lt;artifactId&gt;springdoc-openapi-starter-webmvc-ui&lt;/artifactId&gt;
   &lt;version&gt;last.version&lt;/version&gt;
&lt;/dependency&gt;</code></pre>
</div>
</div>
<div class="ulist">
<ul>
<li>
<p>如果您没有 spring-boot 和 spring-boot-autoconfigure 依赖项，则需要添加它们。并注意您的 spring.version 和 spring-boot.version 之间的兼容性矩阵。例如，在这种情况下 (spring.version=5.1.12.RELEASE)</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-xml" data-lang="xml">        &lt;dependency&gt;
            &lt;groupId&gt;org.springframework.boot&lt;/groupId&gt;
            &lt;artifactId&gt;spring-boot-autoconfigure&lt;/artifactId&gt;
            &lt;version&gt;3.3.3&lt;/version&gt;
        &lt;/dependency&gt;</code></pre>
</div>
</div>
<div class="ulist">
<ul>
<li>
<p>扫描 <code>springdoc-openapi</code> 的 '自动配置类，spring-boot 会自动为您加载这些类。</p>
</li>
<li>
<p>根据您的模块，您可以在每个 <code>springdoc-openapi</code> 模块的 <code>spring.factories</code> 文件中找到它们。</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">@Configuration
@EnableWebMvc
public class WebConfig implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext)  {
        WebApplicationContext context = getContext();
        servletContext.addListener(new ContextLoaderListener(context));
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("RestServlet",
                new DispatcherServlet(context));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/*");
    }

    private AnnotationConfigWebApplicationContext getContext() {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(this.getClass(),
                SpringDocConfiguration.class,
                SpringDocConfigProperties.class,
                SpringDocSpecPropertiesConfiguration.class,
                SpringDocWebMvcConfiguration.class,
                MultipleOpenApiSupportConfiguration.class,
                SwaggerConfig.class,
                SwaggerUiConfigProperties.class,
                SwaggerUiOAuthProperties.class,
        );
        return context;
    }
}
</code></pre>
</div>
</div>
<div class="ulist">
<ul>
<li>
<p>根据您的模块，您可以在每个 <code>springdoc-openapi</code> 模块的 <code>org.springframework.boot.autoconfigure.AutoConfiguration.imports</code> 文件中找到它们。</p>
</li>
<li>
<p>对于组用法，请确保扫描您的 <code>GroupedOpenApi</code> Bean。</p>
</li>
<li>
<p>如果此外，您正在使用自定义 <code>context path</code>: <code>/my-servlet-path</code>。请确保您声明了以下属性</p>
</li>
</ul>
</div>
<div class="listingblock">
<div class="content">
<pre>spring.mvc.servlet.path=/my-servlet-path</pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="what-is-the-compatibility-matrix-of-springdoc-openapi-with-spring-boot"><a class="anchor" href="#what-is-the-compatibility-matrix-of-springdoc-openapi-with-spring-boot"></a>13.79. <code>springdoc-openapi</code> 与 <code>spring-boot</code> 的兼容性矩阵是什么？</h3>
<div class="paragraph">
<p><code>springdoc-openapi 2.x</code> 与 <code>spring-boot 3</code> 兼容。</p>
</div>
<div class="paragraph">
<p>一般来说，<strong>您应该仅选择今天最新的稳定版本 2.8.5。</strong></p>
</div>
<div class="paragraph">
<p>更准确地说，这是构建 <code>springdoc-openapi</code> 的 spring-boot 版本的详尽列表</p>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 50%;" />
<col style="width: 50%;" />
</colgroup>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">Spring Boot 版本</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">Springdoc OpenAPI 版本</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>3.4.x</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>2.7.x</code> - <code>2.8.x</code></p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>3.3.x</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>2.6.x</code></p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>3.2.x</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>2.3.x</code> - <code>2.5.x</code></p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>3.1.x</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>2.2.x</code></p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>3.0.x</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>2.0.x</code> - <code>2.1.x</code></p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>2.7.x</code>, <code>1.5.x</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>1.6.0</code>+</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>2.6.x</code>, <code>1.5.x</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>1.6.0</code>+</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>2.5.x</code>, <code>1.5.x</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>1.5.9</code>+</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>2.4.x</code>, <code>1.5.x</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>1.5.0</code>+</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>2.3.x</code>, <code>1.5.x</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>1.4.0</code>+</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>2.2.x</code>, <code>1.5.x</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>1.2.1</code>+</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>2.0.x</code>, <code>1.5.x</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>1.0.0</code>+</p></td>
</tr>
</tbody>
</table>
</div>
<div class="sect2">
<h3 id="why-am-i-getting-an-error-swagger-ui-unable-to-render-definition-when-overriding-the-default-spring-registered-httpmessageconverter"><a class="anchor" href="#why-am-i-getting-an-error-swagger-ui-unable-to-render-definition-when-overriding-the-default-spring-registered-httpmessageconverter"></a>13.80. 为什么我在覆盖默认的 spring 注册的 <code>HttpMessageConverter</code> 时收到错误：<code>Swagger UI unable to render definition</code>？</h3>
<div class="paragraph">
<p>当覆盖默认的 spring-boot 注册的 <code>HttpMessageConverter</code> 时，您应该同时注册 <code>ByteArrayHttpMessageConverter</code> 以获得正确的 <code>springdoc-openapi</code> 支持。</p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-java" data-lang="java">    converters.add(new ByteArrayHttpMessageConverter());
    converters.add(new MappingJackson2HttpMessageConverter(jacksonBuilder.build()));
</code></pre>
</div>
</div>
<div class="admonitionblock note">
<table>
<tbody><tr>
<td class="icon">
<i class="fa icon-note" title="Note"></i>
</td>
<td class="content">注册 <code>HttpMessageConverters</code> 时，顺序非常重要。</td>
</tr>
</tbody></table>
</div>
</div>
<div class="sect2">
<h3 id="some-parameters-are-not-generated-in-the-resulting-openapi-spec"><a class="anchor" href="#some-parameters-are-not-generated-in-the-resulting-openapi-spec"></a>13.81. 某些参数未在生成的 OpenAPI 规范中生成。</h3>
<div class="paragraph">
<p>此问题是由 <a href="https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-3.2-Release-Notes" target="_blank" rel="noopener">Spring-Boot 3.2.0</a> 引入的更改引起的，特别是对于<strong>参数名称发现</strong>。可以通过将 <code>-parameters</code> 参数添加到 Maven Compiler Plugin 来解决此问题。</p>
</div>
<div class="listingblock">
<div class="content">
<pre class="highlight"><code class="language-xml" data-lang="xml">&lt;plugin&gt;
    &lt;groupId&gt;org.apache.maven.plugins&lt;/groupId&gt;
    &lt;artifactId&gt;maven-compiler-plugin&lt;/artifactId&gt;
    &lt;configuration&gt;
        &lt;parameters&gt;true&lt;/parameters&gt;
    &lt;/configuration&gt;
&lt;/plugin&gt;</code></pre>
</div>
</div>
</div>
</div>
</div>
</div>
<div id="footer">
<div id="footer-text">最后更新 2025-02-11 21:58:31 +0100</div>
</div>
</div>
  </div>
</div>

</body></html>