工程结构
base --基类
common --通用组件
	annotation --自定义的注解
	interceptor --拦截器
	listener --监听器
	plugin --插件，如分页插件之类
	resolver --自定义异常
	util --自定义工具类
	view --用户导出订单，酒店地图之类
system --系统设置
	controlller --控制层
	service --业务层
	dao/mapper --对象持久化层
	entity --实体层
WebContent --前台视图层
	error --错误页面，如404之类
	static --静态资源文件  是否需要使用CDN
		--css
		--js
		--images
	userfiles --用户上传附件，头像等
	WEB-INF/pages  jsp页面
		common --通用包含的页面
		system --系统设置页面
		lib --项目依赖的jar包

		
	
jsp -> controller -> service -> dao(mapper) -> db(entity)

数据展现 -> 页面转发,数据转换  -> 业务  -> 实体对象的CRUD - 持久化