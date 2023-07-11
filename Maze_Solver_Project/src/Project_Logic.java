/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.List;

public class Project_Logic {
    public static boolean dfs(int [][] maze,int x,int y,List<Integer>path){
        if(maze[y][x]==9){
            path.add(x);
            path.add(y);
            return true;
        }

        if(maze[y][x]==0){
            maze[y][x]=2;
            //left
            if(dfs(maze,x-1,y,path)){
                path.add(x);
                path.add(y);
                return true;
            }
            //right
            if(dfs(maze,x+1,y,path)){
                path.add(x);
                path.add(y);
                return true;
            }
            //up
            if(dfs(maze,x,y-1,path)){
                path.add(x);
                path.add(y);
                return true;
            }
            //down
            if(dfs(maze,x,y+1,path)){
                path.add(x);
                path.add(y);
                return true;
            }
        }
        return false;
    }
}
