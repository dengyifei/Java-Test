package com.acrabsoft.design.compose;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author efei
 *
 */
public class Folder extends File{
	private List<File> files;
	
	
	
	public Folder(String name) {
		super(name);
		this.files = new ArrayList<File>();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		for(File file : files){
            file.display();
        }
	}
	
	/**
     * @desc 向文件夹中添加文件
     * @param file
     * @return void
     */
    public void add(File file){
        files.add(file);
    }

    /**
     * @desc 从文件夹中删除文件
     * @param file
     * @return void
     */
    public void remove(File file){
        files.remove(file);
    }

}
