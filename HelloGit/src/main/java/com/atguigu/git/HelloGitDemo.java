package com.atguigu.git;

public class HelloGitDemo {

    public static void main(String[] args) {
        System.out.println("HelloGit!");
        System.out.println("HelloGit!更新1");
        System.out.println("HelloGit!创建分支");
        System.out.println("HelloGit!主干添加内容");
        System.out.println("HelloGit!分支添加了内容");
        System.out.println("HelloGit!克隆下来的项目");
        System.out.println("merge or rebase");
        System.out.println("测试merge还是rebase");
        System.out.println("different between rebase and merge!");
        System.out.println("这次需要测试直接rebase有什么变化");

        cal(9,10);
        System.out.println(1111);
        cal2(5,7);
    }

    public static int cal(int x,int y){
        return x * y;
    }

    public static int cal2(int x,int y){
        return x + y;
    }

}
