<template>
  <div class="app-container home">
    <el-row :gutter="20">
      <el-col :lg="24" :sm="24">
        <blockquote class="text-warning" style="font-size: 14px">
          Weiter 1.0.1<br/>
          <h4 class="text-danger">
            ☛☛ Weiter伴你同行 ☚☚
          </h4>
          <el-link target="_blank" type="primary">
            您好！我准备好了！<br/>
            新的起点，以后的每天，让我们携手同行，愿时光美好，未来可期！
          </el-link>
          <br/>
        </blockquote>
        <hr/>
      </el-col>
    </el-row>
    <el-row :gutter="20">
      <el-col :lg="12" :sm="24" style="padding-left: 20px">
        <h2>Weiter管理系统</h2>
        <p>
          一直想做一款后台管理系统，看了很多优秀的开源项目但是发现没有合适自己的。
          于是利用空闲休息时间开始自己写一套后台系统，如此有了Weiter信息管理系统。<br/>
          Weiter取于德语，译文：进一步的。希望系统以后会越来越好用，伴你同行。<br/>
          它可以用于所有的Web应用程序，如网站管理后台，网站会员中心，CMS，CRM，OA等等。
          当然，您也可以对它进行深度定制，以做出更强系统。
          所有前端后台代码封装过后十分精简易上手，出错概率低。同时支持移动客户端访问。系统会陆续更新一些实用功能。
        </p>
        <p>
          <b>当前版本:</b> <span>v{{ version }}</span>
        </p>
        <p>
          <el-tag type="danger">&yen;&nbsp;免费开源</el-tag>
        </p>
        <p>
          <el-button
              icon="el-icon-cloudy"
              plain
              size="mini"
              type="primary"
              @click="goTarget('https://github.com/zhouuwei')"
          >访问Git
          </el-button
          >
          <el-button icon="el-icon-s-home" plain size="mini" @click="goTarget('http://localhost:80/index')">访问主页
          </el-button>
        </p>
      </el-col>

      <el-col :lg="12" :sm="24" style="padding-left: 50px">
        <el-row>
          <el-col :span="12">
            <h2>技术选型</h2>
          </el-col>
        </el-row>
        <el-row>
          <el-col :span="6">
            <h4>后端技术</h4>
            <ul>
              <li>SpringBoot</li>
              <li>SpringCloud</li>
              <li>NaCos</li>
              <li>GetWay</li>
              <li>...</li>
            </ul>
          </el-col>
          <el-col :span="6">
            <h4>前端技术</h4>
            <ul>
              <li>Vue</li>
              <li>Vuex</li>
              <li>Element-ui</li>
              <li>Axios</li>
              <li>Sass</li>
              <li>Quill</li>
              <li>...</li>
            </ul>
          </el-col>
        </el-row>
      </el-col>
    </el-row>
    <el-divider/>
    <el-row :gutter="20">
      <el-col :lg="8" :md="12" :sm="24" :xs="24">
        <el-card class="update-log">
          <div slot="header" class="clearfix">
            <span>系统功能</span>
          </div>
          <el-collapse accordion>
            <ol>
              <li>用户管理：用户是系统操作者，该功能主要完成系统用户配置。</li>
              <li>角色管理：角色菜单权限分配、设置角色按机构进行数据范围权限划分。</li>
              <li>菜单管理：配置系统菜单，操作权限，按钮权限标识等。</li>
              <li>部门管理：配置系统组织机构（公司、部门、小组），树结构展现支持数据权限。</li>
              <li>岗位管理：配置系统用户所属担任职务。</li>
              <li>字典管理：对系统中经常使用的一些较为固定的数据进行维护。</li>
              <li>参数管理：对系统动态配置常用参数。</li>
              <li>通知公告：系统通知公告信息发布维护。</li>
              <li>操作日志：系统正常操作日志记录和查询；系统异常信息日志记录和查询。</li>
              <li>登录日志：系统登录日志记录查询，包含登录异常。</li>
              <li>在线用户：当前系统中活跃用户状态监控。</li>
              <li>定时任务：在线（添加、修改、删除)任务调度包含执行结果日志。</li>
              <li>代码生成：前后端代码的生成（java、html、xml、sql）支持CRUD下载 。</li>
              <li>系统接口：根据业务代码自动生成相关的api接口文档。</li>
              <li>服务监控：监视当前系统CPU、内存、磁盘、堆栈等相关信息。</li>
              <li>个人中心：用户可以自己更改资料，头像等；</li>
              <li>个性化配置：支持系统布局等个性化配置，让你使用更顺心；</li>
              <li>连接池监视：监视当前系统数据库连接池状态，可进行分析SQL找出系统性能瓶颈。</li>
            </ol>
          </el-collapse>
        </el-card>
      </el-col>
      <el-col :lg="8" :md="12" :sm="24" :xs="24">
        <el-card class="update-log">
          <div slot="header" class="clearfix">
            <span>更新日志</span>
          </div>
          <el-collapse accordion>
            <el-collapse-item title="v1.0.0">
              <ol>
                <li>用户管理：用户是系统操作者，该功能主要完成系统用户配置。</li>
                <li>角色管理：角色菜单权限分配、设置角色按机构进行数据范围权限划分。</li>
                <li>菜单管理：配置系统菜单，操作权限，按钮权限标识等。</li>
                <li>部门管理：配置系统组织机构（公司、部门、小组），树结构展现支持数据权限。</li>
                <li>岗位管理：配置系统用户所属担任职务。</li>
                <li>字典管理：对系统中经常使用的一些较为固定的数据进行维护。</li>
                <li>参数管理：对系统动态配置常用参数。</li>
                <li>通知公告：系统通知公告信息发布维护。</li>
                <li>操作日志：系统正常操作日志记录和查询；系统异常信息日志记录和查询。</li>
                <li>登录日志：系统登录日志记录查询，包含登录异常。</li>
                <li>在线用户：当前系统中活跃用户状态监控。</li>
                <li>定时任务：在线（添加、修改、删除)任务调度包含执行结果日志。</li>
                <li>代码生成：前后端代码的生成（java、html、xml、sql）支持CRUD下载 。</li>
                <li>系统接口：根据业务代码自动生成相关的api接口文档。</li>
                <li>服务监控：监视当前系统CPU、内存、磁盘、堆栈等相关信息。</li>
                <li>个人中心：用户可以自己更改资料，头像等；</li>
                <li>个性化配置：支持系统布局等个性化配置，让你使用更顺心；</li>
                <li>连接池监视：监视当前系统数据库连接池状态，可进行分析SQL找出系统性能瓶颈。</li>
              </ol>
            </el-collapse-item>
          </el-collapse>
        </el-card>
      </el-col>
      <el-col :lg="8" :md="12" :sm="24" :xs="24">
        <el-card class="update-log">
          <div slot="header" class="clearfix">
            <span>联系信息</span>
          </div>
          <div class="body">
            <p>
              <i class="el-icon-s-promotion"></i> 官网：
              <el-link href="https://github.com/zhouuweii/weiter" target="_blank">https://github.com/zhouuweii/weiter</el-link>
            </p>
          </div>
        </el-card>
      </el-col>
    </el-row>
  </div>
</template>

<script>
export default {
  name: "index",
  data() {
    return {
      // 版本号
      version: "1.0.1",
    };
  },
  methods: {
    goTarget(href) {
      window.open(href, "_blank");
    },
  },
};
</script>

<style lang="scss" scoped>
.home {
  blockquote {
    padding: 10px 20px;
    margin: 0 0 20px;
    font-size: 17.5px;
    border-left: 5px solid #eee;
  }

  hr {
    margin-top: 20px;
    margin-bottom: 20px;
    border: 0;
    border-top: 1px solid #eee;
  }

  .col-item {
    margin-bottom: 20px;
  }

  ul {
    padding: 0;
    margin: 0;
  }

  font-family: "open sans", "Helvetica Neue", Helvetica, Arial, sans-serif;
  font-size: 13px;
  color: #676a6c;
  overflow-x: hidden;

  ul {
    list-style-type: none;
  }

  h4 {
    margin-top: 0px;
  }

  h2 {
    margin-top: 10px;
    font-size: 26px;
    font-weight: 100;
  }

  p {
    margin-top: 10px;

    b {
      font-weight: 700;
    }
  }

  .update-log {
    ol {
      display: block;
      list-style-type: decimal;
      margin-block-start: 1em;
      margin-block-end: 1em;
      margin-inline-start: 0;
      margin-inline-end: 0;
      padding-inline-start: 40px;
    }
  }
}
</style>
