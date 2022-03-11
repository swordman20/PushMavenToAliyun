#AndroidStudio 发布aar到阿里云Maven
>记录AS发布aar文件到阿里云私有仓库的过程

1. 打开AS，新建一个Module，随便写一个工具类
如下图所示：

![如图所示](https://tva1.sinaimg.cn/large/e6c9d24ely1h05z6x3zqqj212p0iqtao.jpg)

2. 打开AS右侧的Gradle工具，选择自己创建的Module，选择Tasks下面的build的assemble就可以把Module打包生成aar文件
如下图所示：

![如图所示](https://tva1.sinaimg.cn/large/e6c9d24ely1h05zbvxlv4j21h10nb78j.jpg)

3. 将打包好的aar文件，上传到阿里云Maven库中
	1. 打开[阿里云Maven](https://developer.aliyun.com/mvn/guide)网站，注册并登陆
	2. 选择一键开通阿里云Maven私有仓库
	![开通私有仓库](https://tva1.sinaimg.cn/large/e6c9d24ely1h05ziso9f8j21dq0hdjum.jpg)
	3. 进入私有仓库，release和developer仓库都可以用于存放aar文件
	![Maven仓库](https://tva1.sinaimg.cn/large/e6c9d24ely1h05zl2m2wzj20v309fdgh.jpg)
	4. 进入仓库列表，可以点击右上角上传aar文件
	![上传aar文件](https://tva1.sinaimg.cn/large/e6c9d24ely1h05zsprqgvj21fd0nb76i.jpg)
	5. 如何使用上传好的aar文件，点击上传的包名，右侧会展开使用指南。
	![使用指南](https://tva1.sinaimg.cn/large/e6c9d24ely1h05zuglpzbj20k40thdhv.jpg)
4. 当项目下的gradle配置好私有仓库地址，最后一句话即可引用到项目中
	```
	implementation 'com.xiaweifeng.log:mylog:1.0.2'
	```

