package com.lyle.wse.controller;

import com.lyle.wse.mapper.CommentMapper;
import com.lyle.wse.model.Comment;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lyle 2024-09-06 22:17
 */
@RequestMapping("/xss")
@RestController
public class XssController {

    @Resource
    private CommentMapper commentMapper;

    /**
     * <a href="http://localhost:8080/xss/reflected?search=<script>alert(1)</script>">反射型XSS</a>
     *
     * @param search search
     */
    @GetMapping("/reflected")
    public ModelAndView xss_reflect(@RequestParam String search) {
        ModelAndView mv = new ModelAndView("reflected-xss");
        mv.addObject("search", search);
        return mv;
    }

    /**
     * 进入数据录入页面
     */
    @GetMapping("/stored")
    public ModelAndView xss_store_input() {
        return new ModelAndView("stored-xss-input");
    }

    /**
     * <a href="http://localhost:8080/xss/stored?postId=3&comment=This+post+was+extremely+helpful.&name=Carlos+Montoya&email=carlos@normal-user.net">存储型XSS</a>
     * <p>
     * 正常提交: postId=3&comment=This+post+was+extremely+helpful.&name=Carlos+Montoya&email=carlos@normal-user.net
     * </p>
     * <p>
     * 恶意提交:
     * </p>
     */
    @PostMapping("/stored")
    public Map<String, Object> xss_store_submit(Comment comment) {
        Comment c = new Comment();
        c.setName(comment.getName());
        c.setPostId(comment.getPostId());
        c.setComment(comment.getComment());
        c.setWebsite(comment.getWebsite());
        c.setEmail(comment.getEmail());
        commentMapper.insert(c);
        Map<String, Object> result = new HashMap<>();
        result.put("code", 200);
        result.put("message", "提交成功");
        return result;
    }

    @GetMapping("/storedList")
    public ModelAndView xss_store_list() {
        ModelAndView mv = new ModelAndView("stored-xss-list");
        List<Comment> comments = commentMapper.selectAll();
        mv.addObject("comments", comments);
        return mv;
    }

    @GetMapping("/dom")
    public ModelAndView dom_xss(String search) {
        ModelAndView mv = new ModelAndView("dom-xss");
        mv.addObject("searchResult", "n search results for " + search);
        return mv;
    }

}