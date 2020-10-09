package com.family.controller;

import com.family.model.BasePageModel;
import com.family.model.PageParam;
import com.family.model.StudentInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午4:32 2017/11/14
 */
@Controller
public class IndexController {
    @RequestMapping("/student")
    public String list(){
        return "list";
    }

    @RequestMapping(value="index",method = RequestMethod.GET)
    @ResponseBody
    public BasePageModel get(StudentInfo studentInfo, PageParam pageParam, BasePageModel basePageModel){
      /*  Page<?> page = PageHelper.startPage(pageParam.getiDisplayStart()/pageParam.getiDisplayLength()+1, pageParam.getiDisplayLength());
        String[] str=propList();
        studen tService.getList(studentInfo);
        pageParam.setSortPro(str[pageParam.getiSortCol_0()]);
        basePageModel.setAaData(page);
        basePageModel.setiTotalDisplayRecords((int)page.getTotal());
        basePageModel.setiTotalRecords((int)page.getTotal());*/
        return basePageModel;
    }
    public String[] propList(){
        return new String[]{"id","name","systemNo","gender","address","mobile","qqNumber"};
    }

}
