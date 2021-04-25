# idea-plugin-open-explorer

this plugin is use `Alt+E` to open explorer or `Alt+Shift+E` to open class path on explorer;

idea 插件 自动在explorer中打开文件路径，或者打开编译后的文件路径

使用社区版本

运行环境 `git clone --depth 1 git://git.jetbrains.org/idea/community.git`

```
<?xml version="1.0" encoding="UTF-8"?>
<module type="PLUGIN_MODULE" version="4">
  <component name="NewModuleRootManager" inherit-compiler-output="true">
    <exclude-output />
    <content url="file://$MODULE_DIR$">
      <sourceFolder url="file://$MODULE_DIR$/src" isTestSource="false" />
      <sourceFolder url="file://$MODULE_DIR$/resources" type="java-resource" />
    </content>
    <orderEntry type="inheritedJdk" />
    <orderEntry type="sourceFolder" forTests="false" />
  </component>
</module>

```