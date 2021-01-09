package com.family.project.test;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/12/26 上午10:00
 * @modified By:
 */
public class Test {

    public static void main(String[] args) {
        UserModel user =new UserModel();
        List<StudentModel> list1=new ArrayList<>();
        StudentModel s1=new StudentModel();
        s1.setId(1);
        s1.setName("a");
        list1.add(s1);
        user.setStudentInfoList(list1);

        CopyFromUser copyFromUser=new CopyFromUser();

        BeanUtils.copyProperties(user,copyFromUser);

        System.out.println(copyFromUser);

        if(copyFromUser.getStudentInfoList().get(0) instanceof StudentVo){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
