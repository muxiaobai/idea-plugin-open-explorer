package io.github.muxiaobai.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DataKeys;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleUtil;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ModuleRootManager;
import com.intellij.openapi.vfs.VirtualFile;

/**
 * 右键创建Basic Action
 * @author xujin
 */
public class ProjectPopAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {

        Project project = e.getProject();
        /**
         * 从Action中得到一个虚拟文件
         */
        VirtualFile virtualFile = e.getData(DataKeys.VIRTUAL_FILE);
        if (!virtualFile.isDirectory()) {
            virtualFile = virtualFile.getParent();
        }
        Module module = ModuleUtil.findModuleForFile(virtualFile, project);

        String moduleRootPath = ModuleRootManager.getInstance(module).getContentRoots()[0].getPath();
        String actionDir = virtualFile.getPath();

//        String str = StringUtils.substringAfter(actionDir, moduleRootPath + "/src/main/java/");
//        //获取右键后的路径
//        String basePackage = StringUtils.replace(str, "/", ".");
//        NewRightContext.clearAllSet();
//        NewRightContext.setSelectedPackage(basePackage);
//        BasicActionOpenDialog dialog = new BasicActionOpenDialog(project, module);
//        if (!dialog.showAndGet()) {
//            return;
//        }



    }


}