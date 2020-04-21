package com.lagou.edu.controller;


import com.lagou.edu.dao.ResumeDao;
import com.lagou.edu.pojo.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author 应癫
 *
 */
@Controller
@RequestMapping("/tbResume")
public class TbResumeController {

    @Autowired
    private ResumeDao resumeDao;

    @RequestMapping("/findAll")
    public ModelAndView findAll() {
        List<Resume> list = resumeDao.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list",list);
        modelAndView.setViewName("/success.jsp");
        return modelAndView;
    }

    @RequestMapping("/findOneBeforeUpdate")
    public ModelAndView findOneBeforeUpdate(String id) {
        Resume one = resumeDao.findOne(Long.parseLong(id));
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("resume",one);
        modelAndView.setViewName("/update.jsp");
        return modelAndView;
    }

    @RequestMapping("/deleteOne")
    public String deleteOne(String id) {
        resumeDao.delete(Long.parseLong(id));
        return "redirect:/tbResume/findAll";
    }

    @RequestMapping("/updateOne")
    public String updateOne(Resume resume) {
        resumeDao.save(resume);
        return "redirect:/tbResume/findAll";
    }
}
